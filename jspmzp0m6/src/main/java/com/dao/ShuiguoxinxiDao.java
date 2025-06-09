package com.dao;

import com.entity.ShuiguoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguoxinxiVO;
import com.entity.view.ShuiguoxinxiView;


/**
 * 水果信息
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
public interface ShuiguoxinxiDao extends BaseMapper<ShuiguoxinxiEntity> {
	
	List<ShuiguoxinxiVO> selectListVO(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	
	ShuiguoxinxiVO selectVO(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	
	List<ShuiguoxinxiView> selectListView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);

	List<ShuiguoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	
	ShuiguoxinxiView selectView(@Param("ew") Wrapper<ShuiguoxinxiEntity> wrapper);
	
}
