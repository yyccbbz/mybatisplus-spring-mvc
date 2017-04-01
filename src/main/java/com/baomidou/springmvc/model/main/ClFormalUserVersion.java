package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 正式名单的版本表，该表关联user和adviser,记录客户和投顾的对应关系。
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("cl_formal_user_version")
public class ClFormalUserVersion implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 客户ID
	 */
	@TableField(value="user_id")
	private Long userId;

	/**
	 * 投顾ID
	 */
	@TableField(value="advisor_id")
	private Long advisorId;

	/**
	 * 版本号:默认是1，依次递增
	 */
	@TableField(value="version_no")
	private String versionNo;

	/**
	 * 分配起始日期
	 */
	@TableField(value="start_date")
	private Date startDate;

	/**
	 * 分配结束日期，为NULL值表示没有结束日期
	 */
	@TableField(value="end_date")
	private Date endDate;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(Long advisorId) {
		this.advisorId = advisorId;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
