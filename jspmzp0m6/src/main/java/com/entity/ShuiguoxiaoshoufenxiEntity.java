package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 水果销售分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
@TableName("shuiguoxiaoshoufenxi")
public class ShuiguoxiaoshoufenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShuiguoxiaoshoufenxiEntity() {
		
	}
	
	public ShuiguoxiaoshoufenxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 种类
	 */
					
	private String zhonglei;
	
	/**
	 * 销售单位
	 */
					
	private String xiaoshoudanwei;
	
	/**
	 * 销售数量
	 */
					
	private Integer xiaoshoushuliang;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 进价
	 */
					
	private Integer jinjia;
	
	/**
	 * 利润
	 */
					
	private Integer lirun;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：种类
	 */
	public void setZhonglei(String zhonglei) {
		this.zhonglei = zhonglei;
	}
	/**
	 * 获取：种类
	 */
	public String getZhonglei() {
		return zhonglei;
	}
	/**
	 * 设置：销售单位
	 */
	public void setXiaoshoudanwei(String xiaoshoudanwei) {
		this.xiaoshoudanwei = xiaoshoudanwei;
	}
	/**
	 * 获取：销售单位
	 */
	public String getXiaoshoudanwei() {
		return xiaoshoudanwei;
	}
	/**
	 * 设置：销售数量
	 */
	public void setXiaoshoushuliang(Integer xiaoshoushuliang) {
		this.xiaoshoushuliang = xiaoshoushuliang;
	}
	/**
	 * 获取：销售数量
	 */
	public Integer getXiaoshoushuliang() {
		return xiaoshoushuliang;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：进价
	 */
	public void setJinjia(Integer jinjia) {
		this.jinjia = jinjia;
	}
	/**
	 * 获取：进价
	 */
	public Integer getJinjia() {
		return jinjia;
	}
	/**
	 * 设置：利润
	 */
	public void setLirun(Integer lirun) {
		this.lirun = lirun;
	}
	/**
	 * 获取：利润
	 */
	public Integer getLirun() {
		return lirun;
	}

}
