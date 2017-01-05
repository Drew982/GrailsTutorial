package grailstutorial

class LoginController {

     LoginService loginService //Spring Bean -- gives access to service

    def login() {
        String username = params.username //Gives access to data
        String password = params.password //Gives access to data
        int id = loginService.getID(username)

        password = loginService.saltPassword(id, password)
        password = loginService.encryptPassword(password) //Encrypts salted password in SHA256

        if(loginService.verifyPassword(id, password)) {
            redirect(controller: "user", action: "admin") //Redirects to /user/admin page if successful login
        }
        else {
            redirect(view: "/login") //Returns to login page if failure
        }
    }
}
