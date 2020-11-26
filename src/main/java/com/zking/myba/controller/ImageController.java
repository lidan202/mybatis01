package com.zking.myba.controller;

import com.zking.myba.model.Myfile;
import com.zking.myba.service.IMyfileService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.UnsupportedEncodingException;

@Controller
public class ImageController {
    @Autowired
    private IMyfileService myfileService;

    @RequestMapping("/godownload")
    public String goDownload(){
        return "download";
    }

    @RequestMapping("/dodownload")
    public ResponseEntity<byte[]> download(Myfile myfile) throws Exception{
        Myfile mf=myfileService.selectByPrimaryKey(myfile.getFileId());
        File file=new File("E:\\img\\wyf.jpg");
        HttpHeaders headers=new HttpHeaders();
        try {
            String downloadFileName=new String(mf.getRealName().getBytes("utf-8"),"iso-8859-1");
            headers.setContentDispositionFormData("attachment", downloadFileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }
}
