package com.aaa.Dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.tb_Goods;

public interface GoodsDao {
	//��ѯ����
    public List<Map>queryAll();
    //��ѯtype
    public List<Map> querytype();
    //���
    public int save(tb_Goods g);
    //ɾ��
    public int delete(int goodsId);
    //�޸�
    public int update(tb_Goods g);
    //����id��ѯ
    public List<tb_Goods> queryById(int goodsId);
}
