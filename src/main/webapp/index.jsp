<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
</head>
<body>
<a href="add.html">新增帖子</a>
	<table class="table table-hover table-bordered text-center table-striped">
		<thead>
			<tr>
				<td>编号</td>
				<td>标题</td>
				<td>作者</td>
				<td>发布时间</td>
				<td>操作1</td>
				<td>操作2</td>
			</tr>
		</thead>
		<tbody name="tbody">
          
		</tbody>
	</table>
</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script src="js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		$.get("http://127.0.0.1:8080/Aexamination/inv/getin/1/100", function(data) {
			$.each(data.list, function(i,obj) {
				var tr = " <tr>" + " <td>" + ""+obj.invitationId+"" + "</td>" + " <td>" + ""+obj.headline+""
						+ "</td>" + " <td>" + ""+obj.us.userName+"" + " </td>" + " <td>"
						+ ""+obj.invitationDate+"" + "</td>" + " <td>" + "<a href='javascript:void(0)' ids="+obj.invitationId+" name='ding'>顶("+obj.topList.length+")</a>  <a href='javascript:void(0)' ids="+obj.invitationId+" name='cai'>踩("+obj.trampleList.length+")</a>  <a>回复</a>" + "</td>"
					    + " <td><input type=\"button\" class=\"btn btn-success btn-sm\" value=\"查看\" style=\"background-color: olivedrab;width:100px;\" name=\"inset\" ids="+obj.invitationId+"></td>"
						+ "</tr>";
				 $("[name=tbody]").append(tr);
			})
		}, "json")
		$("[name=ding]").live("click",function(){
			var id = $(this).attr("ids");
			$.get("http://127.0.0.1:8080/Aexamination/inv/addtop/"+id,function(data){
				alert(data.mag);
				if(data.code==400){
			      location.href="logn.html"; 
				}else{
					 location.href="index.jsp"; 
				}
			})
		})
		$("[name=cai]").live("click",function(){
			var id = $(this).attr("ids");
			$.get("http://127.0.0.1:8080/Aexamination/inv/addTramp/"+id,function(data){
				alert(data.mag);
				if(data.code==400){
			      location.href="logn.html"; 
				}else{
					 location.href="index.jsp"; 
				}
			})
		})
		$("[name=inset]").live("click",function(){
			var id = $(this).attr("ids");
			   window.sessionStorage.setItem("id",id);
			   
			   location.href="info.html"; 
		})
		//addTramp
	})
</script>
<!-- $.ajax(" http://localhost:8080/mailboxs/sys/draftboxAdd",{
				type:"post",
				contentType:"application/json",
				dataType:"json",
				data:JSON.stringify(box),
				timeout:5000,
				success:function(data){
					if(data.code==200){
						alert("存稿成功！");
						reset();
					}else{
						alert("存稿失败！"+data.msg);
					}
				}
			});
				 -->
</html>
