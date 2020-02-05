package kr.re.kitri.kitribook.service;

import kr.re.kitri.kitribook.dao.PostDao;
import kr.re.kitri.kitribook.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KitriBookService {//기능관점에서 메소드 이름을 짓기
     @Autowired
    private PostDao postDao;

    /*전체보기*/
    public List<Post> viewPosts() {
        return postDao.selectAllPosts();
    }

    /*상세보기*/
    public Post viewPostById(long bookId) {
        return postDao.selectPostByKey(bookId);
    }

    /*글쓰기*/
    public Post writePost(Post post) {
        return postDao.insertPost(post);
    }

    /*글수정하기*/
    public Post ModifyPost(Post post) {
        return postDao.updatePost(post);
    }

    /*글삭제*/
    public long removePost(long bookId) {
        return postDao.deletePost(bookId);
    }
}
