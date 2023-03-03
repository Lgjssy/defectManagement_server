package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Bug {
    private String Bug_Title;//标题
    private String Priority;//优先级
    private String Bug_Status;//状态
    private String Creator;//创建人
    private String Bug_Create_Date;//创建日期
    private String Bug_End_Date;//结束日期
    private String Assignee;//指派人
    private String Severity;//严重程度
    private String Operating_System;//操作系统
    private String Related_Modules;//相关模块
    private String Related_Tasks;//相关任务
    private String Related_Needs;//相关需求
    private String Person_In_Charge;//负责人
    private String Bug_Type;//Bug类型

    public String getBug_Title() {
        return Bug_Title;
    }

    public void setBug_Title(String bug_Title) {
        Bug_Title = bug_Title;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getBug_Status() {
        return Bug_Status;
    }

    public void setBug_Status(String bug_Status) {
        Bug_Status = bug_Status;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public String getBug_Create_Date() {
        return Bug_Create_Date;
    }

    public void setBug_Create_Date(String bug_Create_Date) {
        Bug_Create_Date = bug_Create_Date;
    }

    public String getBug_End_Date() {
        return Bug_End_Date;
    }

    public void setBug_End_Date(String bug_End_Date) {
        Bug_End_Date = bug_End_Date;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String assignee) {
        Assignee = assignee;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getOperating_System() {
        return Operating_System;
    }

    public void setOperating_System(String operating_System) {
        Operating_System = operating_System;
    }

    public String getRelated_Modules() {
        return Related_Modules;
    }

    public void setRelated_Modules(String related_Modules) {
        Related_Modules = related_Modules;
    }

    public String getRelated_Task() {
        return Related_Tasks;
    }

    public void setRelated_Task(String related_Task) {
        Related_Tasks = related_Task;
    }

    public String getRelated_Needs() {
        return Related_Needs;
    }

    public void setRelated_Needs(String related_Needs) {
        Related_Needs = related_Needs;
    }

    public String getPerson_In_Charge() {
        return Person_In_Charge;
    }

    public void setPerson_In_Charge(String person_In_Charge) {
        Person_In_Charge = person_In_Charge;
    }

    public String getBug_Type() {
        return Bug_Type;
    }

    public void setBug_Type(String bug_Type) {
        Bug_Type = bug_Type;
    }

    public Bug(String bug_Title, String priority, String bug_Status, String creator, String bug_Create_Date, String bug_End_Date, String assignee, String severity, String operating_System, String related_Modules, String related_Tasks, String related_Needs, String person_In_Charge, String bug_Type) {
        Bug_Title = bug_Title;
        Priority = priority;
        Bug_Status = bug_Status;
        Creator = creator;
        Bug_Create_Date = bug_Create_Date;
        Bug_End_Date = bug_End_Date;
        Assignee = assignee;
        Severity = severity;
        Operating_System = operating_System;
        Related_Modules = related_Modules;
        Related_Tasks = related_Tasks;
        Related_Needs = related_Needs;
        Person_In_Charge = person_In_Charge;
        Bug_Type = bug_Type;
    }
}
