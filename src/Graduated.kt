// Student.kt
data class Graduated(val id: String, val name: String, val course: String, val mark: Double) {

    // Show only the details the slide asks for
    override fun toString(): String = "Student(name=$name, course=$course, mark=$mark)"
}