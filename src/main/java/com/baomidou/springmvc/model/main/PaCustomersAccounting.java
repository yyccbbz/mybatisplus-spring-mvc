package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩核算]--[获客数核算]--customers accounting
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pa_customers_accounting")
public class PaCustomersAccounting implements Serializable {

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
	 * 注册日期
	 */
	@TableField(value="register_date")
	private String registerDate;

	/**
	 * 期末AUM
	 */
	@TableField(value="ending_balance")
	private String endingBalance;

	/**
	 * 期末AUM时间点
	 */
	@TableField(value="ending_balance_time_point")
	private String endingBalanceTimePoint;

	/**
	 * 期末不小于50万系数（0：不符合条件，1：符合条件）
	 */
	@TableField(value="ending_not_less_than_fifty")
	private Integer endingNotLessThanFifty;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_adviser")
	private String investmentAdviser;

	/**
	 * 投资金额
	 */
	@TableField(value="buy_amount")
	private String buyAmount;

	/**
	 * 本期兑付金额
	 */
	@TableField(value="current_amount_paid")
	private String currentAmountPaid;

	/**
	 * 期初AUM
	 */
	@TableField(value="beginning_balance")
	private String beginningBalance;

	/**
	 * 期初AUM时间点
	 */
	@TableField(value="beginning_balance_time_point")
	private String beginningBalanceTimePoint;

	/**
	 * 期初不大于50万系数（0：不符合条件，1：符合条件）
	 */
	@TableField(value="beginning_no_greater_than_fifty")
	private Integer beginningNoGreaterThanFifty;

	/**
	 * 客户标识
	 */
	@TableField(value="user_identify")
	private String userIdentify;

	/**
	 * 业绩池系数（0：不计入，1：计入）
	 */
	@TableField(value="if_performance_pool")
	private Integer ifPerformancePool;

	/**
	 * 投顾获客
	 */
	@TableField(value="advisor_get_customers")
	private Integer advisorGetCustomers;

	/**
	 * 比对历史获客（投顾）
	 */
	@TableField(value="comparison_historical_advisor")
	private Integer comparisonHistoricalAdvisor;

	/**
	 * 投顾获客去重
	 */
	@TableField(value="advisor_get_customers_remove_duplicates")
	private Integer advisorGetCustomersRemoveDuplicates;

	/**
	 * 中心获客
	 */
	@TableField(value="center_for_customers")
	private Integer centerForCustomers;

	/**
	 * 比对历史获客（中心）
	 */
	@TableField(value="comparison_historical_center")
	private Integer comparisonHistoricalCenter;

	/**
	 * 中心获客去重
	 */
	@TableField(value="center_for_customers_remove_duplicates")
	private Integer centerForCustomersRemoveDuplicates;

	/**
	 * 差错查询（预留字段）
	 */
	@TableField(value="error_query")
	private String errorQuery;

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

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getEndingBalance() {
		return endingBalance;
	}

	public void setEndingBalance(String endingBalance) {
		this.endingBalance = endingBalance;
	}

	public String getEndingBalanceTimePoint() {
		return endingBalanceTimePoint;
	}

	public void setEndingBalanceTimePoint(String endingBalanceTimePoint) {
		this.endingBalanceTimePoint = endingBalanceTimePoint;
	}

	public Integer getEndingNotLessThanFifty() {
		return endingNotLessThanFifty;
	}

	public void setEndingNotLessThanFifty(Integer endingNotLessThanFifty) {
		this.endingNotLessThanFifty = endingNotLessThanFifty;
	}

	public String getInvestmentAdviser() {
		return investmentAdviser;
	}

	public void setInvestmentAdviser(String investmentAdviser) {
		this.investmentAdviser = investmentAdviser;
	}

	public String getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(String buyAmount) {
		this.buyAmount = buyAmount;
	}

	public String getCurrentAmountPaid() {
		return currentAmountPaid;
	}

	public void setCurrentAmountPaid(String currentAmountPaid) {
		this.currentAmountPaid = currentAmountPaid;
	}

	public String getBeginningBalance() {
		return beginningBalance;
	}

	public void setBeginningBalance(String beginningBalance) {
		this.beginningBalance = beginningBalance;
	}

	public String getBeginningBalanceTimePoint() {
		return beginningBalanceTimePoint;
	}

	public void setBeginningBalanceTimePoint(String beginningBalanceTimePoint) {
		this.beginningBalanceTimePoint = beginningBalanceTimePoint;
	}

	public Integer getBeginningNoGreaterThanFifty() {
		return beginningNoGreaterThanFifty;
	}

	public void setBeginningNoGreaterThanFifty(Integer beginningNoGreaterThanFifty) {
		this.beginningNoGreaterThanFifty = beginningNoGreaterThanFifty;
	}

	public String getUserIdentify() {
		return userIdentify;
	}

	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	public Integer getIfPerformancePool() {
		return ifPerformancePool;
	}

	public void setIfPerformancePool(Integer ifPerformancePool) {
		this.ifPerformancePool = ifPerformancePool;
	}

	public Integer getAdvisorGetCustomers() {
		return advisorGetCustomers;
	}

	public void setAdvisorGetCustomers(Integer advisorGetCustomers) {
		this.advisorGetCustomers = advisorGetCustomers;
	}

	public Integer getComparisonHistoricalAdvisor() {
		return comparisonHistoricalAdvisor;
	}

	public void setComparisonHistoricalAdvisor(Integer comparisonHistoricalAdvisor) {
		this.comparisonHistoricalAdvisor = comparisonHistoricalAdvisor;
	}

	public Integer getAdvisorGetCustomersRemoveDuplicates() {
		return advisorGetCustomersRemoveDuplicates;
	}

	public void setAdvisorGetCustomersRemoveDuplicates(Integer advisorGetCustomersRemoveDuplicates) {
		this.advisorGetCustomersRemoveDuplicates = advisorGetCustomersRemoveDuplicates;
	}

	public Integer getCenterForCustomers() {
		return centerForCustomers;
	}

	public void setCenterForCustomers(Integer centerForCustomers) {
		this.centerForCustomers = centerForCustomers;
	}

	public Integer getComparisonHistoricalCenter() {
		return comparisonHistoricalCenter;
	}

	public void setComparisonHistoricalCenter(Integer comparisonHistoricalCenter) {
		this.comparisonHistoricalCenter = comparisonHistoricalCenter;
	}

	public Integer getCenterForCustomersRemoveDuplicates() {
		return centerForCustomersRemoveDuplicates;
	}

	public void setCenterForCustomersRemoveDuplicates(Integer centerForCustomersRemoveDuplicates) {
		this.centerForCustomersRemoveDuplicates = centerForCustomersRemoveDuplicates;
	}

	public String getErrorQuery() {
		return errorQuery;
	}

	public void setErrorQuery(String errorQuery) {
		this.errorQuery = errorQuery;
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
