package grailstutorial

class BootStrap
{

    def init = { servletContext ->
        new User(username: "Andrew", age: 22, height: 6).save()
        new User(username: "Lee", age: 27, height: 6).save()
        new User(username: "John", age: 21, height: 5).save()
    }
    def destroy = {
        User.list().each { user ->
            println (user.username)
            user.delete()
        }
    }
}
