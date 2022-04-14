package com.bdqn.controller;

import cn.itrip.dao.itripHotel.ItripHotelMapper;
import cn.itrip.dao.itripUser.ItripUserMapper;
import cn.itrip.pojo.ItripHotel;
import cn.itrip.pojo.ItripUser;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class itripController {
    @Resource
    ItripHotelMapper dao;

    @Resource
    ItripUserMapper dao1;

    @RequestMapping(value="/api/dologin",produces="application/json;charset=utf-8")

    @ResponseBody
    public String glist(String name,String password) throws Exception {

        Map b=new HashMap<>();
        b.put("a",name);
        b.put("b",password);
        ItripUser user=dao1.getItripUserListByMap(b);

        return JSONArray.toJSONString(user);
    }

    @RequestMapping("/clist1")
    public String clist(){

        return "clist1";
    }

}
