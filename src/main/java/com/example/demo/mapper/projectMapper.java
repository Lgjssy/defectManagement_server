package com.example.demo.mapper;

import com.example.demo.entity.project;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface projectMapper {
    public List<project> FindProject(String Project_name);
    public List<String> FindAllProject();
}
