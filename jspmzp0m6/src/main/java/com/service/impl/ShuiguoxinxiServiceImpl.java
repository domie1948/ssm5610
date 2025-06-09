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


import com.dao.ShuiguoxinxiDao;
import com.entity.ShuiguoxinxiEntity;
import com.service.ShuiguoxinxiService;
import com.entity.vo.ShuiguoxinxiVO;
import com.entity.view.ShuiguoxinxiView;

@Service("shuiguoxinxiService")
public class ShuiguoxinxiServiceImpl extends ServiceImpl<ShuiguoxinxiDao, ShuiguoxinxiEntity> implements ShuiguoxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguoxinxiEntity> page = this.selectPage(
                new Query<ShuiguoxinxiEntity>(params).getPage(),
                new EntityWrapper<ShuiguoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguoxinxiEntity> wrapper) {
		  Page<ShuiguoxinxiView> page =new Query<ShuiguoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguoxinxiVO> selectListVO(Wrapper<ShuiguoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguoxinxiVO selectVO(Wrapper<ShuiguoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguoxinxiView> selectListView(Wrapper<ShuiguoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguoxinxiView selectView(Wrapper<ShuiguoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
