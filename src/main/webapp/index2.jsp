<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>云计费管理系统</title>
  <title><s:text name="system.title" /></title>
  
  <link rel="stylesheet" type="text/css" href="<s:url value="/Scripts/ext/resources/css/ext-all.css"/>" />
  <link rel="stylesheet" type="text/css" href="Styles/common.css"/>
  <link rel="stylesheet" type="text/css" href="MainContainer.css" />

  <!--导入Ext-->
  <script type="text/javascript" src="<s:url value="/Scripts/ext/adapter/ext/ext-base.js"/>"></script>
  <script type="text/javascript" src="<s:url value="/Scripts/ext/ext-all.js"/>"></script>
    

    <!-- 自定义内容 -->
  <script type="text/javascript" src="resources/js/dump.js"></script>
  <script type="text/javascript" src="MainContainer.js"></script>
    
    <!-- 客户管理模块 -->
    <link rel="stylesheet" type="text/css" href="usermng/Styles/UserMng.css" />
    <script type="text/javascript" src="usermng/UserTree.js"></script>
    <script type="text/javascript" src="usermng/UserGrid.js"></script>
    <script type="text/javascript" src="usermng/UserDetailWindow.js"></script>
    <script type="text/javascript" src="usermng/UserMngPanel.js"></script>
    
    <!-- 产品管理模块 -->
    <script type="text/javascript" src="productmng/ProductTree.js"></script>
    <script type="text/javascript" src="productmng/ProductMngPanel.js"></script>
    
    <!-- 报表管理模块 -->
    <script type="text/javascript" src="<s:url value="/Report/ReportTree.js"/>"></script>
    <script type="text/javascript" src="<s:url value="/Report/ReportMngPanel.js"/>"></script>
    
    
  </head>
  
  <body>
  </body>
  
  
</html>
