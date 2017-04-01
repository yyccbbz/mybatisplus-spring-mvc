package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 外部拓展客户（导入名单）
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_ext_user_bak")
public class ClExtUserBak implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * excel关联id
	 */
	@TableField(value="excel_id")
	private Long excelId;

	/**
	 * 手机号码
	 */
	@TableField(value="phone_number")
	private Long phoneNumber;

	/**
	 * 投顾上传的客户姓名（待匹配系统客户姓名）
	 */
	@TableField(value="customer_name")
	private String customerName;

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
	 * 是否有效（1：有效，0：无效）
	 */
	@TableField(value="if_effective")
	private Integer ifEffective;

	/**
	 * 是否删除，0代表未删除，1代表删除
	 */
	@TableField(value="if_delete")
	private Integer ifDelete;

	/**
	 * 备注信息(用来记录上报无效的原因）
	 */
	private String remark;

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

	public Long getExcelId() {
		return excelId;
	}

	public void setExcelId(Long excelId) {
		this.excelId = excelId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	public Integer getIfEffective() {
		return ifEffective;
	}

	public void setIfEffective(Integer ifEffective) {
		this.ifEffective = ifEffective;
	}

	public Integer getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(Integer ifDelete) {
		this.ifDelete = ifDelete;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
