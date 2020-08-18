
package com.wh.service.starter.dao.db.table;

import com.wh.service.starter.model.db.table.Company;
import com.project.base.mybatis.annotation.ByCriteria;
import com.project.base.mybatis.base.IBaseMapper;
import com.project.base.mybatis.criterion.Criteria;
import com.project.base.model.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoCompany extends IBaseMapper<Company, Integer> {

}

	