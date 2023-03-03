package com.example.demo.entity;

public class project {
    String Project_Name;//项目名

    public project(String project_Name) {
        Project_Name = project_Name;
    }
    public project() {
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    @Override
    public String toString() {
        return "project{" +
                "Project_Name='" + Project_Name + '\'' +
                '}';
    }
}
