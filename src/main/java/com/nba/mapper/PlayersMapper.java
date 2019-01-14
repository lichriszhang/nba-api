package com.nba.mapper;

import com.nba.entity.Players;
import java.util.List;

public interface PlayersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Players record);

    Players selectByPrimaryKey(Integer id);

    List<Players> selectAll();

    int updateByPrimaryKey(Players record);
}