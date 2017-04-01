package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩报表]--[业绩报表]--performance report
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pr_performance_report")
public class PrPerformanceReport implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 区域
	 */
	private String area;

	/**
	 * 投顾组
	 */
	@TableField(value="team_name")
	private String teamName;

	/**
	 * 投顾级别
	 */
	@TableField(value="advisor_level")
	private String advisorLevel;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_advisor")
	private String investmentAdvisor;

	/**
	 * 当前vip客户数(人数)
	 */
	@TableField(value="current_vip_customers_number")
	private Integer currentVipCustomersNumber;

	/**
	 * 计入业绩客户AUM值（亿元）
	 */
	@TableField(value="performance_customers_aum")
	private Double performanceCustomersAum;

	/**
	 * 计入业绩客户数（人数）
	 */
	@TableField(value="performance_customers_number")
	private Integer performanceCustomersNumber;

	/**
	 * 上报客户数注册增长率
	 */
	@TableField(value="reported_customers_registered_growth_rate")
	private String reportedCustomersRegisteredGrowthRate;

	/**
	 * 上报客户交易数增长率
	 */
	@TableField(value="reported_customers_transactions_growth_rate")
	private String reportedCustomersTransactionsGrowthRate;

	/**
	 * 本月定期销售规模（万元）
	 */
	@TableField(value="monthly_regular_sales_scale")
	private Double monthlyRegularSalesScale;

	/**
	 * 本月活期申购额折算后(万元) 
	 */
	@TableField(value="monthly_current_sales_scale_conversion")
	private Double monthlyCurrentSalesScaleConversion;

	/**
	 * 本月活包定申购额折算后（万元）
	 */
	@TableField(value="monthly_cpr_sales_scale_conversion")
	private Double monthlyCprSalesScaleConversion;

	/**
	 * 当前销售规模(万元)
	 */
	@TableField(value="monthly_sales_scale")
	private Double monthlySalesScale;

	/**
	 * 月销售规模业绩目标(万元)
	 */
	@TableField(value="monthly_sales_scale_performance_targets")
	private Integer monthlySalesScalePerformanceTargets;

	/**
	 * 销售规模完成率
	 */
	@TableField(value="sales_completion_rate")
	private String salesCompletionRate;

	/**
	 * 小组销售规模(万元)
	 */
	@TableField(value="team_sales_scale")
	private Double teamSalesScale;

	/**
	 * 本月获客数(折算)
	 */
	@TableField(value="monthly_get_customers_number")
	private Integer monthlyGetCustomersNumber;

	/**
	 * 月度获客业绩目标(折算)
	 */
	@TableField(value="monthly_get_customers_target")
	private Integer monthlyGetCustomersTarget;

	/**
	 * 获客完成率
	 */
	@TableField(value="get_customers_completion_rate")
	private String getCustomersCompletionRate;

	/**
	 * 小组获客数量(折算)
	 */
	@TableField(value="team_get_customers_number")
	private Integer teamGetCustomersNumber;

	/**
	 * 综合完成率
	 */
	@TableField(value="comprehensive_completion_rate")
	private String comprehensiveCompletionRate;

	/**
	 * 综合完成率排名
	 */
	@TableField(value="comprehensive_completion_rate_ranking")
	private Integer comprehensiveCompletionRateRanking;

	/**
	 * 小组综合完成率
	 */
	@TableField(value="team_comprehensive_completion_rate")
	private String teamComprehensiveCompletionRate;

	/**
	 * 版本（格式为年月 201612、201701）
	 */
	private Integer version;

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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getAdvisorLevel() {
		return advisorLevel;
	}

	public void setAdvisorLevel(String advisorLevel) {
		this.advisorLevel = advisorLevel;
	}

	public String getInvestmentAdvisor() {
		return investmentAdvisor;
	}

	public void setInvestmentAdvisor(String investmentAdvisor) {
		this.investmentAdvisor = investmentAdvisor;
	}

	public Integer getCurrentVipCustomersNumber() {
		return currentVipCustomersNumber;
	}

	public void setCurrentVipCustomersNumber(Integer currentVipCustomersNumber) {
		this.currentVipCustomersNumber = currentVipCustomersNumber;
	}

	public Double getPerformanceCustomersAum() {
		return performanceCustomersAum;
	}

	public void setPerformanceCustomersAum(Double performanceCustomersAum) {
		this.performanceCustomersAum = performanceCustomersAum;
	}

	public Integer getPerformanceCustomersNumber() {
		return performanceCustomersNumber;
	}

	public void setPerformanceCustomersNumber(Integer performanceCustomersNumber) {
		this.performanceCustomersNumber = performanceCustomersNumber;
	}

	public String getReportedCustomersRegisteredGrowthRate() {
		return reportedCustomersRegisteredGrowthRate;
	}

	public void setReportedCustomersRegisteredGrowthRate(String reportedCustomersRegisteredGrowthRate) {
		this.reportedCustomersRegisteredGrowthRate = reportedCustomersRegisteredGrowthRate;
	}

	public String getReportedCustomersTransactionsGrowthRate() {
		return reportedCustomersTransactionsGrowthRate;
	}

	public void setReportedCustomersTransactionsGrowthRate(String reportedCustomersTransactionsGrowthRate) {
		this.reportedCustomersTransactionsGrowthRate = reportedCustomersTransactionsGrowthRate;
	}

	public Double getMonthlyRegularSalesScale() {
		return monthlyRegularSalesScale;
	}

	public void setMonthlyRegularSalesScale(Double monthlyRegularSalesScale) {
		this.monthlyRegularSalesScale = monthlyRegularSalesScale;
	}

	public Double getMonthlyCurrentSalesScaleConversion() {
		return monthlyCurrentSalesScaleConversion;
	}

	public void setMonthlyCurrentSalesScaleConversion(Double monthlyCurrentSalesScaleConversion) {
		this.monthlyCurrentSalesScaleConversion = monthlyCurrentSalesScaleConversion;
	}

	public Double getMonthlyCprSalesScaleConversion() {
		return monthlyCprSalesScaleConversion;
	}

	public void setMonthlyCprSalesScaleConversion(Double monthlyCprSalesScaleConversion) {
		this.monthlyCprSalesScaleConversion = monthlyCprSalesScaleConversion;
	}

	public Double getMonthlySalesScale() {
		return monthlySalesScale;
	}

	public void setMonthlySalesScale(Double monthlySalesScale) {
		this.monthlySalesScale = monthlySalesScale;
	}

	public Integer getMonthlySalesScalePerformanceTargets() {
		return monthlySalesScalePerformanceTargets;
	}

	public void setMonthlySalesScalePerformanceTargets(Integer monthlySalesScalePerformanceTargets) {
		this.monthlySalesScalePerformanceTargets = monthlySalesScalePerformanceTargets;
	}

	public String getSalesCompletionRate() {
		return salesCompletionRate;
	}

	public void setSalesCompletionRate(String salesCompletionRate) {
		this.salesCompletionRate = salesCompletionRate;
	}

	public Double getTeamSalesScale() {
		return teamSalesScale;
	}

	public void setTeamSalesScale(Double teamSalesScale) {
		this.teamSalesScale = teamSalesScale;
	}

	public Integer getMonthlyGetCustomersNumber() {
		return monthlyGetCustomersNumber;
	}

	public void setMonthlyGetCustomersNumber(Integer monthlyGetCustomersNumber) {
		this.monthlyGetCustomersNumber = monthlyGetCustomersNumber;
	}

	public Integer getMonthlyGetCustomersTarget() {
		return monthlyGetCustomersTarget;
	}

	public void setMonthlyGetCustomersTarget(Integer monthlyGetCustomersTarget) {
		this.monthlyGetCustomersTarget = monthlyGetCustomersTarget;
	}

	public String getGetCustomersCompletionRate() {
		return getCustomersCompletionRate;
	}

	public void setGetCustomersCompletionRate(String getCustomersCompletionRate) {
		this.getCustomersCompletionRate = getCustomersCompletionRate;
	}

	public Integer getTeamGetCustomersNumber() {
		return teamGetCustomersNumber;
	}

	public void setTeamGetCustomersNumber(Integer teamGetCustomersNumber) {
		this.teamGetCustomersNumber = teamGetCustomersNumber;
	}

	public String getComprehensiveCompletionRate() {
		return comprehensiveCompletionRate;
	}

	public void setComprehensiveCompletionRate(String comprehensiveCompletionRate) {
		this.comprehensiveCompletionRate = comprehensiveCompletionRate;
	}

	public Integer getComprehensiveCompletionRateRanking() {
		return comprehensiveCompletionRateRanking;
	}

	public void setComprehensiveCompletionRateRanking(Integer comprehensiveCompletionRateRanking) {
		this.comprehensiveCompletionRateRanking = comprehensiveCompletionRateRanking;
	}

	public String getTeamComprehensiveCompletionRate() {
		return teamComprehensiveCompletionRate;
	}

	public void setTeamComprehensiveCompletionRate(String teamComprehensiveCompletionRate) {
		this.teamComprehensiveCompletionRate = teamComprehensiveCompletionRate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
