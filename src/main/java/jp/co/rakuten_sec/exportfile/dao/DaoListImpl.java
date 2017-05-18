package jp.co.rakuten_sec.exportfile.dao;


import java.util.List;

public class DaoListImpl<E> implements DaoList<E> {

	private List<E> daoList;

	public List<E> getDaoList() {
		return daoList;
	}

	public void setDaoList(List<E> daoList) {
		this.daoList = daoList;
	}

}
