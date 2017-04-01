package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 正式客户名单
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_formal_user")
public class ClFormalUser implements Serializable {

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
	 * 上报/分配
	 */
	@TableField(value="report_or_allot")
	private String reportOrAllot;

	/**
	 * 上报/分配时间
	 */
	@TableField(value="report_or_allot_date")
	private String reportOrAllotDate;

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
	 * 是否业绩池（0：否，1：是）
	 */
	@TableField(value="if_performance_pool")
	private Integer ifPerformancePool;

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

	public String getReportOrAllot() {
		return reportOrAllot;
	}

	public void setReportOrAllot(String reportOrAllot) {
		this.reportOrAllot = reportOrAllot;
	}

	public String getReportOrAllotDate() {
		return reportOrAllotDate;
	}

	public void setReportOrAllotDate(String reportOrAllotDate) {
		this.reportOrAllotDate = reportOrAllotDate;
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

	public Integer getIfPerformancePool() {
		return ifPerformancePool;
	}

	public void setIfPerformancePool(Integer ifPerformancePool) {
		this.ifPerformancePool = ifPerformancePool;
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
