package week7;

import java.util.*;
import java.io.*;

public class Problem2 {
	class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}

	public class TreeNode<T> {

		private TreeNode<T> parent = null;
		private ArrayList<TreeNode<T>> children = new ArrayList<TreeNode<T>>();
		private T data = null;

		public TreeNode(T data) {
			this.data = data;
		}

		public TreeNode(T data, TreeNode<T> parent) {
			this.data = data;
			this.parent = parent;
		}

		public T getData() {
			return this.data;
		}

		public void setParent(TreeNode<T> parent) {
			parent.addChild(this);
			this.parent = parent;
		}

		public void addChild(TreeNode<T> child) {
			child.setParent(this);
			this.children.add(child);
		}

		public void addChild(T data) {
			TreeNode<T> child = new TreeNode<T>(data);
			child.setParent(this);
			this.children.add(child);
		}

		public ArrayList<TreeNode<T>> getChildren() {
			return this.children;
		}

	}

	public class TreeHeight {
		int n;
		int parent[];

		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = in.nextInt();
			}
		}

		int computeHeight() {

			ArrayList<TreeNode<Integer>> listOfNodes = new ArrayList<>();

			for (int i = 0; i < parent.length; i++) {
				TreeNode<Integer> node = new TreeNode<>(i);
				listOfNodes.add(node);
			}

			for (TreeNode<Integer> node : listOfNodes) {
				int i = 0;

				if (parent[i] != -1) {
					node.setParent(listOfNodes.get(parent[i]));
				}

			}

			return 5;

		}
	}

	static public void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					new Problem2().run();
				} catch (IOException e) {
				}
			}
		}, "1", 1 << 26).start();
	}

	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
