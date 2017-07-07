package Tree.bstpackage;

public class NodeImpl<E> implements Node<E> {
  Node<E> parent;
  Node<E> left;
  Node<E> right;
  E data;
  public NodeImpl(E data, Node<E> parent, Node<E> left, Node<E> right){
  	this.data=data;
  	this.parent=parent;
  	this.left=left;
  	this.right=right;
  }

  public void setParent(Node<E> parent){
  	this.parent=parent;
  }

  public void setLeft(Node<E> left){
  	this.left=left;
  }

  public void setRight(Node<E> right){
  	this.right=right;
  }
  public Node<E> getParent(){
  	return this.parent;
  }

  public Node<E> getLeft(){
  	return this.left;
  }

  public Node<E> getRight(){
  	return this.right;
  }

  public E getData() {
  	return this.data;
  }
  public void setData(E data) {
  	this.data = data;
  }

}