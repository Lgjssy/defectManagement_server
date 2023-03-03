package com.example.demo.mapper;

import com.example.demo.entity.TPHistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TPhistory {
    public List<TPHistory> findTPByTestPlanNum(int TestPlanNum);//根据测试计划id查找历史记录
}
