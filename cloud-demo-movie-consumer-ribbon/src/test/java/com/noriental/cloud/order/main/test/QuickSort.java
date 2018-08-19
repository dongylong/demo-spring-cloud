//package com.noriental.cloud.ordersvr.main.test;
//
//import org.junit.Test;
//
///**
// * @author dongyl
// * @date 15:08 11/10/17
// * @project demo-spring-cloud
// */
//public class QuickSort {
//
//    @Test
//    public void quickTest() {
//
//        int[] A = new int[]{3, 2, 5, 4, 1};
//        //左指针
//        int p = 0;
//        //右指针
//        int r = A.length - 1;
//        int key = quickSort(A, p, r);
//        quickSort();
//    }
//
//    /**
//     *
//     */
//    private int quickSort(int[] A, int p, int r) {
//        int left = p;
//        int right = r;
//        int temp = A[p];
//        int t;
//        if (left >= right) {
//            if (temp < A[left]) {
//                A[p] = A[left];
//                A[left] = temp;
//            }
//            return right;
//        }
//        while (left != right) {
//            while (A[right]>temp){
//                right--;
//            }
//            while (A[left]>temp) {
//                left++;
//            }
//            if(A[right] <A[left]){
//                t=A[left];
//                A[left] = A[right];
//                A[right] = t;
//            }
//        }
//    }
//}
