package com.aaa.Service;

import java.util.List;
import java.util.Map;

import com.aaa.entity.tb_Goods;

public interface GoodsService {
	 public List<Map>queryAll();
	 public List<Map> querytype();
	 public int save(tb_Goods g);
	 //ɾ��
	  public int delete(int goodsId);
	  //�޸�
	 public int update(tb_Goods g);
	    public List<tb_Goods> queryById(int goodsId);

}
