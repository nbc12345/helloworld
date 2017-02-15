package com.paracelt.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.paraclt.entities.Player;

public class PlayerDAOImp implements PlayerDAO {

	PlayerDAO playerDAO;
	private static final Logger logger = LoggerFactory.getLogger(PlayerDAOImp.class);
	@Override
	
	public void Addplayer(Player p) {
		// TODO Auto-generated method stub
		
	}
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public List<Player> listPlayer() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		List<Player> playerList = session.createQuery("from player").list();
		for(Player p :playerList){
			
			logger.info("Player List::"+p);
		}
		return playerList;
	}

}
