package edu.pitt.cs;

public class CatImpl implements Cat {

	int id;
	String name;
	boolean rented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
	    rented = false;
	}

	public void rentCat() {
		this.rented = true;
		return;
	}

	public void returnCat() {
		this.rented = false;
		return;
	}

	public void renameCat(String name) {
		this.name = name;
		return;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return rented;
	}

	public String toString() {
		String ret = "ID " + this.id + ". " + this.name;
		return ret;
	}

}