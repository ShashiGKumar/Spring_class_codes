package com.te.springautowiring;

public class Laptop {

	Battery b;
	Screen s;
	Harddisk hd1;
	Harddisk hd2;

	public Laptop(Battery b, Screen s, Harddisk hardDisk1, Harddisk hd2) {
		super();
		this.b = b;
		this.s = s;
		this.hd1 = hardDisk1;
		this.hd2 = hd2;
	}

//	public void setHd1(Harddisk hd1) {
//		this.hd1 = hd1;
//	}
//	public void setHd2(Harddisk hd2) {
//		this.hd2 = hd2;
//	}
//	public void setB(Battery b) {
//		this.b = b;
//	}
//	public void setS(Screen s) {
//		this.s = s;
//	}
	@Override
	public String toString() {
		return "Laptop [b=" + b + ", s=" + s + ", hd1=" + hd1 + ", hd2=" + hd2 + "]";
	}

}
