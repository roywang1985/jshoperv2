package com.jshop.entity;

// Generated 2012-6-12 16:11:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * OrderT generated by hbm2java
 */
public class OrderT implements java.io.Serializable {

	private String orderid;
	private String userid;
	private String username;
	private String paymentid;
	private String paymentname;
	private String delivermode;
	private String deliverynumber;
	private String orderstate;
	private String logisticsid;
	private double freight;
	private double amount;
	private Double points;
	private Date purchasetime;
	private Date deliverytime;
	private String invoice;
	private String shippingaddressid;
	private String customernotes;
	private String logisticswebaddress;
	private Date paytime;
	private String orderTag;
	private String toBuyer;
	private double shouldpay;
	private double usepoints;
	private String vouchersid;
	private String goodid;
	private String goodsname;
	private Integer needquantity;
	private String paystate;
	private String shippingstate;
	private String deliveraddressid;
	private String shippingusername;
	private Date createtime;
	private String hasprintexpress;
	private String hasprintinvoice;
	private String hasprintfpinvoice;
	private String expressnumber;
	private String tradeNo;

	public OrderT() {
	}

	public OrderT(String orderid, String userid, String username,
			String paymentid, String paymentname, String delivermode,
			String orderstate, String logisticsid, double freight,
			double amount, Date purchasetime, String invoice,
			String shippingaddressid, double shouldpay, double usepoints,
			String paystate) {
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.delivermode = delivermode;
		this.orderstate = orderstate;
		this.logisticsid = logisticsid;
		this.freight = freight;
		this.amount = amount;
		this.purchasetime = purchasetime;
		this.invoice = invoice;
		this.shippingaddressid = shippingaddressid;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.paystate = paystate;
	}

