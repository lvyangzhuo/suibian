package com.example.suibian.modular.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.suibian.modular.sys.entity.Resources;
import com.example.suibian.modular.sys.model.SysResources;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lyz123
 * @since 2018-06-17
 */
public interface ISysResourcesService extends IService<SysResources> {

    List<Resources> listUrlAndPermission();

    List<Resources> listByUserId(Long userId);
}
