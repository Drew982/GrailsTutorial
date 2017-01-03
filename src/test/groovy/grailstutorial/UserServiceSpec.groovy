package grailstutorial

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(UserService)
class UserServiceSpec extends Specification
{

    def setup()
    {
    }

    def cleanup()
    {
    }

//    def "Test That Database Has At Least One Username"()
//    {
//        when:
//        def results = service.getUsernames()
//
//        then:
//        results.size() >= 1
//    }
//
//    def "Test That Service Provides Usernames from userList"()
//    {
//        given:
//        def userList = getUsers()
//        def expectedResult = ["Andrew", "John", "Lee", "Jon"]
//
//        when:
//        def results = service.getUsernames(userList)
//
//        then:
//        results == expectedResult
//
//    }
//
//    def "Test That Database Has At Least One Age"()
//    {
//        when:
//        def results = service.getAges()
//
//        then:
//        results.size() >= 1
//    }
//
//    def "Test That Service Provides Ages from userList"()
//    {
//        given:
//        def userList = getUsers()
//        def expectedResult = [22, 30, 24, 24]
//
//        when:
//        def results = service.getAges(userList)
//
//        then:
//        results == expectedResult
//
//    }
//
//    private static def getUsers()
//    {
//        [
//                [
//                        username: "Andrew",
//                        age     : 22,
//                        height  : 6,
//                        id      : 1
//                ],
//                [
//                        username: "John",
//                        age     : 30,
//                        height  : 4,
//                        id      : 2
//                ],
//                [
//                        username: "Lee",
//                        age     : 24,
//                        height  : 6,
//                        id      : 3
//                ],
//                [
//                        username: "Jon",
//                        age     : 24,
//                        height  : 6,
//                        id      : 4
//                ]
//        ] //Linked hashmap -- list
//    }
}
