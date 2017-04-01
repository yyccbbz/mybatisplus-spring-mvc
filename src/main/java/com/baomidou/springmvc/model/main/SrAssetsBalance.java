package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * [统计报表]--[资产余额]--assets balance
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("sr_assets_balance")
public class SrAssetsBalance implements Serializable {

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
	 * 投资顾问
	 */
	@TableField(value="investment_adviser")
	private String investmentAdviser;

	/**
	 * 注册日期
	 */
	@TableField(value="register_date")
	private String registerDate;

	/**
	 * 当前定期AUM
	 */
	@TableField(value="regular_assets_total")
	private String regularAssetsTotal;

	/**
	 * 当前活期AUM
	 */
	@TableField(value="current_assets_total")
	private String currentAssetsTotal;

	/**
	 * 当活包定AUM
	 */
	@TableField(value="crp_assets_total")
	private String crpAssetsTotal;

	/**
	 * 当前总AUM
	 */
	@TableField(value="aum_total")
	private String aumTotal;

	/**
	 * AUM时间点
	 */
	@TableField(value="aum_time_point")
	private String aumTimePoint;

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

	public String getInvestmentAdviser() {
		return investmentAdviser;
	}

	public void setInvestmentAdviser(String investmentAdviser) {
		this.investmentAdviser = investmentAdviser;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRegularAssetsTotal() {
		return regularAssetsTotal;
	}

	public void setRegularAssetsTotal(String regularAssetsTotal) {
		this.regularAssetsTotal = regularAssetsTotal;
	}

	public String getCurrentAssetsTotal() {
		return currentAssetsTotal;
	}

	public void setCurrentAssetsTotal(String currentAssetsTotal) {
		this.currentAssetsTotal = currentAssetsTotal;
	}

	public String getCrpAssetsTotal() {
		return crpAssetsTotal;
	}

	public void setCrpAssetsTotal(String crpAssetsTotal) {
		this.crpAssetsTotal = crpAssetsTotal;
	}

	public String getAumTotal() {
		return aumTotal;
	}

	public void setAumTotal(String aumTotal) {
		this.aumTotal = aumTotal;
	}

	public String getAumTimePoint() {
		return aumTimePoint;
	}

	public void setAumTimePoint(String aumTimePoint) {
		this.aumTimePoint = aumTimePoint;
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
