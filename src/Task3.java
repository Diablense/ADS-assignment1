//complexity: O(n)
public int powerSum(int n, int b,int bPower){
    if(n==0){
        return 0;//stops recursion and returns zero to ensure that i+1 does not exceed n
    }
    bPower*=b;//represents b^i
    return bPower+powerSum(n-1,b,bPower);//sums b^i and b^(i+1)
}

void main() {
    Scanner scanner = new Scanner(System.in);
    int b= scanner.nextInt();
    int n= scanner.nextInt();
    System.out.println(powerSum(n,b,1)+1);//+1 is to account for b^0
}