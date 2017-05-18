package jp.co.rakuten_sec.exportfile.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BondOrdHistoryKey implements Serializable{
    private Date procDt;

    private BigDecimal ordNo;

    public Date getProcDt() {
        return procDt;
    }

    public void setProcDt(Date procDt) {
        this.procDt = procDt;
    }

    public BigDecimal getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(BigDecimal ordNo) {
        this.ordNo = ordNo;
    }
}