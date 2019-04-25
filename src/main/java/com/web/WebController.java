package com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.repository.SampleRepository;
import com.web.service.SampleService;
import com.web.vo.Sample;

@RestController
@RequestMapping("/member")
public class WebController {
	
	@Autowired
	private SampleRepository memberDao;

	//@Resource(name = "SampleService")
	@Autowired
	private SampleService sampleService;

	@RequestMapping("/home")
	@ResponseBody
	public String home(){
		return "helloHome";
	}	
	
	@RequestMapping("/jsp")
	public String jspPage(Model model) throws Exception{

		model.addAttribute("name","hello springBoot12345");
		model.addAttribute("sysdate",sampleService.sampleSysdate());

		return "hello";

	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Sample add(Sample member){
		
		Sample memberData = memberDao.save(member);
		
		return memberData;

	}
	
	@RequestMapping("/view/{id}")
	@ResponseBody
	public Sample view(@PathVariable int id){

		Sample memberData = memberDao.findOne(id);

		return memberData;

	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Sample> list(){

		List<Sample> memberList = memberDao.findAll();

		return memberList;

	}
	
	@RequestMapping("/del/{id}")
	public String delete(@PathVariable int id){

		System.out.println("id=" + id);

		memberDao.delete(id);

		return "redirect:/member/list";

	}
	
	@RequestMapping("/edit/{id}")
	@ResponseBody
	public Sample edit(Sample member){

		Sample memberData = memberDao.save(member);

		return memberData;

	}
	
}