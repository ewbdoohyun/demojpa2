package me.danny.demojpa2.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {

        Post post = new Post();
        post.setTitle("Hibernate");

        assertFalse(postRepository.contains(post));

        postRepository.save(post);

        assertTrue(postRepository.contains(post));

        postRepository.delete(post);
        postRepository.flush();
    }
}