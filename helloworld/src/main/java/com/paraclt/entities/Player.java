package com.paraclt.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;



/**
 * The persistent class for the player database table.
 * 
 */
@Entity
@NamedQuery(name="Player.findAll", query="SELECT p FROM Player p")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idplayer;

	private String name;

	private int score;

	private int step;

	private Time time;

	public Player() {
	}

	public int getIdplayer() {
		return this.idplayer;
	}

	public void setIdplayer(int idplayer) {
		this.idplayer = idplayer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getStep() {
		return this.step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}