package jp.co.rakuten_sec.exportfile.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import jp.co.rakuten_sec.exportfile.util.DateUtil;


public class BondOrdHistory implements Serializable ,Entity{
    private String procDt;
    private BigDecimal ordNo;
    public String getProcDt() {
        return procDt;
    }
    public void setProcDt(Date procDt) {
        this.procDt = DateUtil.getYYYYMMDDDate(procDt);
    }
    public BigDecimal getOrdNo() {
        return ordNo;
    }
    public void setOrdNo(BigDecimal ordNo) {
        this.ordNo = ordNo;
    }
    private Short trdTypCd;
    private Short ordStsCd;
    private Short hulftSendFlg;
    private Long facePrice;
    private Long amount;
    private Long passInterest;
    private Integer tax;
    private Long balance;
    private Integer trdTax;
    private Long commissionAmount;
    private Short bondTrdTyp;
    private Short tradeRate;
    private BigDecimal refPrice;
    private Long refAmount;
    private Short cnclCorrKbn;
    private String dscrCd;
    private String applDt;
    private String inpTm;
    private Short rcvNo;
    private Short inputRoute;
    private String agent;
    private String execPriceInpTm;
    private String execTm;
    private Short latstCnclCorrKbn;
    private String latstInpTm;
    private Short latstInputRoute;
    private String latstAgent;
    private String hulftSendDt;
    private String dataCd;
    private Short branchCd;
    private Integer clientCd;
    private Integer salesmanCd;
    private Short tradeKbn;
    private Short sonarTrdCd;
    private String tradeDt;
    private String valueDt;
    private String numCd;
    private String sonarDscrCd;
    private String dscrNm;
    private String redemptDt;
    private BigDecimal coupon;
    private String couponKbn;
    private BigDecimal execPrice;
    private Short insiderFlg;
    private String insiderDscrCd;
    private Short spaKbn;
    public Short getTrdTypCd() {
        return trdTypCd;
    }
    public void setTrdTypCd(Short trdTypCd) {
        this.trdTypCd = trdTypCd;
    }
    public Short getOrdStsCd() {
        return ordStsCd;
    }
    public void setOrdStsCd(Short ordStsCd) {
        this.ordStsCd = ordStsCd;
    }
    public Short getHulftSendFlg() {
        return hulftSendFlg;
    }
    public void setHulftSendFlg(Short hulftSendFlg) {
        this.hulftSendFlg = hulftSendFlg;
    }
    public Long getFacePrice() {
        return facePrice;
    }
    public void setFacePrice(Long facePrice) {
        this.facePrice = facePrice;
    }
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    public Long getPassInterest() {
        return passInterest;
    }
    public void setPassInterest(Long passInterest) {
        this.passInterest = passInterest;
    }
    public Integer getTax() {
        return tax;
    }
    public void setTax(Integer tax) {
        this.tax = tax;
    }
    public Long getBalance() {
        return balance;
    }
    public void setBalance(Long balance) {
        this.balance = balance;
    }
    public Integer getTrdTax() {
        return trdTax;
    }
    public void setTrdTax(Integer trdTax) {
        this.trdTax = trdTax;
    }
    public Long getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Long commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Short getBondTrdTyp() {
        return bondTrdTyp;
    }

    public void setBondTrdTyp(Short bondTrdTyp) {
        this.bondTrdTyp = bondTrdTyp;
    }

    public Short getTradeRate() {
        return tradeRate;
    }

    public void setTradeRate(Short tradeRate) {
        this.tradeRate = tradeRate;
    }

    public BigDecimal getRefPrice() {
        return refPrice;
    }

    public void setRefPrice(BigDecimal refPrice) {
        this.refPrice = refPrice;
    }

    public Long getRefAmount() {
        return refAmount;
    }

    public void setRefAmount(Long refAmount) {
        this.refAmount = refAmount;
    }

    public Short getCnclCorrKbn() {
        return cnclCorrKbn;
    }

    public void setCnclCorrKbn(Short cnclCorrKbn) {
        this.cnclCorrKbn = cnclCorrKbn;
    }

    public String getDscrCd() {
        return dscrCd;
    }

    public void setDscrCd(String dscrCd) {
        this.dscrCd = dscrCd == null ? null : dscrCd.trim();
    }

