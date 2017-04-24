/**
 * ClassName 部门管理数据列表视图
 */
Ext.define('epl.system.view.MenuList',{
	extend:'Ext.grid.Panel',
	alias : 'widget.system.MenuList',
//	store : 'epl.system.store.MenuStore',
  
	selModel:{
    selType:'checkboxmodel'
  },
  
  multiSelect: true,

  border:0,
  frame:true,

  tbar:[
    {xtype:'button',text:'添加',id:'add',iconCls:'table_add'},
    {xtype:'button',text:'删除',id:'delete',iconCls:'table_remove'},
    {xtype:'button',text:'保存',id:'save',iconCls:'table_save'}
  ],

  enableKeyNav:true,
  columnLines: true,

  initComponent : function() {
    this.columns = [ 
    ];


    this.editing = Ext.create("Ext.grid.plugin.CellEditing");
    this.plugins = [this.editing];

    this.callParent(arguments);
  }
});





