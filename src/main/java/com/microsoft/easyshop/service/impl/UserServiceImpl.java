package com.microsoft.easyshop.service.impl;

import com.microsoft.easyshop.entity.User;
import com.microsoft.easyshop.mapper.UserMapper;
import com.microsoft.easyshop.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
