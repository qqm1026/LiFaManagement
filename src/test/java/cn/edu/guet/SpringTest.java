package cn.edu.guet;

import cn.edu.guet.model.CardType;
import cn.edu.guet.model.Servicetype;
import cn.edu.guet.service.ISerCom;
import cn.edu.guet.service.ICardCom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class SpringTest {

    @Autowired
    ISerCom serCom;

    @Autowired
    ICardCom cardCom;

    @Test
    public void testSERCOM(){

        List<Servicetype> servicetypes=serCom.getAllSerCom();
        for(Servicetype servicetype:servicetypes){
            System.out.println(servicetype);
        }
        for(int i=0;i<servicetypes.size();i++){
            System.out.println(servicetypes.get(i).getServiceId());
            System.out.println(servicetypes.get(i).getServiceName());
            System.out.println(servicetypes.get(i).getComMoney());
        }
    }

    @Test
    public void testSERCOMBYID(){

        Servicetype servicetypes=serCom.getSerComById("104");

        System.out.println(servicetypes.getServiceId());
        System.out.println(servicetypes.getServiceName());
        System.out.println(servicetypes.getComMoney());

    }

    @Test
    public void testUPDATESERCOM(){

        Servicetype servicetype=new Servicetype();
        if(servicetype.getServiceId()=="102"){
            servicetype.setComMoney(7.0f);
        }
        serCom.updateSerCom(servicetype);

    }

    @Test
    public void testCARDCOM(){

        List<CardType> cardTypes=cardCom.getAllCardCom();

        for(int i=0;i<cardTypes.size();i++){
            System.out.println(cardTypes.get(i).getCardId());
            System.out.println(cardTypes.get(i).getCardName());
            System.out.println(cardTypes.get(i).getComMoney());
        }
    }

    @Test
    public void testCARDCOMBYNAME(){

        CardType cardType=cardCom.getCardComByName("9折");
        System.out.println(cardType.getCardId());
        System.out.println(cardType.getCardName());
        System.out.println(cardType.getComMoney());
    }

    @Test
    public void testUPDATECARDCOM(){

        CardType cardType=new CardType();
        if(cardType.getCardId()=="T001"){
            cardType.setComMoney(15.0f);
        }
        cardCom.updateCardCom(cardType);
    }

}