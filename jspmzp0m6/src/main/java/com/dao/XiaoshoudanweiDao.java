package com.dao;

import com.entity.XiaoshoudanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoudanweiVO;
import com.entity.view.XiaoshoudanweiView;


/**
 * 销售单位
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface XiaoshoudanweiDao extends BaseMapper<XiaoshoudanweiEntity> {
	
	List<XiaoshoudanweiVO> selectListVO(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
	
	XiaoshoudanweiVO selectVO(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
	
	List<XiaoshoudanweiView> selectListView(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);

	List<XiaoshoudanweiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
	
	XiaoshoudanweiView selectView(@Param("ew") Wrapper<XiaoshoudanweiEntity> wrapper);
	
}
