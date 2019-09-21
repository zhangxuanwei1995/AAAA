package com.itheima.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.service.Hello;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = Hello.class,protocol="dubbo")
@Transactional
public class HelloImpl implements Hello {
    @Override
    public String fun(String name) {
        return ("lll hello: " + name);
    }
}
