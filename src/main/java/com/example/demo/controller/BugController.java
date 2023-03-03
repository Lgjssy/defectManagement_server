package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import com.example.demo.entity.Bug;
import com.example.demo.entity.Module;
import com.example.demo.mapper.ModuleMapper;
import com.example.demo.mapper.bugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Slf4j
@RestController
public class BugController {
    @Autowired
    private ModuleMapper moduleMapper;
    @Autowired
    private bugMapper bugMapper;
    @CrossOrigin
    @RequestMapping("/findBug")
    public Map<Integer, List<String>> findBugByProject(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByModule(map1.get("Related_Modules")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugAll")
    public Map<Integer, List<String>> findBugAll(){
        List<Bug> temp=new ArrayList<Bug>();
        temp=bugMapper.findAllBug();
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugAllNum")
    public Integer findBugAllNum(){

        List<String> list=new ArrayList<>();
        list=bugMapper.findBugType();
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugNumByPrincipal")
    public Integer findBugNumByPrincipal(@RequestBody Map<String,String> map1){

        List<Bug> list=new ArrayList<>();
        list=bugMapper.findBugByPrincipal(map1.get("User_Id"));
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByPrincipal")
    public Map<Integer, List<String>> findBugByPrincipal(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByPrincipal(map1.get("User_Id")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        System.out.println(map);
        return map;
    }

    @CrossOrigin
    @RequestMapping("/findBugNumByBuilder2")
    public Integer findBugNumByBuilder2(@RequestBody Map<String,String> map1){

        List<Bug> list=new ArrayList<Bug>();
        list=bugMapper.findBugByBuilder(map1.get("User_Id"));
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByBuilder2")
    public Map<Integer, List<String>> findBugByBuilder(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByBuilder(map1.get("User_Id")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugNumByClose1")
    public Integer findBugNumByClose(@RequestBody Map<String,String> map1){

        List<Bug> list=new ArrayList<Bug>();
        list=bugMapper.findBugByClose("已关闭",map1.get("User_Id"));
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByClose1")
    public Map<Integer, List<String>> findBugByCondition(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByClose("已关闭",map1.get("User_Id")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugNumByFinish1")
    public Integer findBugNumByFinish1(@RequestBody Map<String,String> map1){
        List<Bug> list=new ArrayList<Bug>();
        list=bugMapper.findBugByClose("已解决",map1.get("User_Id"));
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByFinish1")
    public Map<Integer, List<String>> findBugByFinish(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByClose("已解决",map1.get("User_Id")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        System.out.println(map);
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugNumByModule1")
    public Integer findBugNumByModule1(@RequestBody Map<String,String> map1){
        List<Bug> list=new ArrayList<Bug>();
        list=bugMapper.findBugByModule(map1.get("Module"));
        return list.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByModule1")
    public Map<Integer, List<String>> findBugByModule1(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByModule(map1.get("Module")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        System.out.println(map);
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findBugNumByName")
    public Integer findBugNumByName(@RequestBody Map<String,String> map1){
        List<Bug> bug1=bugMapper.findBugByName(map1.get("Bug_Title"));
        return bug1.size();
    }
    @CrossOrigin
    @RequestMapping("/findBugByName")
    public Map<Integer, List<String>> findBugByName(@RequestBody Map<String,String> map1){
        List<Bug> temp=new ArrayList<Bug>(bugMapper.findBugByName(map1.get("Bug_Title")));
        Map<Integer,List<String>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<String> bug =new ArrayList<>();
            bug.add(temp.get(i).getBug_Title());
            bug.add(temp.get(i).getPriority().toString());
            bug.add(temp.get(i).getBug_Status());
            bug.add(temp.get(i).getCreator());
            bug.add(temp.get(i).getBug_Create_Date());
            bug.add(temp.get(i).getBug_End_Date());
            bug.add(temp.get(i).getAssignee());
            bug.add(temp.get(i).getSeverity());
            bug.add(temp.get(i).getOperating_System());
            bug.add(temp.get(i).getRelated_Modules());
            bug.add(temp.get(i).getRelated_Task());
            bug.add(temp.get(i).getRelated_Needs());
            bug.add(temp.get(i).getPerson_In_Charge());
            bug.add(temp.get(i).getBug_Type());
            map.put(i,bug);
        }
        System.out.println(map);
        return map;
    }
    @CrossOrigin
    @RequestMapping("/addModule")
    public Integer addModule(@RequestBody Map<String,String> map){
        List<String> moduleName=new ArrayList<>();
        moduleName=moduleMapper.findModuleName();
        int index=0;
        for(int i=0;i<moduleName.size();i++){
            if(map.get("Module_Name").equals(moduleName.get(i)))
                index=1;
        }
        if(index==1)
            return 1;
        else{
            Module module=new Module(map.get("Module_Name"),map.get("Module_Description"),null,null);
            moduleMapper.addNewModule(module);
            return 0;
        }

    }
    @CrossOrigin
    @RequestMapping("/addBug")
    public Integer addBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        System.out.println(map);
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1)
            return 1;
        else{
            Bug bug=new Bug(map.get("Bug_Title"),map.get("Priority"),map.get("Bug_Status"),map.get("Creator"),map.get("Bug_Create_Date").substring(0,10),map.get("Bug_End_Date").substring(0,10),map.get("Assignee"),map.get("Severity"),map.get("Operating_System"),map.get("Related_Modules"),map.get("Related_Tasks"),map.get("Related_Needs"),map.get("Person_In_Charge"),"系统bug");
            System.out.println(bug.toString());
            bugMapper.Insert_Bug(bug);
            return 0;
        }
    }
    @CrossOrigin
    @RequestMapping("/deleteBug")
    public Integer deleteBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1){
            bugMapper.deleteBug(map.get("Bug_Title"));
            log.info("删除成功{}",map.get("Bug_Title"));
            return 0;
        }
        else
            log.info("删除失败，不存在{}",map.get("Bug_Title"));
            return 1;
    }
    @CrossOrigin
    @RequestMapping("/affirmBug")
    public Integer affirmBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        System.out.println(map);
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }

        if(index==1){
            if(map.get("Bug_Status").equals("未确认")){
                bugMapper.affirmBug(map.get("Bug_Title"));
                log.info("确认成功！{}",map.get("Bug_Title"));
                return 0;
            }
            else{
                log.info("已经是确认状态!{}",map.get("Bug_Title"));
                return 2;
            }
        }
        else
            return 1;
    }
    @CrossOrigin
    @RequestMapping("/closeBug")
    public Integer closeBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1){
            if(bugMapper.findBugCondition(map.get("Bug_Title")).equals("已关闭")){
                log.info("已经是关闭状态!{}",map.get("Bug_Title"));
                return 2;
            }
            else{
                bugMapper.closeBug(map.get("Bug_Title"));
                bugMapper.setCloseUser(map.get("User_Name"),map.get("Bug_Title"));
                log.info("关闭成功！{}",map.get("Bug_Title"));
                return 0;
            }
        }
        else
            return 1;
    }
    @CrossOrigin
    @RequestMapping("/activeBug")
    public Integer activeBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1){
            if(bugMapper.findBugCondition(map.get("Bug_Title")).equals("已关闭")){
                bugMapper.activateBug(map.get("Bug_Title"));
                bugMapper.setActiveUser(map.get("User_Name"),map.get("Bug_Title"));
                log.info("激活成功状态!{}",map.get("Bug_Title"));
                return 0;
            }
            else{
                log.info("不处于关闭状态，不需要激活{}",map.get("Bug_Title"));
                return 2;
            }
        }
        else
            return 1;
    }
    @CrossOrigin
    @RequestMapping("/finishBug")
    public Integer finishBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1){
            if(bugMapper.findBugCondition(map.get("Bug_Title")).equals("已解决")){
                log.info("这是一个已经解决的!{}",map.get("Bug_Title"));
                return 2;
            }
            else{
                bugMapper.fixBug(map.get("Bug_Title"));
                bugMapper.setFinishUser(map.get("User_Name"),map.get("Bug_Title"));
                log.info("解决完成!{}",map.get("Bug_Title"));
                return 0;
            }
        }
        else
            return 1;
    }
    @CrossOrigin
    @RequestMapping("/assigneeBug")
    public Integer assigneeBug(@RequestBody Map<String,String> map){
        List<String> BugName=new ArrayList<>();
        System.out.println(map.get("Bug_Title"));
        BugName=bugMapper.findBugName();
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(map.get("Bug_Title").equals(BugName.get(i)))
                index=1;
        }
        if(index==1){
            bugMapper.assignBug(map.get("Bug_Title"),map.get("Assignee"),map.get("Person_In_Charge"));
            return 0;
        }
        else
            return 1;
    }
}
