package com.zzs.myblogprovider.dao;

import com.zzs.myblogprovider.domain.LoginVo;
import com.zzs.myblogprovider.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {

    public User checkNameAndPwd(LoginVo loginVo);
}
