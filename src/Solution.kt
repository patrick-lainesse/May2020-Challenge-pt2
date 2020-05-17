/* May 16th: Odd Even Linked List
Given a singly linked list, group all odd nodes together followed by the even nodes.
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.*/

//Definition for singly-linked list.
class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun oddEvenList(head: ListNode?): ListNode? {

    // skipped in place solution
    var ln: ListNode? = head
    var even = head?.next
    var evenHead = even

    if (even?.next == null) return head

    while (ln != null) {
        val temp = ln.next
        ln.next = temp?.next
        temp?.next = null
        even?.next = temp
        even = even?.next
        if (ln.next == null) {
            break
        }
        ln = ln.next
    }
    even = evenHead
    ln?.next = even
    return head
}


fun main() {

    //May 16th: Odd Even Linked List
    val ln1 = ListNode(1)
    val ln2 = ListNode(2)
    val ln3 = ListNode(3)
    val ln4 = ListNode(4)
    val ln5 = ListNode(5)

    /*ln1.next = ln2
    ln2.next = ln3
    ln3.next = ln4
    ln4.next = ln5

    // Output: 1->3->5->2->4->NULL
    oddEvenList(ln1)
*/
    /*var ln: ListNode? = ln1
    while (ln != null) {
        println(ln.value)
        ln = ln.next
    }*/

    /*val ln6 = ListNode(6)
    val ln7 = ListNode(7)

    ln2.next = ln1
    ln1.next = ln3
    ln3.next = ln5
    ln5.next = ln6
    ln6.next = ln4
    ln4.next = ln7
    ln7.next = null
    //val ln8: ListNode? = null

    oddEvenList(ln2)
*/
    val lnw1 = ListNode(1)
    val lnw2 = ListNode(2)
    val lnw3 = ListNode(3)
    lnw1.next = lnw2
    lnw2.next = lnw3
    oddEvenList(lnw1)

    // Output: 2->3->6->7->1->5->4->NULL
    var ln: ListNode? = lnw1
    while (ln != null) {
        println(ln.value)
        ln = ln.next
    }
}