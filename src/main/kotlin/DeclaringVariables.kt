/**
 * Kotlin in Action book - Refer page 18.
 * Atomic Kotlin book - Refer page 35.
 *
 * In Java declaring a variable --> String nameOfTheStudentExplicit = "Raj"
 */

class DeclaringVariables {

    /**
     * In kotlin you can provide type explicitly if you want
     */
    val nameOfTheStudentExplicit: String = "Raj"

    /**
     * You can avoid type declaration, kotlin takes care of adding type on it's own.
     * But for that to happen you need to assign a value to the variable.
     *
     * The ability of the compiler to determine types from context is called type inference.
     */
    val nameOfTheStudentImplicit = "Raj"
}

private fun main() {

}