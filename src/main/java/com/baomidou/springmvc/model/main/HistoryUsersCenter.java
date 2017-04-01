package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("history_users_center")
public class HistoryUsersCenter implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 对比月份
	 */
	private String month;

	/**
	 * 用户手机
	 */
	@TableField(value="mobile_no")
	private Long mobileNo;

	/**
	 * 用户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 投资顾问
	 */
	@TableField(value="investment_adviser")
	private String investmentAdviser;

	/**
	 * 资产余额
	 */
	@TableField(value="aum_total")
	private Double aumTotal;

	/**
	 * 投顾获客折算系数
	 */
	@TableField(value="huoke_coefficient")
	private Integer huokeCoefficient;



	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInvestmentAdviser() {
		return investmentAdviser;
	}

	public void setInvestmentAdviser(String investmentAdviser) {
		this.investmentAdviser = investmentAdviser;
	}

	public Double getAumTotal() {
		return aumTotal;
	}

	public void setAumTotal(Double aumTotal) {
		this.aumTotal = aumTotal;
	}

	public Integer getHuokeCoefficient() {
		return huokeCoefficient;
	}

	public void setHuokeCoefficient(Integer huokeCoefficient) {
		this.huokeCoefficient = huokeCoefficient;
	}

}
