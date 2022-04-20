package com.zzs.myblogprovider.service;

import com.zzs.myblogprovider.dao.LoginDao;
import com.zzs.myblogprovider.domain.LoginVo;
import com.zzs.myblogprovider.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public String login(LoginVo loginVo) {
        User user =  loginDao.checkNameAndPwd(loginVo);
        if(null==user){
            return "false";
        }
        return "true";
    }
}
