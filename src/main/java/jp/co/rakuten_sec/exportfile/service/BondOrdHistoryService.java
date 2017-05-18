package jp.co.rakuten_sec.exportfile.service;

import java.util.List;

import jp.co.rakuten_sec.exportfile.entity.BondOrdHistory;

public interface BondOrdHistoryService {
	
	BondOrdHistory findById(String id);
	List<BondOrdHistory> findAll();
}
