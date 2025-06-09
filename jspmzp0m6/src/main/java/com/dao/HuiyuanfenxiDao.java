package com.dao;

import com.entity.HuiyuanfenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanfenxiVO;
import com.entity.view.HuiyuanfenxiView;


/**
 * 会员分析
 * 
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface HuiyuanfenxiDao extends BaseMapper<HuiyuanfenxiEntity> {
	
	List<HuiyuanfenxiVO> selectListVO(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
	
	HuiyuanfenxiVO selectVO(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
	
	List<HuiyuanfenxiView> selectListView(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);

	List<HuiyuanfenxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
	
	HuiyuanfenxiView selectView(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
	
}
