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

    def create()
    {
        userService.createUser(params.username, params.age, params.height)
        redirect(controller: "user", action: "admin")
    }

    def update()
    {
        userService.updateAge(params.id, params.age)
        redirect(controller: "user", action: "admin")
    }

    def delete()
    {
        userService.deleteByID(params.id)
        render(status: 200)
    }
}
