package model;


public class Player {

	private String nick;
	private String team;
	private double xPosition, yPosition;
	private double xDirection, yDirection;
	
	public Player(String nick, String team, double xPosition, double yPosition) {
		this.nick = nick;
		this.team = team;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public double getxPosition() {
		return xPosition;
	}
	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}
	public double getyPosition() {
		return yPosition;
	}
	public void setyPosition(double yPosition) {
		this.yPosition = yPosition;
	}
	public double getxDirection() {
		return xDirection;
	}
	public void setxDirection(double xDirection) {
		this.xDirection = xDirection;
	}
	public double getyDirection() {
		return yDirection;
	}
	public void setyDirection(double yDirection) {
		this.yDirection = yDirection;
	}

	public String getNick() {
		return nick;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public void move() {
		xPosition += xDirection;
		yPosition += yDirection;
	}


}