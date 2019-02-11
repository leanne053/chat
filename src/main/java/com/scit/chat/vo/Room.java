package com.scit.chat.vo;

public class Room {
	private int roomseq;
	private String id;
	private String name;
	private String title;
	private String indate;
	
public Room(int roomseq, String id, String name, String title, String indate) {
	super();
	this.roomseq = roomseq;
	this.id = id;
	this.name = name;
	this.title = title;
	this.indate = indate;
}
public Room() {
	super();
}
public int getRoomseq() {
	return roomseq;
}
public void setRoomseq(int roomseq) {
	this.roomseq = roomseq;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getIndate() {
	return indate;
}
public void setIndate(String indate) {
	this.indate = indate;
}
@Override
public String toString() {
	return "Room [roomseq=" + roomseq + ", id=" + id + ", name=" + name + ", title=" + title + ", indate=" + indate
			+ "]";
};
	
	
}
