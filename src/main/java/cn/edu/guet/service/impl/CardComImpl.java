package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CardComMapper;
import cn.edu.guet.model.CardType;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.ICardCom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class CardComImpl implements ICardCom {

    @Autowired
    CardComMapper cardComMapper;

    @Override
    public List<CardType> getAllCardCom() {
        return cardComMapper.getAllCardCom();
    }

    @Override
    public CardType getCardComByName(String cardName) {
        return cardComMapper.getCardComByName(cardName);
    }

    @Override
    public void updateCardCom(CardType cardType) {
        cardComMapper.updateCardCom(cardType);
    }

    @Override
    public void updateQingkong(CardType cardType) {
        cardComMapper.updateQingkong(cardType);
    }
}
