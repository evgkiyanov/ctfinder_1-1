package org.tyaa.ctfinder.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class State {
@Id
private int id;
private String title_key;
private int offer_type_id;
public State(int id, String title_key, int offer_type_id) {
	super();
	this.id = id;
	this.title_key = title_key;
	this.offer_type_id = offer_type_id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle_key() {
	return title_key;
}
public void setTitle_key(String title_key) {
	this.title_key = title_key;
}
public int getOffer_type_id() {
	return offer_type_id;
}
public void setOffer_type_id(int offer_type_id) {
	this.offer_type_id = offer_type_id;
}

}
