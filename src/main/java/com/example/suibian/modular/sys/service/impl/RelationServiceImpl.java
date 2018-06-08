package com.example.suibian.modular.sys.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.suibian.modular.sys.dao.RelationMapper;
import com.example.suibian.modular.sys.model.Relation;
import com.example.suibian.modular.sys.service.IRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author stylefeng123
 * @since 2018-02-22
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
