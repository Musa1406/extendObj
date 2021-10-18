package products;

import extendObj.Product; 

public class PrinterProduct extends Product {
	private boolean wifi;
	private double weight;
	private	boolean a3;
	private boolean colorScan;
	private String printerType;
	public PrinterProduct() {
		super();
	}
	public PrinterProduct(boolean wifi, double weight, boolean a3, boolean colorScan, String printerType) {
		super();
		this.wifi = wifi;
		this.weight = weight;
		this.a3 = a3;
		this.colorScan = colorScan;
		this.printerType = printerType;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isA3() {
		return a3;
	}
	public void setA3(boolean a3) {
		this.a3 = a3;
	}
	public boolean isColorScan() {
		return colorScan;
	}
	public void setColorScan(boolean colorScan) {
		this.colorScan = colorScan;
	}
	public String getPrinterType() {
		return printerType;
	}
	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}
	public void showPrinter() {
		System.out.println("Yazýcý Modeli :"+this.getCaption());
		System.out.println("    Fiyat :"+this.getPrice());
		System.out.println("    Ýndirim : %"+this.getDicoundRate());
		System.out.println("Aðýrlýðýrlýk :"+this.getWeight());
		System.out.println("Yazýcý Tipi :"+this.getPrinterType());
	}
	//wifi waight a3 colorScan PrinterType
}
