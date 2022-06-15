package com.sankuai.inf.leaf.api;

import com.sankuai.inf.leaf.common.Result;

public interface IdService  {
    Result getId(String key);
    Result getId();
}
