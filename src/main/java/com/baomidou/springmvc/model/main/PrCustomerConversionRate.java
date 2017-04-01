package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩报表]--[客户转换率]--customer conversion rate
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pr_customer_conversion_rate")
public class PrCustomerConversionRate implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_advisor")
	private String investmentAdvisor;

	/**
	 * 上期客户数
	 */
	@TableField(value="last_period_customers_number")
	private String lastPeriodCustomersNumber;

	/**
	 * 本期客户数
	 */
	@TableField(value="current_period_customers_number")
	private String currentPeriodCustomersNumber;

	/**
	 * 上期注册客户数
	 */
	@TableField(value="last_period_registered_customers_number")
	private String lastPeriodRegisteredCustomersNumber;

	/**
	 * 本期注册客户数
	 */
	@TableField(value="current_period_registered_customers_number")
	private String currentPeriodRegisteredCustomersNumber;

	/**
	 * 上期客户交易数
	 */
	@TableField(value="last_period_transaction_customers_number")
	private String lastPeriodTransactionCustomersNumber;

	/**
	 * 本期客户交易数
	 */
	@TableField(value="current_period_transaction_customers_number")
	private String currentPeriodTransactionCustomersNumber;

	/**
	 * 本期注册客户占比
	 */
	@TableField(value="current_period_registered_customers_proportion")
	private String currentPeriodRegisteredCustomersProportion;

	/**
	 * 客户注册增长率
	 */
	@TableField(value="customer_registration_growth_rate")
	private String customerRegistrationGrowthRate;

	/**
	 * 本期交易客户占比
	 */
	@TableField(value="current_period_transactions_customers_proportion")
	private String currentPeriodTransactionsCustomersProportion;

	/**
	 * 客户交易转换率
	 */
	@TableField(value="customer_transaction_conversion_rate")
	private String customerTransactionConversionRate;

	/**
	 * 本期客户AUM增长率(期末基准)
	 */
	@TableField(value="current_period_customers_aum_growth_rate")
	private String currentPeriodCustomersAumGrowthRate;

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

	public String getInvestmentAdvisor() {
		return investmentAdvisor;
	}

	public void setInvestmentAdvisor(String investmentAdvisor) {
		this.investmentAdvisor = investmentAdvisor;
	}

	public String getLastPeriodCustomersNumber() {
		return lastPeriodCustomersNumber;
	}

	public void setLastPeriodCustomersNumber(String lastPeriodCustomersNumber) {
		this.lastPeriodCustomersNumber = lastPeriodCustomersNumber;
	}

	public String getCurrentPeriodCustomersNumber() {
		return currentPeriodCustomersNumber;
	}

	public void setCurrentPeriodCustomersNumber(String currentPeriodCustomersNumber) {
		this.currentPeriodCustomersNumber = currentPeriodCustomersNumber;
	}

	public String getLastPeriodRegisteredCustomersNumber() {
		return lastPeriodRegisteredCustomersNumber;
	}

	public void setLastPeriodRegisteredCustomersNumber(String lastPeriodRegisteredCustomersNumber) {
		this.lastPeriodRegisteredCustomersNumber = lastPeriodRegisteredCustomersNumber;
	}

	public String getCurrentPeriodRegisteredCustomersNumber() {
		return currentPeriodRegisteredCustomersNumber;
	}

	public void setCurrentPeriodRegisteredCustomersNumber(String currentPeriodRegisteredCustomersNumber) {
		this.currentPeriodRegisteredCustomersNumber = currentPeriodRegisteredCustomersNumber;
	}

	public String getLastPeriodTransactionCustomersNumber() {
		return lastPeriodTransactionCustomersNumber;
	}

	public void setLastPeriodTransactionCustomersNumber(String lastPeriodTransactionCustomersNumber) {
		this.lastPeriodTransactionCustomersNumber = lastPeriodTransactionCustomersNumber;
	}

	public String getCurrentPeriodTransactionCustomersNumber() {
		return currentPeriodTransactionCustomersNumber;
	}

	public void setCurrentPeriodTransactionCustomersNumber(String currentPeriodTransactionCustomersNumber) {
		this.currentPeriodTransactionCustomersNumber = currentPeriodTransactionCustomersNumber;
	}

	public String getCurrentPeriodRegisteredCustomersProportion() {
		return currentPeriodRegisteredCustomersProportion;
	}

	public void setCurrentPeriodRegisteredCustomersProportion(String currentPeriodRegisteredCustomersProportion) {
		this.currentPeriodRegisteredCustomersProportion = currentPeriodRegisteredCustomersProportion;
	}

	public String getCustomerRegistrationGrowthRate() {
		return customerRegistrationGrowthRate;
	}

	public void setCustomerRegistrationGrowthRate(String customerRegistrationGrowthRate) {
		this.customerRegistrationGrowthRate = customerRegistrationGrowthRate;
	}

	public String getCurrentPeriodTransactionsCustomersProportion() {
		return currentPeriodTransactionsCustomersProportion;
	}

	public void setCurrentPeriodTransactionsCustomersProportion(String currentPeriodTransactionsCustomersProportion) {
		this.currentPeriodTransactionsCustomersProportion = currentPeriodTransactionsCustomersProportion;
	}

	public String getCustomerTransactionConversionRate() {
		return customerTransactionConversionRate;
	}

	public void setCustomerTransactionConversionRate(String customerTransactionConversionRate) {
		this.customerTransactionConversionRate = customerTransactionConversionRate;
	}

	public String getCurrentPeriodCustomersAumGrowthRate() {
		return currentPeriodCustomersAumGrowthRate;
	}

	public void setCurrentPeriodCustomersAumGrowthRate(String currentPeriodCustomersAumGrowthRate) {
		this.currentPeriodCustomersAumGrowthRate = currentPeriodCustomersAumGrowthRate;
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
