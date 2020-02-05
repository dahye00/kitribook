package kr.re.kitri.kitribook.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KitriBookServiceTest {
    @Autowired
    private KitriBookService kitriBookService;

    @Test
    public void TestRemovePost() {
        long bookId = kitriBookService.removePost(2);
    }

    @Test
    public void TestUpdatePost() {

    }

    @Test
    public void TestInsertPost() {

    }

}
