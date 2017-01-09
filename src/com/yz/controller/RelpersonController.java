package com.yz.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yz.po.Locate;
import com.yz.po.Relperson;
import com.yz.po.RelpersonVO;
import com.yz.service.LocateService;
import com.yz.service.RelpersonService;
import com.yz.utils.DateTimeKit;
import com.yz.utils.Page;
import com.yz.vo.CountVO;
import com.yz.vo.LocateCount;
import com.yz.vo.RelpersonCount;
import com.yz.vo.UploadResult;

@Controller
@RequestMapping("/relperson")
public class RelpersonController {
	@Autowired
	private RelpersonService relpersonService;
	
	@Autowired
	private LocateService locateService;

	@RequestMapping("/addRelperson")
	public @ResponseBody UploadResult addRelperson(Relperson relperson)
			throws Exception {
		relperson.setUploadtime(DateTimeKit.getLocal_Time());//设置上传时间
		relpersonService.insert(relperson);
		UploadResult uploadResult = new UploadResult();
		uploadResult.setUploadResult(1);
		return uploadResult;
	}

	@RequestMapping("/toEdit")
	public String toEdit(HttpServletRequest request, Model model, Integer id) throws Exception {
		Relperson relperson = relpersonService.findRelpersonById(id);
		model.addAttribute("relperson", relperson);
		return "relperson/relpersonUpdate";
	}
	
	@RequestMapping("/view")
	public ModelAndView view(Integer id) throws Exception {
		Relperson relperson = relpersonService.findRelpersonById(id);
		
		Locate currentLocate = locateService.getRealLocate(1,relperson.getCurrentaddress());
		Locate workdunitLocate = locateService.getRealLocate(2,relperson.getWorkdunitaddress());
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("relperson", relperson);
		modelAndView.addObject("workdunitLocate", workdunitLocate);
		modelAndView.addObject("currentLocate", currentLocate);
		modelAndView.setViewName("relperson/relpersonView");
		return modelAndView;
	}


	@RequestMapping("/query")
	public String Query(RelpersonVO relpersonVO,Model model) throws Exception {
		if (relpersonVO.getPageNo() == null) {
			relpersonVO.setPageNo(1);
		}
		
		Page page = relpersonService.findRelpersonListByRelpersonQuery(relpersonVO);
		model.addAttribute("page", page);
		
		model.addAttribute("relpersonVO", relpersonVO);

		return "relperson/relpersonList";
		
	}
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) throws Exception {
		List<Relperson> relpersonList = relpersonService.findRelpersonList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("relpersonList", relpersonList);
		modelAndView.setViewName("relperson/relpersonList");
		return modelAndView;
	}

	@RequestMapping("/delete")
	public String delete(Integer id) throws Exception {
		relpersonService.deleteRelpersonById(id);
		return "redirect:/relperson/list";
	}
	
	
	
	@RequestMapping("/update")
	public String update(Integer id,Relperson relperson) throws Exception {
		relpersonService.updateRelpersonById(id,relperson);
		return "redirect:/relperson/list";
	}


	@RequestMapping("/editRelpersonSubmit")
	public  String editRelpersonSubmit(Model model, HttpServletRequest request, Integer id,Relperson relperson) throws Exception {
		relpersonService.updateRelpersonById(id, relperson);
		return "op_success_child";
	}
	
	@RequestMapping("/count")
	public ModelAndView count(Integer countType) throws Exception {
		
		int totalNumber = 0;
		
		List<CountVO> countVOs = new ArrayList<CountVO>();
		
		countVOs = relpersonService.handleCountByCountType(countType);
		
		List<Relperson> relpersons = relpersonService.findRelpersonList();
		
		if(relpersons!=null&&relpersons.size()>0)
		{
			CountVO countVO = new CountVO();
			countVO.setCountTypeName("合计");
			countVO.setNumber(relpersons.size());
			countVOs.add(countVO);
			
			
			totalNumber = relpersons.size();
		}
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("countVOs", countVOs);
		modelAndView.addObject("totalNumber", totalNumber);
		modelAndView.setViewName("relperson/relpersonCount");
		return modelAndView;
	}
	
	
	  @RequestMapping("/countnew")
	  public String count(Model model) throws Exception {
		  List<RelpersonCount> relpersonCounts = relpersonService.findRelpersonCount();
		  model.addAttribute("relpersonCounts", relpersonCounts);
		  
		 return "relperson/relpersonCountNew";
	  }
}
