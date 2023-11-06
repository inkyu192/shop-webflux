package com.toy.shopwebflux.dto.response;

import com.toy.shopwebflux.constant.Role;
import com.toy.shopwebflux.domain.Member;
import lombok.Getter;

@Getter
public record MemberResponse(
        Long id,
        String account,
        String name,
        String city,
        String street,
        String zipcode,
        Role role
) {
    public MemberResponse(Member member) {
        this(
                member.getId(),
                member.getAccount(),
                member.getName(),
                member.getCity(),
                member.getStreet(),
                member.getZipcode(),
                member.getRole()
        );
    }
}
