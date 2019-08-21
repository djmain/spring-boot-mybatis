package com.jay.spring.boot.mybatis.person;

/**
 * created by Jay on 2019/8/21
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PersonController
{
    @Resource
    PersonService personServiceImpl;

    @RequestMapping("/person/list")
    public List<Person> list()
    {
        return personServiceImpl.list();
    }
}
