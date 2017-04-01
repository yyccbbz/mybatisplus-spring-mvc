package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [统计报表]--[活期销售明细]--current sales details
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("sr_current_sales_details")
public class SrCurrentSalesDetails implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 客户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 手机号码
	 */
	@TableField(value="phone_number")
	private Long phoneNumber;

	/**
	 * 上报/分配
	 */
	@TableField(value="report_or_allot")
	private String reportOrAllot;

	/**
	 * 上报/分配时间
	 */
	@TableField(value="report_or_allot_date")
	private String reportOrAllotDate;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_adviser")
	private String investmentAdviser;

	/**
	 * 客户标识
	 */
	@TableField(value="user_identify")
	private String userIdentify;

	/**
	 * 基础产品名称（活期）
	 */
	@TableField(value="base_product_name")
	private String baseProductName;

	/**
	 * 申购金额
	 */
	@TableField(value="purchase_amount")
	private String purchaseAmount;

	/**
	 * 现有资产---当前活期AUM（资产总额）
	 */
	@TableField(value="current_assets_total")
	private String currentAssetsTotal;

	/**
	 * 申购时间 0000-00-00 00:00:00
	 */
	@TableField(value="purchase_date")
	private String purchaseDate;

	/**
	 * 更新时间
	 */
	private Date mtime;

	/**
	 * 创建时间
	 */
	private Date ctime;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getReportOrAllot() {
		return reportOrAllot;
	}

	public void setReportOrAllot(String reportOrAllot) {
		this.reportOrAllot = reportOrAllot;
	}

	public String getReportOrAllotDate() {
		return reportOrAllotDate;
	}

	public void setReportOrAllotDate(String reportOrAllotDate) {
		this.reportOrAllotDate = reportOrAllotDate;
	}

	public String getInvestmentAdviser() {
		return investmentAdviser;
	}

	public void setInvestmentAdviser(String investmentAdviser) {
		this.investmentAdviser = investmentAdviser;
	}

	public String getUserIdentify() {
		return userIdentify;
	}

	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	public String getBaseProductName() {
		return baseProductName;
	}

	public void setBaseProductName(String baseProductName) {
		this.baseProductName = baseProductName;
	}

	public String getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public String getCurrentAssetsTotal() {
		return currentAssetsTotal;
	}

	public void setCurrentAssetsTotal(String currentAssetsTotal) {
		this.currentAssetsTotal = currentAssetsTotal;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getMtime() {
		return mtime;
	}

	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

}
