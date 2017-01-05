package grailstutorial

class LoginController {

     LoginService loginService //Spring Bean -- gives access to service

    def login() {
        String username = params.username //Gives access to data
        String password = params.password //Gives access to data
        int id = loginService.getID(username)

        password = loginService.saltPassword(id, password)
        password = loginService.encryptPassword(password) //Encrypts salted password in SHA256
    }
}
