package com.learn.testjiekou.service.impl;

import com.learn.testjiekou.entity.Book;
import com.learn.testjiekou.mapper.BookMapper;
import com.learn.testjiekou.service.IBookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
