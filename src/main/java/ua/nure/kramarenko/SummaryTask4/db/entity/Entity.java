package ua.nure.kramarenko.SummaryTask4.db.entity;

import java.io.Serializable;

/**
 * Root of all entities which have identifier field.
 * 
* @author Vlad Kramarenko
 * 
 */
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = 8466257860808346236L;

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		this.id = i;
	}

}
