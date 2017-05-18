package jp.co.rakuten_sec.exportfile.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jp.co.rakuten_sec.exportfile.entity.BondOrdHistory;

public class BondOrdHistoryDaoImpl extends GenericDaoImpl<BondOrdHistory>   implements BondOrdHistoryDao {

	@Override
	public BondOrdHistory findById(String id) {
		BondOrdHistory bondOrdHistory = new BondOrdHistory();
		BigDecimal BigDecimal = new BigDecimal(id);
		bondOrdHistory.setOrdNo(BigDecimal);
		return getSqlSession().selectOne("bondOrdHistoryMapper.selectOne",bondOrdHistory);
	}

	@Override
	public List<BondOrdHistory> findAll() {
		List<BondOrdHistory> bondOrdHistoryList = new ArrayList<BondOrdHistory>();
		
		return getSqlSession().selectList("bondOrdHistoryMapper.selectAll");
	}

}
