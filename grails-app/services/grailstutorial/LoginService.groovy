package grailstutorial

import grails.transaction.Transactional

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

@Transactional
class LoginService {

    def getID(username) {
        1
    }

    def saltPassword(id, password) {
        password + "fjlasurt8948935RTAOF89ea5rt34 &%&&  hruwfaew78r7f34"
    }

    def encryptPassword(password) {
        MessageDigest digest = MessageDigest.getInstance("SHA-256") //Creates message digest for SHA256 encryption
        digest.digest(password.getBytes(StandardCharsets.UTF_8)) //Digests message and returns encrypted version
    }

    def verifyPassword(id, password) {
        Login login = Login.get(id) //Gives access to ID, username & encrypted password
        login.password == password

    }

}
