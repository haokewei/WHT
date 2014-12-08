<%@page import ="look.lookbypeople" %>
<%@page import ="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
		<title>SHOW_BOOK</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/blue.css" rel="stylesheet" type="text/css" media="all" />
<!----font-Awesome----->
   	<link rel="stylesheet" href="fonts/css/font-awesome.min.css">
<!----font-Awesome----->
<!-- start plugins -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<!--start slider -->
    <link rel="stylesheet" href="css/fwslider.css" media="all">
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/css3-mediaqueries.js"></script>
    <script src="js/fwslider.js"></script>
<!--end slider -->
<!-- must have -->
<link href="css/allinone_carousel.css" rel="stylesheet" type="text/css">
<script src="js/jquery-ui-1.8.16.custom.min.js" type="text/javascript"></script>
<script src="js/jquery.ui.touch-punch.min.js" type="text/javascript"></script>
<script src="js/allinone_carousel.js" type="text/javascript"></script>
<!--[if IE]><script src="js/excanvas.compiled.js" type="text/javascript"></script>
<![endif]-->
<!-- must have -->
	<script>
		jQuery(function() {

			jQuery('#allinone_carousel_charming').allinone_carousel({
				skin: 'charming',
				width: 990,
				height: 454,
				responsive:true,
				autoPlay: 3,
				resizeImages:true,
				autoHideBottomNav:false,
				showElementTitle:false,
				verticalAdjustment:50,
				showPreviewThumbs:false,
				//easing:'easeOutBounce',
				numberOfVisibleItems:5,
				nextPrevMarginTop:23,
				playMovieMarginTop:0,
				bottomNavMarginBottom:-10
			});		
		});
	</script>
<!-- Owl Carousel Assets -->
<link href="css/owl.carousel.css" rel="stylesheet">
<script src="js/owl.carousel.js"></script>
		<script>
			$(document).ready(function() {

				$("#owl-demo").owlCarousel({
					items : 4,
					lazyLoad : true,
					autoPlay : true,
					navigation : true,
					navigationText : ["", ""],
					rewindNav : false,
					scrollPerPage : false,
					pagination : false,
					paginationNumbers : false,
				});

			});
		</script>
		<!-- //Owl Carousel Assets -->
<!-- start circle -->
<script>
(function($){
	$.fn.percentPie = function(options){

		var settings = $.extend({
			width: 100,
			trackColor: "EEEEEE",
			barColor: "E2534B",
			barWeight: 30,
			startPercent: 0,
			endPercent: 1,
			fps: 60
		}, options);

		this.css({
			width: settings.width,
			height: settings.width
		});

		var	that = this,
			hoverPolice = false,
			canvasWidth = settings.width,
			canvasHeight = canvasWidth,
			id = $('canvas').length,
			canvasElement = $('<canvas id="'+ id +'" width="' + canvasWidth + '" height="' + canvasHeight + '"></canvas>'),
			canvas = canvasElement.get(0).getContext("2d"),
			centerX = canvasWidth/2,
			centerY = canvasHeight/2,
			radius = settings.width/2 - settings.barWeight/2;
			counterClockwise = false,
			fps = 1000 / settings.fps,
			update = .01;
			this.angle = settings.startPercent;

		this.drawArc = function(startAngle, percentFilled, color){
			var drawingArc = true;
			canvas.beginPath();
			canvas.arc(centerX, centerY, radius, (Math.PI/180)*(startAngle * 360 - 90), (Math.PI/180)*(percentFilled * 360 - 90), counterClockwise);
			canvas.strokeStyle = color;
			canvas.lineWidth = settings.barWeight;
			canvas.stroke();
			drawingArc = false;
		}

		this.fillChart = function(stop){
			var loop = setInterval(function(){
				hoverPolice = true;
				canvas.clearRect(0, 0, canvasWidth, canvasHeight);

				that.drawArc(0, 360, settings.trackColor);
				that.angle += update;
				that.drawArc(settings.startPercent, that.angle, settings.barColor);

				if(that.angle > stop){
					clearInterval(loop);
					hoverPolice = false;
				}
			}, fps);
		}

		this.mouseover(function(){
			if(hoverPolice == false){
				that.angle = settings.startPercent;
				that.fillChart(settings.endPercent);
			}
		});

		this.fillChart(settings.endPercent);
		this.append(canvasElement);
		return this;
	}
}(jQuery));

