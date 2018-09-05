
package ModelPackage;

public class ThirdLayer extends SecondLayer{
    
 
    public int check = 0;
    
  //  public static Clocks clocks = new Clocks();
    

    public int[][] checkYellow(int colorcube[][]){
    
    if (colorcube[3][1]==4 && colorcube[3][3]==4 && colorcube[3][5]==4 && colorcube[3][7]==4){
      //  System.out.println("Yellow Cross is Done!");
        System.out.println("Second Step :");
   //     System.out.println("***********************************");
       colorcube = this.yellowCross(colorcube);
        return colorcube;
    }
    else if (colorcube[3][1]==4 && colorcube[3][7]==4){
        colorcube = clocks.greenCW(colorcube);//front
        colorcube = clocks.YellowCW(colorcube);//up
        colorcube = clocks.OrangeCW(colorcube);//right
        colorcube = clocks.YellowCCW(colorcube);//upinverse
        colorcube = clocks.OrangeCCW(colorcube);//rightinverse
        colorcube = clocks.greenCCW(colorcube);//frontinverse
        colorcube = this.checkYellow(colorcube);
        return colorcube;
    }
    else if (colorcube[3][3]==4 && colorcube[3][5]==4){
       colorcube = clocks.redCW(colorcube);//front
       colorcube = clocks.YellowCW(colorcube);//up
       colorcube = clocks.greenCW(colorcube);//right
       colorcube = clocks.YellowCCW(colorcube);//upinverse
       colorcube = clocks.greenCCW(colorcube); //rightinverse
       colorcube = clocks.redCCW(colorcube);//forntinverse
       colorcube = this.checkYellow(colorcube);
       return colorcube;
    }
    else if (colorcube[3][1]==4 && colorcube[3][3]==4){
        colorcube = clocks.redCW(colorcube); //front
        colorcube = clocks.YellowCW(colorcube);//up
        colorcube = clocks.greenCW(colorcube);//right
        colorcube= clocks.YellowCCW(colorcube);//upinverse
        colorcube = clocks.greenCCW(colorcube);//rightinverse
        colorcube = clocks.redCCW(colorcube);//frontinverse
        colorcube = this.checkYellow(colorcube);
        return colorcube;
    }
    else if (colorcube[3][1]==4 && colorcube [3][5]==4){
        colorcube = clocks.blueCW(colorcube);//front
        colorcube = clocks.YellowCW(colorcube);//up
        colorcube = clocks.redCW(colorcube);//right
        colorcube = clocks.YellowCCW(colorcube);//upinverse
        colorcube = clocks.redCCW(colorcube);//rightinverse
        colorcube = clocks.blueCCW(colorcube);//frontinvers
        colorcube = this.checkYellow(colorcube);
        return colorcube;
    }
    else if (colorcube[3][3]==4 && colorcube [3][7]==4){
        
        colorcube = clocks.greenCW(colorcube);//front
        colorcube = clocks.YellowCW(colorcube);//right
        colorcube = clocks.OrangeCW(colorcube);//up
        colorcube = clocks.YellowCCW(colorcube);//rightinverse
        colorcube = clocks.OrangeCCW(colorcube);//upinverse
        colorcube = clocks.greenCCW(colorcube);//frontinverse
        colorcube = this.checkYellow(colorcube);
        return colorcube;
    }
    else if (colorcube[3][7]==4 && colorcube [3][5]==4){
        colorcube = clocks.OrangeCW(colorcube);//front
        colorcube = clocks.YellowCW(colorcube);//up
        colorcube = clocks.blueCW(colorcube);//right
        colorcube = clocks.YellowCCW(colorcube);//upinverse
        colorcube = clocks.blueCCW(colorcube);//rightinverse
        colorcube = clocks.OrangeCCW(colorcube);//frontinvers
        colorcube = this.checkYellow(colorcube);
        return colorcube;
    }
    else {
        colorcube = clocks.greenCW(colorcube);//front
        colorcube = clocks.YellowCW(colorcube);//up
        colorcube = clocks.OrangeCW(colorcube);//right
        colorcube = clocks.YellowCCW(colorcube);//upinverse
        colorcube = clocks.OrangeCCW(colorcube);//rightinverse
        colorcube = clocks.greenCCW(colorcube);//frontinverse
        colorcube = this.checkYellow(colorcube);
        
    return colorcube;
    }
    
    }
    public int[][] yellowCross(int colorcube[][]){
        
        if(colorcube[0][3]== colorcube[0][4] && colorcube[4][1] ==colorcube [4][4] &&
                colorcube[5][7]==colorcube[5][4] && colorcube[2][4]==colorcube[2][5]){
     //       System.out.println("Color Matched");
            System.out.println("Third Step :");
            //System.out.println("***********************************");
            colorcube = this.yellowHalf(colorcube);
        }
        //adjacent
        else if (colorcube[0][3]== colorcube[0][4] && colorcube[4][1] ==colorcube [4][4]){
            colorcube= clocks.greenCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.greenCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.greenCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.greenCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
            
        }
        else if (colorcube[0][3]== colorcube[0][4]&& colorcube[5][7]==colorcube[5][4]){
            colorcube= clocks.redCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.redCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.redCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.redCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
        }
        else if (colorcube[5][7]==colorcube[5][4] && colorcube[2][4]==colorcube[2][5]){
            colorcube= clocks.blueCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.blueCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.blueCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.blueCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
        }
        else if (colorcube[4][1] ==colorcube [4][4] && colorcube[2][4]==colorcube[2][5]){
           colorcube= clocks.OrangeCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.OrangeCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.OrangeCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.OrangeCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
           
           
        }
        //opposite
        else if(colorcube[0][3]== colorcube[0][4]&& colorcube[2][4]==colorcube[2][5] )
        {
            colorcube= clocks.redCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.redCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.redCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.redCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
           
        }
        else if (colorcube[5][7]==colorcube[5][4] && colorcube[4][1] ==colorcube [4][4]){
            colorcube= clocks.greenCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.greenCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.greenCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = clocks.greenCCW(colorcube);
           colorcube= clocks.YellowCW(colorcube);
           colorcube = this.yellowCross(colorcube);
           
        }
        else {
            colorcube= clocks.YellowCW(colorcube);
            colorcube = this.yellowCross(colorcube);
        }
        
    return colorcube;
    }
    
