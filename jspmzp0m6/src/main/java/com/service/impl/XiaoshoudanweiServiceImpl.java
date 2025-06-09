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


import com.dao.XiaoshoudanweiDao;
import com.entity.XiaoshoudanweiEntity;
import com.service.XiaoshoudanweiService;
import com.entity.vo.XiaoshoudanweiVO;
import com.entity.view.XiaoshoudanweiView;

@Service("xiaoshoudanweiService")
public class XiaoshoudanweiServiceImpl extends ServiceImpl<XiaoshoudanweiDao, XiaoshoudanweiEntity> implements XiaoshoudanweiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoudanweiEntity> page = this.selectPage(
                new Query<XiaoshoudanweiEntity>(params).getPage(),
                new EntityWrapper<XiaoshoudanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoudanweiEntity> wrapper) {
		  Page<XiaoshoudanweiView> page =new Query<XiaoshoudanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoudanweiVO> selectListVO(Wrapper<XiaoshoudanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoudanweiVO selectVO(Wrapper<XiaoshoudanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoudanweiView> selectListView(Wrapper<XiaoshoudanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoudanweiView selectView(Wrapper<XiaoshoudanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
