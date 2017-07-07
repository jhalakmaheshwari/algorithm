package Tree.bstpackage;

import java.util.*;

public interface Node<E> {
	/*E data;*/
	Node<E> getParent();
	// List<Node<E>> getChildren();
	E getData();
	Node<E> getRight();
	Node<E> getLeft();
	void setLeft(Node<E> left);
	void setRight(Node<E> right);
	void setParent(Node<E> parent);
	void setData(E data);
}