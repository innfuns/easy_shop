package com.microsoft.easyshop.service.impl;

import com.microsoft.easyshop.entity.Location;
import com.microsoft.easyshop.mapper.LocationMapper;
import com.microsoft.easyshop.service.ILocationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2020-07-28
 */
@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location> implements ILocationService {

}
