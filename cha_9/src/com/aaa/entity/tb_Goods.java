package com.aaa.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class tb_Goods {
  private Integer goodsId; 
  private String goodsName;
  private String goodsDesc;
  private double goodsUnitPrice;
  private String goodsImageName;
  private Integer sellCount;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date goodsDate;
  private tb_Goods_Type type;
  private Integer typeId;
public Integer getGoodsId() {
	return goodsId;
}
public void setGoodsId(Integer goodsId) {
	this.goodsId = goodsId;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public String getGoodsDesc() {
	return goodsDesc;
}
public void setGoodsDesc(String goodsDesc) {
	this.goodsDesc = goodsDesc;
}
public double getGoodsUnitPrice() {
	return goodsUnitPrice;
}
public void setGoodsUnitPrice(double goodsUnitPrice) {
	this.goodsUnitPrice = goodsUnitPrice;
}
public String getGoodsImageName() {
	return goodsImageName;
}
public void setGoodsImageName(String goodsImageName) {
	this.goodsImageName = goodsImageName;
}
public Integer getSellCount() {
	return sellCount;
}
public void setSellCount(Integer sellCount) {
	this.sellCount = sellCount;
}
public Date getGoodsDate() {
	return goodsDate;
}
public void setGoodsDate(Date goodsDate) {
	this.goodsDate = goodsDate;
}
public tb_Goods_Type getType() {
	return type;
}
public void setType(tb_Goods_Type type) {
	this.type = type;
}
public Integer getTypeId() {
	return typeId;
}
public void setTypeId(Integer typeId) {
	this.typeId = typeId;
}
@Override
public String toString() {
	return "tb_Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsDesc=" + goodsDesc
			+ ", goodsUnitPrice=" + goodsUnitPrice + ", goodsImageName=" + goodsImageName + ", sellCount=" + sellCount
			+ ", goodsDate=" + goodsDate + ", type=" + type + ", typeId=" + typeId + "]";
}
public tb_Goods(Integer goodsId, String goodsName, String goodsDesc, double goodsUnitPrice, String goodsImageName,
		Integer sellCount, Date goodsDate, tb_Goods_Type type, Integer typeId) {
	super();
	this.goodsId = goodsId;
	this.goodsName = goodsName;
	this.goodsDesc = goodsDesc;
	this.goodsUnitPrice = goodsUnitPrice;
	this.goodsImageName = goodsImageName;
	this.sellCount = sellCount;
	this.goodsDate = goodsDate;
	this.type = type;
	this.typeId = typeId;
}
public tb_Goods() {
	super();
	// TODO Auto-generated constructor stub
}
public tb_Goods(Integer goodsId, String goodsName, String goodsDesc, double goodsUnitPrice, String goodsImageName,
		Integer sellCount, Date goodsDate) {
	super();
	this.goodsId = goodsId;
	this.goodsName = goodsName;
	this.goodsDesc = goodsDesc;
	this.goodsUnitPrice = goodsUnitPrice;
	this.goodsImageName = goodsImageName;
	this.sellCount = sellCount;
	this.goodsDate = goodsDate;
}
 
}