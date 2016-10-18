package by.company.library.dao.impl;

import by.company.library.bean.User;
import by.company.library.dao.UserDao;
import by.company.library.dao.exception.DAOException;

public class UserDaoImpl implements UserDao{

	@Override
	public User registerUser() throws DAOException {
		// stub
		return new User();
	}

	@Override
	public User logination(String login, String password) throws DAOException {
		// stub
		return new User();
	}
	
	

}
