package joonu.spring.web.impl;

import joonu.spring.web.user.impl.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import joonu.spring.web.user.UserService;
import joonu.spring.web.user.UserVO;


//@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private joonu.spring.web.user.impl.UserDAO userDAO;
	
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
}
