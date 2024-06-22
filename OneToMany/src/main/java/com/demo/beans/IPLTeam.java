package com.demo.beans;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.HashSet;

@Entity(name="iplteam")
public class IPLTeam {
	@Id
	private int teamid;
	private String tname;
	@OneToMany(mappedBy="team")
	
	private Set<Player> playerset = new HashSet<>();
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Set<Player> getPlayerset() {
		return playerset;
	}
	public void setPlayerset(Set<Player> playerset) {
		this.playerset = playerset;
	}
	public IPLTeam(int teamid, String tname, Set<Player> playerset) {
		super();
		this.teamid = teamid;
		this.tname = tname;
		this.playerset = playerset;
	}
	public IPLTeam() {
		super();
	}
	@Override
	public String toString() {
		return "IPLTeam [teamid=" + teamid + ", tname=" + tname  + "]";
	}
	
	
	
}
