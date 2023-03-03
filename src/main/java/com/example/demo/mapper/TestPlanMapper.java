package com.example.demo.mapper;


import com.example.demo.entity.TestPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestPlanMapper {
    public void addTestPlan(TestPlan testPlan);//新建测试计划
    public void updateTestPlan(TestPlan testPlan);//修改测试计划，通过TestPlan.TestPlanNum找到对应用例这里的testPlan里面的变量不一定都有，要判断是否为空，如testPlan.HR是否为空，为空不修改这个属性，不为空修改这个属性public void addTestPlan(TestPlan testPlan);//新建测试计划
    public void updateTestCondition(String Condition,int TestPlanNum);//修改测试计划的状态，修改状态后数据库需要在测试计划历史记录表里面加入一列（触发器实现）
    public List<TestPlan> findByPrincipal(String userName,String ModuleName);//根据负责人，模块名查找测试计划
    public List<TestPlan> findByModule(String ModuleName);//根据模块名查找测试计划
    public List<TestPlan> findAllPlan();
    public List<String> findAllPlanName();
    public List<TestPlan> findPlanByName(String TestPlanName);
}