    public String getApplDt() {
        return applDt;
    }

    public void setApplDt(Date applDt) {
        this.applDt = DateUtil.getYYYYMMDDDate(applDt);
    }

    public String getInpTm() {
        return inpTm;
    }

    public void setInpTm(Date inpTm) {
        this.inpTm = DateUtil.getYYYYMMDDDate(inpTm);
    }

    public Short getRcvNo() {
        return rcvNo;
    }

    public void setRcvNo(Short rcvNo) {
        this.rcvNo = rcvNo;
    }

    public Short getInputRoute() {
        return inputRoute;
    }

    public void setInputRoute(Short inputRoute) {
        this.inputRoute = inputRoute;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent == null ? null : agent.trim();
    }

    public String getExecPriceInpTm() {
        return execPriceInpTm;
    }

    public void setExecPriceInpTm(Date execPriceInpTm) {
        this.execPriceInpTm = DateUtil.getYYYYMMDDDate(execPriceInpTm);
    }

    public String getExecTm() {
        return execTm;
    }

    public void setExecTm(Date execTm) {
        this.execTm = DateUtil.getYYYYMMDDDate(execTm);
    }

    public Short getLatstCnclCorrKbn() {
        return latstCnclCorrKbn;
    }

    public void setLatstCnclCorrKbn(Short latstCnclCorrKbn) {
        this.latstCnclCorrKbn = latstCnclCorrKbn;
    }

    public String getLatstInpTm() {
        return latstInpTm;
    }

    public void setLatstInpTm(Date latstInpTm) {
        this.latstInpTm = DateUtil.getYYYYMMDDDate(latstInpTm);
    }

    public Short getLatstInputRoute() {
        return latstInputRoute;
    }

    public void setLatstInputRoute(Short latstInputRoute) {
        this.latstInputRoute = latstInputRoute;
    }

    public String getLatstAgent() {
        return latstAgent;
    }

    public void setLatstAgent(String latstAgent) {
        this.latstAgent = latstAgent == null ? null : latstAgent.trim();
    }

    public String getHulftSendDt() {
        return hulftSendDt;
    }

    public void setHulftSendDt(Date hulftSendDt) {
        this.hulftSendDt = DateUtil.getYYYYMMDDDate(hulftSendDt);
    }

    public String getDataCd() {
        return dataCd;
    }

    public void setDataCd(String dataCd) {
        this.dataCd = dataCd == null ? null : dataCd.trim();
    }

    public Short getBranchCd() {
        return branchCd;
    }

    public void setBranchCd(Short branchCd) {
        this.branchCd = branchCd;
    }

    public Integer getClientCd() {
        return clientCd;
    }

    public void setClientCd(Integer clientCd) {
        this.clientCd = clientCd;
    }

    public Integer getSalesmanCd() {
        return salesmanCd;
    }

    public void setSalesmanCd(Integer salesmanCd) {
        this.salesmanCd = salesmanCd;
    }

    public Short getTradeKbn() {
        return tradeKbn;
    }

    public void setTradeKbn(Short tradeKbn) {
        this.tradeKbn = tradeKbn;
    }

    public Short getSonarTrdCd() {
        return sonarTrdCd;
    }

    public void setSonarTrdCd(Short sonarTrdCd) {
        this.sonarTrdCd = sonarTrdCd;
    }

    public String getTradeDt() {
        return tradeDt;
    }

    public void setTradeDt(Date tradeDt) {
        this.tradeDt = DateUtil.getYYYYMMDDDate(tradeDt);
    }

    public String getValueDt() {
        return valueDt;
    }

    public void setValueDt(Date valueDt) {
        this.valueDt = DateUtil.getYYYYMMDDDate(valueDt);
    }

    public String getNumCd() {
        return numCd;
    }

    public void setNumCd(String numCd) {
        this.numCd = numCd == null ? null : numCd.trim();
    }

    public String getSonarDscrCd() {
        return sonarDscrCd;
    }

    public void setSonarDscrCd(String sonarDscrCd) {
        this.sonarDscrCd = sonarDscrCd == null ? null : sonarDscrCd.trim();
    }

    public String getDscrNm() {
        return dscrNm;
    }

