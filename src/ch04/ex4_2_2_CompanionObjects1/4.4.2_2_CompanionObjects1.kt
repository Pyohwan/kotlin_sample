package ch04.ex4_2_2_CompanionObjects1

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User private constructor(val nickname: String) { // private 라 원래 접근 못해야 함
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
}
