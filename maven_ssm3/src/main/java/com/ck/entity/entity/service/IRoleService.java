package com.ck.entity.entity.service;

import com.ck.entity.entity.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IRoleService {
    public List<Role> queryrole();
}
