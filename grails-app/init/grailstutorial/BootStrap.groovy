package grailstutorial

class BootStrap
{

    def init = { servletContext ->
        new User(username: "Andrew", age: 22, height: 6).save()
        new User(username: "Lee", age: 27, height: 6).save()
        new User(username: "John", age: 21, height: 5).save()
        new User(username: "Jon", age: 21, height: 4).save()
        new User(username: "Olivia", age: 26, height: 5).save()
        new User(username: "Terry", age: 24, height: 8).save()
        new User(username: "Mark", age: 29, height: 2).save()

        new Login(username: "Adw1", password: "123").save()
        new Login(username: "Le2", password: "234").save()
        new Login(username: "Jhn3", password: "345").save()
    }

    def destroy = {
        User.list()?.each { user ->
            println(user.username)
            user.delete()
        }
    }
}
