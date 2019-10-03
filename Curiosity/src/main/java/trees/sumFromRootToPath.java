package trees;

public class sumFromRootToPath {
	private Node root;
	public static void main(String[] args) {
		int sum = 18;
		sumFromRootToPath tree = new sumFromRootToPath();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);
		int length = new sumFromRootToPath().doesPathExist(tree.root, sum);
		if (length > 0) {
			System.out.println(length);
		} else {
			System.out.println("DNE");
		}
	}

	private int doesPathExist(Node root, int sum) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int subSum = sum - root.element;
		if (root.left == null && root.right == null) {
			if (subSum == 0) {
				return 1;
			} else {
				return Integer.MIN_VALUE;
			}
		}

		if (root.left != null) {
			if (subSum == 0) {
				return 1;
			} else {
				return doesPathExist(root.left, subSum) + 1;
			}
		}

		if (subSum == 0) {
			return 1;
		} else {
			return doesPathExist(root.right, subSum) + 1;
		}

	}

}
