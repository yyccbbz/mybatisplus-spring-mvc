package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 外部拓展客户
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_ext_user")
public class ClExtUser implements Serializable {

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
	 * 投资顾问
	 */
	@TableField(value="investment_adviser")
	private String investmentAdviser;

	/**
	 * 是否注册
	 */
	@TableField(value="if_register")
	private String ifRegister;

	/**
	 * 注册日期
	 */
	@TableField(value="register_date")
	private String registerDate;

	/**
	 * 是否实名
	 */
	@TableField(value="if_real_name")
	private String ifRealName;

	/**
	 * 是否绑卡
	 */
	@TableField(value="if_bind_card")
	private String ifBindCard;

	/**
	 * 是否有过交易
	 */
	@TableField(value="if_transaction")
	private String ifTransaction;

	/**
	 * 扫码推荐人
	 */
	private String referrer;

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

	public String getInvestmentAdviser() {
		return investmentAdviser;
	}

	public void setInvestmentAdviser(String investmentAdviser) {
		this.investmentAdviser = investmentAdviser;
	}

	public String getIfRegister() {
		return ifRegister;
	}

	public void setIfRegister(String ifRegister) {
		this.ifRegister = ifRegister;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getIfRealName() {
		return ifRealName;
	}

	public void setIfRealName(String ifRealName) {
		this.ifRealName = ifRealName;
	}

	public String getIfBindCard() {
		return ifBindCard;
	}

	public void setIfBindCard(String ifBindCard) {
		this.ifBindCard = ifBindCard;
	}

	public String getIfTransaction() {
		return ifTransaction;
	}

	public void setIfTransaction(String ifTransaction) {
		this.ifTransaction = ifTransaction;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
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
