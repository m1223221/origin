package com.learn.testjiekou.controller;


import com.learn.testjiekou.entity.Type;
import com.learn.testjiekou.service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mcx
 * @since 2021-03-31
 */
@RestController
@RequestMapping("/type")
public class TypeController {

    @Autowired
    private ITypeService iTypeService;
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Type> findAll(){
        return iTypeService.list();
    }

}

