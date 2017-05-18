package jp.co.rakuten_sec.exportfile.dao;

import java.util.List;

import jp.co.rakuten_sec.exportfile.entity.BondOrdHistory;

public interface BondOrdHistoryDao {
	
	BondOrdHistory findById(String id);
	List<BondOrdHistory> findAll();
}
