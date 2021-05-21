package com.ck.service;

import com.ck.entity.Booktype;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IBooktypeService {
    public List<Booktype> queryBooktype();

    public Booktype queryBooktypeByid(int btid);
}
