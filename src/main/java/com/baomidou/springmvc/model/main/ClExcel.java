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
@TableName("cl_excel")
public class ClExcel implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 自动编号
	 */
	private Long id;

	/**
	 * 当前用户ID
	 */
	@TableField(value="user_id")
	private Long userId;

	/**
	 * Excel源文件名
	 */
	@TableField(value="excel_name")
	private String excelName;

	/**
	 * Excel服务器文件名
	 */
	@TableField(value="excel_real_name")
	private String excelRealName;

	/**
	 * Excel服务器路径
	 */
	@TableField(value="excel_real_path")
	private String excelRealPath;

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

	public String getExcelName() {
		return excelName;
	}

	public void setExcelName(String excelName) {
		this.excelName = excelName;
	}

	public String getExcelRealName() {
		return excelRealName;
	}

	public void setExcelRealName(String excelRealName) {
		this.excelRealName = excelRealName;
	}

	public String getExcelRealPath() {
		return excelRealPath;
	}

	public void setExcelRealPath(String excelRealPath) {
		this.excelRealPath = excelRealPath;
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
