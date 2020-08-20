package cn.edu.guet.mapper;

import cn.edu.guet.model.Servicetype;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SerComMapper {
    List<Servicetype> getAllSerCom();
    Servicetype getSerComById(@RequestBody String serviceId);
    void updateSerCom(@RequestBody Servicetype servicetype);
    void updateQingkong(Servicetype servicetype);
}
