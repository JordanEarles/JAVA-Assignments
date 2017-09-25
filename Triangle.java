
public class Triangle {
public static void main(String[] args) {
	
int lines=5;
int reverselines=4;
int stars=1;
int starcount=9;

for (int a=0; a<=lines; a++) {
	  for (int b=0; b<=stars; b++)
           System.out.print("*");
	  System.out.println();
	  stars = stars+2;
	  if (stars == 22) {
		  break;
	  }
    }
for (int c=0; c<=reverselines; c++) {
	  for (int d=0; d<=starcount; d++)
         System.out.print("*");
	  System.out.println();
	  starcount = starcount-2;
	  if (starcount == -2) {
		  break;
      }
    }	
  }
}

