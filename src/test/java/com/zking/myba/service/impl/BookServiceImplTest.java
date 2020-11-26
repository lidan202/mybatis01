package com.zking.myba.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zking.myba.mapper.BookMapper;
import com.zking.myba.model.Book;
import com.zking.myba.service.IBookService;
import com.zking.myba.utils.MybatisSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private Book book;
    private BookMapper bookMapper;
    private IBookService bookService=new BookServiceImpl();
    private SqlSession sqlSession;
    @Before
    public void setUp() throws Exception {
        book=new Book();
        sqlSession = MybatisSessionFactoryUtils.openSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
    }
    @After
    public void down() throws Exception{
        sqlSession.commit();
    }
    @Test
    public void selectByPrimaryKey() {
        Book b=bookMapper.selectByPrimaryKey(9);
        System.out.println(b);
    }

    @Test
    public void addtest() {
        for(int i=1;i<20;i++){
            book.setBookName("红楼梦"+i+"章");
            book.setBookPrice(90f);
            book.setBookBrief("阿巴阿巴阿巴。。");
            bookMapper.insert(book);
        }

    }

    @Test
    public void selecttest() {
        book.setBookName("红楼梦");
        book.setBookPrice(666f);
        List<Book> blist = bookMapper.list(book);
        System.out.println(blist);
    }

    @Test
    public void listtest() {
        book.setBookName("红楼梦");
        Map<String, Book> mso = bookMapper.mso(book);
        System.out.println(mso);
    }
    //模糊查询，所有，分页
    @Test
    public void selectAlltest() {
        book.setBookName("红");
        Page<Book> page = PageHelper.startPage(1, 5);
        List<Book> books=bookMapper.list(book);
        System.out.println("总条目："+page.getTotal());
        System.out.println("第："+page.getPageNum()+"页");
        System.out.println("显示："+page.getPageSize());

        for (Book b : books) {
            System.out.println(b);
        }
    }


    @Test
    public void updateByIdSelective() {
        book.setBookId(6);
        book.setBookPrice(666f);
        bookMapper.updateByPrimaryKeySelective(book);
        Book b = bookMapper.selectByPrimaryKey(6);
        System.out.println(b);

    }

    @Test
    public void deletetest() {
        bookMapper.deleteByPrimaryKey(4);
    }
}