package com.chinh.mapper;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import org.springframework.jdbc.core.RowMapper;

import com.chinh.model.Player;
 
public class PlayerMapper implements RowMapper<Player> {
 
    public static final String BASE_SQL = //
            "Select p.idplayer,p.name,p.step,p.time,p.score "//
                    + " from Player p ";
 
    @Override
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        Integer idplayer = rs.getInt("idplayer");
        Integer score = rs.getInt("score");
        String name = rs.getString("name");
        System.out.println("!23");
        Integer step = rs.getInt("step");
        Time time=rs.getTime("time");
        return new Player(idplayer, name, score, step, time);
    }
 
}
