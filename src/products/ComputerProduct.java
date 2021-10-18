package products;

import extendObj.Product;

public class ComputerProduct extends Product {
  private int graphicCardMemory;
  private String processer;
  private boolean touchScreen;
public ComputerProduct() {
	super();
}
public ComputerProduct(int graphicCardMemory, String processer, boolean touchScreen) {
	super();
	this.graphicCardMemory = graphicCardMemory;
	this.processer = processer;
	this.touchScreen = touchScreen;
}
public int getGraphicCardMemory() {
	return graphicCardMemory;
}
public void setGraphicCardMemory(int graphicCardMemory) {
	this.graphicCardMemory = graphicCardMemory;
}
public String getProcesser() {
	return processer;
}
public void setProcesser(String processer) {
	this.processer = processer;
}
public boolean isTouchScreen() {
	return touchScreen;
}
public void setTouchScreen(boolean touchScreen) {
	this.touchScreen = touchScreen;
}
}
