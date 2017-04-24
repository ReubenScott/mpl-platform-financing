Ext.namespace("com.soak.cmp");
var userMngPanel;
var productTree;
/**
 * 主Viewport
 * 全局单例
 * @class com.soak.cmp.MainContainer
 * @extends Ext.Viewport
 */
com.soak.cmp.MainContainer=Ext.extend(Ext.Viewport,{
	//缓存所有一级模块
	firstModules:new Ext.util.MixedCollection(),
	layout:"border",
	id:"viewport",
	initComponent: function(config){
		this.items=[
			{
				xtype:'panel',
				region:'north',
				height:100,
				layout:'fit',
				frame:true,
				html:'<div class="app-top-div"></div>',
				defaults:{
					border:false
				},
				bbar:[
					{
						text:"客户管理",
						handler:this.switchModule.createDelegate(this,["usermngpanel","客户管理"])
					},"|",
					{
						text:"产品管理",
						handler:this.switchModule.createDelegate(this,["productmngpanel","产品管理"])
					},"|",
					{
						text:"报表管理",
						handler:this.switchModule.createDelegate(this,["reportPanel","报表管理"])
					},"|",
					{
						text:"配置管理",
						handler:this.switchModule.createDelegate(this,["productmng","配置管理"])
					},
					'->',
					{
						xtype:"label",
						id:"currentModuleLabel"
					},'|',
					{
						text:"首选项"
					},
					{
						text:"退出"
					}
				]
			},
			{
				xtype:'panel',
				id:'leftContainer',
				region:'center',
				layout:'card',
				border:false
			}
		];
		com.soak.cmp.MainContainer.superclass.initComponent.call(this);   
	},
	//切换一级模块
	switchModule:function(moduleId,moduleName){
		var leftContainer=Ext.getCmp("leftContainer");
		var targetModle=this.firstModules.get(moduleId);
		var currModuleLabel=Ext.getCmp("currentModuleLabel");
		if(!targetModle){
			switch(moduleId){
				case "usermngpanel":
					targetModle=new com.soak.cmp.UserMngPanel({
						id:moduleId
					});
					leftContainer.add(targetModle);
					break;
				case "productmngpanel":
					targetModle=new com.soak.cmp.ProductMngPanel({
						id:moduleId
					});
					leftContainer.add(targetModle);
					break;
				case "reportPanel":
					targetModle=new com.soak.cmp.ReportMngPanel({
						id:moduleId
					});
					leftContainer.add(targetModle);
					break;
				default:
					break;
			}
		}
		currModuleLabel.setText("<font color='#ff0000'>当前模块>"+moduleName+"</font>",false);
		this.firstModules.add(moduleId,targetModle);
		leftContainer.getLayout().setActiveItem(targetModle);
		leftContainer.doLayout();
	}
});
Ext.reg("maincontainer",com.soak.cmp.MainContainer);

Ext.onReady(function(){
	new com.soak.cmp.MainContainer();
});