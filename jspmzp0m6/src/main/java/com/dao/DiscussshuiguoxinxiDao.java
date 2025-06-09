package com.dao;

import com.entity.DiscussshuiguoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshuiguoxinxiVO;
import com.entity.view.DiscussshuiguoxinxiView;


/**
 * 水果信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface DiscussshuiguoxinxiDao extends BaseMapper<DiscussshuiguoxinxiEntity> {
	
	List<DiscussshuiguoxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	
	DiscussshuiguoxinxiVO selectVO(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	
	List<DiscussshuiguoxinxiView> selectListView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);

	List<DiscussshuiguoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	
	DiscussshuiguoxinxiView selectView(@Param("ew") Wrapper<DiscussshuiguoxinxiEntity> wrapper);
	
}
