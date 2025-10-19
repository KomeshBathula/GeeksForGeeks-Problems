// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int first_occur = findFirstOccurence(arr, x);
        int last_occur = findLastOccurence(arr, x);
        result.add(first_occur);
        result.add(last_occur);
        return result;
    }
    static int findFirstOccurence(int arr[], int x){
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == x){
                if(mid>0 && arr[mid - 1] == x)
                    right = mid - 1;
                else 
                    return mid;
            }
            else if(arr[mid] > x) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
    static int findLastOccurence(int arr[], int x){
        int left = 0, right = arr.length - 1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == x){
                if(mid<arr.length - 1 && arr[mid + 1] == x)
                    left = mid + 1;
                else 
                    return mid;
            }
            else if(arr[mid] > x) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
    
}
