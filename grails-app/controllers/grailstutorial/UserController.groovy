package grailstutorial

import grails.web.RequestParameter

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

    def create(String username, int age, int height)
    {
        def users = userService.createUser()
    }

    def update(int id, int age)
    {
        def users = userService.updateAge()
    }

    def delete(@RequestParameter("id") int id)
    {
        println id
        userService.deleteByID(id)
        render(status: 404)
    }
}
