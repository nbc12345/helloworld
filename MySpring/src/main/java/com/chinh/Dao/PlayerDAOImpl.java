package com.chinh.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chinh.model.Player;

public class PlayerDAOImpl implements PlayerDao {
    private JdbcTemplate jdbcTemplate;
    
    public PlayerDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idplayer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player get(int idplayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> list() {
		String sql="SELECT * FROM player";
		List<Player> listplayer = jdbcTemplate.query(sql, new RowMapper<Player>(){

			@Override
			public Player mapRow(ResultSet rs, int row) throws SQLException {
				// TODO Auto-generated method stub
				Player aplayer = new Player();
				
				aplayer.setIdplayer(rs.getInt("idplayer"));
				aplayer.setName(rs.getString("name"));
				aplayer.setScore(rs.getInt("score"));
				aplayer.setStep(rs.getInt("step"));
				aplayer.setTime(rs.getTime("time"));
				
				return aplayer;
			}
			
		});
		return listplayer;
	}

}
