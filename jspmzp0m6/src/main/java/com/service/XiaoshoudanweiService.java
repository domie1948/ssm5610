package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoudanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoudanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoudanweiView;


/**
 * 销售单位
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface XiaoshoudanweiService extends IService<XiaoshoudanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoudanweiVO> selectListVO(Wrapper<XiaoshoudanweiEntity> wrapper);
   	
   	XiaoshoudanweiVO selectVO(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
   	
   	List<XiaoshoudanweiView> selectListView(Wrapper<XiaoshoudanweiEntity> wrapper);
   	
   	XiaoshoudanweiView selectView(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoudanweiEntity> wrapper);
   	
}

