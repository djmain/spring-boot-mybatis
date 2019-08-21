package com.jay.spring.boot.mybatis.person;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * created by Jay on 2019/8/21
 */

@Repository
public interface PersonMapper
{
    List<Person> listAll();
}
