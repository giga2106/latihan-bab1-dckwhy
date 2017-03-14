
package Praktikumsmt2;

import java.util.Scanner;
public class mainpacman {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        pacman p = new pacman();
        int x=2,y=1;
        boolean start = true;
        String a [][] = new String [10][10];
        int move=0, poin=0, sm=20;
        String arah;
        p.setKarakter("@");
        p.setPagar("#");
        p.setCamilan("o");        
            for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i==0 || i==9 || j==0 || j==9) {
                    a[i][j] = "#";
                    
                    
                }
                else if (i==2 && j==1 ||
                         i==2 && j==2 ||
                         i==2 && j==3 ||
                         i==2 && j==8 ||
                         i==4 && j==3 ||
                         i==4 && j==4 || 
                         i==4 && j==5 ||
                         i==4 && j==6 ||
                         i==6 && j==1 ||
                         i==6 && j==2 ||
                         i==6 && j==7 ||
                         i==6 && j==8 ||
                         i==7 && j==3) {
                    a[i][j] = "#";
                   
                }
                else{
                    a[i][j] = " ";
                    
                }
               
            }
        }
             a[y][x]=p.getKarakter();
             a[2][5]=p.getCamilan();
             a[3][3]=p.getCamilan();
             a[4][8]=p.getCamilan();
             a[6][5]=p.getCamilan();
             a[7][5]=p.getCamilan();
        do {
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                   
                    System.out.print(a[i][j]);
                }
                System.out.println("");
            }
            System.out.println("move: "+move+"     poin: "+poin+"     move left: "+sm);
            System.out.print("w:Up,a:left,s:down,d:right,q:quit--> ");
            arah = in.nextLine();
            if (arah.equalsIgnoreCase("w")) {
                if (a[y-1][x].equals(" ")) {
                    a[y][x]=" ";
                    a[y-1][x]="@";
                    move++;
                    sm--;
                    y--;
                }
                else if (a[y-1][x].equals("o")) {
                    a[y][x]=" ";
                    a[y-1][x]="@";
                    poin++;
                    move++;
                    sm--;
                    y--;
                }
                else if (a[y-1][x].equals("#")) {
                    continue;
                }
                
                    
                }
            
            else if (arah.equalsIgnoreCase("d")) {
                if (a[y][x+1].equals(" ")) {
                    a[y][x]=" ";
                    a[y][x+1]="@";
                    move++;
                    sm--;
                    x++;
                }
                else if (a[y][x+1].equals("o")) {
                    a[y][x]=" ";
                    a[y][x+1]="@";
                    poin++;
                    move++;
                    sm--;
                    x++;
                }
                else if (a[y][x+1].equals("#")) {
                    continue;
                }
                
            }
            else if (arah.equalsIgnoreCase("s")) {
                if (a[y+1][x].equals(" ")) {
                    a[y][x]=" ";
                    a[y+1][x]="@";
                    move++;
                    sm--;
                    y++;
                }
                else if (a[y+1][x].equals("o")) {
                    a[y][x]=" ";
                    a[y+1][x]="@";
                    poin++;
                    move++;
                    sm--;
                    y++;
                }
                else if (a[y+1][x].equals("#")) {
                    continue;
                }
                
            }
            else if (arah.equalsIgnoreCase("a")) {
                if (a[y][x-1].equals(" ")) {
                    a[y][x]=" ";
                    a[y][x-1]="@";
                    move++;
                    sm--;
                    x--;
                }
                else if (a[y][x-1].equals("o")) {
                    a[y][x]=" ";
                    a[y][x-1]="@";
                    poin++;
                    move++;
                    sm--;
                    x--;
                }
                else if (a[y][x-1].equals("#")) {
                    continue;
                }                
            }
            else if (arah.equals("q")) {
                start = false;
                System.out.println("Terima kasih");
            }
            
        } while (move<20&&poin<6);
          if (poin<5&&sm==0) {
                
                System.out.println("you lose");
            }
          else if (poin==5||sm!=0) {
            
              System.out.println("you win");
        }
        
    }
}
