package com.example.suibian.modular.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.suibian.modular.sys.dao.SysResourcesMapper;
import com.example.suibian.modular.sys.entity.Resources;
import com.example.suibian.modular.sys.model.SysResources;
import com.example.suibian.modular.sys.service.ISysResourcesService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
@Service
public class SysResourcesServiceImpl extends ServiceImpl<SysResourcesMapper, SysResources> implements ISysResourcesService {

    @Resource
    private SysResourcesMapper resourcesMapper;

    /**
     * 获取资源的url和permission
     *
     * @return
     */
    @Override
    public List<Resources> listUrlAndPermission() {
        List<SysResources> sysResources = resourcesMapper.listUrlAndPermission();
        return getResources(sysResources);
    }

    /**
     * 获取用户关联的所有资源
     *
     * @param userId
     * @return
     */
    @Override
    public List<Resources> listByUserId(Long userId) {
        List<SysResources> sysResources = resourcesMapper.listByUserId(userId);
        return getResources(sysResources);
    }

    private List<Resources> getResources(List<SysResources> sysResources) {
        if (CollectionUtils.isEmpty(sysResources)) {
            return null;
        }
        List<Resources> resources = new ArrayList<Resources>();
        for (SysResources r : sysResources) {
            resources.add(new Resources(r));
        }
        return resources;
    }

}
