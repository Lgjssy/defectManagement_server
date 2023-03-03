package com.example.demo.controller;


import com.example.demo.entity.TestPlan;
import com.example.demo.mapper.TestExampleMapper;
import com.example.demo.mapper.TestPlanMapper;
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
public class TestPlanControlller {
    @Autowired
    private TestPlanMapper testPlanMapper;
    @CrossOrigin
    @RequestMapping("/findTPByName")
    public Map<Integer, List<Object>> findByName(@RequestBody Map<String,String> map1){
        List<TestPlan> temp=new ArrayList<TestPlan>();
        temp=testPlanMapper.findPlanByName(map1.get("Test_Plan_Name"));
        System.out.println(temp);
        Map<Integer, List<Object>> map =new HashMap<>();
        for(int i=0;i<temp.size();i++){
            List<Object> te =new ArrayList<>();
            te.add(temp.get(i).getTest_Plan_Id());
            te.add(temp.get(i).getTest_Plan_Name());
            te.add(temp.get(i).getHuman_resource_allocation());
            te.add(temp.get(i).getPrincipal());
            te.add(temp.get(i).getStart_Date());
            te.add(temp.get(i).getEnd_Date());
            te.add(temp.get(i).getState());
            te.add(temp.get(i).getPriority());
            te.add(temp.get(i).getOwing_module());
            te.add(temp.get(i).getTest_risk());
            te.add(temp.get(i).getDescription());
            map.put(i,te);

        }
        System.out.println(map);
        return map;
    }
    @CrossOrigin
    @RequestMapping("/findTPNumByName")
    public Integer findTENum(@RequestBody Map<String,String> map1){
        List<TestPlan> temp=new ArrayList<TestPlan>();
        temp=testPlanMapper.findPlanByName(map1.get("Test_Plan_Name"));
        return temp.size();
    }
    @CrossOrigin
    @RequestMapping("/insertTP")
    public Integer findTextPlan(@RequestBody Map<String,String> map){
        List<String> planName=new ArrayList<>();
        planName=testPlanMapper.findAllPlanName();
        System.out.println(planName);
        int index=0;
        for(int i=0;i<planName.size();i++){
            if(map.get("Test_Plan_Name").equals(planName.get(i)))
                index=1;
        }
        if(index==0){
            TestPlan plan =new TestPlan(map.get("Test_Plan_Name"),map.get("Human_resource_allocation"),map.get("principal"),map.get("Start_Date").substring(0,10),map.get("End_Date").substring(0,10),map.get("State"),map.get("Description"),map.get("Priority"),map.get("Owning_module"),map.get("Test_risk"));
            System.out.println(plan);
            testPlanMapper.addTestPlan(plan);
            System.out.println(plan.getTestPlanNum());
            return  0;
        }
        else return 1;

    }
}