    public void setDscrNm(String dscrNm) {
        this.dscrNm = dscrNm == null ? null : dscrNm.trim();
    }

    public String getRedemptDt() {
        return redemptDt;
    }

    public void setRedemptDt(Date redemptDt) {
        this.redemptDt = DateUtil.getYYYYMMDDDate(redemptDt);
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public String getCouponKbn() {
        return couponKbn;
    }

    public void setCouponKbn(String couponKbn) {
        this.couponKbn = couponKbn == null ? null : couponKbn.trim();
    }

    public BigDecimal getExecPrice() {
        return execPrice;
    }

    public void setExecPrice(BigDecimal execPrice) {
        this.execPrice = execPrice;
    }

    public Short getInsiderFlg() {
        return insiderFlg;
    }

    public void setInsiderFlg(Short insiderFlg) {
        this.insiderFlg = insiderFlg;
    }

    public String getInsiderDscrCd() {
        return insiderDscrCd;
    }

    public void setInsiderDscrCd(String insiderDscrCd) {
        this.insiderDscrCd = insiderDscrCd == null ? null : insiderDscrCd.trim();
    }

    public Short getSpaKbn() {
        return spaKbn;
    }

    public void setSpaKbn(Short spaKbn) {
        this.spaKbn = spaKbn;
    }

	@Override
	public String toString() {
		return procDt + "," + ordNo + "," + trdTypCd + ","
				+ ordStsCd + "," + hulftSendFlg + "," + facePrice + "," + amount
				+ "," + passInterest + "," + tax + "," + balance + "," + trdTax
				+ "," + commissionAmount + "," + bondTrdTyp + "," + tradeRate
				+ "," + refPrice + "," + refAmount + "," + cnclCorrKbn + ","
				+ dscrCd + "," + applDt + "," + inpTm + "," + rcvNo + "," + inputRoute
				+ "," + agent + "," + execPriceInpTm + "," + execTm
				+ "," + latstCnclCorrKbn + "," + latstInpTm + ","
				+ latstInputRoute + "," + latstAgent + "," + hulftSendDt + "," + dataCd
				+ "," + branchCd + "," + clientCd + "," + salesmanCd + ","
				+ tradeKbn + "," + sonarTrdCd + "," + tradeDt + "," + valueDt + ","
				+ numCd + "," + sonarDscrCd + "," + dscrNm + "," + redemptDt
				+ "," + coupon + "," + couponKbn + "," + execPrice + ","
				+ insiderFlg + "," + insiderDscrCd + "," + spaKbn + ","
				+ getProcDt() + "," + getOrdNo() + "," + getTrdTypCd() + ","
				+ getOrdStsCd() + "," + getHulftSendFlg() + "," + getFacePrice()
				+ "," + getAmount() + "," + getPassInterest() + "," + getTax()
				+ "," + getBalance() + "," + getTrdTax() + ","
				+ getCommissionAmount() + "," + getBondTrdTyp() + "," + getTradeRate()
				+ "," + getRefPrice() + "," + getRefAmount() + ","
				+ getCnclCorrKbn() + "," + getDscrCd() + "," + getApplDt() + ","
				+ getInpTm() + "," + getRcvNo() + "," + getInputRoute() + ","
				+ getAgent() + "," + getExecPriceInpTm() + "," + getExecTm()
				+ "," + getLatstCnclCorrKbn() + "," + getLatstInpTm()
				+ "," + getLatstInputRoute() + "," + getLatstAgent()
				+ "," + getHulftSendDt() + "," + getDataCd() + ","
				+ getBranchCd() + "," + getClientCd() + "," + getSalesmanCd()
				+ "," + getTradeKbn() + "," + getSonarTrdCd() + ","
				+ getTradeDt() + "," + getValueDt() + "," + getNumCd() + ","
				+ getSonarDscrCd() + "," + getDscrNm() + "," + getRedemptDt()
				+ "," + getCoupon() + "," + getCouponKbn() + ","
				+ getExecPrice() + "," + getInsiderFlg() + "," + getInsiderDscrCd()
				+ "," + getSpaKbn();
		/**
		 *  + "," + getClass() + "," + hashCode()
				+ "," + super.toString() + "]"
		 */
	}

	

	
    
    
}