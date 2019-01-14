package com.nba.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
@Accessors(chain = true)
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Teams {
    private Integer teamId;

    private String teamName;

    private Integer teamWin;

    private Integer teamLose;

    private LocalDateTime createDate;

    private String teamBoss;

    private Integer ranking;

    private String teamCity;

    private String teamArea;

    private String teamLogo;
}