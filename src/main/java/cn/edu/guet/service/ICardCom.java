package cn.edu.guet.service;

import cn.edu.guet.model.CardType;
import cn.edu.guet.model.Vip;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ICardCom {
    List<CardType> getAllCardCom();
    CardType getCardComByName(String cardName);
    void updateCardCom(CardType cardType);
    void updateQingkong(CardType cardType);
}
