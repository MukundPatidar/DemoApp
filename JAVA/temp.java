public class temp {

  public static void prt(char a) {
    System.out.print(a);
  }
  
   public static void main(String args[]) {
     
    int count[] = new int[10];
    char alf[] = new char[10];

    for (int i = 0; i < 10; i++) {
        alf[i] = 'A';
        count[i] = 0;
    }
    
    while( count[9] != 2212){
        System.out.print("\t"); 

        // alphabet 'H'
        if(count[0] < 2005) {
          prt(alf[0]);
          alf[0]++;
          count[0]++;
        }
        else {
          if (alf[0] != 72) {
            prt(alf[0]);
            alf[0]++;
          }
          else {
              prt(alf[0]);
              count[0] = 2212;
          }
        }
        if(alf[0] == 90) {
          alf[0] = 'A' ;
        }
        
        

        // alphabet 'E'
        if (count[0] == 2212) {
          if(count[1] < 2005) {
            prt(alf[1]);
            alf[1]++ ;
            count[1]++ ;
          }
          else {
            if (alf[1] != 69) {
                prt(alf[1]);
                alf[1]++;
            }
            else {
                prt(alf[1]);
                count[1] = 2212;
            }
          }
          if(alf[1] == 90) {
            alf[1] = 'A' ;
          }
        }

        // alphabet 'L'
        if (count[1] == 2212) {
          if(count[2] < 2005) {
            prt(alf[2]);
            alf[2]++ ;
            count[2]++ ;
          }
          else {
            if (alf[2] != 76) {
                prt(alf[2]);
                alf[2]++;
            }
            else {
                prt(alf[2]);
                count[2] = 2212;
            }
          }
          if(alf[2] == 90) {
            alf[2] = 'A' ;
          }
        }

        // alphabet 'L'
        if (count[2] == 2212) {
          if(count[3] < 2005) {
            prt(alf[3]);
            alf[3]++ ;
            count[3]++ ;
          }
          else {
            if (alf[3] != 76) {
                prt(alf[3]);
                alf[3]++;
            }
            else {
                prt(alf[3]);
                count[3] = 2212;
            }
          }
          if(alf[3] == 90) {
            alf[3] = 'A' ;
          }
        }

        // alphabet 'O'
        if (count[3] == 2212) {
          if(count[4] < 2005) {
            prt(alf[4]);
            alf[4]++ ;
            count[4]++ ;
          }
          else {
            if (alf[4] != 79) {
                prt(alf[4]);
                alf[4]++;
            }
            else {
                prt(alf[4]);
                count[4] = 2212;
            }
          }
          if(alf[4] == 90) {
            alf[4] = 'A' ;
          }
        }

        System.out.print("\t");

        // alphabet 'W'
        if (count[4] == 2212) {
          if(count[5] < 2005) {
            prt(alf[5]);
            alf[5]++ ;
            count[5]++ ;
          }
          else {
            if (alf[5] != 87) {
                prt(alf[5]);
                alf[5]++;
            }
            else {
                prt(alf[5]);
                count[5] = 2212;
            }
          }
          if(alf[5] == 90) {
            alf[5] = 'A' ;
          }
        }

        // alphabet 'O'
        if (count[5] == 2212) {
          if(count[6] < 2005) {
            prt(alf[6]);
            alf[6]++ ;
            count[6]++ ;
          }
          else {
            if (alf[6] != 79) {
                prt(alf[6]);
                alf[6]++;
            }
            else {
                prt(alf[6]);
                count[6] = 2212;
            }
          }
          if(alf[6] == 90) {
            alf[6] = 'A' ;
          }
        }

        // alphabet 'R'
        if (count[6] == 2212) {
          if(count[7] < 2005) {
            prt(alf[7]);
            alf[7]++ ;
            count[7]++ ;
          }
          else {
            if (alf[7] != 82) {
                prt(alf[7]);
                alf[7]++;
            }
            else {
                prt(alf[7]);
                count[7] = 2212;
            }
          }
          if(alf[7] == 90) {
            alf[7] = 'A' ;
          }
        }

        // alphabet 'L'
        if (count[7] == 2212) {
          if(count[8] < 2005) {
            prt(alf[8]);
            alf[8]++ ;
            count[8]++ ;
          }
          else {
            if (alf[8] != 76) {
                prt(alf[8]);
                alf[8]++;
            }
            else {
                prt(alf[8]);
                count[8] = 2212;
            }
          }
          if(alf[8] == 90) {
            alf[8] = 'A' ;
          }
        }

        // alphabet 'D'
        if (count[8] == 2212) {
          if(count[9] < 2005) {
            prt(alf[9]);
            alf[9]++ ;
            count[9]++ ;
          }
          else {
            if (alf[9] != 68) {
                prt(alf[9]);
                alf[9]++;
            }
            else {
                prt(alf[9]);
                count[9] = 2212;
            }
          }
          if(alf[9] == 90) {
            alf[9] = 'A' ;
          }
        }

        System.out.print("\n");

    }

   }
}
