package me.danny.demojpa2.post;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Setter
@Getter
public class Post {

    @Id @GeneratedValue
    private  Long id;

    private String title;

    @Lob
    private String contetn;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
}
