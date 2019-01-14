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
public class Players {
	private Integer id;

    private String name;

    private Integer number;

    private Integer team;

    private Integer age;

    private Float height;

    private Float score;

    private Float assist;

    private Float rebound;

    private Float steal;

    private Float block;

    private Float miss;

    private Float playTime;

    private Float illegal;

    private Float threePoint;

    private Float penalty;

    private LocalDateTime playersYear;

}