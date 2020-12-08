package com.bjpoernode.crm.settings.service.impl;

import com.bjpoernode.crm.settings.dao.UserDao;
import com.bjpoernode.crm.settings.service.UserService;
import com.bjpoernode.crm.utils.SqlSessionUtil;

public class UserServiceImpl implements UserService {

private UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);







}
