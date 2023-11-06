package com.toy.shopwebflux.dto.request;

import com.toy.shopwebflux.constant.Role;

public record MemberSaveRequest(
        String account,
        String password,
        String name,
        Role role,
        String city,
        String street,
        String zipcode
) {
}
