package com.learn.testjiekou.service.impl;

import com.learn.testjiekou.entity.User;
import com.learn.testjiekou.mapper.UserMapper;
import com.learn.testjiekou.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mcx
 * @since 2021-03-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
