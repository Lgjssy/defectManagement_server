package com.example.demo.mapper;

import com.example.demo.entity.Module;

import java.util.List;

public interface ModuleMapper {
    public List<Module> findModuleByFather(String ModuleName);//根据父模块查找子模块
    public List<Module> findAllModules();//根据父模块查找子模块
    public List<Module> findModuleByProject(String ProjectName);//根据模块名查找模块
    public List<Module> findModule(String ModuleName);//根据模块名查找模块
    public     void         insertModule(String module_name,String module_description,String parent_module,String project_name);//增加模块
    public         void     deleteModule(String ModuleName);//删除模块
    /*******************************安全性未解决*/
    public            void  updateModuleName(String ModuleName,String NewModuleName);//修改模块名
    /****************************************/
    public            void  updateModuleDescription(String ModuleName,String NewModuleDes);//修改模块描述
    void addNewModule(Module module);
    public List<String> findModuleName();
}
