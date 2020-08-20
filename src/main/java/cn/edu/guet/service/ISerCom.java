package cn.edu.guet.service;

import cn.edu.guet.model.Servicetype;

import java.util.List;

public interface ISerCom {
    List<Servicetype> getAllSerCom();
    Servicetype getSerComById(String serviceid);
    void updateSerCom(Servicetype servicetype);
    void updateQingkong(Servicetype servicetype);
}
