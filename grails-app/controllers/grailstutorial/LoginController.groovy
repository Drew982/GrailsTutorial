package grailstutorial

class LoginController {
    LoginService loginService

    def q() {
        def users = loginService.getUsers()
        render(view: "newpage", model: [users: users]) //prints new page and map of users
    }
}
