package com.learn.testjiekou.service.impl;

import com.learn.testjiekou.entity.Type;
import com.learn.testjiekou.mapper.TypeMapper;
import com.learn.testjiekou.service.ITypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements ITypeService {

}
