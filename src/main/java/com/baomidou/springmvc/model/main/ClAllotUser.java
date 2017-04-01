package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 平台待分配客户
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_allot_user")
public class ClAllotUser implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 手机号码
	 */
	@TableField(value="phone_number")
	private Long phoneNumber;

	/**
	 * 客户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 注册日期
	 */
	@TableField(value="register_date")
	private String registerDate;

	/**
	 * 证件号码
	 */
	@TableField(value="id_card")
	private String idCard;

	/**
	 * 是否员工
	 */
	@TableField(value="if_employee")
	private String ifEmployee;

	/**
	 * 资产总额
	 */
	@TableField(value="assets_amount")
	private String assetsAmount;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 年龄
	 */
	private String age;

	/**
	 * 出生日期
	 */
	private String birthday;

	/**
	 * 扫码推荐人
	 */
	private String referrer;

	/**
	 * 推荐人手机号
	 */
	@TableField(value="referrer_phone_number")
	private String referrerPhoneNumber;

	/**
	 * 推荐人是否员工
	 */
	@TableField(value="if_referrer_employee")
	private String ifReferrerEmployee;

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
	 * 是否删除;0:未删除，1:删除
	 */
	@TableField(value="if_delete")
	private Integer ifDelete;

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

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIfEmployee() {
		return ifEmployee;
	}

	public void setIfEmployee(String ifEmployee) {
		this.ifEmployee = ifEmployee;
	}

	public String getAssetsAmount() {
		return assetsAmount;
	}

	public void setAssetsAmount(String assetsAmount) {
		this.assetsAmount = assetsAmount;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	public String getReferrerPhoneNumber() {
		return referrerPhoneNumber;
	}

	public void setReferrerPhoneNumber(String referrerPhoneNumber) {
		this.referrerPhoneNumber = referrerPhoneNumber;
	}

	public String getIfReferrerEmployee() {
		return ifReferrerEmployee;
	}

	public void setIfReferrerEmployee(String ifReferrerEmployee) {
		this.ifReferrerEmployee = ifReferrerEmployee;
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

	public Integer getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(Integer ifDelete) {
		this.ifDelete = ifDelete;
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
