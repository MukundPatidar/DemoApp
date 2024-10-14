package simpleQ;
public class HW {

  public static void prt(char a) {
    System.out.print(a);
  }

  public static void main(String args[]) {

    // creating arrays
    // to count all letters
    int count[] = new int[10];
    // to store all letters
    char letters[] = new char[10];

    for (int i = 0; i < 10; i++) {
      letters[i] = 'A';
      count[i] = 0;
    }

    while (count[9] != 2212) {
      System.out.print("\t");

      // alphabet 'H'
      if (count[0] < 2005) {
        prt(letters[0]);
        letters[0]++;
        count[0]++;
      } else {
        if (letters[0] != 72) {
          prt(letters[0]);
          letters[0]++;
        } else {
          prt(letters[0]);
          count[0] = 2212;
        }
      }
      if (letters[0] == 90) {
        letters[0] = 'A';
      }

      // alphabet 'E'
      if (count[0] == 2212) {
        if (count[1] < 2005) {
          prt(letters[1]);
          letters[1]++;
          count[1]++;
        } else {
          if (letters[1] != 69) {
            prt(letters[1]);
            letters[1]++;
          } else {
            prt(letters[1]);
            count[1] = 2212;
          }
        }
        if (letters[1] == 90) {
          letters[1] = 'A';
        }
      }

      // alphabet 'L'
      if (count[1] == 2212) {
        if (count[2] < 2005) {
          prt(letters[2]);
          letters[2]++;
          count[2]++;
        } else {
          if (letters[2] != 76) {
            prt(letters[2]);
            letters[2]++;
          } else {
            prt(letters[2]);
            count[2] = 2212;
          }
        }
        if (letters[2] == 90) {
          letters[2] = 'A';
        }
      }

      // alphabet 'L'
      if (count[2] == 2212) {
        if (count[3] < 2005) {
          prt(letters[3]);
          letters[3]++;
          count[3]++;
        } else {
          if (letters[3] != 76) {
            prt(letters[3]);
            letters[3]++;
          } else {
            prt(letters[3]);
            count[3] = 2212;
          }
        }
        if (letters[3] == 90) {
          letters[3] = 'A';
        }
      }

      // alphabet 'O'
      if (count[3] == 2212) {
        if (count[4] < 2005) {
          prt(letters[4]);
          letters[4]++;
          count[4]++;
        } else {
          if (letters[4] != 79) {
            prt(letters[4]);
            letters[4]++;
          } else {
            prt(letters[4]);
            count[4] = 2212;
          }
        }
        if (letters[4] == 90) {
          letters[4] = 'A';
        }
      }

      System.out.print("\t");

      // alphabet 'W'
      if (count[4] == 2212) {
        if (count[5] < 2005) {
          prt(letters[5]);
          letters[5]++;
          count[5]++;
        } else {
          if (letters[5] != 87) {
            prt(letters[5]);
            letters[5]++;
          } else {
            prt(letters[5]);
            count[5] = 2212;
          }
        }
        if (letters[5] == 90) {
          letters[5] = 'A';
        }
      }

      // alphabet 'O'
      if (count[5] == 2212) {
        if (count[6] < 2005) {
          prt(letters[6]);
          letters[6]++;
          count[6]++;
        } else {
          if (letters[6] != 79) {
            prt(letters[6]);
            letters[6]++;
          } else {
            prt(letters[6]);
            count[6] = 2212;
          }
        }
        if (letters[6] == 90) {
          letters[6] = 'A';
        }
      }

      // alphabet 'R'
      if (count[6] == 2212) {
        if (count[7] < 2005) {
          prt(letters[7]);
          letters[7]++;
          count[7]++;
        } else {
          if (letters[7] != 82) {
            prt(letters[7]);
            letters[7]++;
          } else {
            prt(letters[7]);
            count[7] = 2212;
          }
        }
        if (letters[7] == 90) {
          letters[7] = 'A';
        }
      }

      // alphabet 'L'
      if (count[7] == 2212) {
        if (count[8] < 2005) {
          prt(letters[8]);
          letters[8]++;
          count[8]++;
        } else {
          if (letters[8] != 76) {
            prt(letters[8]);
            letters[8]++;
          } else {
            prt(letters[8]);
            count[8] = 2212;
          }
        }
        if (letters[8] == 90) {
          letters[8] = 'A';
        }
      }

      // alphabet 'D'
      if (count[8] == 2212) {
        if (count[9] < 2005) {
          prt(letters[9]);
          letters[9]++;
          count[9]++;
        } else {
          if (letters[9] != 68) {
            prt(letters[9]);
            letters[9]++;
          } else {
            prt(letters[9]);
            count[9] = 2212;
          }
        }
        if (letters[9] == 90) {
          letters[9] = 'A';
        }
      }

      System.out.print("\n");

    }

  }
}