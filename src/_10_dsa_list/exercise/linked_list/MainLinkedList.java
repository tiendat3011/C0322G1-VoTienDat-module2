package _10_dsa_list.exercise.linked_list;

public class MainLinkedList {
    public static void main(String[] args) {
        NewMyLinkedList linkedList = new NewMyLinkedList();
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        System.out.println("Độ dài mảng là " + linkedList);
        linkedList.addLast(14);
        linkedList.addLast(15);
        System.out.println("Độ dài mảng là " + linkedList);
        linkedList.add(2, 20);
        System.out.println("Thêm pt 20 vào vị trí thứ 2 " + linkedList);
        linkedList.remove(2);
        System.out.println("Xoá pt tại vị trí thứ 2 " + linkedList);
        linkedList.remove(3);
        System.out.println("Xoá pt tại vị trí thứ 3 " + linkedList);
        linkedList.remove((Integer) 11);
        System.out.println("Xoá số 11 " + linkedList);
    }
}