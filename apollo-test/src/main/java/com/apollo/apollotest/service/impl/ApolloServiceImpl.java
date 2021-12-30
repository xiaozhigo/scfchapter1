package com.apollo.apollotest.service.impl;

import com.apollo.apollotest.mysql.TestDao;
import com.apollo.apollotest.service.ApolloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ApolloServiceImpl implements ApolloService {

    @Autowired
    private TestDao dao;

    @Override
    public String getNowTime() {
        return dao.getNowTime();
    }
}
