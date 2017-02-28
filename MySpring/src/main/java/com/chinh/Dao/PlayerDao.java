package com.chinh.Dao;

import java.util.List;

import com.chinh.model.Player;

public interface PlayerDao {

	public void update(Player player);
	public void delete(int idplayer);
	public Player get(int idplayer);
	public List<Player> list();
}
