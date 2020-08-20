package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.CardType;
import cn.edu.guet.model.Servicetype;
import cn.edu.guet.service.ICardCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("CardCom")
public class CardComController {

    @Autowired
    ICardCom cardCom;

    @RequestMapping(value = "getAllCardCom",method = {RequestMethod.GET})
    @ResponseBody
    public List<CardType> getAllCardCom(){

        List<CardType> cardTypes=cardCom.getAllCardCom();
        return cardTypes;
    }

    @RequestMapping(value = "getCardComByName",method = {RequestMethod.GET})
    @ResponseBody
    public Result getCardComByName(String cardName){

        CardType cardType=cardCom.getCardComByName(cardName);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail();
        }
    }

    @RequestMapping(value = "updateCardCom",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateCardCom(@RequestBody CardType cardType){

        cardCom.updateCardCom(cardType);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail();
        }
    }

    @RequestMapping(value = "updateQingkong",method = {RequestMethod.POST})
    @ResponseBody
    public Result updateQingkong(@RequestBody CardType cardType){

        cardCom.updateQingkong(cardType);
        if(cardType!=null){
            return Result.succ(cardType);
        }else{
            return Result.fail();
        }
    }
}
