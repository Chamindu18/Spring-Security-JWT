package org.ecom.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

// entity class
@Entity
@Table(name = "users")
@Getter
@Setter
public class User implements UserDetails {

}
