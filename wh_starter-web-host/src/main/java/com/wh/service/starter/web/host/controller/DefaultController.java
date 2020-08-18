package com.wh.service.starter.web.host.controller;

import com.project.base.model.CommonResponse;
import com.project.base.web.BaseController;
import com.wh.service.starter.biz.db.table.BizCompany;
import com.wh.service.starter.intf.db.table.IServiceCompany;
import com.wh.service.starter.model.db.table.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@ApiIgnore
@RestController
public class DefaultController extends BaseController {
    @Autowired
    private BizCompany bizCompany;
    @GetMapping("/")
    public String index() {
        return "ok";
    }

	@GetMapping("/healthcheck")
    public String healthcheck() {
        System.out.println("cai we where ");
        Company company = new Company();
        company.setName("苏州文和网络科技有限公司");
        bizCompany.insert(company);
        return "ok";
    }
    @GetMapping("/insertCompany")
    public String testRest(){
        Company company = new Company();
        company.setName("苏州文和网络科技有限公司22");
        bizCompany.insert(company);
        return "saved";
    }
    @GetMapping("/searchCompany")
    public CommonResponse  search(String name){
        List list = bizCompany.searchCompany(name);
        return CommonResponse.success(list);
    }

	@GetMapping("/favicon.ico")
    void favicon() {
    }
}
