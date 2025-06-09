package com.dao;

import com.entity.ShuiguoxiaoshoufenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguoxiaoshoufenxiVO;
import com.entity.view.ShuiguoxiaoshoufenxiView;


/**
 * 水果销售分析
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface ShuiguoxiaoshoufenxiDao extends BaseMapper<ShuiguoxiaoshoufenxiEntity> {
	
	List<ShuiguoxiaoshoufenxiVO> selectListVO(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
	
	ShuiguoxiaoshoufenxiVO selectVO(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
	
	List<ShuiguoxiaoshoufenxiView> selectListView(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);

	List<ShuiguoxiaoshoufenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
	
	ShuiguoxiaoshoufenxiView selectView(@Param("ew") Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper);
	
}
