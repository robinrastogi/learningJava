package myCollections;

public class ListNode {
	 String data = "";
	 ListNode next = null;
	 public ListNode(String data, ListNode node) {
		 this.data = data;
		 this.next = node;
	}
	// reverse
	public static ListNode reverse (ListNode list) {
		if (list == null) return null;
		if (list.next == null) return list;
		ListNode secondElem = list.next;
		list.next = null;
		ListNode reverseRest = reverse(secondElem);
		secondElem.next = list;
		return reverseRest;
		
	}
	
	public static void main(String[] args) {
		ListNode node3= new ListNode ("node3",null);
		ListNode node2= new ListNode ("node2",node3);
		ListNode node1= new ListNode ("node1",node2);
		
		System.out.println(" Original list : "+node1.data+"\n");
		System.out.println(" Last Item : "+node1.next.next.data+"\n");
		
		ListNode reverseList = ListNode.reverse(node1);
		System.out.println("First Item "+reverseList.data);
	}
} 
