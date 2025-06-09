package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanfenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanfenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanfenxiView;


/**
 * 会员分析
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:12
 */
public interface HuiyuanfenxiService extends IService<HuiyuanfenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanfenxiVO> selectListVO(Wrapper<HuiyuanfenxiEntity> wrapper);
   	
   	HuiyuanfenxiVO selectVO(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
   	
   	List<HuiyuanfenxiView> selectListView(Wrapper<HuiyuanfenxiEntity> wrapper);
   	
   	HuiyuanfenxiView selectView(@Param("ew") Wrapper<HuiyuanfenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanfenxiEntity> wrapper);
   	
}

