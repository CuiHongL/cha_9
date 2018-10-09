<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/jqueryExt.js"></script>
  <body>
   <form  method="post" id="form1">
    	<table  border="1">
    		<tr>
    			<td>商品</td>
    			<td><input type="text" name="goodsName" value="矿泉水"/></td>
    		</tr>
    		<tr>
    			<td>折扣</td>
    			<td><input type="text" name="goodsDesc"  value="八折" />
    			</td>
    		</tr>
    		<tr>
    			<td>价格</td>
    			<td><input type="text" name="goodsUnitPrice" value="10"/></td>
    		</tr>
    		<tr>
    			<td>图片</td>
    			<td><input type="text" name="goodsImageName" /></td>
    		</tr>
    		<tr>
    			<td>总数</td>
    			<td><input type="text" name="sellCount" value="100"/></td>
    		</tr>
    		<tr>
    			<td>日期</td>
    			<td><input type="text" name="goodsDate" value="2018-09-27"/></td>
    		</tr>
    		<tr>
    			<td>类别</td>
    			<td><select id="querytype" name="typeId"></select></td>
    		</tr>
    		<tr>
    			<td><input type="button"  value="添加" onclick="test1()"/></td>
    		</tr>
    	</table>
    </form>
    <form  method="post" id="form2">
    	<table  border="1">
    		<tr>
    			<td>商品</td>
    			<td><input type="text" name="goodsName" id="goodsName" value="矿泉水"/></td>
    		</tr>
    		<tr>
    			<td>折扣</td>
    			<td><input type="text" name="goodsDesc" id="goodsDesc" value="八折" />
    			</td>
    		</tr>
    		<tr>
    			<td>价格</td>
    			<td><input type="text" name="goodsUnitPrice" id="goodsUnitPrice" value="10"/></td>
    		</tr>
    		<tr>
    			<td>图片</td>
    			<td><input type="text" name="goodsImageName" id="goodsImageName"/></td>
    		</tr>
    		<tr>
    			<td>总数</td>
    			<td><input type="text" name="sellCount" id="sellCount" value="100"/></td>
    		</tr>
    		<tr>
    			<td>日期</td>
    			<td><input type="date" name="goodsDate" id="goodsDate" value="2018-09-27"/></td>
    		</tr>
    		<tr>
    			<td>类别</td>
    			<!-- id="querytype" -->
    			<td><select  name="typeId" id="typeId"></select></td>
    		</tr>
    		<tr>
    			<td><input type="button"  value="修改" onclick="update()"/></td>
    		</tr>
    	</table>
    </form>
     <div>
     <table border="1">
    		<tr>
    			<td>编码</td>
    			<td>商品</td>
    			<td>折扣</td>
    			<td>价格</td>
    			<td>图片</td>
    			<td>总数</td>
    			<td>日期</td>
    			<td>类别</td>
    			
    			</tr>
    		<tbody id="tbody">
    		
    		</tbody>
    	</table>
    </div>
    
  </body>
</html>
<script>
/*查询goodss  */
  function test(){
		 	$.ajax({
        	url : "goods/queryAll",
        	type : "post",
        	async : true,
        	dataType : 'json',
        	success : function(data) {
        		$("#tbody").html("");
        		for(var i=0;i<data.length;i++){
        			var obj=data[i];
        			var tr="<tr>";
        			tr+="<td>"+data[i].goodsId+"</td>";
        			tr+="<td>"+data[i].goodsName+"</td>";
        			tr+="<td>"+data[i].goodsDesc+"</td>";
        			tr+="<td>"+data[i].goodsUnitPrice+"</td>";
        			tr+="<td>"+data[i].goodsImageName+"</td>";
        			tr+="<td>"+data[i].sellCount+"</td>";
        			tr+="<td>"+data[i].goodsDate+"</td>";
        			tr+="<td>"+data[i].typeName+"</td>";
        			tr+="<td><input type='button' id='"+obj.goodsId+"' value='删除' class='delete'/><input type='button' id='"+obj.goodsId+"' value='更改' class='update'/></td>";
        			
        			tr+="</tr>";
        			$("#tbody").append(tr);
        		}
        	}
 		});
		}
		$(function(){
				test();
			})
			
			/*添加 */
			 function test1(){
			$.ajax({
	        	url : "goods/save",
	        	type : "post",
	           data:$("#form1").serialize(),
	       	 	dataType : 'text',//返回的数据类型
	        	success : function(data) {
	        		alert(data);
	        		test();
	        	}
	 		});
		}
		/* 查询type */
  function query(){
    $.ajax({
        	url : "goods/querytype",
        	type : "post",
        	async : true,
        	dataType : 'json',
        	success : function(data) {
        $("#tbody").html("");
        for(var i=0;i<data.length;i++){
        var obj=data[i];
        var tr="<option value='"+obj.typeId+"'>"+obj.typeName+"</option>"
              $("#querytype").append(tr);
          }}
       });
  }
  function query1(){
    $.ajax({
        	url : "goods/querytype",
        	type : "post",
        	async : true,
        	dataType : 'json',
        	success : function(data) {
        $("#tbody").html("");
        for(var i=0;i<data.length;i++){
        var obj=data[i];
        var tr="<option value='"+obj.typeId+"'>"+obj.typeName+"</option>"
              $("#typeId").append(tr);
          }}
       });
  }
  $(function(){
     query();
     query1();
  }
  )
  /* 删除 */
          $(function(){
	        $("#tbody").on("click",".delete",function(){
						var id=this.id;
					 	alert(id);
					 	if(confirm("确认删除？")){
					 		$.ajax({
					 		url : "goods/delete",
					 		type : "post",
/* 					 		async : true,
 */					 		contentType: "application/json; charset=utf-8",
					 		data : JSON.stringify(id),
					 		dataType : 'text',
					 		success:function(data){
					 			alert(data);
					 			test();
					 		}
					 	});
					 	}else{
					 		alert("取消了删除！");
					 	}
					 	
					})
			})
			/* 修改 */
			$(function(){
				$("#tbody").on("click",".update",function(){
					var id=this.id;
					$.ajax({
						url:"goods/ById",
						type:"post",
						async:true,
						contentType:"application/json;charset=utf-8",
						data: JSON.stringify(id), 
						dataType: 'Json',
						success:function(data){
							$("#goodsName").val(data[0].goodsName);
							$("#goodsDesc").val(data[0].goodsDesc);
							$("#goodsUnitPrice").val(data[0].goodsUnitPrice);
							$("#goodsImageName").val(data[0].goodsImageName);
							$("#sellCount").val(data[0].sellCount);
							$("#goodsDate").val(data[0].goodsDate);
							//alert(data[0].sex=="男");
						}
					});
				})
			})
			function update(){
				var obj=$("#form2").serializeObject();
			$.ajax({
	        	url : "goods/update",
	        	type : "post",
	        	async : true,
	        	contentType: "application/json; charset=utf-8",//需要制定
	        	data : JSON.stringify(obj),//将json对象转换成json格式的字符串
	       	 	dataType : 'text',//返回的数据类型
	        	success : function(data) {
	        	    alert(data);
	        		test();
	           }
	 		});
			} 
			
</script>
