package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshuiguoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshuiguoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshuiguoxinxiView;


/**
 * 水果信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface DiscussshuiguoxinxiService extends IService<DiscussshuiguoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshuiguoxinxiVO> selectListVO(Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	DiscussshuiguoxinxiVO selectVO(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	List<DiscussshuiguoxinxiView> selectListView(Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	DiscussshuiguoxinxiView selectView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshuiguoxinxiEntity> wrapper);
   	
}

