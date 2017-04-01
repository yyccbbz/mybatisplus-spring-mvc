package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩核算]--[活期销售规模核算]--current sales scale accounting
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pa_current_sales_scale_accounting")
public class PaCurrentSalesScaleAccounting implements Serializable {

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
	private Integer reportOrAllot;

	/**
	 * 上报/分配日期
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
	@TableField(value="basic_product_name")
	private String basicProductName;

	/**
	 * 申购金额（万元）
	 */
	@TableField(value="monthly_purchase_amount")
	private Double monthlyPurchaseAmount;

	/**
	 * 现有资产
	 */
	@TableField(value="current_assets_total")
	private String currentAssetsTotal;

	/**
	 * 申购日期
	 */
	@TableField(value="purchase_date")
	private String purchaseDate;

	/**
	 * 申购金额/10（千元）
	 */
	@TableField(value="monthly_purchase_amount_10")
	private Double monthlyPurchaseAmount0;

	/**
	 * 业绩池系数
	 */
	@TableField(value="performance_pool_coefficient")
	private Integer performancePoolCoefficient;

	/**
	 * 有效金额（万元）
	 */
	@TableField(value="effective_current_sales_scale")
	private Double effectiveCurrentSalesScale;

	/**
	 * 递延下月金额（万元）
	 */
	@TableField(value="deferred_next_month")
	private Double deferredNextMonth;

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

	public Integer getReportOrAllot() {
		return reportOrAllot;
	}

	public void setReportOrAllot(Integer reportOrAllot) {
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

	public String getBasicProductName() {
		return basicProductName;
	}

	public void setBasicProductName(String basicProductName) {
		this.basicProductName = basicProductName;
	}

	public Double getMonthlyPurchaseAmount() {
		return monthlyPurchaseAmount;
	}

	public void setMonthlyPurchaseAmount(Double monthlyPurchaseAmount) {
		this.monthlyPurchaseAmount = monthlyPurchaseAmount;
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

	public Double getMonthlyPurchaseAmount0() {
		return monthlyPurchaseAmount0;
	}

	public void setMonthlyPurchaseAmount0(Double monthlyPurchaseAmount0) {
		this.monthlyPurchaseAmount0 = monthlyPurchaseAmount0;
	}

	public Integer getPerformancePoolCoefficient() {
		return performancePoolCoefficient;
	}

	public void setPerformancePoolCoefficient(Integer performancePoolCoefficient) {
		this.performancePoolCoefficient = performancePoolCoefficient;
	}

	public Double getEffectiveCurrentSalesScale() {
		return effectiveCurrentSalesScale;
	}

	public void setEffectiveCurrentSalesScale(Double effectiveCurrentSalesScale) {
		this.effectiveCurrentSalesScale = effectiveCurrentSalesScale;
	}

	public Double getDeferredNextMonth() {
		return deferredNextMonth;
	}

	public void setDeferredNextMonth(Double deferredNextMonth) {
		this.deferredNextMonth = deferredNextMonth;
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
