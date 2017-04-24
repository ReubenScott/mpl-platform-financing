Ext.define('epl.xdbl.xdbl',{ 
    extend: 'Ext.panel.Panel', 
    xtype: 'xdbl-xdbl',
    initComponent : function(){ 
        Ext.apply(this,{ 
            id:"xdbl-tabpan", 
            tbar: [ 
                  { 
                    xtype: 'button', 
                    text: '[03]顶部工具栏' ,
                    enableToggle: true 
                  },
                  {
                        text:"Foo"
                    }, 
                    "->",
                    {
                        text:"Bar"
                    }

            ],
            layout: {
                type: 'table'
            },
            items:[ {
                    id : 'xdbl-start',
                    xtype: 'button',
                    text : '开始',
                    scale   : 'large',
                    pressed : true,
                    enableToggle: true ,
                    border: 0
                } , 
                {
                    id : 'xdbl-stop',
                    xtype: 'button',
                    text : '停止',
                    enableToggle : true,
                    scale : 'large',
                    style: {
                        left: '450px'
                    }
                }

            ] 
        }); 
        this.callParent(arguments); 
    } 
}); 