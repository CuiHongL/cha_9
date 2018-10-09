package com.aaa.entity;

import java.util.List;

public class tb_Goods_Type {
     private Integer typeId;
    private String typeName;
    private List<tb_Goods> goods;
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public List<tb_Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<tb_Goods> goods) {
		this.goods = goods;
	}
	@Override
	public String toString() {
		return "tb_Goods_Type [typeId=" + typeId + ", typeName=" + typeName + ", goods=" + goods + "]";
	}
	public tb_Goods_Type(Integer typeId, String typeName, List<tb_Goods> goods) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.goods = goods;
	}
	public tb_Goods_Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
