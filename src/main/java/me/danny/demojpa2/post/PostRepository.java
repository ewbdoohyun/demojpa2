package me.danny.demojpa2.post;

import me.danny.demojpa2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long> {

}
