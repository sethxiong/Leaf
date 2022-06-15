package com.sankuai.inf.leaf.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sankuai.inf.leaf.api.IdService;
import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.server.service.SnowflakeService;

import javax.annotation.Resource;

@Service(version = "1.0.0")
public class IdServiceImpl implements IdService {

    @Resource
    private SnowflakeService snowflakeService;

    public Result getId(String key) {
        return snowflakeService.getId(key);
    }

    @Override
    public Result getId() {
        return snowflakeService.getId(null);
    }

}
