package com.yimilan.yuwen.dao.api;

import com.yimilan.yuwen.domain.entity.api.BaseConfig;

public interface BaseConfigDao {
    int insert(BaseConfig record);

    int insertSelective(BaseConfig record);
}