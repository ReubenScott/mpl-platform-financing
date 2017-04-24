/**
 * ClassName 菜单管理
 */
Ext.define("epl.system.view.MenuManage",{
	extend:'Ext.panel.Panel',
	alias : 'widget.system.MenuManage',  
  store : 'epl.system.store.MenuStore',
	
//	defaults:{
//		split:true,
//		bodyStyle:'padding:1px'
//	},
//	
//	layout:'border',

  tbar:[
    {xtype:'button',text:'添加',id:'add',iconCls:'table_add'},
    {xtype:'button',text:'删除',id:'delete',iconCls:'table_remove'},
    {xtype:'button',text:'保存',id:'save',iconCls:'table_save'}
  ],
  
	items:[
  	{
  		title:'菜单数据表格',
  		iconCls:'dept_table',
  		region:'center',
  		xtype:'panel',
//  		id:'center-grid',
  		margins:'5 5 5 0',
  		layout:'fit',
  		items:[{
  			id:'dept-grid',
  			xtype:'system.MenuList'
  		}]
  	}
	]
	
});