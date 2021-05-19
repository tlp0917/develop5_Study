package com.ck.entity.entity.service.impl;

import com.ck.entity.entity.dao.IRoleDao;
import com.ck.entity.entity.entity.Role;
import com.ck.entity.entity.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IRoserviceImpl implements IRoleService {
    @Autowired
    private IRoleDao roleDao;
    @Override
    public List<Role> queryrole() {
      return   roleDao.queryrole();
    }
}
