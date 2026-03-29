//complexity: O(n)
public void printReverse(int n, Scanner scanner){
    if(n==0){
        return;
    }
    int bAtI=scanner.nextInt();//represents b[i] of input sequence
    printReverse(n-1,scanner);//summons next iteration
    System.out.print(bAtI+" ");//prints b[i] after summoning next iteration to make sure that it is printed in reverse
}
void main() {
    Scanner scanner = new Scanner(System.in);
    int n= scanner.nextInt();
    printReverse(n,scanner);
}