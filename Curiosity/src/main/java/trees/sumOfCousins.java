package trees;

public class sumOfCousins {
	Node root;
	public int findSum(Node root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return findSum(root.right);
		}

		if (root.right == null) {
			return findSum(root.left);
		}

		return findSum(root.left) + findSum(root.right);
	}
}