$(document).ready(function() {

	$('.google').percentPie({
		width: 100,
		trackColor: "E2534B",
		barColor: "76C7C0",
		barWeight: 20,
		endPercent: .9,
		fps: 60
	});
  
  $('.moz').percentPie({
		width: 100,
		trackColor: "E2534B",
		barColor: "76C7C0",
		barWeight: 20,
		endPercent: .75,
		fps: 60
	});
  
  $('.safari').percentPie({
		width: 100,
		trackColor: "E2534B",
		barColor: "#76C7C0",
		barWeight: 20,
		endPercent: .5,
		fps: 60
	});
    
});
</script>
</head>

	<body >
		<hr noshade>
		<div class="header_bg">
<div class="container">
	<div class="header">
		<div class="logo">
			<a href="index.html"><img src="images/logo.png" alt=""/></a>
		</div>
		<div class="h_menu">
		<a id="touch-menu" class="mobile-menu" href="#">Menu</a>
		<nav>
		<ul class="menu list-unstyled">
			<li class="activate"><a href="index.jsp">切换用户</a></li>
			<li class="activate"><a href="index.jsp">成果申报</a>
			<ul class="sub-menu list-unstyled">
				<li><a href="add_cbzz.jsp">出版专著申报</a></li>
				<li><a href="add_huojiang.jsp">获奖申报</a></li> 
				<li><a href="add_kyxm.jsp">科研项目申报</a></li>
				<li><a href="add_xsjz.jsp">学术兼职申报</a></li>
				<li><a href="add_zhuanli.jsp">专利申报</a></li>
			</ul>
			</li>
			<li class="activate"><a href="index.jsp">查询</a>
			<ul class="sub-menu list-unstyled">
				<li><a href="lookbypeople.jsp">姓名查询</a></li>
				<li><a href="lookbytime.jsp">时间查询</a></li> 
				<li><a href="lookbytitle.jsp">项目名称查询</a></li>
				<li><a href="lookbytype.jsp">类型查询</a></li>
				<li><a href="lookbyadvanced.jsp">综合查询</a></li>
			</ul>
			</li>
			<li class="activate"><a href="index.jsp">成果统计并生成报表</a>
			<ul class="sub-menu list-unstyled">
				<li><a href="print_gzl.jsp">人员成果统计</a></li>
				<li><a href="print_dw.jsp">单位成果统计</a></li> 
			</ul>
			</li>
		</ul>
		</nav>
		<script src="js/menu.js" type="text/javascript"></script>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
			<hr  width="100%" size="10" >
            <br>  </br>  
            <br>  </br>  
            <br>  </br>  
            <br>  </br>  
            <br>  </br>  
		<div align="center">
<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		与 <s:property value="Title"/> 有关的科研项目有:<br>
		</h3>
		<s:iterator value="Xmlb1" id="item"> 
    	<tr>
		<td>
		<s:a href="information_kyxm?Xmmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_kyxm?Xmmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_kyxm?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		于 <s:property value="Title"/> 有关的出版专著有:<br>
		</h3>
		<s:iterator value="Xmlb2" id="item"> 
    	<tr>
		<td>
		<s:a href="information_cbzz?Zzmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_cbzz?Zzmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_cbzz?Zzmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		与 <s:property value="Title"/> 有关的获奖项目有:<br>
		</h3>
		<s:iterator value="Xmlb3" id="item"> 
    	<tr>
		<td>
		<s:a href="information_huojiang?Xmmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_huojiang?Xmmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_huojiang?Xmmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		与 <s:property value="Title"/> 有关的学术兼职团体有:<br>
		</h3>
		<s:iterator value="Xmlb4" id="item"> 
    	<tr>
		<td>
		<s:a href="information_xsjz?Bzf=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_xsjz?Bzf=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_xsjz?Bzf=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
		
		<table border="2" cellsapcing="0" cellpadding ="0" bgcolor="white" width="60%" align="center">
		<h3>
		与 <s:property value="Title"/> 有关的专利有:<br>
		</h3>
		<s:iterator value="Xmlb5" id="item"> 
    	<tr>
		<td>
		<s:a href="information_zhuanli?Zlmc=%{item}" > 
		<s:property value='item'/>
		</s:a>
		</td>
		<td>
			<s:a href="deleteaction_zhuanli?Zlmc=%{item}">删除</s:a>
		</td>
		<td>
			<s:a href="updateaction_zhuanli?Zlmc=%{item}">更新</s:a>
		</td>
		</tr>
		</s:iterator>		
		</table>
  			<div id="fwslider"><!-- start slider -->
        <div class="slider_container">
            <div class="slide"> 
                <!-- Slide image -->
                    <img src="images/1.jpg">
                <!-- /Slide image -->
                <!-- Texts container -->
                <div class="slide_content">
                    <div class="slide_content_wrap">
                        <!-- Text title -->
                        
                        <!-- /Text title -->
                        <!-- Text description -->
                        
                        <!-- /Text description -->
                    </div>
                </div>
		</div>
		</body>
</html>
