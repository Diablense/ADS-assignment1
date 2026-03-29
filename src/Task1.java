//Time complexity: O(n)
public int SumSquares(int n,int sum){
    if(n==0){
        return sum;//checks if reached zero
    }
    sum+=n*n;//adds square to sum
    return SumSquares(n-1, sum);//summons function with decreased N
}

void main() {
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    System.out.println(SumSquares(n,0));
}