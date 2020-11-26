package com.zking.myba.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Controller
@ResponseBody
public class indexController {

    @RequestMapping("/toUpload")
    public String toUpload(){
        return "uploadFile";
    }

    @RequestMapping("/doupload")
    public Object doUpload(MultipartFile mf){
        //文件保存的位置
        String filename = mf.getOriginalFilename();
        File file=new File("E:\\img\\"+filename);
        System.out.println("文件类型："+mf.getContentType());
        try {
            mf.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        return map;
    }

    @RequestMapping("/")
    public String itnt(){

        return "itnt";
    }

    @RequestMapping("/change")
    public String change(HttpSession session){

        Locale lo=(Locale)session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        if (lo.US.equals(lo)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else{
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        }
        return "itnt";
    }

}
