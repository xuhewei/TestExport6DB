package jp.co.rakuten_sec.exportfile.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import jp.co.rakuten_sec.exportfile.entity.Entity;
import jp.co.rakuten_sec.exportfile.entity.EntityUtils;


public  class  GenericDaoImpl<T extends Entity> extends SqlSessionDaoSupport implements GenericDao<T> {
	
	public GenericDaoImpl() {
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T find(T searchKeyObject) {
		//T result = (T) getSqlMapClientTemplate()
				//.queryForObject(
		T result = (T) getSqlSession()
		.selectOne(getSqlMapId("find", EntityUtils.getEntityClass(searchKeyObject)),
						searchKeyObject);
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T find(String id, T searchKeyObject) {
		//T result = (T) getSqlMapClientTemplate().queryForObject(id, 
		T result = (T) getSqlSession().selectOne(id, 
				searchKeyObject);
		return result;
	}
	
	
	
	
	
	
	
	private String getSqlMapId(String doKind, Class<?> type) {

		StringBuilder insertMethod = new StringBuilder(type.getSimpleName());
		insertMethod.append(".");

		insertMethod.append(doKind);

		return insertMethod.toString();
	}

}
