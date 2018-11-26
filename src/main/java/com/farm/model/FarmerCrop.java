package com.farm.model;

public class FarmerCrop {
	private int cId;                            	//variable for crop id
	private String cType;					//variable for crop type
	private String cName;					//variable for crop name
	private String cFertilizerType;		//variable for Fertilizer type used in crop
	private int cQuantity;					//variable for quantity of crop on sale
	private int cStatus;					//variable for status of crop sold status
	private int cBasePrice;				//variable for crop selling base price
	//private int cSellPrice;					//variable for final crop sold price

	//getter and setter methods for all variables
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcFertilizerType() {
		return cFertilizerType;
	}
	public void setcFertilizerType(String cFertilizerType) {
		this.cFertilizerType = cFertilizerType;
	}
	public int getcQuantity() {
		return cQuantity;
	}
	public void setcQuantity(int cQuantity) {
		this.cQuantity = cQuantity;
	}

	public int getcStatus() {
		return cStatus;
	}
	public void setcStatus(int cStatus) {
		this.cStatus = cStatus;
	}
	public int getcBasePrice() {
		return cBasePrice;
	}
	public void setcBasePrice(int cBasePrice) {
		this.cBasePrice = cBasePrice;
	}
/*	public int getcSellPrice() {
		return cSellPrice;
	}
	public void setcSellPrice(int cSellPrice) {
		this.cSellPrice = cSellPrice;
	}*/
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	private int fId;

}
