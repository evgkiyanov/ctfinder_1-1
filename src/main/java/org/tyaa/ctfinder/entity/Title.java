package org.tyaa.ctfinder.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Title {
@Id
private int id;
private String key;
private int lang_id;
public Title(int id, String key, int lang_id) {
	super();
	this.id = id;
	this.key = key;
	this.lang_id = lang_id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getKey() {
	return key;
}
public void setKey(String key) {
	this.key = key;
}
public int getLang_id() {
	return lang_id;
}
public void setLang_id(int lang_id) {
	this.lang_id = lang_id;
}

}
