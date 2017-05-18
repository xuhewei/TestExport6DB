package jp.co.rakuten_sec.exportfile.dao;


import java.util.Map;

public class DaoMapImpl<E> implements DaoMap<E> {

	private Map<String, E> daoMap;

	public E get(String key) {
		return daoMap.get(key);
	}

	public void setDaoMap(Map<String, E> daoMap) {
		this.daoMap = daoMap;
	}
}
