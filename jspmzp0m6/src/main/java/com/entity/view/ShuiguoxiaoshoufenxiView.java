package com.entity.view;

import com.entity.ShuiguoxiaoshoufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水果销售分析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
@TableName("shuiguoxiaoshoufenxi")
public class ShuiguoxiaoshoufenxiView  extends ShuiguoxiaoshoufenxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguoxiaoshoufenxiView(){
	}
 
 	public ShuiguoxiaoshoufenxiView(ShuiguoxiaoshoufenxiEntity shuiguoxiaoshoufenxiEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguoxiaoshoufenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
