package _14_sort_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 10, 8};
        int pos;
        int x;
        for (int i = 0; i < array.length; i++) {// lặp qua tất cả các số
            x = array[i]; // chọn 1 số để chèn
            pos = i; // lựa chọn vị trí để chèn
            while (pos > 0 && x < array[pos - 1]) {// kiểm tra số liền trước có lớn hơn giá trị được chèn hay không
                array[pos] = array[pos - 1]; //đổi chỗ lên đầu
                pos--;
                System.out.println(" Di chyển só " +array[pos] );
            }
            if (pos!=i){
                System.out.println(" chèn số " +x +" vào vị trí "+pos );
                array[pos] = x;// chèn pt vào vị trí
            }
            System.out.println(Arrays.toString(array)); // Arrays dùng để sắp xếp các pt trên mảng thành dạng danh sách
                                 //.to.string hiển thị tất cả các phần tử của một mảng
        }
    }
}
//sx noi bot ss các cặp pt liền kề nhau sau đó dịch chuyển pt lớn bé về phía sau
// tot 0n xau 0n2
//sx chọn tim` pt lon, be nhat trong mảng sau đó dịch chuyển lên đau`. tiếp tục xét vs mảng còn lại, bỏ qua
// pt đã đc sx tot xau 0n2
//sx chèn` : lay mang con o trong mang can` sx
//pt dau` tien trong mang phai dam bao ljuo dc sx (tang giam)
//moi~ lan` lap lai thi` size con +1
// chèn pt ms vao` vi tri thich hop
// tot 0n xau 0n23w