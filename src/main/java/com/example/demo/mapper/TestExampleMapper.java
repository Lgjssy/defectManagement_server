package com.example.demo.mapper;

import com.example.demo.entity.TestExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestExampleMapper {
    public List<TestExample> findAllTe();
    public TestExample findTeById(int iD);
    public List<TestExample> findExByName(String Test_Case_Name);
    public List<TestExample> findExByExecutor(String Executor,String ModuleName);//根据执行人查找用例
    public List<TestExample> findExByBuilder(String Builder,String ModuleName);//根据创建人查找用例
    public List<TestExample> findExByUser(String userName,String ModuleName);//根据与我相关查找用例,包括执行人，创建人
    public List<TestExample> findExBySearch1(String Executor,int TEid,String ModuleName);//处于第一标签页的搜索
    public List<TestExample> findExBySearch2(String Builder,int TEid,String ModuleName);//处于第二标签页的搜索
    public List<TestExample> findExBySearch3(String userName,int TEid,String ModuleName);//处于第三标签页的搜索
    public List<TestExample> findExByPlan(int TestPlanNum);//根据测试计划查找用例
    public void    /*返回值改一下*/            changeExampleState(int TEid,String state);//恢复用例,变成正常
    public void   /*返回值改一下*/             changeExType(int TEid,String ExType);//修改类型
    public void   /*返回值改一下*/             changeExPriority(int TEid,int ExPriority);//修改优先级
    public void   /*返回值改一下*/             changeExKey(int TEid,String ExKey);//修改关键字
    public void   /*返回值改一下*/             changeExName(int TEid,String ExName);//修改用例名称
    public void   /*返回值改一下*/             changeExPCondition(int TEid,String ExPCondition);//修改前置条件
    public void   /*返回值改一下*/             changeExDes(int TEid,String ExDes);//修改备注
    public void   /*返回值改一下*/             addExample(TestExample testExample);//新建用例
    public void   /*返回值改一下*/             deleteExample(int TEid);//删除用例
}
