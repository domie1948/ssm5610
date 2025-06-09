package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguoxinxiView;


/**
 * 水果信息
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
public interface ShuiguoxinxiService extends IService<ShuiguoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguoxinxiVO> selectListVO(Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	ShuiguoxinxiVO selectVO(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	List<ShuiguoxinxiView> selectListView(Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	ShuiguoxinxiView selectView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguoxinxiEntity> wrapper);
   	
}

