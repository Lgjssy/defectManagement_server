package com.example.demo.entity;

public class Module {
    private String Module_Name;//模块名
    private String Module_Description;//描述
    private String Parent_Module;//父模块
    private String Project_Name;

    public Module(String module_ame, String module_Description, String parent_Module, String project_Name) {
        Module_Name = module_ame;
        Module_Description = module_Description;
        Parent_Module = parent_Module;
        Project_Name = project_Name;
    }

    public Module() {
    }

    public String getModule_ame() {
        return Module_Name;
    }

    public void setModule_ame(String module_ame) {
        Module_Name = module_ame;
    }

    public String getModule_Description() {
        return Module_Description;
    }

    public void setModule_Description(String module_Description) {
        Module_Description = module_Description;
    }

    public String getParent_Module() {
        return Parent_Module;
    }

    public void setParent_Module(String parent_Module) {
        Parent_Module = parent_Module;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    @Override
    public String toString() {
        return "Module{" +
                "Module_Name='" + Module_Name + '\'' +
                ", Module_Description='" + Module_Description + '\'' +
                ", Parent_Module='" + Parent_Module + '\'' +
                ", Project_Name='" + Project_Name + '\'' +
                '}';
    }
}
