package pkg2.matris.top_çarp;
public class MatrisTop_çarp {
    public static void main(String[] args) {
         // 2 matrisi toplayan genel olmak şartıyla recursive yapan metodu gerçekleştiriniz
        int a[][] = {{2,4,5,4},{4,4,5,2},{4,4,1,2},{6,4,1,2}};
        int b[][] = {{2,4,5,4},{3,4,5,2},{6,4,1,2},{4,4,1,2}};
        c = new int[a.length][a[0].length];
        topla(a,b,0,0);
        for (int i = 0; i  <  a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    public static int c[][];
    public static void topla(int a[][], int b[][],int i ,int j) {
        if (i==a.length) 
            return;
        if(j<a.length-1){
            c[i][j] = a[i][j] * b[i][j];
            topla(a,b,i,++j);
        }else {
            c[i][j] = a[i][j] * b[i][j];
            topla(a,b,++i,0);
        }
    }
    
}
