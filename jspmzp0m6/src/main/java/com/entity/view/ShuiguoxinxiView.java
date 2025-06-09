package com.entity.view;

import com.entity.ShuiguoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水果信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
@TableName("shuiguoxinxi")
public class ShuiguoxinxiView  extends ShuiguoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguoxinxiView(){
	}
 
 	public ShuiguoxinxiView(ShuiguoxinxiEntity shuiguoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
