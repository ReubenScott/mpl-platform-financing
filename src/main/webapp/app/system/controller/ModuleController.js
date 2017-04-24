Ext.define('IV.controller.ModuleController', {
    extend: 'Ext.app.Controller',
    views: [
        'North',
        'Center',
        'West'
    ],
    stores: [
        'Module'
    ],
    models: [
        'Module'
    ],
    refs: [
        {
            ref: 'center',
            selector: 'center'
        }, {
            ref: 'viewport',
            selector: 'viewport'
        },
        {
            ref: 'moduleView',
            selector: 'moduleView'
        }

    ],
    init: function(app) {
        this.control({
            'moduleView': {
                'afterrender':this.afrender, // 自动选择第一个
                'select':this.onSelectionChange
            }
        });
    },
    afrender:function(view){
        view.getSelectionModel().select(view.store.first());
    },
    onSelectionChange: function(thisview, record, eOpts){
       var self = this;
       var selected = record;
        if(selected.get('module') =='userModule'){
          Ext.require("IV.controller.UserController",function(){
             var userController = application.getController('UserController');
             userController.init(self);
          },self);
        }else if(selected.get('module') =='roleModule'){
          Ext.require("IV.controller.RoleController",function(){
             var roleController = application.getController('RoleController');
             roleController.init(self);
          },self);
        }
    }
});
