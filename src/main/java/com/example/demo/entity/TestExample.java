package com.example.demo.entity;

public class TestExample {//测试用例
    private Integer Test_Case_ID;//用例ID
    private String Test_Case_Name;//用例名称
    private String Test_Case_Type;//用例类型
    private String Creator;//创建人
    private String Executor;//执行人
    private String Result;//结果
    private Integer Number_Of_Execution_Result;//执行结果数
    private Integer Number_Of_Bug;//用例产生Bug数
    private int Use_Case_Steps;//用力步骤编号
    private String State;//状态
    private String Precondition;//前置条件
    private String Owning_Module_Name;//所属模块
    private String Priority;//优先级
    private String Key_Words;//关键词
    private String Description;//描述
    private String Applicable_Stage;//适用阶段
    private String Execution_Time;//执行时间
    private int Text_plan;//测试计划

    public TestExample(Integer test_Case_ID, String test_Case_Name, String test_Case_Type, String creator, String executor, String result, Integer number_Of_Execution_Result, Integer number_Of_Bug, int use_Case_Steps, String state, String precondition, String owning_Module_Name, String priority, String key_Words, String description, String applicable_Stage, String execution_Time, int text_plan) {
        Test_Case_ID = test_Case_ID;
        Test_Case_Name = test_Case_Name;
        Test_Case_Type = test_Case_Type;
        Creator = creator;
        Executor = executor;
        Result = result;
        Number_Of_Execution_Result = number_Of_Execution_Result;
        Number_Of_Bug = number_Of_Bug;
        Use_Case_Steps = use_Case_Steps;
        State = state;
        Precondition = precondition;
        Owning_Module_Name = owning_Module_Name;
        Priority = priority;
        Key_Words = key_Words;
        Description = description;
        Applicable_Stage = applicable_Stage;
        Execution_Time = execution_Time;
        Text_plan = text_plan;
    }
    public TestExample(String test_Case_Name, String test_Case_Type, String creator, String executor, String result, Integer number_Of_Execution_Result, Integer number_Of_Bug, int use_Case_Steps, String state, String precondition, String owning_Module_Name, String priority, String key_Words, String description, String applicable_Stage, String execution_Time, int text_plan) {
        Test_Case_ID=-1;
        Test_Case_Name = test_Case_Name;
        Test_Case_Type = test_Case_Type;
        Creator = creator;
        Executor = executor;
        Result = result;
        Number_Of_Execution_Result = number_Of_Execution_Result;
        Number_Of_Bug = number_Of_Bug;
        Use_Case_Steps = use_Case_Steps;
        State = state;
        Precondition = precondition;
        Owning_Module_Name = owning_Module_Name;
        Priority = priority;
        Key_Words = key_Words;
        Description = description;
        Applicable_Stage = applicable_Stage;
        Execution_Time = execution_Time;
        Text_plan = text_plan;
    }

    public TestExample() {
    }

    public Integer getTest_Case_ID() {
        return Test_Case_ID;
    }

    public void setTest_Case_ID(Integer test_Case_ID) {
        Test_Case_ID = test_Case_ID;
    }

    public String getTest_Case_Name() {
        return Test_Case_Name;
    }

    public void setTest_Case_Name(String test_Case_Name) {
        Test_Case_Name = test_Case_Name;
    }

    public String getTest_Case_Type() {
        return Test_Case_Type;
    }

    public void setTest_Case_Type(String test_Case_Type) {
        Test_Case_Type = test_Case_Type;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public String getExecutor() {
        return Executor;
    }

    public void setExecutor(String executor) {
        Executor = executor;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public Integer getNumber_Of_Execution_Result() {
        return Number_Of_Execution_Result;
    }

    public void setNumber_Of_Execution_Result(Integer number_Of_Execution_Result) {
        Number_Of_Execution_Result = number_Of_Execution_Result;
    }

    public Integer getNumber_Of_Bug() {
        return Number_Of_Bug;
    }

    public void setNumber_Of_Bug(Integer number_Of_Bug) {
        Number_Of_Bug = number_Of_Bug;
    }

    public int getUse_Case_Steps() {
        return Use_Case_Steps;
    }

    public void setUse_Case_Steps(int use_Case_Steps) {
        Use_Case_Steps = use_Case_Steps;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPrecondition() {
        return Precondition;
    }

    public void setPrecondition(String precondition) {
        Precondition = precondition;
    }

    public String getOwning_Module_Name() {
        return Owning_Module_Name;
    }

    public void setOwning_Module_Name(String owning_Module_Name) {
        Owning_Module_Name = owning_Module_Name;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getKey_Words() {
        return Key_Words;
    }

    public void setKey_Words(String key_Words) {
        Key_Words = key_Words;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getApplicable_Stage() {
        return Applicable_Stage;
    }

    public void setApplicable_Stage(String applicable_Stage) {
        Applicable_Stage = applicable_Stage;
    }

    public String getExecution_Time() {
        return Execution_Time;
    }

    public void setExecution_Time(String execution_Time) {
        Execution_Time = execution_Time;
    }

    public int getText_plan() {
        return Text_plan;
    }

    public void setText_plan(int text_plan) {
        Text_plan = text_plan;
    }

    @Override
    public String toString() {
        return "TestExample{" +
                "Test_Case_ID=" + Test_Case_ID +
                ", Test_Case_Name='" + Test_Case_Name + '\'' +
                ", Test_Case_Type='" + Test_Case_Type + '\'' +
                ", Creator='" + Creator + '\'' +
                ", Executor='" + Executor + '\'' +
                ", Result='" + Result + '\'' +
                ", Number_Of_Execution_Result=" + Number_Of_Execution_Result +
                ", Number_Of_Bug=" + Number_Of_Bug +
                ", Use_Case_Steps=" + Use_Case_Steps +
                ", State='" + State + '\'' +
                ", Precondition='" + Precondition + '\'' +
                ", Owning_Module_Name='" + Owning_Module_Name + '\'' +
                ", Priority='" + Priority + '\'' +
                ", Key_Words='" + Key_Words + '\'' +
                ", Description='" + Description + '\'' +
                ", Applicable_Stage='" + Applicable_Stage + '\'' +
                ", Execution_Time='" + Execution_Time + '\'' +
                ", Text_plan=" + Text_plan +
                '}';
    }
}
