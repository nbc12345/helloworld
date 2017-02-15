package com.paracelt.services;

import java.util.List;

import com.paracelt.DAO.*;
import com.paraclt.entities.Player;
public interface PlayerSevices {

	public void Addplayer(Player p);
	public List<Player>listPlayer();
}
