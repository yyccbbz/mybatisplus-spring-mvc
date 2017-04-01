package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [统计报表]--[定期到期兑付报表]
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("sr_regular_payment_due")
public class SrRegularPaymentDue implements Serializable {

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
	private String phoneNumber;

	/**
	 * 产品名称
	 */
	@TableField(value="product_name")
	private String productName;

	/**
	 * 兑付时间
	 */
	@TableField(value="redemption_date")
	private String redemptionDate;

	/**
	 * 本金
	 */
	private String principal;

	/**
	 * 产品收益
	 */
	@TableField(value="product_revenue")
	private String productRevenue;

	/**
	 * 划款金额
	 */
	@TableField(value="transfer_amount")
	private String transferAmount;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_advisor")
	private String investmentAdvisor;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRedemptionDate() {
		return redemptionDate;
	}

	public void setRedemptionDate(String redemptionDate) {
		this.redemptionDate = redemptionDate;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getProductRevenue() {
		return productRevenue;
	}

	public void setProductRevenue(String productRevenue) {
		this.productRevenue = productRevenue;
	}

	public String getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(String transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getInvestmentAdvisor() {
		return investmentAdvisor;
	}

	public void setInvestmentAdvisor(String investmentAdvisor) {
		this.investmentAdvisor = investmentAdvisor;
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
