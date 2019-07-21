package com.miaoshaproject.Service;

import com.miaoshaproject.Service.model.UserModel;
import com.miaoshaproject.dao.UserDOMapper;
import com.miaoshaproject.dataobject.UserDO;
import com.miaoshaproject.error.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserService {
     public UserModel getUser(Integer id);

     void register(UserModel userModel) throws BusinessException;
}
