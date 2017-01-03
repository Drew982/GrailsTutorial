package grailstutorial

class UserController
{
    UserService userService

    //Method for old action "q" in UrlMappings [now replaced by admin/user -- action: "admin"]
//    def q() {
//        def usernames = loginService.getUsernames()
//        render(view: "newpage", model: [usernames: usernames]) //prints new page and map of usernames
//                                        //map[key: value]
//    }

    def admin() //Read endpoint
    {
        def users = userService.getUsers()
        render(view: "useradmin", model: [users: users])
    }
}
