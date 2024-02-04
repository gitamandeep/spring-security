package com.unkownkoder.AuthenticationBackend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
@Setter
@Entity
@Data
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Integer roleId;

    private String authority;

    public Role(){
        super();
    }

    public Role(String authority){
        super();
        this.authority = authority;
    }

    public Role(Integer roleId, String authority){
        this.roleId = roleId;
        this.authority = authority;

    }
    @Override
    public String getAuthority() {
        return this.authority;
    }

    public Integer getRoleId(){
        return this.roleId;
    }
}
