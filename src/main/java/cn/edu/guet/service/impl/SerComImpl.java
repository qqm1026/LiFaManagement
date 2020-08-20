package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.SerComMapper;
import cn.edu.guet.model.Servicetype;
import cn.edu.guet.service.ISerCom;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SerComImpl implements ISerCom {

    @Autowired
    SerComMapper serComMapper;

    @Override
    public List<Servicetype> getAllSerCom() {
        return serComMapper.getAllSerCom();
    }

    @Override
    public Servicetype getSerComById(String serviceid) {
        return serComMapper.getSerComById(serviceid);
    }

    @Override
    public void updateSerCom(Servicetype servicetype) {
        serComMapper.updateSerCom(servicetype);
    }

    @Override
    public void updateQingkong(Servicetype servicetype) {
        serComMapper.updateQingkong(servicetype);
    }


}