	public OrderT(String orderid, String userid, String username,
			String paymentid, String paymentname, String delivermode,
			String deliverynumber, String orderstate, String logisticsid,
			double freight, double amount, Double points, Date purchasetime,
			Date deliverytime, String invoice, String shippingaddressid,
			String customernotes, String logisticswebaddress, Date paytime,
			String orderTag, String toBuyer, double shouldpay,
			double usepoints, String vouchersid, String goodid,
			String goodsname, Integer needquantity, String paystate,
			String shippingstate, String deliveraddressid,
			String shippingusername, Date createtime, String hasprintexpress,
			String hasprintinvoice, String hasprintfpinvoice,
			String expressnumber, String tradeNo) {
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.paymentid = paymentid;
		this.paymentname = paymentname;
		this.delivermode = delivermode;
		this.deliverynumber = deliverynumber;
		this.orderstate = orderstate;
		this.logisticsid = logisticsid;
		this.freight = freight;
		this.amount = amount;
		this.points = points;
		this.purchasetime = purchasetime;
		this.deliverytime = deliverytime;
		this.invoice = invoice;
		this.shippingaddressid = shippingaddressid;
		this.customernotes = customernotes;
		this.logisticswebaddress = logisticswebaddress;
		this.paytime = paytime;
		this.orderTag = orderTag;
		this.toBuyer = toBuyer;
		this.shouldpay = shouldpay;
		this.usepoints = usepoints;
		this.vouchersid = vouchersid;
		this.goodid = goodid;
		this.goodsname = goodsname;
		this.needquantity = needquantity;
		this.paystate = paystate;
		this.shippingstate = shippingstate;
		this.deliveraddressid = deliveraddressid;
		this.shippingusername = shippingusername;
		this.createtime = createtime;
		this.hasprintexpress = hasprintexpress;
		this.hasprintinvoice = hasprintinvoice;
		this.hasprintfpinvoice = hasprintfpinvoice;
		this.expressnumber = expressnumber;
		this.tradeNo = tradeNo;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPaymentid() {
		return this.paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public String getPaymentname() {
		return this.paymentname;
	}

	public void setPaymentname(String paymentname) {
		this.paymentname = paymentname;
	}

	public String getDelivermode() {
		return this.delivermode;
	}

	public void setDelivermode(String delivermode) {
		this.delivermode = delivermode;
	}

	public String getDeliverynumber() {
		return this.deliverynumber;
	}

	public void setDeliverynumber(String deliverynumber) {
		this.deliverynumber = deliverynumber;
	}

	public String getOrderstate() {
		return this.orderstate;
	}

	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}

	public String getLogisticsid() {
		return this.logisticsid;
	}

	public void setLogisticsid(String logisticsid) {
		this.logisticsid = logisticsid;
	}

	public double getFreight() {
		return this.freight;
	}

	public void setFreight(double freight) {
		this.freight = freight;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Double getPoints() {
		return this.points;
	}

	public void setPoints(Double points) {
		this.points = points;
	}

	public Date getPurchasetime() {
		return this.purchasetime;
	}

	public void setPurchasetime(Date purchasetime) {
		this.purchasetime = purchasetime;
	}

	public Date getDeliverytime() {
		return this.deliverytime;
	}

	public void setDeliverytime(Date deliverytime) {
		this.deliverytime = deliverytime;
	}

	public String getInvoice() {
		return this.invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getShippingaddressid() {
		return this.shippingaddressid;
	}

	public void setShippingaddressid(String shippingaddressid) {
		this.shippingaddressid = shippingaddressid;
	}

	public String getCustomernotes() {
		return this.customernotes;
	}

	public void setCustomernotes(String customernotes) {
		this.customernotes = customernotes;
	}

	public String getLogisticswebaddress() {
		return this.logisticswebaddress;
	}

	public void setLogisticswebaddress(String logisticswebaddress) {
		this.logisticswebaddress = logisticswebaddress;
	}

	public Date getPaytime() {
		return this.paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}

	public String getOrderTag() {
		return this.orderTag;
	}

	public void setOrderTag(String orderTag) {
		this.orderTag = orderTag;
	}

	public String getToBuyer() {
		return this.toBuyer;
	}

	public void setToBuyer(String toBuyer) {
		this.toBuyer = toBuyer;
	}

	public double getShouldpay() {
		return this.shouldpay;
	}

	public void setShouldpay(double shouldpay) {
		this.shouldpay = shouldpay;
	}

	public double getUsepoints() {
		return this.usepoints;
	}

	public void setUsepoints(double usepoints) {
		this.usepoints = usepoints;
	}

	public String getVouchersid() {
		return this.vouchersid;
	}

	public void setVouchersid(String vouchersid) {
		this.vouchersid = vouchersid;
	}

	public String getGoodid() {
		return this.goodid;
	}

	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}

	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Integer getNeedquantity() {
		return this.needquantity;
	}

	public void setNeedquantity(Integer needquantity) {
		this.needquantity = needquantity;
	}

	public String getPaystate() {
		return this.paystate;
	}

	public void setPaystate(String paystate) {
		this.paystate = paystate;
	}

	public String getShippingstate() {
		return this.shippingstate;
	}

	public void setShippingstate(String shippingstate) {
		this.shippingstate = shippingstate;
	}

	public String getDeliveraddressid() {
		return this.deliveraddressid;
	}

	public void setDeliveraddressid(String deliveraddressid) {
		this.deliveraddressid = deliveraddressid;
	}

	public String getShippingusername() {
		return this.shippingusername;
	}

	public void setShippingusername(String shippingusername) {
		this.shippingusername = shippingusername;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getHasprintexpress() {
		return this.hasprintexpress;
	}

	public void setHasprintexpress(String hasprintexpress) {
		this.hasprintexpress = hasprintexpress;
	}

	public String getHasprintinvoice() {
		return this.hasprintinvoice;
	}

	public void setHasprintinvoice(String hasprintinvoice) {
		this.hasprintinvoice = hasprintinvoice;
	}

	public String getHasprintfpinvoice() {
		return this.hasprintfpinvoice;
	}

	public void setHasprintfpinvoice(String hasprintfpinvoice) {
		this.hasprintfpinvoice = hasprintfpinvoice;
	}

	public String getExpressnumber() {
		return this.expressnumber;
	}

	public void setExpressnumber(String expressnumber) {
		this.expressnumber = expressnumber;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
