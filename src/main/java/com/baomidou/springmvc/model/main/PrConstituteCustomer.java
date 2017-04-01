package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩报表]--[获客构成]--constitute customer
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pr_constitute_customer")
public class PrConstituteCustomer implements Serializable {

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
	 * 计入业绩客户数
	 */
	@TableField(value="performance_customers_number")
	private String performanceCustomersNumber;

	/**
	 * 纯新增vip客户数
	 */
	@TableField(value="pure_new_vip_customers")
	private String pureNewVipCustomers;

	/**
	 * 上报客户数
	 */
	@TableField(value="reported_customers_number")
	private String reportedCustomersNumber;

	/**
	 * 分配客户数
	 */
	@TableField(value="allot_customers_number")
	private String allotCustomersNumber;

	/**
	 * 本周获客数
	 */
	@TableField(value="weekly_get_customers_number")
	private String weeklyGetCustomersNumber;

	/**
	 * 当前vip客户数
	 */
	@TableField(value="current_vip_customers_number")
	private String currentVipCustomersNumber;

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

	public String getPerformanceCustomersNumber() {
		return performanceCustomersNumber;
	}

	public void setPerformanceCustomersNumber(String performanceCustomersNumber) {
		this.performanceCustomersNumber = performanceCustomersNumber;
	}

	public String getPureNewVipCustomers() {
		return pureNewVipCustomers;
	}

	public void setPureNewVipCustomers(String pureNewVipCustomers) {
		this.pureNewVipCustomers = pureNewVipCustomers;
	}

	public String getReportedCustomersNumber() {
		return reportedCustomersNumber;
	}

	public void setReportedCustomersNumber(String reportedCustomersNumber) {
		this.reportedCustomersNumber = reportedCustomersNumber;
	}

	public String getAllotCustomersNumber() {
		return allotCustomersNumber;
	}

	public void setAllotCustomersNumber(String allotCustomersNumber) {
		this.allotCustomersNumber = allotCustomersNumber;
	}

	public String getWeeklyGetCustomersNumber() {
		return weeklyGetCustomersNumber;
	}

	public void setWeeklyGetCustomersNumber(String weeklyGetCustomersNumber) {
		this.weeklyGetCustomersNumber = weeklyGetCustomersNumber;
	}

	public String getCurrentVipCustomersNumber() {
		return currentVipCustomersNumber;
	}

	public void setCurrentVipCustomersNumber(String currentVipCustomersNumber) {
		this.currentVipCustomersNumber = currentVipCustomersNumber;
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
