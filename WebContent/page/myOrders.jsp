<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>briup电子商务-我的信息</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<style type="text/css">
#nav {
	/* border: 1px solid red; */
	float: left;
}

#nav li {
	height: 50px;
	width: 150px;
	line-height: 50px;
	border: 1px solid gray;
	text-align: center;
}

.content {
	float: left;
	border: 1px solid gray;
	width: 85%;
	min-height: 400px;
}

.reg_box {
	background-image: url("");
}

#order tr td {
	border: 1px solid #DAF3FF;
	padding: 20px;
	width: 300px;
	text-align: center;
}

#order th {
	background-color: #DAF3FF;
	text-align: left;
	height: 40px;
	line-height: 40px;
}
</style>
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<li><a href="ExitServlet">退出</a>|</li>
				<li><a href="users/toMyOrdersServlet">我的订单<span class="jt_down"></span></a>|</li>
				<li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
				<li><a href="#">网站导航<span class="jt_down"></span></a></li>
			</ul>
		</div>
	</div>
	<!--头部-->
	<div class="header3">
		<a href="#"><img src="images/logo.png" class="oneImg"></a>
		<div class="h3_right">
			<div class="myyy">
				个人信息 <span class="sj_down"></span>
			</div>
			<div class="tsc">
				<a href="users/toShopCarServlet">去购物车结算</a> <span class="sj_right"></span>
			</div>
		</div>
	</div>
	<div class="container3">
		<ul id="nav">
			<li><a href="userInfo.jsp">个人信息</a></li>
			<li><a href="users/toMyOrdersServlet">我的订单</a></li>
		</ul>
		<div class="content">
			<table id="order">
				<c:forEach var="order" items="${orders }" varStatus="state">

					<tbody>

						<tr>
							<th colspan="2"><input type="checkbox" name="orderid"
								value="${order.id }"> <b>${order.orderDate }</b> <span>订单编号:${order.id }</span>
							</th>
							<th colspan="1">briup自营</th>
							<th><a href="delOrder.do?orderid=${order.id}"><img
									alt="" src="images/del.png" style="float: right"></a></th>
						</tr>

						<tr>
							<c:forEach var="orderLine" items="${order.orderLines }">
								<td><img alt="" src="images/1.png" style="float: left;">
									<p style="padding-top: 30px;">${orderLine.book.name }</p></td>
								<td>${orderLine.book.price }</td>
								<td>${orderLine.num }</td>
								<td>总价值：${order.total }<br /> (含运费：￥0.0元)

								</td>
							</c:forEach>
						</tr>

					</tbody>

				</c:forEach>

			</table>
		</div>
	</div>
	<!--脚部-->
	<div style="clear: both;"></div>
	<div class="footer3">
		<div class="f3_top">
			<div class="f3_center">
				<div class="ts1">品目繁多 愉悦购物</div>
				<div class="ts2">正品保障 天天低价</div>
				<div class="ts3">极速物流 特色定制</div>
				<div class="ts4">优质服务 以客为尊</div>
			</div>
		</div>
		<div class="f3_middle">
			<ul class="f3_center">
				<li class="f3_mi_li01">
					<h1>购物指南</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>配送方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>支付方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>售后服务</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>服务保障</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li06">
					<h1>客服中心</h1> <img src="images/QRCodes.png">
					<p>抢红包、疑问咨询、优惠活动</p>
				</li>
			</ul>
		</div>
		<div class="f3_bottom">
			<p class="f3_links">
				<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
					href="#">供货商入驻</a>
			</p>
			<p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司</p>
			<img src="images/police.png">
		</div>
	</div>

</body>
</html>