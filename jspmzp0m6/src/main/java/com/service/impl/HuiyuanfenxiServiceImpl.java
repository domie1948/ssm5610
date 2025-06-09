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


import com.dao.HuiyuanfenxiDao;
import com.entity.HuiyuanfenxiEntity;
import com.service.HuiyuanfenxiService;
import com.entity.vo.HuiyuanfenxiVO;
import com.entity.view.HuiyuanfenxiView;

@Service("huiyuanfenxiService")
public class HuiyuanfenxiServiceImpl extends ServiceImpl<HuiyuanfenxiDao, HuiyuanfenxiEntity> implements HuiyuanfenxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanfenxiEntity> page = this.selectPage(
                new Query<HuiyuanfenxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanfenxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanfenxiEntity> wrapper) {
		  Page<HuiyuanfenxiView> page =new Query<HuiyuanfenxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanfenxiVO> selectListVO(Wrapper<HuiyuanfenxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanfenxiVO selectVO(Wrapper<HuiyuanfenxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanfenxiView> selectListView(Wrapper<HuiyuanfenxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanfenxiView selectView(Wrapper<HuiyuanfenxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
