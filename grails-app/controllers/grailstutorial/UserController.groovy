package grailstutorial

class UserController
{
    UserService loginService

    def q() {
        def usernames = loginService.getUsernames()
        render(view: "newpage", model: [usernames: usernames]) //prints new page and map of usernames
                                        //map[key: value]
    }
}
