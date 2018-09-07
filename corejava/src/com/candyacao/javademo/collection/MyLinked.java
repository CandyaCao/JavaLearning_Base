package com.candyacao.javademo.collection;

/**
 * ˫������
 * 
 * @author CLY
 *
 */

public class MyLinked {
	private Node first;
	private Node last;
	private int size = 0;

	/**
	 * �����еĽڵ�
	 */
	// addFirst
	public void addFirst(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// �������ڵ����һ���ڵ�ָ��֮ǰ�ĵ�һ���ڵ�
			node.next = this.first;
			// ��֮ǰ�ĵ�һ���ڵ��ǰһ���ڵ�ָ�������Ľڵ�
			this.first.prev = node;
			// �������Ľڵ��Ϊͷ�ڵ�
			this.first = node;

		}
		size++;
	}

	// addLast
	public void addLast(Object ele) {
		Node node = new Node(ele);
		if (size == 0) {
			this.first = node;
			this.last = node;
		} else {
			// �������ڵ����һ���ڵ�ָ��֮ǰ�����ڵ�
			node.prev = this.last;
			// ��֮ǰ�����һ���ڵ����һ���ڵ�ָ�������Ľڵ�
			this.last.next = node;
			// �������Ľڵ��Ϊβ�ڵ�
			this.last = node;

		}
		size++;
	}

	// removeFirst
	public void removeFirst() {
		this.first = this.first.next;
		this.first.prev = null;
		size--;
	}

	// removeLast
	public void removeLast() {
		this.last = this.last.prev;
		this.last.next = null;
		size--;
	}

	// remove
	public void remove(Object ele) {

		// �ҵ�Ҫɾ���Ľڵ�
		Node current = this.first;
		for (int i = 0; i < size; i++) {

			if (!current.ele.equals(ele)) {
				if (current.next == null) {
					return;
				}
				current = current.next;
			}
		}

		if (current == this.first) {
			this.first = current.next;
			this.first.prev = null;
		} else if (current == this.last) {
			this.last = current.prev;
			this.last.next = null;
		} else {
			// ��ɾ���ڵ����һ���ڵ��nextָ��ɾ���ڵ����һ���ڵ�
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}

		size--;

	}

	// toString
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		Node node = this.first;
		for (int i = 1; i <= size; i++) {
			stringBuilder.append(node.ele);
			if (i != size) {
				stringBuilder.append(",");
			} else {
				stringBuilder.append("]");
			}
			node = node.next;
		}
		return stringBuilder.toString();
	}

	public Node getFirst() {
		return this.first;
	}

	public Node getLast() {
		return this.last;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	class Node {
		Node next;
		Node prev;
		Object ele;

		public Node(Object ele) {
			this.ele = ele;
		}
	}
}