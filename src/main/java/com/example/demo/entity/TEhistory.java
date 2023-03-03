package com.example.demo.entity;

public class TEhistory {//测试用例的历史记录
    private String Executor;//执行人
    private String Creator;//创建人
    private String Execution;//执行时间
    private Integer Test_Case_ID;//用例Id
    private String Real_Output;

    public TEhistory(String executor, String creator, String execution, Integer test_Case_ID, String real_Output) {
        Executor = executor;
        Creator = creator;
        Execution = execution;
        Test_Case_ID = test_Case_ID;
        Real_Output = real_Output;
    }

    public TEhistory() {
    }

    public String getExecutor() {
        return Executor;
    }

    public void setExecutor(String executor) {
        Executor = executor;
    }

    public String getCreator() {
        return Creator;
    }

    public void setCreator(String creator) {
        Creator = creator;
    }

    public String getExecution() {
        return Execution;
    }

    public void setExecution(String execution) {
        Execution = execution;
    }

    public Integer getTest_Case_ID() {
        return Test_Case_ID;
    }

    public void setTest_Case_ID(Integer test_Case_ID) {
        Test_Case_ID = test_Case_ID;
    }

    public String getReal_Output() {
        return Real_Output;
    }

    public void setReal_Output(String real_Output) {
        Real_Output = real_Output;
    }

    @Override
    public String toString() {
        return "TEhistory{" +
                "Executor='" + Executor + '\'' +
                ", Creator='" + Creator + '\'' +
                ", Execution='" + Execution + '\'' +
                ", Test_Case_ID=" + Test_Case_ID +
                ", Real_Output='" + Real_Output + '\'' +
                '}';
    }
}
