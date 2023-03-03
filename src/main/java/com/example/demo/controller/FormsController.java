package com.example.demo.controller;

import com.example.demo.entity.Bug;
import com.example.demo.entity.Module;
import com.example.demo.mapper.ModuleMapper;
import com.example.demo.mapper.projectMapper;
import com.example.demo.mapper.bugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class FormsController {
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private projectMapper projectMapper;
    @Autowired
    private bugMapper bugmapper;
    @CrossOrigin
    @RequestMapping("/findBugNumByProject")
    public Map<String,Integer> findBugNumByProject(){
        Map<String,Integer> map=new HashMap<>();
        List<String> projectList=projectMapper.FindAllProject();
        for(int i=0;i<projectList.size();i++){
            map.put(projectList.get(i),findBugByProject(projectList.get(i)).size());
        }
        System.out.println(map);
        return map;
    }
    public List<Bug> findBugByProject(String projectname) {
        List<Module> temp1 = new ArrayList<Module>(moduleMapper.findModuleByProject(projectname));
        System.out.println(temp1);
        List<String> temp2 = new ArrayList<String>();
        Map<String, List<Bug>> map = new HashMap<>();
        for (int i = 0; i < temp1.size(); i++) {
            temp2.add(temp1.get(i).getModule_ame());//模块名
        }
        for (int i = 0; i < temp2.size(); i++) {
            System.out.println(temp2.get(i));
            if (moduleMapper.findModuleByFather(temp2.get(i)).size()!=0) {//有子模块
                System.out.println(moduleMapper.findModuleByFather(temp2.get(i)));
                List<Module> temp3 = new ArrayList<Module>(moduleMapper.findModuleByFather(temp2.get(i)));//子模块
                List<String> temp4 = new ArrayList<String>();
                for (int n = 0; n < temp3.size(); n++) {
                    temp4.add(temp3.get(n).getModule_ame());//模块名
                    if(bugmapper.findBugByModule(temp4.get(n))!=null){
                        map.put(temp4.get(n), bugmapper.findBugByModule(temp4.get(n)));
                    }

                }
            } else {//无子模块
                if(bugmapper.findBugByModule(temp2.get(i))!=null)
                    map.put(temp2.get(i), bugmapper.findBugByModule(temp2.get(i)));
            }
        }
        List<Bug> sum = new ArrayList<Bug>();
        Set keyset = map.keySet();
        for (Object key : keyset) {
            sum.addAll(map.get(key));
        }
        return sum;
    }

    /**********************通过模块************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByModule")
    public Map<String,Integer> findBugNumByModule(){
        List<Module> modules =new ArrayList<Module>();
        modules=moduleMapper.findAllModules();
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<modules.size();i++){
            map.put(modules.get(i).getModule_ame(),findBugByModule(modules.get(i).getModule_ame()).size());
        }
        System.out.println(map);
        return map;
    }
    public List<Bug> findBugByModule(String module){
        List<Bug> bugs=new ArrayList<Bug>();
        bugs=bugmapper.findBugByModule(module);
        return bugs;
    }
/**********************通过每天建立的来区分bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByStartData")
    public Map<String,Integer> findBugNumByStartData(){
    List<Bug> bugList=new ArrayList<Bug>();
    List<String> bugData=new ArrayList<>();
    bugData=bugmapper.findBugStartData();
    for(int i=0;i<bugData.size();i++){
        bugData.set(i,bugData.get(i).substring(0,10));
    }
    LinkedHashSet<String> bugDat=new LinkedHashSet<String>(bugData);
    List<String> bugDate=new ArrayList<String>(bugDat);
    Map<String,Integer> map=new HashMap<>();

    for(int i=0;i<bugDate.size();i++){
        bugList=bugmapper.findBugByStartData(bugDate.get(i));
        map.put(bugDate.get(i),bugList.size());
    }
    System.out.println(map);
    return map;
}
/**********************通过每天关闭的来区分bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByEndData")
    public Map<String,Integer> findBugNumByEndData(){
    List<Bug> bugList=new ArrayList<Bug>();
    List<String> bugData=new ArrayList<>();
    bugData=bugmapper.findBugEndData();
    for(int i=0;i<bugData.size();i++){
        bugData.set(i,bugData.get(i).substring(0,10));
    }
    LinkedHashSet<String> bugDat=new LinkedHashSet<String>(bugData);
    List<String> bugDate=new ArrayList<String>(bugDat);
    Map<String,Integer> map=new HashMap<>();
    for(int i=0;i<bugDate.size();i++){
        bugList=bugmapper.findBugByEndData(bugDate.get(i));
        map.put(bugDate.get(i),bugList.size());
    }
    System.out.println(map);
    return map;
}
/**********************通过每人创建的的来区分bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByBuilder")
    public Map<String,Integer> findBugNumByBuilder(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugBuilder();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByBuilderName(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************通过每人完成的的来区分bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByFinish")
    public Map<String,Integer> findBugNumByFinish(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugPrincipal();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByPrincipalName(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************通过每人关闭的的来区分bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByClose")
    public Map<String,Integer> findBugNumByClose(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugAssignee();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByAssigneeName(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************按照bug类型来统计bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByType")
    public Map<String,Integer> findBugNumByType(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugType();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByTypeName(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************按照紧急程度来统计bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumBySeverity")
    public Map<String,Integer> findBugNumBySeverity(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugSeverity();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugBySeverity(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************按照优先级来统计bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByPriority")
    public Map<String,Integer> findBugNumByPriority(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugPriority();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByPriority(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
    /**********************按照状态来统计bug************************/
    @CrossOrigin
    @RequestMapping("/findBugNumByStatus")
    public Map<String,Integer> findBugNumByStatus(){
        Map<String,Integer> BuilderMap=new HashMap<>();
        List<String> Builder=new ArrayList<>();
        Builder=bugmapper.findBugStatus();
        LinkedHashSet<String> bugDat=new LinkedHashSet<String>(Builder);
        List<String> Builders=new ArrayList<String>(bugDat);
        for(int i=0;i<Builders.size();i++){
            BuilderMap.put(Builders.get(i),bugmapper.findBugByStatus(Builders.get(i)).size());
        }
        System.out.println(BuilderMap);
        return BuilderMap;
    }
}
