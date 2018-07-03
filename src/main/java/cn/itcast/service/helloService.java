package cn.itcast.service;

import cn.itcast.entity.Hello;

public interface helloService {
    public Hello findById(int id) throws Exception;
}
