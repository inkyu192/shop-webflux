package com.toy.shopwebflux.domain;

import com.toy.shopwebflux.constant.Role;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table
public class Member extends Base implements Persistable<Long> {

    @Id
    private Long member_id;
    private String account;
    private String password;
    private String name;
    private Role role;
    private String city;
    private String street;
    private String zipcode;

    @Override
    public Long getId() {
        return member_id;
    }

    @Override
    public boolean isNew() {
        return getCreatedDate() == null;
    }

    public static Member empty() {
        return new Member();
    }

    public static Member create(
            Long memberId,
            String account,
            String password,
            String name,
            Role role,
            String city,
            String street,
            String zipcode
    ) {
        Member member = new Member();

        member.member_id = memberId;
        member.account = account;
        member.password = password;
        member.name = name;
        member.role = role;
        member.city = city;
        member.street = street;
        member.zipcode = zipcode;

        return member;
    }

    public void update(String name, Role role, String city, String street, String zipcode) {
        this.name = name;
        this.role = role;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
