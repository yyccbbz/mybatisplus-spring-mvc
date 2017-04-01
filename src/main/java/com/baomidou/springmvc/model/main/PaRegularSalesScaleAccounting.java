package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩核算]--[定期销售规模核算]--regular sales scale accounting
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pa_regular_sales_scale_accounting")
public class PaRegularSalesScaleAccounting implements Serializable {

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
	 * 扫码推荐人
	 */
	private String referrer;

	/**
	 * 返利失效日期
	 */
	@TableField(value="rebate_expiration_date")
	private String rebateExpirationDate;

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
	 * 基础产品名称（定期）
	 */
	@TableField(value="basic_product_name")
	private String basicProductName;

	/**
	 * 投资金额
	 */
	@TableField(value="investment_amount")
	private String investmentAmount;

	/**
	 * 现有资产---当前定期AUM（资产总额）
	 */
	@TableField(value="regular_assets_total")
	private String regularAssetsTotal;

	/**
	 * 购买时间 0000-00-00 00:00:00
	 */
	@TableField(value="investment_date")
	private String investmentDate;

	/**
	 * 分配系数
	 */
	@TableField(value="partition_coefficient")
	private Integer partitionCoefficient;

	/**
	 * 业绩池系数
	 */
	@TableField(value="performance_pool_coefficient")
	private Integer performancePoolCoefficient;

	/**
	 * 产品系数
	 */
	@TableField(value="product_coefficient")
	private Integer productCoefficient;

	/**
	 * 有效销售金额（单位：元）
	 */
	@TableField(value="effective_sales_amount")
	private Double effectiveSalesAmount;

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

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getRebateExpirationDate() {
		return rebateExpirationDate;
	}

	public void setRebateExpirationDate(String rebateExpirationDate) {
		this.rebateExpirationDate = rebateExpirationDate;
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

	public String getBasicProductName() {
		return basicProductName;
	}

	public void setBasicProductName(String basicProductName) {
		this.basicProductName = basicProductName;
	}

	public String getInvestmentAmount() {
		return investmentAmount;
	}

	public void setInvestmentAmount(String investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public String getRegularAssetsTotal() {
		return regularAssetsTotal;
	}

	public void setRegularAssetsTotal(String regularAssetsTotal) {
		this.regularAssetsTotal = regularAssetsTotal;
	}

	public String getInvestmentDate() {
		return investmentDate;
	}

	public void setInvestmentDate(String investmentDate) {
		this.investmentDate = investmentDate;
	}

	public Integer getPartitionCoefficient() {
		return partitionCoefficient;
	}

	public void setPartitionCoefficient(Integer partitionCoefficient) {
		this.partitionCoefficient = partitionCoefficient;
	}

	public Integer getPerformancePoolCoefficient() {
		return performancePoolCoefficient;
	}

	public void setPerformancePoolCoefficient(Integer performancePoolCoefficient) {
		this.performancePoolCoefficient = performancePoolCoefficient;
	}

	public Integer getProductCoefficient() {
		return productCoefficient;
	}

	public void setProductCoefficient(Integer productCoefficient) {
		this.productCoefficient = productCoefficient;
	}

	public Double getEffectiveSalesAmount() {
		return effectiveSalesAmount;
	}

	public void setEffectiveSalesAmount(Double effectiveSalesAmount) {
		this.effectiveSalesAmount = effectiveSalesAmount;
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
