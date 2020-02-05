package kr.re.kitri.kitribook.dao;

import kr.re.kitri.kitribook.model.Post;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PostDaoTest {

    @Autowired
    private PostDao postDao;

    @Test
    public void testInsertPost() {
        //테스트 케이스는 항상 리턴타입도, 파라메터 타입도 없어요.
        Post result = postDao.insertPost(new Post(4,"bbbb","ccccc","aaaa",0));
        assertNotNull(result);
    }

    @Test
    public void testSelectPostByKey() {
        // select * from book where book_id=bookId
        Post result = postDao.selectPostByKey(2);
        assertEquals(2,result.getPostId());
    }

}
