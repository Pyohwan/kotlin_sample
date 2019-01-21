internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/*
fun TalkativeButton.giveSpeech() { // public 이 internal 접근해서
    yell() // private 라서
    whisper() // protected 라서
}
*/

