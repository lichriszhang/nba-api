package com.nba.mapper;

import com.nba.entity.Teams;
import java.util.List;

public interface TeamsMapper {
    int deleteByPrimaryKey(Integer teamId);

    int insert(Teams record);

    Teams selectByPrimaryKey(Integer teamId);

    List<Teams> selectAll();

    int updateByPrimaryKey(Teams record);
}