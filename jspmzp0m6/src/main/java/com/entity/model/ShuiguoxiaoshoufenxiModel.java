package com.entity.model;

import com.entity.ShuiguoxiaoshoufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 水果销售分析
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public class ShuiguoxiaoshoufenxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