    public int[][] yellowHalf(int colorcube[][]){
         if (
                 (colorcube[0][0] == 5 || colorcube[0][0] == 1 || colorcube[0][0] == 4)
                 
                 && (colorcube[4][0] == 5 || colorcube[4][0] == 1 || colorcube[4][0] == 4)
                 
                 && (colorcube[3][2] == 5 || colorcube[3][2] == 1 || colorcube[3][2] == 4)
                 
                 && (colorcube[4][2] == 5 || colorcube[4][2] == 3 || colorcube[4][2] == 4)
                 
                 && (colorcube[2][2] == 5 || colorcube[2][2] == 3 || colorcube[2][2] == 4)
                 
                 && (colorcube[3][0] == 5 || colorcube[3][0] == 3 || colorcube[3][0]== 4)
                 
                 && (colorcube [2][8] == 3|| colorcube[2][8]== 6|| colorcube[2][8]==4)
                 
                && (colorcube [3][6] == 3 || colorcube[3][6] == 6 || colorcube[3][6] == 4)
                 
                 && (colorcube[5][8] == 3 || colorcube [5][8] == 6 || colorcube [5][8] ==4)
                 
                 && (colorcube[3][8] == 4 || colorcube[3][8] == 1 || colorcube[3][8] ==6)
                 
                  && (colorcube[0][6] == 4 || colorcube[0][6] == 1 || colorcube[0][6]==6)
                 
                  && (colorcube[5][6] == 4 || colorcube[5][6]==1 || colorcube[5][6] ==6)
                 
                 ){
             
         //    System.out.println("Corner Color Match");
          //   System.out.println("***********************************");
             System.out.println("Fourth Step :  ");
             colorcube = this.yellowDone(colorcube);
         }
         
             
         else if ((colorcube[0][0]==5 || colorcube[0][0]==1 || colorcube[0][0]==4)
                 && (colorcube[4][0]==4 || colorcube[4][0]==1 || colorcube[4][0]==5)
                 && (colorcube[3][2]==5 || colorcube[3][2]==1 || colorcube[3][2]==4))
         {
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.OrangeCW(colorcube);
             colorcube = clocks.YellowCCW(colorcube);
             colorcube = clocks.redCCW(colorcube);
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.OrangeCCW(colorcube);
             colorcube= clocks.YellowCCW(colorcube);
             colorcube = clocks.redCW(colorcube);
             colorcube=this.yellowHalf(colorcube);
             
         }
         else if ( (colorcube[4][2]==5 || colorcube[4][2]==3 || colorcube[4][2]==4)
                 && (colorcube[2][2] == 5 || colorcube[2][2] == 3 || colorcube[2][2] == 4)
                 && (colorcube[3][0] == 5 || colorcube[3][0] == 3 || colorcube[3][0]== 4))
         {
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.blueCW(colorcube);
             colorcube = clocks.YellowCCW(colorcube);
             colorcube = clocks.greenCCW(colorcube);
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.blueCCW(colorcube);
             colorcube= clocks.YellowCCW(colorcube);
             colorcube = clocks.greenCW(colorcube);
             colorcube=this.yellowHalf(colorcube);
         }
         else if ( (colorcube [2][8] == 3|| colorcube[2][8]== 6|| colorcube[2][8]==4)
                && (colorcube [3][6] == 3 || colorcube[3][6] == 6 || colorcube[3][6] == 4)
                 && (colorcube[5][8] == 3 || colorcube [5][8] == 6 || colorcube [5][8] ==4))
         {
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.redCW(colorcube);
             colorcube = clocks.YellowCCW(colorcube);
             colorcube = clocks.OrangeCCW(colorcube);
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.redCCW(colorcube);
             colorcube= clocks.YellowCCW(colorcube);
             colorcube = clocks.OrangeCW(colorcube);
             colorcube=this.yellowHalf(colorcube);
         }
          else if ((colorcube[3][8]==4 || colorcube[3][8]==1 || colorcube[3][8] ==6)
                  && (colorcube[0][6] == 4 || colorcube[0][6] == 1 || colorcube[0][6]==6)
                  && (colorcube[5][6] == 4 || colorcube[5][6]==1 || colorcube[5][6] ==6))
          {
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.greenCW(colorcube);
             colorcube = clocks.YellowCCW(colorcube);
             colorcube = clocks.blueCCW(colorcube);
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.greenCCW(colorcube);
             colorcube= clocks.YellowCCW(colorcube);
             colorcube = clocks.blueCW(colorcube);
             colorcube=this.yellowHalf(colorcube);
          }
          else{
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.blueCW(colorcube);
             colorcube = clocks.YellowCCW(colorcube);
             colorcube = clocks.greenCCW(colorcube);
             colorcube = clocks.YellowCW(colorcube);
             colorcube = clocks.blueCCW(colorcube);
             colorcube= clocks.YellowCCW(colorcube);
             colorcube = clocks.greenCW(colorcube);
             colorcube=this.yellowHalf(colorcube);
          }
        
     return colorcube;
    }
    
     
    
