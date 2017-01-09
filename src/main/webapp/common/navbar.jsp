<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<%@ include file="/common/config.jsp"%>
<style type="text/css">
.cb-top-bar {
	position: relative;
	width: 100%;
	height: 50px;
	background: #212528;
	background-color: rgb(33, 37, 40);
	background-image: none;
	background-repeat: repeat;
	background-attachment: scroll;
	background-clip: border-box;
	background-origin: padding-box;
	background-position-x: 0%;
	background-position-y: 0%;
	background-size: auto auto;
	line-height: 50px;
}

.cb-logo-icon>img {
	position: absolute;
	top: 10px;
	left: 10px;
	width: 30px;
	height: 30px;
}

.cb-logo-icon>span {
	position: absolute;
	margin-left: 56px;
	color: #FFFFFF;
	font-size: 14px;
}

.cb-logo-icon {
	position: relative;
	float: left;
	width: 180px;
	height: 100%;
	border-right: 1px solid #373d41;
}

.cb-side-bar {
	width: 180px;
	float: left;
	height: 100%;
	background: #373d41;
	overflow: hidden;
}
.cb-list-text{
	width: 100%;
	height: 37px;
	line-height: 37px;
	color: #cbd3da;
	font-size: 12px;
	text-align: left;
	position: relative;
}
</style>
<div>
	<div class="cb-top-bar">
		<div class="cb-logo-icon">
			<%-- 			<img src="${ctx}/images/cube.png" alt=""></img>  --%>
			<span>易数魔方</span>
		</div>
	</div>
	<div class="cb-side-bar">
		<ul>
			<li>
				<a href="" class="cb-list-text">热词分析</a>
			</li>
		</ul>
	</div>

</div>