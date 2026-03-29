//Complexity: O(n)

public int sumArray(int n, int[] arr, int sum){
    if(n==0){
        return sum+arr[n];//stops the recursion
    }
    sum+=arr[n];//adds arr[n] to the sum
    return sumArray(n-1,arr,sum);//summons sumarray with decreased N
}

void main() {
    Scanner scanner = new Scanner(System.in);
    int[] arr = {12,21,45,12,54,123,432};
    int n= scanner.nextInt();
    if(n>arr.length || n==0){
        throw new IllegalArgumentException("N can't be larger than array size or can not be zero");
    }
    System.out.println(sumArray(n-1,arr,0));
}