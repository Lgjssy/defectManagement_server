package com.example.demo.mapper;

import com.example.demo.entity.TEhistory;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TEhistoryMapper {
    public void   /*返回值改一下*/     addTEhistory(TEhistory tEhistory);//新建用例历史
    public void  /*返回值改一下*/     addResult(String result,String test_id);//输入执行结果
}