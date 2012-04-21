package controllers;

import models.User;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.Http;

public class Account extends Controller {

	@Before
	static void checkLogin() {

		if (session.get("username") == null
				&& !request.actionMethod.equals("login")
				&& !request.actionMethod.equals("validateLogin")) {
			Account.login();
		}
	}

	public static void index() {
		render();
	}

	public static void login() {
		render();
	}
	
	
	public static void logout(){
		session.clear();
		Account.index();
		
	}

	public static void validateLogin() {
		User user = User.find("byUsername", params.get("username")).first();

		if (user != null) {

			if (user.password.equals(params.get("password"))) {
				session.put("username", user.username);
				Account.index();
				return;
			}
		}

		Account.login();

	}

}
