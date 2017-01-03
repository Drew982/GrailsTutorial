package grailstutorial

import grails.transaction.Transactional

@Transactional
class UserService //Handles Data Access Objects [CRUD - Create, Read, Update, Destroy]
                    //API - Application Programming Interface - allows for user interaction
{
    /****************************READ************************/
    def getUsers()
    {
        User.list()
    }

    def getUsernames()
    {
        User.list().username
    }

    def getAges()
    {
        User.list().age
    }

    def getHeight()
    {
        User.list().height
    }

    /***************************CREATE*******************************/
    def createUser(username, age, height)
    {
        User user = new User(username: username, age: age, height: height)
        user.save()
    }

    /****************************UPDATE*****************************/
    def updateUsername(id, username)
    {
        User user = User.get(id) //Accesses database location by ID
        user.username = username //Overrides username field of the User selected by ID
        user.save() //Checks if object has an ID - if no ID, creates one; if ID, updates
    }

    def updateAge(id, age)
    {
        User user = User.get(id)
        user.age = age
        user.save()
    }

    def updateHeight(id, height)
    {
        User user = User.get(id)
        user.height = height
        user.save()
    }

    /******************************DELETE***************************/
    def deleteByID(id)
    {
        User.get(id).delete()
    }
}
