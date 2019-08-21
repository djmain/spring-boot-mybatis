package com.jay.spring.boot.mybatis.person;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by Jay on 2019/8/21
 */
@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService
{
    @Resource
    PersonMapper personMapper;

    @Override
    public List<Person> list()
    {
        return personMapper.listAll();
    }
}
