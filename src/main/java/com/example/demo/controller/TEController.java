package com.example.demo.controller;

import com.example.demo.entity.Bug;
import com.example.demo.entity.TestExample;
import com.example.demo.mapper.TestExampleMapper;
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

@RestController
public class TEController {
@Autowired
   private TestExampleMapper testExampleMapper;
    @Autowired
private com.example.demo.mapper.bugMapper bugMapper;
    @CrossOrigin
    @RequestMapping("/findTEByName")
    public Map<Integer, List<Object>> findByName(@RequestBody Map<String,String> map1){
        List<TestExample> temp=new ArrayList<TestExample>();
        temp=testExampleMapper.findExByName(map1.get("Test_Case_Name"));
        Map<Integer, List<Object>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<Object> te =new ArrayList<>();
            te.add(temp.get(i).getTest_Case_ID());
            te.add(temp.get(i).getTest_Case_Name());
            te.add(temp.get(i).getTest_Case_Type());
            te.add(temp.get(i).getCreator());
            te.add(temp.get(i).getExecutor());
            te.add(temp.get(i).getResult());
            te.add(temp.get(i).getNumber_Of_Execution_Result());
            te.add(temp.get(i).getNumber_Of_Bug());
            te.add(temp.get(i).getUse_Case_Steps());
            te.add(temp.get(i).getState());
            te.add(temp.get(i).getPrecondition());
            te.add(temp.get(i).getOwning_Module_Name());
            te.add(temp.get(i).getPriority());
            te.add(temp.get(i).getKey_Words());
            te.add(temp.get(i).getDescription());
            te.add(temp.get(i).getApplicable_Stage());
            te.add(temp.get(i).getExecution_Time());
            te.add(temp.get(i).getText_plan());
            map.put(i,te);
        }
        System.out.println(map);
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findTENumByName")
    public Integer findTENum(@RequestBody Map<String,String> map1){
        List<TestExample> temp=new ArrayList<TestExample>();
        temp=testExampleMapper.findExByName(map1.get("Test_Case_Name"));
       return temp.size();
}
    @CrossOrigin
    @RequestMapping("/insertTE")
    public  Integer insertTE(@RequestBody Map<String,String> map1){
        System.out.println(map1);
        System.out.println(map1.get("Test_Case_ID")+map1.get("Test_Case_Name")+map1.get("Test_Case_Type")+map1.get("Creator")+map1.get("Executor")+map1.get("Result")+Integer.parseInt(map1.get("Number_Of_Execution_Results"))+Integer.parseInt(map1.get("Number_Of_Bug"))+Integer.parseInt(map1.get("Use_Case_Steps"))+map1.get("State")+map1.get("Precondition")+map1.get("Owning_Module_Name")+map1.get("Priority")+map1.get("Key_Words")+map1.get("Description")+map1.get("Applicable_Stage")+map1.get("Execution_Time")+Integer.parseInt(map1.get("Text_plan")));
        TestExample te = new TestExample(Integer.parseInt(map1.get("Test_Case_ID")),map1.get("Test_Case_Name"),map1.get("Test_Case_Type"),map1.get("Creator"),map1.get("Executor"),map1.get("Result"),Integer.parseInt(map1.get("Number_Of_Execution_Results")),Integer.parseInt(map1.get("Number_Of_Bug")),Integer.parseInt(map1.get("Use_Case_Steps")),map1.get("State"),map1.get("Precondition"),map1.get("Owning_Module_Name"),map1.get("Priority"),map1.get("Key_Words"),map1.get("Description"),map1.get("Applicable_Stage"),map1.get("Execution_Time"),Integer.parseInt(map1.get("Text_plan")));
        System.out.println(te.toString());
        testExampleMapper.addExample(te);
           if(te.getTest_Case_ID()!=-1){
            return 0;
           }
           else return 1;
    }
    @CrossOrigin
    @RequestMapping("/addNewBug")
    public  Integer addNewBug(@RequestBody Map<String,String> map1){
        TestExample testExample=new TestExample();
        testExample=testExampleMapper.findTeById(Integer.parseInt(map1.get("Test_Case_ID")));
        List<String> BugName=new ArrayList<>();
        BugName=bugMapper.findBugName();
        System.out.println(BugName);
        int index=0;
        for(int i=0;i<BugName.size();i++){
            if(testExample.getTest_Case_Name().equals(BugName.get(i)))
                index=1;
        }
        System.out.println(index);
        if(index==0){

            System.out.println(testExample.toString());
            Bug bug1 =new Bug(testExample.getTest_Case_Name(),testExample.getPriority(),"未确认","小李","2022-07-14",testExample.getExecution_Time(),"小李","高","windows",testExample.getOwning_Module_Name(),"用例测试",testExample.getKey_Words(),"小李","测试用例bug");
            bugMapper.Insert_Bug(bug1);
            return 0;
        }
        else
            return 1;
    }
}
