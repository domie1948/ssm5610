package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShuiguoxiaoshoufenxiDao;
import com.entity.ShuiguoxiaoshoufenxiEntity;
import com.service.ShuiguoxiaoshoufenxiService;
import com.entity.vo.ShuiguoxiaoshoufenxiVO;
import com.entity.view.ShuiguoxiaoshoufenxiView;

@Service("shuiguoxiaoshoufenxiService")
public class ShuiguoxiaoshoufenxiServiceImpl extends ServiceImpl<ShuiguoxiaoshoufenxiDao, ShuiguoxiaoshoufenxiEntity> implements ShuiguoxiaoshoufenxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguoxiaoshoufenxiEntity> page = this.selectPage(
                new Query<ShuiguoxiaoshoufenxiEntity>(params).getPage(),
                new EntityWrapper<ShuiguoxiaoshoufenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper) {
		  Page<ShuiguoxiaoshoufenxiView> page =new Query<ShuiguoxiaoshoufenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguoxiaoshoufenxiVO> selectListVO(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguoxiaoshoufenxiVO selectVO(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguoxiaoshoufenxiView> selectListView(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguoxiaoshoufenxiView selectView(Wrapper<ShuiguoxiaoshoufenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
