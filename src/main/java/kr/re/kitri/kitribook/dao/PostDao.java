package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {//쿼리 관점에서 이름을 짓기

    @Autowired
    private SqlSessionTemplate session; //sqlSession으로 되어있어도 작동 함.

    public Post insertPost(Post post) {
        // insert into post values(.....)
        System.out.println("insert ok...");
        session.insert("kr.re.kitri.kitribook.dao.PostDao.insertPost",post);
        return post;
    }

    public Post updatePost(Post post) {
        // update post ....
        System.out.println("update ok..");
        session.delete("kr.re.kitri.kitribook.dao.PostDao.updatePost",post);
        return post;
    }
    public long deletePost(long bookId) {
        // delete from post where book_id=bookId
        System.out.println("delete ok..");
        session.delete("kr.re.kitri.kitribook.dao.PostDao.deletePost",bookId);
        return bookId;
    }
    public List<Post> selectAllPosts() {
        // select * from post
        System.out.println("selectAll ok...");
        List<Post> books = session.selectList("kr.re.kitri.kitribook.dao.PostDao.selectAllPosts");
        return books;
    }
    public Post selectPostByKey(long bookId) {
        // select * from book where book_id=bookId
        Post post = session.selectOne("kr.re.kitri.kitribook.dao.PostDao.selectPostByKey",bookId);
        return post;
    }

}
