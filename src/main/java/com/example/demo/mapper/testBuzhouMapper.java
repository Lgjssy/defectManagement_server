package com.example.demo.mapper;

import com.example.demo.entity.TestExample;
import com.example.demo.entity.testBuzhou;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface testBuzhouMapper {
    public void   /*返回值改一下*/             addBuzhou(testBuzhou Buzhou);//新建用例
    public void  /*返回值改一下*/             changeBuzhouContent(String content,int number,int ID);//修改步骤内容介绍
    public List<testBuzhou> findTestBuzhouByEx(int TEid);//根据用例查找步骤
}
