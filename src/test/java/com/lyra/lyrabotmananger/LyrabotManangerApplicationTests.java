package com.lyra.lyrabotmananger;

import com.lyra.lyrabotmananger.dao.UserRepository;
import com.lyra.lyrabotmananger.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LyrabotManangerApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setId(1);
        user.setName("lyra");
        user.setAge(15);
        user.setAvatar("https://www.baidu.com");
        user.setQqNumber("365373011");
        userRepository.save(user);
    }

}
