package grailstutorial

import grails.transaction.Transactional

@Transactional
class LoginService
{

    def getUsers()
    {
        [
                [
                        username: "Andrew",
                        age     : 22,
                        height  : 6,
                        id      : 1
                ] as User, //convert map to User object (domain class)
                [
                        username: "John",
                        age     : 30,
                        height  : 4,
                        id      : 2
                ] as User,
                [
                        username: "Lee",
                        age     : 24,
                        height  : 6,
                        id      : 3
                ] as User,
                [
                        username: "Jon",
                        age     : 24,
                        height  : 6,
                        id      : 4
                ] as User,
                [
                        username: "Lauren",
                        age     : 2,
                        height  : 1,
                        id      : 5
                ] as User
        ] //Linked hashmap -- list
    }

    def getUsernames()
    {
        println(getUsers())
        getUsernames(getUsers())
    }

    def getUsernames(userList)
    {
        def usernames = [] //usernames is an empty list

        userList.each { user -> //"user" current instance of the loop
//             usernames.add(user.username)
            usernames << user.username //username of user (current instance) moved into usernames list

        }


        usernames //returns usernames
    }

    def getAges()
    {
        getAges(getUsers())
    }

    def getAges(userList)
    {
        def ages = []

        userList.each { user ->
            ages << user.age
        }

        ages //returns ages
    }
}
