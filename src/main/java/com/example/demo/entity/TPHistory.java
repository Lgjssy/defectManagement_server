package com.example.demo.entity;

public class TPHistory {//测试计划的历史记录
    private String Creator;//创建者
    private String Editor;//编辑者
    private String Changing_Time;//修改时间
    private int Text_Plan_Id;//测试计划ID
    private String Content;//内容

    public TPHistory(String creator, String editor, String changing_Time, int text_Plan_Id, String content) {
        Creator = creator;
        Editor = editor;
        Changing_Time = changing_Time;
        Text_Plan_Id = text_Plan_Id;
        Content = content;
    }

}
