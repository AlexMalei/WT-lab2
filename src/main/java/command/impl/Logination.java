package by.company.library.command.impl;

import by.company.library.command.Command;
import by.company.library.command.exception.CommandException;
import by.company.library.service.ServiceFactory;
import by.company.library.service.UserService;
import by.company.library.service.exception.ServiceException;

public class Logination implements Command{

	@Override
	public String execute(String request) throws CommandException {
		
		String login;
		String password;
		// parse request and get parameters
		/* stub  */ login = "asdfg";
		/* stub  */ password = "qwerty";
		
		ServiceFactory factory = ServiceFactory.getInstance();
		UserService userService = factory.getUserService();
		
		try {
			userService.logination(login, password);
		} catch (ServiceException e) {
			throw new CommandException(e);
		}
		
		
		return null;
	}

}
