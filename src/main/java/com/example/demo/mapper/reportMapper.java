package com.example.demo.mapper;

import com.example.demo.entity.Bug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface reportMapper {
    public List<Bug> findBugByModule(String ModuleName );//根据模块名统计Bug
    public List<Bug> findBugByDailyadd(String time ,String ModuleName);//根据每日新增统计Bug,包括右侧筛选标签
    public List<Bug> findBugByDailyclose(String time ,String ModuleName);//根据每日关闭统计Bug,包括右侧筛选标签
    public List<Bug> findBugByEachadd(String userName,String ModuleName);//根据每人增加统计Bug,包括右侧筛选标签
    public List<Bug> findBugByEachfinish(String userName, String  ModuleName);//根据每人完成统计Bug,包括右侧筛选标签
    public List<Bug> findBugByEachclose(String userName,String ModuleName);//根据每人关闭统计Bug,包括右侧筛选标签
    public List<Bug> findBugByType(String Type,String ModuleName);//根据每人关闭统计Bug,包括右侧筛选标签
    public List<Bug> findBugBySeverity(String Severity ,String ModuleName);//根据每人关闭统计Bug,包括右侧筛选标签
    public List<Bug> findBugByPriority(String Priority ,String ModuleName);//根据每人关闭统计Bug,包括右侧筛选标签
    public List<Bug> findBugByCondition(String Condition ,String ModuleName);//根据每人关闭统计Bug,包括右侧筛选标签
}
