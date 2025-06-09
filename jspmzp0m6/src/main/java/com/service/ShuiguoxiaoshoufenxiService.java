package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguoxiaoshoufenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguoxiaoshoufenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguoxiaoshoufenxiView;


/**
 * 水果销售分析
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface ShuiguoxiaoshoufenxiService extends IService<ShuiguoxiaoshoufenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguoxiaoshoufenxiVO> selectListVO(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
   	
   	ShuiguoxiaoshoufenxiVO selectVO(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
   	
   	List<ShuiguoxiaoshoufenxiView> selectListView(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
   	
   	ShuiguoxiaoshoufenxiView selectView(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
   	
}

