/**
 * 債券
 */
CREATE TABLE "finance"."bond" (
	"code" varchar(6) COLLATE "default" DEFAULT ''::character varying NOT NULL,
	"name" varchar(20) COLLATE "default" DEFAULT ''::character varying NOT NULL,
	"faceprice" float4,
	"netprice" float4,
	"fullprice" float4,
	"accruedinterest" float4,
	"turnvolume" float4,
	"inpaydays" int4,
	"couponrate" float4,
	"bondcredit" varchar(6) COLLATE "default" DEFAULT ''::character varying NOT NULL,
	"maincredit" varchar(20) COLLATE "default" DEFAULT ''::character varying NOT NULL,
	"assukind" varchar(60) COLLATE "default" DEFAULT ''::character varying NOT NULL,
	"duedate" date,
	"amount" float4,
	"src_dt" date,
	"rec_dt" date
)
WITH (OIDS=FALSE)
;

ALTER TABLE "finance"."bond" OWNER TO "postgres";

COMMENT ON TABLE "finance"."bond" IS '債券';
COMMENT ON COLUMN "finance"."bond"."code" IS '債券代碼';
COMMENT ON COLUMN "finance"."bond"."name" IS '債券名称';
COMMENT ON COLUMN "finance"."bond"."faceprice" IS '面值(元)';
COMMENT ON COLUMN "finance"."bond"."netprice" IS '净价(元)';
COMMENT ON COLUMN "finance"."bond"."fullprice" IS '全价(元)';
COMMENT ON COLUMN "finance"."bond"."accruedinterest" IS '应计利息';
COMMENT ON COLUMN "finance"."bond"."turnvolume" IS '成交额(万元)';
COMMENT ON COLUMN "finance"."bond"."inpaydays" IS '距付息天数';
COMMENT ON COLUMN "finance"."bond"."couponrate" IS '票面利率(%) ';
COMMENT ON COLUMN "finance"."bond"."bondcredit" IS '债券信用';
COMMENT ON COLUMN "finance"."bond"."maincredit" IS '主体信用';
COMMENT ON COLUMN "finance"."bond"."assukind" IS '担保方式';
COMMENT ON COLUMN "finance"."bond"."duedate" IS '到期日';
COMMENT ON COLUMN "finance"."bond"."amount" IS '规模 (亿) ';
COMMENT ON COLUMN "finance"."bond"."src_dt" IS '源数据日期';
COMMENT ON COLUMN "finance"."bond"."rec_dt" IS '记录日期';


/**
 * 财务概要
 */
CREATE TABLE finance.financial_summary (
  stat_date varchar(10),
	code varchar(6) ,
	name varchar(20) ,
	currency varchar(6),
	net_asset_per_share decimal,
	earnings_per_share decimal,
	cash_per_share decimal,
	capital_reserves_per_share decimal,
	net_fixed_assets decimal,
	total_current_assets decimal,
	total_assets decimal,
	total_longterm_liability decimal,
	revenue decimal,
	finance_expense decimal,
	net_profit decimal,
	rec_dt date
)
WITH (OIDS=FALSE)
;

ALTER TABLE finance.financial_summary OWNER TO postgres;

COMMENT ON TABLE finance.financial_summary IS '财务概要';
COMMENT ON COLUMN finance.financial_summary.stat_date IS '统计日期';
COMMENT ON COLUMN finance.financial_summary.code IS '证券代碼';
COMMENT ON COLUMN finance.financial_summary.name IS '債券名称';
COMMENT ON COLUMN finance.financial_summary.currency IS '币种';
COMMENT ON COLUMN finance.financial_summary.net_asset_per_share IS '每股净资产';
COMMENT ON COLUMN finance.financial_summary.earnings_per_share IS '每股收益';
COMMENT ON COLUMN finance.financial_summary.cash_per_share IS '每股现金含量';
COMMENT ON COLUMN finance.financial_summary.capital_reserves_per_share IS '每股资本公积金';
COMMENT ON COLUMN finance.financial_summary.net_fixed_assets IS '固定资产合计';
COMMENT ON COLUMN finance.financial_summary.total_current_assets IS '流动资产合计';
COMMENT ON COLUMN finance.financial_summary.total_assets IS '资产总计';
COMMENT ON COLUMN finance.financial_summary.total_longterm_liability IS '长期负债合计';
COMMENT ON COLUMN finance.financial_summary.revenue IS '主营业务收入';
COMMENT ON COLUMN finance.financial_summary.finance_expense IS '财务费用';
COMMENT ON COLUMN finance.financial_summary.net_profit IS '净利润';
COMMENT ON COLUMN finance.financial_summary.rec_dt IS '记录日期';


