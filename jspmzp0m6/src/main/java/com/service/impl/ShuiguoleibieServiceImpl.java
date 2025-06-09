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


import com.dao.ShuiguoleibieDao;
import com.entity.ShuiguoleibieEntity;
import com.service.ShuiguoleibieService;
import com.entity.vo.ShuiguoleibieVO;
import com.entity.view.ShuiguoleibieView;

@Service("shuiguoleibieService")
public class ShuiguoleibieServiceImpl extends ServiceImpl<ShuiguoleibieDao, ShuiguoleibieEntity> implements ShuiguoleibieService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShuiguoleibieEntity> page = this.selectPage(
                new Query<ShuiguoleibieEntity>(params).getPage(),
                new EntityWrapper<ShuiguoleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShuiguoleibieEntity> wrapper) {
		  Page<ShuiguoleibieView> page =new Query<ShuiguoleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShuiguoleibieVO> selectListVO(Wrapper<ShuiguoleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShuiguoleibieVO selectVO(Wrapper<ShuiguoleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShuiguoleibieView> selectListView(Wrapper<ShuiguoleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShuiguoleibieView selectView(Wrapper<ShuiguoleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
