package com.example.suibian.modular.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.suibian.modular.sys.model.Relation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
  * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
@Mapper
public interface RelationMapper extends BaseMapper<Relation> {

}