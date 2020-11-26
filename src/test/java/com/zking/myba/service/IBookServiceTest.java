package com.zking.myba.service;

import com.zking.myba.model.Book;
import com.zking.myba.service.impl.BaseTestCase;
import com.zking.myba.utils.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

public class IBookServiceTest extends BaseTestCase {
    private Book book;
    @Autowired
    private IBookService bookService;

    @Before
    public void setUp() throws Exception {
        book=new Book();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void single() {
        book.setBookId(9);
        Book b = bookService.selectSingle(this.book);
        System.out.println(b);
    }

    @Test
    public void list() {
        PageBean pageBean=new PageBean();
        pageBean.setPage(1);
        pageBean.setRows(5);
        List<Book> list = bookService.list(book,pageBean);
        for (Book b : list) {
            System.out.println(b);
        }

    }
}