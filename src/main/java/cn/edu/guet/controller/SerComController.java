package cn.edu.guet.controller;


import cn.edu.guet.common.Result;
import cn.edu.guet.model.Servicetype;
import cn.edu.guet.service.ISerCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("SerCom")
public class SerComController {

    @Autowired
    ISerCom serCom;

    @RequestMapping(value = "updateSerCom",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateSerCom(@RequestBody Servicetype servicetype){

        serCom.updateSerCom(servicetype);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail();
        }
    }

    @RequestMapping(value = "updateQingkong",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateQingkong(@RequestBody Servicetype servicetype){

        serCom.updateSerCom(servicetype);
        if(servicetype!=null){
            return Result.succ(servicetype);
        }else{
            return Result.fail();
        }
    }

    @RequestMapping(value = "getAllSerCom",method = {RequestMethod.GET})
    @ResponseBody
    public List<Servicetype> getAllSerCom(){

        List<Servicetype> servicetype=serCom.getAllSerCom();
        return servicetype;

    }

    @RequestMapping(value = "getSerComById",method = {RequestMethod.GET})
    @ResponseBody
    public Servicetype getSerComById(String serviceId){

        Servicetype servicetype=serCom.getSerComById(serviceId);
        return servicetype;
    }

}
