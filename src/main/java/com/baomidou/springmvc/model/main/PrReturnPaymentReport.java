package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [业绩报表]--[回款报表]
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("pr_return_payment_report")
public class PrReturnPaymentReport implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 手机号码
	 */
	@TableField(value="phone_number")
	private String phoneNumber;

	/**
	 * 客户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_advisor")
	private String investmentAdvisor;

	/**
	 * 客户标识
	 */
	@TableField(value="user_identify")
	private String userIdentify;

	/**
	 * 产品名称
	 */
	@TableField(value="product_name")
	private String productName;

	/**
	 * 金额
	 */
	private String amount;

	/**
	 * 产品期限
	 */
	@TableField(value="product_period")
	private String productPeriod;

	/**
	 * 产品利率
	 */
	@TableField(value="product_interest_rate")
	private String productInterestRate;

	/**
	 * 起息日
	 */
	@TableField(value="interest_date")
	private String interestDate;

	/**
	 * 到期日
	 */
	@TableField(value="expiry_date")
	private String expiryDate;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInvestmentAdvisor() {
		return investmentAdvisor;
	}

	public void setInvestmentAdvisor(String investmentAdvisor) {
		this.investmentAdvisor = investmentAdvisor;
	}

	public String getUserIdentify() {
		return userIdentify;
	}

	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getProductPeriod() {
		return productPeriod;
	}

	public void setProductPeriod(String productPeriod) {
		this.productPeriod = productPeriod;
	}

	public String getProductInterestRate() {
		return productInterestRate;
	}

	public void setProductInterestRate(String productInterestRate) {
		this.productInterestRate = productInterestRate;
	}

	public String getInterestDate() {
		return interestDate;
	}

	public void setInterestDate(String interestDate) {
		this.interestDate = interestDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
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
