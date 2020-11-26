package com.zking.myba.controller;

import com.zking.myba.model.Book;
import com.zking.myba.service.IBookService;
import com.zking.myba.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping("/getall")
    public String list(HttpServletRequest req,Model model, Book book){
        PageBean pageBean=new PageBean();
        pageBean.setRequest(req);
        pageBean.setRows(5);
        List<Book> books = bookService.list(book,pageBean);
        model.addAttribute("books",books);
//        session.setAttribute("books",books);
        return "index";
    }

    @RequestMapping("/toAdd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/doAdd")
    public String addBook(HttpSession session,@Validated @ModelAttribute Book book, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            session.setAttribute("msg","书本名不能为空！");
            return "redirect:toAdd";
        }
        int n = bookService.insert(book);
        if(n>0){
            return "redirect:getall";
        }else {
            return "redirect:toAdd";
        }
    }

    @RequestMapping("/dodel")
    public String delBook(Book book){
        int n = bookService.deleteByPrimaryKey(book.getBookId());
        if(n>0){
            return "redirect:getall";
        }else {
            return "redirect:toAdd";
        }
    }

    @RequestMapping("/toUpdate")
    public String load(Model model, Book book){
        Book b = bookService.selectByPrimaryKey(book.getBookId());
        model.addAttribute("b",b);
        return "update";
    }

    @RequestMapping("/doUpdate")
    public String update(Book book){
        int n = bookService.updateByPrimaryKey(book);
        if(n>0){
            return "redirect:getall";
        }else {
            return "redirect:doUpdate";
        }

    }

}
