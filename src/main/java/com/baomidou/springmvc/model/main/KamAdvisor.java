package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("kam_advisor")
public class KamAdvisor implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 所属团队ID（advisor_team.id）
	 */
	private Long tid;

	/**
	 * 投顾编号
	 */
	@TableField(value="serial_number")
	private String serialNumber;

	/**
	 * 投顾级别
	 */
	private String level;

	/**
	 * 系统登录用户名
	 */
	@TableField(value="system_name")
	private String systemName;

	/**
	 * 投顾姓名
	 */
	@TableField(value="actual_name")
	private String actualName;

	/**
	 * 投顾手机号码
	 */
	@TableField(value="phone_number")
	private String phoneNumber;

	/**
	 * 备注信息
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

	public Long getTid() {
		return tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
