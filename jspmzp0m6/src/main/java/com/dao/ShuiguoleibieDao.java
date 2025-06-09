package com.dao;

import com.entity.ShuiguoleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShuiguoleibieVO;
import com.entity.view.ShuiguoleibieView;


/**
 * 水果类别
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
public interface ShuiguoleibieDao extends BaseMapper<ShuiguoleibieEntity> {
	
	List<ShuiguoleibieVO> selectListVO(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
	
	ShuiguoleibieVO selectVO(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
	
	List<ShuiguoleibieView> selectListView(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);

	List<ShuiguoleibieView> selectListView(Pagination page,@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
	
	ShuiguoleibieView selectView(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
	
}
