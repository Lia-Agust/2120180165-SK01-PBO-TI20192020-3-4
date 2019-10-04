
package segitiga.pkg4;

/**
 *
 * @author LIA AGUSTINA
 */
public class Segitiga4 {

  
    public static void main(String[] args) {
        // TODO code application logic here
       int x=10;
       for (int i=1; i<=x ; i++){
        for (int j=x;j>=i;j--){//spasi
            System.out.print(" ");
        }
        for (int k=1;k<=i;k++){//angka 4
            System.out.print("4");
        }
        for (int l=1;l<=i-1;l++){
            System.out.print("4");
        }
        System.out.println();
        }
        }
    }
    
}
