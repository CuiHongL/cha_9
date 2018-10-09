package com.aaa.Dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.tb_Goods;

public interface GoodsDao {
	//查询所有
    public List<Map>queryAll();
    //查询type
    public List<Map> querytype();
    //添加
    public int save(tb_Goods g);
    //删除
    public int delete(int goodsId);
    //修改
    public int update(tb_Goods g);
    //根据id查询
    public List<tb_Goods> queryById(int goodsId);
}
