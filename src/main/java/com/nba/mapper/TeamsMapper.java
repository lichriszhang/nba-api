package com.nba.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nba.entity.Teams;

public interface TeamsMapper {
    int deleteByPrimaryKey(Integer teamId);

    int insert(Teams record);

    Teams selectByPrimaryKey(Integer teamId);

    List<Teams> selectAll();

    List<Teams> selectWestTop(@Param(value="topCount") Integer topCount);
    
    List<Teams> selectEastTop(@Param(value="topCount") Integer topCount);
    
    List<Teams> selectByArea(@Param(value="area")String area);
    
    int updateByPrimaryKey(Teams record);
}