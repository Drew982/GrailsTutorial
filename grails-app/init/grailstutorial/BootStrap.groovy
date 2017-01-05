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

        new Login(username: "Adw1", password: [-62, -86, -124, -105, 22, 37, 86, -96, -42, 127, 39, 112, 15, -126, -85,
                                               11, 118, 79, -6, -58, -74, 29, -13, -63, 19, 37, 76, -88, 43, 2, -43, 76]).save()
        new Login(username: "Le2", password: [-95, -16, 71, -11, 34, -50, -107, -73, 82, -43, 54, -69, -54, 11, 53, 35,
                                              127, -59, 65, -53, 64, -70, 101, 100, -118, -45, -103, -79, 100, 126, -39, -117]).save()
        new Login(username: "Jhn3", password: [125, -124, 14, 22, 42, 95, -111, 117, -62, -108, -75, 16, -105, 76, 53,
                                               23, 64, -64, -101, 32, -62, -124, -56, 117, 91, -52, 105, 48, -4, -37, 74, -104]).save()
    }

    def destroy = {
        User.list()?.each { user ->
            println(user.username)
            user.delete()
        }
    }
}
