class BinaryTreeNode(value: Int) {
    val value: Int = value
    var left: BinaryTreeNode? = null
    var right: BinaryTreeNode? = null
    
    override fun toString(): String {
        var result = "$value"
        return "{ ${left?.toString() ?: ""} " + result + " ${right?.toString() ?: ""} }"
    }
}


fun main() {
    val zero = BinaryTreeNode(0)
    val one = BinaryTreeNode(1)
    val two = BinaryTreeNode(2)

    one.left = zero
    one.right = two

    println(one)
}
