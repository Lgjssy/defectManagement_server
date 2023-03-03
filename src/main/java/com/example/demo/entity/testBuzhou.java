package com.example.demo.entity;

public class testBuzhou {
    private int Numbering;//编号
    private Integer Use_case_ID;//用例ID
    private String Expect_Output;//预期结果
    private String Content;//内容

    public testBuzhou(int numbering, Integer use_case_ID, String expect_Output, String content) {
        Numbering = numbering;
        Use_case_ID = use_case_ID;
        Expect_Output = expect_Output;
        Content = content;
    }

    public testBuzhou() {
    }

    public int getNumbering() {
        return Numbering;
    }

    public void setNumbering(int numbering) {
        Numbering = numbering;
    }

    public Integer getUse_case_ID() {
        return Use_case_ID;
    }

    public void setUse_case_ID(Integer use_case_ID) {
        Use_case_ID = use_case_ID;
    }

    public String getExpect_Output() {
        return Expect_Output;
    }

    public void setExpect_Output(String expect_Output) {
        Expect_Output = expect_Output;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "testBuzhou{" +
                "Numbering=" + Numbering +
                ", Use_case_ID=" + Use_case_ID +
                ", Expect_Output='" + Expect_Output + '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }
}
