package me.danny.demojpa2;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;

public class SimpleRepository<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
        implements MyRepository<T, ID> {

    private EntityManager entityManager;

    public SimpleRepository(JpaEntityInformation<T, ?> entityInformation,
            EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public boolean contains(T entity){
        return entityManager.contains(entity);
    }
}
