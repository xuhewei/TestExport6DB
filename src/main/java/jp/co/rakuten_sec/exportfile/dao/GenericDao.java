package jp.co.rakuten_sec.exportfile.dao;

import java.util.List;


public interface GenericDao<T> {
	
	public T find(T searchKeyObject);
	public T find(String id, T searchKeyObject);

	
}