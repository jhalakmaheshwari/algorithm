package Tree.bstpackage;

public class BST<E extends Number & Comparable<? super E>>{
	// private Node<E> parent;
	// private Node<E> left;
	// private Node<E> right;
	private Node<E> root;
	// private Node<E> element;
	public BST(E rootData){
		this.root=new NodeImpl(rootData, null, null, null);
	}



	public void add(Node<E> root, E data){
		// System.out.println(root.getData());
		// System.out.println("Hey "+ data.compareTo(root.getData()));
		if(data.compareTo(root.getData()) == 1){
			if(root.getRight() == null){
				root.setRight(new NodeImpl(data, null, null, null));
			}
			else{
				add(root.getRight(),data);
				// this.right.add(data);
			}
		}else{
			if(root.getLeft()==null){
				root.setLeft(new NodeImpl(data, null, null, null));
			}
			else{
				add(root.getLeft(),data);
			}
		}
	}

	@Override
	public String toString(){
		inorder(this.root);
		return "";
	}

	public void inorder(Node<E> node){
		if(node != null){
			inorder(node.getLeft());
			System.out.print(node.getData() + " -- ");
			inorder(node.getRight());
		}

	}

/*	public void remove(Node<E> root, E data){
		if(root.getData().compareTo(data) == 0){
			System.out.println("Hey");
			if(root.getLeft()==null && root.getRight() == null){
				root=null;
			}
			else if(root.getRight() == null){
				root = root.getLeft();
			}
			else{
				Node node=root.getLeft();
				root = root.getRight();
				if(root.getLeft() == null){
					root.setLeft(node);
				}
				else{
					root=exercise(root.getLeft(), node, root, root.getRight());
				}
			}
		}
		else if(root.getData().compareTo(data) == 1){ //(root > data)
			remove(root.getLeft(), data);
		}
		else{ //(root < data)
			remove(root.getRight(), data);
		}
	}
*/

/*	public void removeNode(BST bst, Node<E> toDelete, Node<E> compare){
		int diff=compare.getData().compareTo(toDelete.getData());
		if(diff == 0){
			bst.root = null;
		}
		else if(diff == 1){


		}
	}*/

	public void remove(BST bst, Node<E> root, E data){
		Node<E> foundNode=find(data, root);
		if(foundNode.getLeft() == null && foundNode.getRight() == null){
			foundNode = null;
		}
		else if(foundNode.getLeft() != null && foundNode.getRight() != null){
			Node<E> cnode = foundNode.getRight();
			Node<E> cnodeCopy= cnode;
			while(cnode.getLeft() != null){
				cnodeCopy=cnode;
				cnode=cnode.getLeft();
			}
			foundNode = null;
			bst.add(bst.root, cnodeCopy.getData());
		}
		else{
			// INCOMPELETE
			if(foundNode.getLeft() != null){
				Node<E> saveNode = foundNode.getLeft();
				foundNode = null;
				bst.add(bst.root, saveNode.getData());
			}
			else{
				// INCOMPELETE
				Node<E> saveNode = foundNode.getRight();
				foundNode = null;
				bst.add(bst.root, saveNode.getData());
			}
		}

	}

	public Node<E> find(E data, Node<E> root){
		int comp=root.getData().compareTo(data);
		if(comp == 0){
			return root;
		}
		else if(comp == 1){
			return find(data, root.getLeft());
		}
		else{
			return find(data, root.getRight());
		}
	}

	/*public Node<E> exercise(Node<E> rootLeft, Node<E> node, Node<E> root, Node<E> rightChild){
		String arr[]=rootLeft.toString().split(" -- ");
		String arr1[]=node.toString().split(" -- ");
		int i=Integer.parseInt(root.getData().toString());
		BST<Integer> bst1=new BST<Integer>(i);
		for(String str: arr){
			int a=Integer.parseInt(str);
			bst1.add(bst1.root, a);
		}
		for(String str: arr1){
			int a=Integer.parseInt(str);
			bst1.add(bst1.root, a);
		}
		bst1.root.setRight(rightChild);
		return bst1.root;
	}*/

	public static void main(String[] args) {
		BST<Integer> bst=new BST<Integer>(12);
		bst.add(bst.root, 14);
		bst.add(bst.root, 13);
		bst.add(bst.root, 10);
		bst.add(bst.root, 9);
		bst.add(bst.root, 7);
		bst.add(bst.root, 1);
/*		System.out.println(bst);
		bst.remove(bst.root,10);
		System.out.println(bst);*/
		bst.remove(bst, bst.root, 10);
		System.out.println(bst.find(13, bst.root).getData());
		// System.out.println(bst.root.getData() + " RIGHT: " + bst.root.getRight().getData());
	}



}