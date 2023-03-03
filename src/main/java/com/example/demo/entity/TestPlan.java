package com.example.demo.entity;

public class TestPlan {
    private int Test_Plan_Id;//测试计划ID
    private String Test_Plan_Name;//测试计划名称
    private String Human_resource_allocation;//人力资源
    private String principal;//负责人
    private String Start_Date;//开始日期
    private String End_Date;//结束日期
    private String State;//状态
    private String Priority;//优先级
    private String Owing_module;//优先级
    private String Test_risk;//所属模块
    private String Description;//测试风险

    public TestPlan(int test_Plan_Id, String test_Plan_Name, String human_resource_allocation, String principal, String start_Date, String end_Date, String state, String priority, String owing_module, String test_risk, String description) {
        Test_Plan_Id = test_Plan_Id;
        Test_Plan_Name = test_Plan_Name;
        Human_resource_allocation = human_resource_allocation;
        this.principal = principal;
        Start_Date = start_Date;
        End_Date = end_Date;
        State = state;
        Priority = priority;
        Owing_module = owing_module;
        Test_risk = test_risk;
        Description = description;
    }

    public TestPlan() {
    }

    public TestPlan(String test_plan_name, String human_resource_allocation, String principal, String start_date, String end_date, String state, String description, String priority, String owning_module, String test_risk) {
    Test_Plan_Name=test_plan_name;
    Human_resource_allocation=human_resource_allocation;
            this.principal=principal;
            Start_Date=start_date;
            End_Date=end_date;
            State=state;
            Priority=priority;
            Owing_module=owning_module;
            Test_risk=test_risk;
            Description=description;
    }

    public int getTest_Plan_Id() {
        return Test_Plan_Id;
    }

    public void setTest_Plan_Id(int test_Plan_Id) {
        Test_Plan_Id = test_Plan_Id;
    }

    public String getTest_Plan_Name() {
        return Test_Plan_Name;
    }

    public void setTest_Plan_Name(String test_Plan_Name) {
        Test_Plan_Name = test_Plan_Name;
    }

    public String getHuman_resource_allocation() {
        return Human_resource_allocation;
    }

    public void setHuman_resource_allocation(String human_resource_allocation) {
        Human_resource_allocation = human_resource_allocation;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(String start_Date) {
        Start_Date = start_Date;
    }

    public String getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(String end_Date) {
        End_Date = end_Date;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getOwing_module() {
        return Owing_module;
    }

    public void setOwing_module(String owing_module) {
        Owing_module = owing_module;
    }

    public String getTest_risk() {
        return Test_risk;
    }

    public void setTest_risk(String test_risk) {
        Test_risk = test_risk;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "TestPlan{" +
                "Test_Plan_Id=" + Test_Plan_Id +
                ", Test_Plan_Name='" + Test_Plan_Name + '\'' +
                ", Human_resource_allocation='" + Human_resource_allocation + '\'' +
                ", principal='" + principal + '\'' +
                ", Start_Date='" + Start_Date + '\'' +
                ", End_Date='" + End_Date + '\'' +
                ", State='" + State + '\'' +
                ", Priority='" + Priority + '\'' +
                ", Owing_module='" + Owing_module + '\'' +
                ", Test_risk='" + Test_risk + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public int getTestPlanNum() {
        return Test_Plan_Id;
    }
}
