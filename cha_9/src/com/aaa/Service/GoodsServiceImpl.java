package com.aaa.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.aaa.Dao.GoodsDao;
import com.aaa.entity.tb_Goods;
@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsDao dao;
	public List<Map>queryAll() {
		// TODO Auto-generated method stub
		return dao.queryAll();
	}

	@Override
	public int save(tb_Goods g) {
		// TODO Auto-generated method stub
		return dao.save(g);
	}

	@Override
	public List<Map> querytype() {
		// TODO Auto-generated method stub
		return dao.querytype();
	}

	@Override
	public int delete(int goodsId) {
		// TODO Auto-generated method stub
		return dao.delete(goodsId);
	}

	@Override
	public int update(tb_Goods g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	
	public List<tb_Goods> queryById(int goodsId) {
		// TODO Auto-generated method stub
		return dao.queryById(goodsId);
	}



}
