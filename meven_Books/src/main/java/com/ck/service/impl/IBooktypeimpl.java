package com.ck.service.impl;

import com.ck.dao.IBooktypeDao;
import com.ck.entity.Booktype;
import com.ck.service.IBooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBooktypeimpl implements IBooktypeService {
    @Autowired
    private IBooktypeDao iBooktypeDao;
    @Override
    public List<Booktype> queryBooktype() {

        return iBooktypeDao.queryBooktype();
    }

    @Override
    public Booktype queryBooktypeByid(int btid) {
        return iBooktypeDao.queryBooktypeByid(btid);
    }

}
