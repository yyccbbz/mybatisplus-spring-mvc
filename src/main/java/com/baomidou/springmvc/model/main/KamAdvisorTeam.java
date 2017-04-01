package com.baomidou.springmvc.model.main;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 投资顾问团队
 * </p>
 *
 * @author CuiCan
 * @since 2017-04-01
 */
@TableName("kam_advisor_team")
public class KamAdvisorTeam implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 团队名称
	 */
	@TableField(value="team_name")
	private String teamName;

	/**
	 * 团队长ID（= advisor.id）
	 */
	@TableField(value="team_leader_id")
	private Long teamLeaderId;

	/**
	 * 区域
	 */
	private String area;

	/**
	 * 备注
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

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getTeamLeaderId() {
		return teamLeaderId;
	}

	public void setTeamLeaderId(Long teamLeaderId) {
		this.teamLeaderId = teamLeaderId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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
