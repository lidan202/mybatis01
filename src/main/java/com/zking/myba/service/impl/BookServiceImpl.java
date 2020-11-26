package com.zking.myba.service.impl;

import com.zking.myba.mapper.BookMapper;
import com.zking.myba.model.Book;
import com.zking.myba.service.IBookService;
import com.zking.myba.utils.MybatisSessionFactoryUtils;
import com.zking.myba.utils.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;
//    {
//        SqlSession sqlSession = MybatisSessionFactoryUtils.openSession();
//        sqlSession.getMapper(BookMapper.class);
//    }
    @Override
    public int deleteByPrimaryKey(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(Integer bookId) {
        return bookMapper.selectByPrimaryKey(bookId);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    @Cacheable(value="bookselectTest",key="'key:'+#book.bookId",condition = "#book.bookId>2")
    public Book selectSingle(Book book) {
        return bookMapper.selectSingle(book);
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
        return bookMapper.list(book);
    }
}
