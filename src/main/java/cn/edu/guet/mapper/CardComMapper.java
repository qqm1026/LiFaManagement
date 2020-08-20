package cn.edu.guet.mapper;

import cn.edu.guet.model.CardType;
import cn.edu.guet.model.Servicetype;
import cn.edu.guet.model.Vip;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CardComMapper {
    List<CardType> getAllCardCom();
    CardType getCardComByName(String cardName);
    void updateCardCom(@RequestBody CardType cardType);
    void updateQingkong(CardType cardType);
}
