package com.ecommerce.supermarket.checkout.persistence;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER_CREDENTIALS")
public class UserEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;


}
