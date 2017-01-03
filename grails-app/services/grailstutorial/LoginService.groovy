package grailstutorial

import grails.transaction.Transactional

@Transactional
class LoginService //Handles Data Access Objects [CRUD - Create, Read, Update, Destroy]
                    //API - Application Programming Interface - allows for user interaction
{
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
}
