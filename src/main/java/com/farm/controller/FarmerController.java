package com.farm.controller;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import java.io.IOException;
import java.rmi.ServerException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.farm.dao.FarmerDAO;
import com.farm.model.FarmerCrop;


@Controller
public class FarmerController {
	@Autowired
	FarmerDAO edao;
	
	@RequestMapping("/requestsell")
	public ModelAndView index()
	{
		System.out.println("test....");
		return new ModelAndView("placesellrequest");
	}
	/*public ModelAndView save(@ModelAttribute FarmerCrop f)
	{
		System.out.println("test....");
		edao.saveData(f);
		return new ModelAndView("CurrentBidding");
	}*/
	@RequestMapping(value="/savecrop",method=RequestMethod.POST)
	public ModelAndView savecropdata(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmerCrop f)
	{
		System.out.println("test....");
		edao.saveData(f);
		return new ModelAndView("CurrentBidding");
	}
	
	/*@RequestMapping("/savecrop")  
    public ModelAndView save(@ModelAttribute FarmerCrop f){  
		edao.saveData(f);  
        return new ModelAndView("CurrentBidding");//will redirect to viewemp request mapping  
    }  */
	//@RequestMapping(value="/requestsell",method=RequestMethod.POST)
	@RequestMapping("/viewcrop")  
    public ModelAndView viewemp(){  
        List<FarmerCrop> list= new LinkedList<FarmerCrop>();
        list=edao.getCrops();  
        ModelAndView map = new ModelAndView("ViewCrop");
        map.addObject("crops",list);
        return map;
    }  
	//admin module
	
	@RequestMapping("/adreq")
	public ModelAndView admin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmerCrop e)
	{
		edao.adminrequest(e);
		System.out.println("adminreq....");
		return new ModelAndView("FarmerWelcome");
	}
	@RequestMapping("/adaccept")
	public ModelAndView adminaccept(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmerCrop e)
	{
		edao.adminaccept(e);
		System.out.println("adminaccept....");
		return new ModelAndView("FarmerWelcome");
	}
	@RequestMapping("/adreject")
	public ModelAndView adminreject(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmerCrop e)
	{
		edao.adminreject(e);
		System.out.println("adminreq....");
		return new ModelAndView("FarmerWelcome");
	}
	@RequestMapping("/table")
	public ModelAndView tale(HttpServletRequest request, HttpServletResponse response, @ModelAttribute FarmerCrop e)
	{
		edao.getRows();
		System.out.println("table entry....");
		return new ModelAndView("Adminrequest","tab",e);
	}
	@RequestMapping("/viewcrop")  
    public ModelAndView table(){  
        List<FarmerCrop> list= new LinkedList<FarmerCrop>();
        list=edao.getRows();  
        ModelAndView map = new ModelAndView("Adminrequest");
        map.addObject("crops",list);
        return map;
    }  
}
