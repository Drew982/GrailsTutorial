package grailstutorial

import grails.transaction.Transactional

@Transactional
class LoginService {

    def getUsers() {
        [
                [
                        username: "Andrew",
                        age     : 22,
                        height  : 6,
                        id      : 1
                ],
                [
                        username: "John",
                        age     : 30,
                        height  : 4,
                        id      : 2
                ],
                [
                        username: "Lee",
                        age     : 24,
                        height  : 6,
                        id      : 3
                ],
                [
                        username: "Jon",
                        age     : 24,
                        height  : 6,
                        id      : 4
                ]
        ] //Linked hashmap -- list
    }
}
