class TreeNode(value: Int) {
    val value: Int = value
    var children: MutableList<TreeNode> = mutableListOf()

    fun addChild(node: TreeNode) {
        children.add(node)
    }

    override fun toString(): String {
        var s = "${value}"
        if (!children.isEmpty()) {
            s += " { " + children.map { it.toString() } + " } "
        }
        return s
    }
}

fun main() {
    val zero = TreeNode(0)
    val one = TreeNode(1)
    val two = TreeNode(2)
    one.addChild(zero)
    one.addChild(two)

    println(one)

    val negative_one = TreeNode(-1)
    zero.addChild(negative_one)

    println(one)
}