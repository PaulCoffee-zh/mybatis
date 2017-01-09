package com.akcomejf.cube.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akcomejf.cube.model.Requirement;
import com.akcomejf.cube.service.impl.RequirementService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;

import tk.mybatis.mapper.entity.Example;

@Controller
public class indexController {

	@Autowired
	private RequirementService requirementService;

	@RequestMapping(value = "/")
	public String index1() {
		return "redirect:/index.html";
	}

	@RequestMapping("/index.html")
	public ModelAndView index(Requirement requirement, ModelAndView view) {
		Example example = new Example(Requirement.class);
		if (StringUtil.isNotEmpty(requirement.getQuery())) {
			example.createCriteria().andLike("name", "%" + requirement.getQuery() + "%");
			example.or(example.createCriteria().andLike("content", "%" + requirement.getQuery() + "%"));
		}
		example.orderBy("createTime").desc();
		List<Requirement> requirementList = requirementService.selectPage(requirement.getPage(), requirement.getRows(),
				example);
		view.addObject("pageInfo", new PageInfo<Requirement>(requirementList));
		view.addObject("requirement", requirement);
		view.setViewName("index");
		return view;
	}

    @RequestMapping("/login")
    public String login(HttpServletRequest req,HttpServletResponse resp) {

        boolean isAjax = "XMLHttpRequest".equals(req.getHeader("X-Requested-With"));
        if(isAjax){
            resp.setStatus(401);
        }
        return "login";
    }

    @RequestMapping("/404")
    public String error404(){
        return "error-404";
    }

    @RequestMapping("/500")
    public String error500(){
        return "error-500";
    }

    @RequestMapping("/403")
    public String error403(){
        return "error-403";
    }
}