     public int[][] yellowDone(int colorcube[][]){
         if (colorcube[3][0] == 4 && colorcube [3][2] == 4 && colorcube[3][6] == 4 && colorcube[3][8]==4){
            for (int i =0; i<9; i++){
                boolean check = true;
                if(colorcube[0][i]!=1){
                    check = false;
                    break;
                }
                    else if (colorcube[1][i]!=2){
                        check = false;
                        break;
                    }
                    else if (colorcube[2][i]!=3){
                        check = false;
                        break;
                    }
                else if (colorcube[3][i]!=4){
                        check = false;
                        break;
                    }
                else if (colorcube[4][i]!=5){
                        check = false;
                        break;
                    }
                else if (colorcube[5][i]!=6){
                        check = false;
                        break;
                    }
            }
            
         }
//         else {
//             boolean temp = searchYellow(colorcube);
//             if (temp == true){
//                 colorcube = clocks.YellowCW(colorcube);
//                 colorcube = this.yellowDone(colorcube);
//             }
         
         else if (colorcube[3][0] != 4){
             while(colorcube[3][0]!=4){
             colorcube = clocks.blueCCW(colorcube);
             colorcube = clocks.whiteCW(colorcube);
             colorcube = clocks.blueCW(colorcube);
             colorcube = clocks.whiteCCW(colorcube);
             }
             int i = 0;
             while(colorcube[3][0]==4 && i<4){
                 
             colorcube = clocks.YellowCW(colorcube);
             
             
             i++;
             }
             colorcube = this.yellowDone(colorcube);
         }
         else if (colorcube [3][2] != 4){
             while(colorcube [3][2] != 4){
             colorcube = clocks.OrangeCCW(colorcube);
             colorcube = clocks.whiteCW(colorcube);
             colorcube = clocks.OrangeCW(colorcube);
             colorcube = clocks.whiteCCW(colorcube);
             }
             int i = 0;
             while(colorcube[3][2]==4 && i<4){
                 
             colorcube = clocks.YellowCW(colorcube);
             
             i++;
             }
             colorcube = this.yellowDone(colorcube);
         }
         else if (colorcube[3][6] != 4){
           while(colorcube [3][6] != 4){
             colorcube = clocks.redCCW(colorcube);
             colorcube = clocks.whiteCW(colorcube);
             colorcube = clocks.redCW(colorcube);
             colorcube = clocks.whiteCCW(colorcube);
             }
             int i = 0;
             while(colorcube[3][6]==4 && i<4){
                 
             colorcube = clocks.YellowCW(colorcube);
            
             i++;
             }
             colorcube = this.yellowDone(colorcube);  
         }
         else if (colorcube [3][8] != 4){
             while(colorcube [3][8] != 4){
             colorcube = clocks.greenCCW(colorcube);
             colorcube = clocks.whiteCW(colorcube);
             colorcube = clocks.greenCW(colorcube);
             colorcube = clocks.whiteCCW(colorcube);
             }
             int i = 0;
             while(colorcube[3][8]==4 && i<4){
                 
             colorcube = clocks.YellowCW(colorcube);
             
             i++;
             }
             colorcube = this.yellowDone(colorcube);
         }
         return colorcube;
         }
         
     
     
     public boolean searchYellow(int colorcube[][]){
         for (int i=0; i<10; i+=2)
         {
             if(colorcube[3][i]==4)
                 return true;
         }
     return false;
     

}
    
}
    

