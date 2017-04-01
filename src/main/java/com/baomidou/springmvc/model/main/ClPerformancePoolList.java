package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 业绩池名单
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_performance_pool_list")
public class ClPerformancePoolList implements Serializable {

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
	 * 是否业绩池（0：不计入，1：计入）
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
