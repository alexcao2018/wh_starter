
	package com.wh.service.starter.biz.db.table;
	import com.project.base.mybatis.criterion.Criteria;
	import com.project.base.mybatis.criterion.Criterion;
	import com.project.base.mybatis.criterion.Restrictions;
	import com.wh.service.starter.dao.db.table.DaoCompany;
	import com.wh.service.starter.model.db.table.Company;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;

	import java.util.List;

	@Component
	public class  BizCompany
	{
		@Autowired
		private DaoCompany daoCompany;
		public void insert(Company company){
			daoCompany.insert(company);
		}

		public List searchCompany(String name){
			Criteria criteria = Criteria.forClass(Company.class);
			criteria.add(Restrictions.like(Company._name, name));
			return daoCompany.listBy(criteria);
		}
	}
	