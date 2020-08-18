
	package com.wh.service.starter.svc.db.table;
	import com.wh.service.starter.biz.db.table.BizCompany;
	import com.wh.service.starter.intf.db.table.IServiceCompany;
	import com.alibaba.dubbo.config.annotation.Service;
	import org.springframework.beans.factory.annotation.Autowired;
	
	@Service(version = "1.0.0", connections = 2)
	public class  ServiceCompany implements IServiceCompany
	{
		@Autowired
		private BizCompany bizCompany;

	}
	