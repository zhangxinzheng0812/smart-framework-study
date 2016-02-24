package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;
import org.smart4j.framework.util.CollectionUtil;

import java.util.Map;

/**
 * Created by yzy on 2016/2/23.
 */
public class Param {
    private Map<String, Object> paramMap;
    public Param(Map<String, Object> paramMap){
        this.paramMap = paramMap;
    }

    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String,Object> getMap(){
        return paramMap;
    }

    public boolean isEmpty(){
        return CollectionUtil.isEmpty(paramMap);
    }
}
