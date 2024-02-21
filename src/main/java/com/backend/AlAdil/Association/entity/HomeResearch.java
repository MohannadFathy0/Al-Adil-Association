package com.backend.AlAdil.Association.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class HomeResearch {
	
	private boolean ownership;
	private int rentValue;
	private String roomsDesc, roofdesc, wallsDesc, floorDesc, otherDesc;
	public HomeResearch() {
		super();
	}
	
	public HomeResearch(boolean ownership, int rentValue, String roomsDesc, String roofdesc, String wallsDesc,
			String floorDesc, String otherDesc) {
		super();
		this.ownership = ownership;
		this.rentValue = rentValue;
		this.roomsDesc = roomsDesc;
		this.roofdesc = roofdesc;
		this.wallsDesc = wallsDesc;
		this.floorDesc = floorDesc;
		this.otherDesc = otherDesc;
	}

	public boolean isOwnership() {
		return ownership;
	}
	public void setOwnership(boolean ownership) {
		this.ownership = ownership;
	}
	public int getRentValue() {
		return rentValue;
	}
	public void setRentValue(int rentValue) {
		this.rentValue = rentValue;
	}
	public String getRoomsDesc() {
		return roomsDesc;
	}
	public void setRoomsDesc(String roomsDesc) {
		this.roomsDesc = roomsDesc;
	}
	public String getRoofdesc() {
		return roofdesc;
	}
	public void setRoofdesc(String roofdesc) {
		this.roofdesc = roofdesc;
	}
	public String getWallsDesc() {
		return wallsDesc;
	}
	public void setWallsDesc(String wallsDesc) {
		this.wallsDesc = wallsDesc;
	}
	public String getFloorDesc() {
		return floorDesc;
	}
	public void setFloorDesc(String floorDesc) {
		this.floorDesc = floorDesc;
	}

	public String getOtherDesc() {
		return otherDesc;
	}

	public void setOtherDesc(String otherDesc) {
		this.otherDesc = otherDesc;
	}
}
