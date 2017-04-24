<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title><s:text name="system.title" /></title>
<script type="text/javascript" src="<s:url value="/js/ext/ext-all.js"/>"></script>


<style>
BODY {
	FONT-SIZE: 12px;
	MARGIN: 0px
}

.InsideRegister {
	PADDING-RIGHT: 0px;
	PADDING-LEFT: 0px;
	PADDING-BOTTOM: 34px;
	PADDING-TOP: 0px
}

.SizeRegister {
	COLOR: #ffffff
}

.WbRegister {
	BORDER-RIGHT: #4b93d0 1px solid;
	BORDER-TOP: #4b93d0 1px solid;
	BACKGROUND: #ffffff;
	BORDER-LEFT: #4b93d0 1px solid;
	WIDTH: 158px;
	BORDER-BOTTOM: #4b93d0 1px solid;
	HEIGHT: 16px
}

.SizeBottom1 {
	COLOR: #03243c
}

.table {
	BORDER-RIGHT: #87bfd1 1px solid;
	BORDER-TOP: #87bfd1 1px solid;
	MARGIN-TOP: 5px;
	FONT-SIZE: 12px;
	BACKGROUND: #dff6fe;
	MARGIN-BOTTOM: 5px;
	BORDER-LEFT: #87bfd1 1px solid;
	BORDER-BOTTOM: #87bfd1 1px solid
}

.copyright_bg {
	FONT-SIZE: 12px;
	BACKGROUND-IMAGE: url(../images/bottom_bg.gif);
	PADDING-TOP: 20px
}
</style>

<script>
  (function(){
    Ext.onReady(function(){
           alert('hello');

        });
   })();

</script>


</head>

<body background="<s:url value="/images/111.jpg"/>" onload="$('#loginName').focus()">

<table cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <tr>
    <td background="<s:url value="/images/top_bg1.gif"/>" height=121></td>
  </tr>
</table>
<table cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <tr>
    <td align="center" background="<s:url value="/images/top_bg2.gif"/>"><img src="<s:url value="/images/logo.jpg"/>" width="643" height="73"></td>
  </tr>
</table>
<table cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
  <tr>
    <td vAlign=top height=421>
    <table cellSpacing=0 cellPadding=0 width=630 align=center border=0>
      <tr>
        <td height=28></td>
      </tr>
      <tr>
        <td class=SizeRegister vAlign=top align=center height=28>欢迎使用<s:text name="system.title" />！</td>
      </tr>
      <tr>
        <%--		          <td class="SizeRegister" align="center" height="22">欢迎使用<s:text name="system.title" />！<span id="messagePanel"></span></td></tr>--%>
        <td class="SizeRegister" align="center" height="22"><span id="messagePanel"></span></td>
      </tr>
      <tr>
        <td>
        <table class=SizeRegister cellSpacing=5 cellPadding=0 width=250 align=center border=0>
          <TBODY>
            <tr>
              <td width=60 height=24>用户名称：</td>
              <td height="32"><s:textfield id="loginName" onkeydown="javascript:if(event.keyCode==13){login();}" cssClass="WbRegister" /></td>
            </tr>
            <tr>
              <td height=32>用户密码：</td>
              <td><s:password id="password" onkeydown="javascript:if(event.keyCode==13){login();}" cssClass="WbRegister" /></td>
            </tr>
        </TABLE>
        </td>
      </tr>
      <tr>
        <td>
        <table cellSpacing=0 cellPadding=0 width=517 align=center border=0>
          <tr>
            <td class=InsideRegister vAlign=bottom width=215><img alt="" src="<s:url value="/images/Line2.jpg"/>"></td>
            <td width=87><input style="border: 0px" type="image" src="<s:url value="/images/Register.jpg"/>" onClick="login()"></td>
            <td class=InsideRegister vAlign=bottom width=215><img alt="" src="<s:url value="/images/Line1.jpg"/>"></td>
          </tr>
        </table>
        </td>
      </tr>
      <tr>
        <td height=10></td>
      </tr>
      <tr>
        <td class=SizeBottom align=center>服务时间：周一至周五 8:30--11:30，13:00--17:30<br />
        系统维护中心电话：0571-87387793，0571-87387856<br />
        Email：service_sunyway@163.com</td>
      </tr>
    </table>
    </td>
  </tr>
</table>
</body>
</html>
