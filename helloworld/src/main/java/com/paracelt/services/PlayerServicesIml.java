package com.paracelt.services;

import java.util.List;

import com.paraclt.entities.Player;
import com.paracelt.DAO.*;

public class PlayerServicesIml implements PlayerSevices{

	private PlayerDAO playerDAO;
	public void setPlayerDAO(PlayerDAO PlayerDAO){
		this.playerDAO = PlayerDAO;
	}
	@Override
	public void Addplayer(Player p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Player> listPlayer() {
		// TODO Auto-generated method stub
		return this.playerDAO.listPlayer();
	}

}
