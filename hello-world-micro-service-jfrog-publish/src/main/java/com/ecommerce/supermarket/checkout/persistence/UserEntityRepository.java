package com.ecommerce.supermarket.checkout.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Long> {

}
