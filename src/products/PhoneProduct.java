package products;

import extendObj.Product;

public class PhoneProduct extends Product {
    private int batteryPower;
    private String cameraRezolution;
    private double selfieCameraRezolution;
    private int memorySize;
    private double screenSize;
    private int ramCapacity;
	public PhoneProduct() {
		super();
	}
	public PhoneProduct(int batteryPower, String cameraRezolution, double selfieCameraRezolution, int memorySize,
			double screenSize, int ramCapacity) {
		super();
		this.batteryPower = batteryPower;
		this.cameraRezolution = cameraRezolution;
		this.selfieCameraRezolution = selfieCameraRezolution;
		this.memorySize = memorySize;
		this.screenSize = screenSize;
		this.ramCapacity = ramCapacity;
	}

	public int getBatteryPower() {
		return batteryPower;
	}
	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}
	public String getCameraRezolution() {
		return cameraRezolution;
	}
	public void setCameraRezolution(String cameraRezolution) {
		this.cameraRezolution = cameraRezolution;
	}
	public double getSelfieCameraRezolution() {
		return selfieCameraRezolution;
	}
	public void setSelfieCameraRezolution(double selfieCameraRezolution) {
		this.selfieCameraRezolution = selfieCameraRezolution;
	}
	public int getMemorySize() {
		return memorySize;
	}
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	public String writeMemoryCapacity() {
			if(this.getMemorySize()>1000000) {
		    return (this.getMemorySize()/1000000)+"TeraByte";
			}
			else if(this.getMemorySize()>1000) {
			 return	(this.getMemorySize()/1000)+"GiagaByte";
    }
			else 
				return this.getMemorySize()+"MegaByte";
    }
	public void showPhone() {
		System.out.println("Telefon Modeli :"+this.getCaption());
		System.out.println("    Fiyat :"+this.getPrice());
		System.out.println("    Ýndirim : %"+this.getDicoundRate());
		System.out.println("   Batarya Kapasitesi:"+this.getBatteryPower());
		System.out.println("Arka Camera :"+this.getCameraRezolution());
		System.out.println("Ekran Boyutu :"+this.getScreenSize());
		System.out.println("Ram kapasitesi :"+this.getRamCapacity());
		System.out.println("Ön Kamera :"+this.getSelfieCameraRezolution());
	}
	
}