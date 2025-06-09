package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShuiguoleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShuiguoleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShuiguoleibieView;


/**
 * 水果类别
 *
 * @author 
 * @email 
 * @date 2021-03-02 12:49:11
 */
public interface ShuiguoleibieService extends IService<ShuiguoleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShuiguoleibieVO> selectListVO(Wrapper<ShuiguoleibieEntity> wrapper);
   	
   	ShuiguoleibieVO selectVO(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
   	
   	List<ShuiguoleibieView> selectListView(Wrapper<ShuiguoleibieEntity> wrapper);
   	
   	ShuiguoleibieView selectView(@Param("ew") Wrapper<ShuiguoleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShuiguoleibieEntity> wrapper);
   	
}

