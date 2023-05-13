package ch04.ex1_4_2_InnerClass

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}