package com.nba.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nba.entity.Players;

public interface PlayersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Players record);

    Players selectByPrimaryKey(Integer id);

    List<Players> selectAll();
    
    List<Players> selectByTeam(@Param(value="teamId") Integer teamId);

    int updateByPrimaryKey(Players record);
    
    Players selectPlayerByNumbAndTeam(@Param(value="playerNumber") Integer number, @Param(value="teamId") Integer team);
}