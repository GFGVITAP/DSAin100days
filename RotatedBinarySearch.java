// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

//Eg 1->
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4 //verified

//Eg 2->
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

//Eg 3->
//Input: nums = [1], target = 0
//Output: -1

import java.util.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target = 4;

        int pivot=pivotIndex(arr);
        if(pivot==-1) System.out.println( binarySearch(arr,target,0,arr.length-1));
        if(arr[pivot]==target) System.out.println( pivot);
        int firstTry=binarySearch(arr,target,0,pivot);
        if(firstTry!=-1) System.out.println (firstTry);
        else System.out.println( binarySearch(arr,target,pivot+1, arr.length-1));
    }
    static int pivotIndex(int[] arr){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

                if (mid>start && arr[mid] < arr[mid - 1]) return mid - 1;
                if (mid<end && arr[mid] > arr[mid + 1]) return mid;

            if(arr[start]>=arr[mid]) end=mid-1;
            if(arr[start]<arr[mid]) start=mid+1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]) start=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else return mid;
        }
        return -1;
    }

    static int pivotIndexDuplicates(int[] arr){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
            if(mid<end && arr[mid]>arr[mid+1]) return mid;

            if(arr[start]==arr[end]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]) return start;
                ++start;
                if(arr[end]<arr[end-1]) return end;
                --end;
            }

            if(arr[start]<arr[mid] || (arr[start]==arr[mid]&&arr[mid]>arr[end]) ){
                start=mid+1;
            } else end=mid-1;
        }
        return -1;
    }
}