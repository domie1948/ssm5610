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


import com.dao.DiscussshuiguoxinxiDao;
import com.entity.DiscussshuiguoxinxiEntity;
import com.service.DiscussshuiguoxinxiService;
import com.entity.vo.DiscussshuiguoxinxiVO;
import com.entity.view.DiscussshuiguoxinxiView;

@Service("discussshuiguoxinxiService")
public class DiscussshuiguoxinxiServiceImpl extends ServiceImpl<DiscussshuiguoxinxiDao, DiscussshuiguoxinxiEntity> implements DiscussshuiguoxinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshuiguoxinxiEntity> page = this.selectPage(
                new Query<DiscussshuiguoxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshuiguoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		  Page<DiscussshuiguoxinxiView> page =new Query<DiscussshuiguoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshuiguoxinxiVO> selectListVO(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshuiguoxinxiVO selectVO(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshuiguoxinxiView> selectListView(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshuiguoxinxiView selectView(Wrapper<DiscussshuiguoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
