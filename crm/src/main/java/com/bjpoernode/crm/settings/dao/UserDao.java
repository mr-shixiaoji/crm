package com.bjpoernode.crm.settings.dao;

import com.bjpoernode.crm.settings.domain.User;

public interface UserDao {

    User lonin(String loginAct,String loginPwd);

}
