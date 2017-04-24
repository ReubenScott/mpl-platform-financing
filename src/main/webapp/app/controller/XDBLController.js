Ext.define('epl.controller.XDBLController',{ 
    extend: 'Ext.app.Controller', 
  

    init: function () {  
    //初始化部分，下面是部分是给菜单绑定单击事件，接下来会用，这里先注释  
        this.control({  
          
            //设定列表添加按钮的事件
           'xdbl-xdbl button[id=xdbl-start]':{
              click: this.startBl
            },
           'xdbl-xdbl button[id=xdbl-stop]':{
              click: this.stopBl
            }

        });
    },

    startBl : function(button){
        //4.ajax请求把后台数据拿过来
        Ext.Ajax.request({
            url:'inforecod/XDBL/xdbl.htm',
            method:'post',
            timeout:4000,
            success:function(response,opts){
                var obj = eval('('+response.responseText+')');
                 // alert(obj.thread_id);
                //5.得到地区的哪个对象area DOM
                //8.把从数据库拿到的数据进行前台页面缓存
            }
        });
    },

    stopBl : function(button){
        //4.ajax请求把后台数据拿过来
        Ext.Ajax.request({
            url:'inforecod/XDBL/xdblStop.htm',
            method:'post',
            timeout:4000,
            success:function(response,opts){
                var obj = eval('('+response.responseText+')');
                 // alert(obj.status);
                //5.得到地区的哪个对象area DOM
                //8.把从数据库拿到的数据进行前台页面缓存
            }
        });
    }
       


});