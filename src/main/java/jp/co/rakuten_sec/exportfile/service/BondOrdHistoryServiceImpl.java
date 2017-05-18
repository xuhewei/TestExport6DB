package jp.co.rakuten_sec.exportfile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jp.co.rakuten_sec.exportfile.dao.BondOrdHistoryDao;
import jp.co.rakuten_sec.exportfile.dao.DaoList;
import jp.co.rakuten_sec.exportfile.entity.BondOrdHistory;

@Service("bondOrdHistoryService")
public class BondOrdHistoryServiceImpl implements BondOrdHistoryService{
	
	@Autowired
	@Qualifier("bondOrdHistoryDao")
	protected BondOrdHistoryDao bondOrdHistoryDao;
	
	@Autowired
	@Qualifier("bondOrdHistoryDaoList1")
	protected DaoList<BondOrdHistoryDao> bondOrdHistoryDaoList;

	@Override
	public BondOrdHistory findById(String id) {
		
		return bondOrdHistoryDao.findById(id);
	}

	@Override
	public List<BondOrdHistory> findAll() {
		List<BondOrdHistory> entityAllList = new ArrayList<BondOrdHistory>();
		for(BondOrdHistoryDao dao:bondOrdHistoryDaoList.getDaoList()){
			List<BondOrdHistory> list= dao.findAll();
			if (null != list) {
				entityAllList.addAll(list);
			}
		}
		return entityAllList;
	}
	
	
}
