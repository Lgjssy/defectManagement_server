package com.example.demo.mapper;

import com.example.demo.entity.Bug;
import com.example.demo.entity.Module;

import java.util.List;

public interface bugMapper {
    public List<Bug> findBugByPrincipal(String principal);//根据负责人查找Bug
    public List<Bug> findBugByStartData(String data);//根据start查找Bug
    public List<Bug> findAllBug();
    public List<Bug> findBugByEndData(String data);//根据start查找Bug
    public List<String> findBugStartData();//查询日期
    public List<String> findBugEndData();//查询日期
    public List<String> findBugName();//查询bug名
    public List<Bug> findBugByModule(String module);//根据模块查找Bug
    public List<Bug> findBugByName(String BugName);//Bug名
    public List<Bug> findBugByTypeName(String TypeName);//根据类型查找Bug
    public List<String> findBugType();//Bug名
    public List<Bug> findBugBySeverity(String Severity);
    public List<String> findBugSeverity();
    public List<Bug> findBugByPriority(String Priority);
    public List<String> findBugStatus();
    public List<Bug> findBugByStatus(String Status);
    public List<String> findBugPriority();
    public List<Bug> findBugByBuilder(String Builder);//根据创建人查找Bug
    public List<Bug> findBugByBuilderName(String Builder);//根据创建人查找Bug
    public List<String> findBugPrincipal();
    public List<Bug> findBugByPrincipalName(String PrincipalName);//根据创建人查找Bug
    public List<String> findBugAssignee();
    public List<Bug> findBugByAssigneeName(String PrincipalName);//根据创建人查找Bug
    public List<String> findBugBuilder();
    public List<Bug> findBugByClose(String condition,String principal);//根据状态和负责人查找Bug，即我关闭的或我完成的
    public List<Bug> findBugByMe(String userName,String module);//根据与我相关查找Bug,包括负责人，创建人，指派人
    public List<Bug> findBugBySearch1(String principal,String BugName,String module);//处于第一标签页
    public List<Bug> findBugBySearch2(String Builder,String BugName,String module);//处于第二标签页
    public List<Bug> findBugBySearch3(String condition,String principal,String BugName,String module);//处于第三，四标签页
    public      void     affirmBug(String BugName);//确认Bug
    public      String     findBugCondition(String BugName);//确认Bug
    public         void  closeBug(String BugName);//关闭Bug
    public          void fixBug(String BugName);//解决Bug
    public          void activateBug(String BugName);//激活Bug
    public          void assignBug(String BugName,String userName,String userName2);//指派Bug
    public          void deleteBug(String BugName);//删除Bug

    void setCloseUser(String UserName,String BugTitle);//删除Bug
    void setActiveUser(String UserName,String BugTitle);//删除Bug
    void setFinishUser(String UserName,String BugTitle);//删除Bug
    public void Insert_Bug(Bug bug);
}