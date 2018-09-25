package algorithm.search;

/**
 * @author 浦希成
 * 2018/9/24 18:36
 */
public class BinarySearch {
    public int binarySearch_no_recursion(int arrs[],int key){
        int l=0;
        int r=arrs.length-1;
        int mid=0;
        while (l<=r){
            mid=(l+r)/2;
            if (key==arrs[mid]){
                return mid;
            }else if(key>arrs[mid]){
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return -1;
    }
    public int binarySearch_recursion(int arrs[],int l,int r,int key){
        if (l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if (arrs[mid]==key){
            return mid;
        }else if(key>arrs[mid]){
            return binarySearch_recursion(arrs,mid+1,r,key);
        }else {
            return binarySearch_recursion(arrs,l,mid-1,key);
        }
    }

    public static void main(String[] args) {
        int arrs[]=new  int[]{1,5,7,8,9,34,56,89};
        System.out.println(new BinarySearch().binarySearch_recursion(arrs,0,arrs.length-1,7));

    }

}
