package com.yikolemon.mapper;

import com.yikolemon.pojo.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentMapperTest {

    @Autowired
    private CommentMapper commentMapper;

    @Test
    public void getParentId() {
    }

    @Test
    public void getChildIds() {
        List<Long> childIds = commentMapper.getChildIds((long) 24);
        System.out.println(childIds);
    }
}