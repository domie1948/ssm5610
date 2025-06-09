package com.entity.view;

import com.entity.ShuiguoleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 水果类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
@TableName("shuiguoleibie")
public class ShuiguoleibieView  extends ShuiguoleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShuiguoleibieView(){
	}
 
 	public ShuiguoleibieView(ShuiguoleibieEntity shuiguoleibieEntity){
 	try {
			BeanUtils.copyProperties(this, shuiguoleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
