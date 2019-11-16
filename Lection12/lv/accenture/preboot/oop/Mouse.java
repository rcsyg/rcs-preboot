package lv.accenture.preboot.oop;

public class Mouse {
	String name;
	boolean isDomestic;
	
	public Mouse() {
		this.name = "unknown";
		this.isDomestic = false;
	}
	
	public Mouse(String name) {
		this.name = name;
		this.isDomestic = true;
	}
	
	public Mouse(String name, boolean isDomestic) {
		this.name = name;
		this.isDomestic = isDomestic;
	}
	
}
