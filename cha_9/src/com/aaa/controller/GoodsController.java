package com.aaa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aaa.Service.GoodsService;
import com.aaa.entity.tb_Goods;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private GoodsService ser;
	@RequestMapping("/queryAll")
	@ResponseBody
     public List<Map> queryAll(){
		return ser.queryAll();
    	 }
	@RequestMapping("/querytype")
	@ResponseBody
	public List<Map> querytype() {
		return ser.querytype();
	}
	@RequestMapping("/save")
	@ResponseBody
	public int save(tb_Goods g) {
		System.out.println("123");
		return ser.save(g);
	}
	//删除一行数据
	@RequestMapping("/delete")
	public void delete(@RequestBody int goodsId,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		int num=ser.delete(goodsId);
		if (num>0) {
			out.print("删除成功");
		}else{
			out.print("删除失败");
		}
	}
	@RequestMapping("/ById")
	@ResponseBody
	public List<tb_Goods> queryById(@RequestBody int goodsId){
		List<tb_Goods> list=ser.queryById(goodsId);
		return list;
		
	}
	@RequestMapping("/update")
	public void update(@RequestBody tb_Goods g,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		int goodsId=ser.update(g);
		if (goodsId>0) {
			out.print("更改成功！");
		}else{
			out.print("更改失败！");
		}
	}
}
