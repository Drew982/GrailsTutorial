package grailstutorial

class LoginController {

     LoginService loginService //Spring Bean -- gives access to service

    def login() {
        if (session.username) { //Checks session
            redirect(controller: "user", action: "admin") //Redirects to /user/admin page if successful login
        }
        else
        {
            String username = params.username //Gives access to data
            String password = params.password //Gives access to data
            int id = loginService.getID(username)
//
//        println(password)
//        password = loginService.saltPassword(id, password)
//        println(password)
//        password = loginService.encryptPassword(password) //Encrypts salted password in SHA256
//        println(password)

            if (loginService.verifyPassword(id, password))
            {
                session.username = username
                session.removeAttribute("loginFailed") //Remove loginFailure notice after successful login
                redirect(controller: "user", action: "admin") //Redirects to /user/admin page if successful login
            } else
            {
                session.loginFailed = true
                redirect(uri: "/login") //Returns to login page if failure
            }
        }
    }

    def logout() {
        session.removeAttribute("username")
        redirect(uri: "/login") //Returns to login page if failure
    }
}
