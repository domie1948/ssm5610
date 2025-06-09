package com.entity.view;

import com.entity.XiaoshoudanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
@TableName("xiaoshoudanwei")
public class XiaoshoudanweiView  extends XiaoshoudanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshoudanweiView(){
	}
 
 	public XiaoshoudanweiView(XiaoshoudanweiEntity xiaoshoudanweiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshoudanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
