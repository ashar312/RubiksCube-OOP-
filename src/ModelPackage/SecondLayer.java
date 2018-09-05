
package ModelPackage;


public class SecondLayer extends FirstLayer {
    
   // public static Clocks clocks = new Clocks();
        
 public int[][] SecondLayer(int colorcube[][])
    {

           colorcube = FirstEdge(colorcube);
   //      System.out.println("Second Layer is Done");
           
            return colorcube;
    }
 
 
     
 
 public int[][] FirstEdge(int colorcube[][])
    {
        //System.out.println("white cross");
        
        colorcube = OrangeGreenEdge(colorcube);
    //    System.out.println("First Edge is done");
        colorcube = GreenRedEdge(colorcube);
      //  System.out.println("Second Edge is done");
        colorcube = RedBlueEdge(colorcube);
     //   System.out.println("Third Edge is done");
       colorcube = BlueOrangeEdge(colorcube);
     //  System.out.println("Forth Edge is done");
        return colorcube;
    }
 
 public int[][] OrangeGreenEdge(int colorcube[][])
    {
        
        //System.out.println("white first edge");
        
        /*if(colorcube[0][1] == 1 && colorcube[4][3] == 5) (right position)
        {
            colorcube =  clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }*/
        
        if(colorcube[0][3] == 1 && colorcube[3][5] == 5)  // done
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            
        }
        /* Place already taken
        else if(colorcube[0][5] == 1 && colorcube[1][3] == 5)
        {
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
        */
        
        
        
        else if(colorcube[0][7] == 1 && colorcube[5][3] == 5) //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }
        /*else if(colorcube[1][1] ==  1 && colorcube[4][7] == 5) Place already taken
        {
            colorcube =   clocks.whiteCCW(colorcube);
        }
        else if(colorcube[1][3] == 1 && colorcube[0][5] == 5)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(colorcube[1][5] == 1 && colorcube[2][3] == 5)
        {
            colorcube =   clocks.whiteCW(colorcube);
            colorcube =   clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][7] == 1 && colorcube[5][1] == 5)
        {
            colorcube =   clocks.whiteCW(colorcube);
        }
        */
        
        else if(colorcube[2][1] == 1 && colorcube[4][5] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
            
        }
        /* else if(colorcube[2][3] == 1 && colorcube[1][5] == 5) Already taken
        {
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
*/
        
        else if(colorcube[2][5] == 1 && colorcube[3][3] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            
        }
        else if(colorcube[2][7] == 1 && colorcube[5][5] == 5) // done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[3][1] == 1 && colorcube[4][1] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }
        else if(colorcube[3][3] == 1 && colorcube[2][5] == 5)  //done
        {
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
        }
        
        else if(colorcube[3][5] == 1 && colorcube[0][3] == 5) //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
        }
        else if(colorcube[3][7] == 1 && colorcube[5][7] == 5) //done
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
        }
        else if(colorcube[4][1] == 1 && colorcube[3][1] == 5)  //done
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[4][3] == 1 && colorcube[0][1] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }
        else if(colorcube[4][5] == 1 && colorcube[2][1] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        /* Already takenelse if(colorcube[4][7] == 1 && colorcube[1][1] == 5)
        {
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[5][1] == 1 && colorcube[1][7] == 5)
        {
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
*/
        else if(colorcube[5][3] == 1 && colorcube[0][7] == 5) //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[5][5] == 1 && colorcube[2][7] == 5)  //done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
        }
        else if(colorcube[5][7] == 1 && colorcube[3][7] == 5)  //done
        {
            
           
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
                    
        }
        
        return colorcube;
    }
 
 public int [][] GreenRedEdge(int colorcube[][])
    {
     //System.out.println("white first edge");
        
        /*if(colorcube[0][1] == 1 && colorcube[4][3] == 6) Already taken
        {
            colorcube =  clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }*/
        
        if(colorcube[0][3] == 1 && colorcube[3][5] == 6)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            
        }
        /* Place already taken for first layer
        else if(colorcube[0][5] == 1 && colorcube[1][3] == 5)
        {
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
        
        
        else if(colorcube[0][7] == 1 && colorcube[5][3] == 5)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
        }
        
        else if(colorcube[1][1] ==  1 && colorcube[4][7] == 5) Place already taken
        {
            colorcube =   clocks.whiteCCW(colorcube);
        }
        else if(colorcube[1][3] == 1 && colorcube[0][5] == 5)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(colorcube[1][5] == 1 && colorcube[2][3] == 5)
        {
            colorcube =   clocks.whiteCW(colorcube);
            colorcube =   clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][7] == 1 && colorcube[5][1] == 5)
        {
            colorcube =   clocks.whiteCW(colorcube);
        }
        */
        
        else if(colorcube[2][1] == 1 && colorcube[4][5] == 6) // done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            
            
        }
        /* else if(colorcube[2][3] == 1 && colorcube[1][5] == 5) Already taken
        {
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
*/
        
        else if(colorcube[2][5] == 1 && colorcube[3][3] == 6)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            
        }
        else if(colorcube[2][7] == 1 && colorcube[5][5] == 6)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            //colorcube =   clocks.YellowCW(colorcube);
            //colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
        else if(colorcube[3][1] == 1 && colorcube[4][1] == 6)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            
        }
        else if(colorcube[3][3] == 1 && colorcube[2][5] == 6)
        {
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        
        else if(colorcube[3][5] == 1 && colorcube[0][3] == 6)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        else if(colorcube[3][7] == 1 && colorcube[5][7] == 6)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        else if(colorcube[4][1] == 1 && colorcube[3][1] == 6)
        {
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
        /*else if(colorcube[4][3] == 1 && colorcube[0][1] == 6)  already done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }*/
        else if(colorcube[4][5] == 1 && colorcube[2][1] == 6)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        /* Already taken in white layer 
        else if(colorcube[4][7] == 1 && colorcube[1][1] == 6)
        {
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[5][1] == 1 && colorcube[1][7] == 6)
        {
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
*/
        else if(colorcube[5][3] == 1 && colorcube[0][7] == 6)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        else if(colorcube[5][5] == 1 && colorcube[2][7] == 6)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
        else if(colorcube[5][7] == 1 && colorcube[3][7] == 6)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
     return colorcube;    
 }
 
 public int [][] RedBlueEdge(int colorcube[][])
    {
     //System.out.println("white first edge");
        
        /*if(colorcube[0][1] == 6 && colorcube[4][3] == 3) Already taken
        {
            colorcube =  clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }*/
        
        if(colorcube[0][3] == 6 && colorcube[3][5] == 3)  // done
        {
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }
        /* Place already taken for first layer
        else if(colorcube[0][5] == 6 && colorcube[1][3] == 3)
        {
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
        
        
        else if(colorcube[0][7] == 6 && colorcube[5][3] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
        }
        
        else if(colorcube[1][1] ==  6 && colorcube[4][7] == 3) Place already taken
        {
            colorcube =   clocks.whiteCCW(colorcube);
        }
        else if(colorcube[1][3] == 6 && colorcube[0][5] == 3)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(colorcube[1][5] == 6 && colorcube[2][3] == 3)
        {
            colorcube =   clocks.whiteCW(colorcube);
            colorcube =   clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][7] == 6 && colorcube[5][1] == 3)
        {
            colorcube =   clocks.whiteCW(colorcube);
        }
        */
        
        else if(colorcube[2][1] == 6 && colorcube[4][5] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            
        }
        /* else if(colorcube[2][3] == 6 && colorcube[1][5] == 3) Already taken
        {
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
*/
        
        else if(colorcube[2][5] == 6 && colorcube[3][3] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }
        else if(colorcube[2][7] == 6 && colorcube[5][5] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }
        else if(colorcube[3][1] == 6 && colorcube[4][1] == 3)
        {
            //colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            
        }
        else if(colorcube[3][3] == 6 && colorcube[2][5] == 3)
        {
            //colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
        }
        
        else if(colorcube[3][5] == 6 && colorcube[0][3] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            //colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
        }
        else if(colorcube[3][7] == 6 && colorcube[5][7] == 3)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
        }
        else if(colorcube[4][1] == 6 && colorcube[3][1] == 3)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }
        /*else if(colorcube[4][3] == 6 && colorcube[0][1] == 3)  already done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }*/
        else if(colorcube[4][5] == 6 && colorcube[2][1] == 3)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
        }
        /* Already taken in white layer 
        else if(colorcube[4][7] == 6 && colorcube[1][1] == 3)
        {
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[5][1] == 6 && colorcube[1][7] == 3)
        {
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
*/
        /* already done in GreenRed
        else if(colorcube[5][3] == 6 && colorcube[0][7] == 3)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
            
         Already done because it is the desired space
        else if(colorcube[5][5] == 6 && colorcube[2][7] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }*/
        else if(colorcube[5][7] == 6 && colorcube[3][7] == 3)
        {
            //colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }
     return colorcube;    
 }
 
    public int [][] BlueOrangeEdge(int colorcube[][])
    {
     //System.out.println("white first edge");
        
        /*if(colorcube[0][1] == 6 && colorcube[4][3] == 3) Already taken
        {
            colorcube =  clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }*/
        
        if(colorcube[0][3] == 3 && colorcube[3][5] == 5)
        {
            //colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
        }
        /* Place already taken for first layer
        else if(colorcube[0][5] == 6 && colorcube[1][3] == 3)
        {
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
        
        
        else if(colorcube[0][7] == 6 && colorcube[5][3] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
        }
        
        else if(colorcube[1][1] ==  6 && colorcube[4][7] == 3) Place already taken
        {
            colorcube =   clocks.whiteCCW(colorcube);
        }
        else if(colorcube[1][3] == 6 && colorcube[0][5] == 3)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(colorcube[1][5] == 6 && colorcube[2][3] == 3)
        {
            colorcube =   clocks.whiteCW(colorcube);
            colorcube =   clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][7] == 6 && colorcube[5][1] == 3)
        {
            colorcube =   clocks.whiteCW(colorcube);
        }
        */
        
        
        /*this position is the desired position
        else if(colorcube[2][1] == 3 && colorcube[4][5] == 5)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            
        }
         else if(colorcube[2][3] == 6 && colorcube[1][5] == 3) Already taken
        {
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.whiteCCW(colorcube);
        }
*/
        
        else if(colorcube[2][5] == 3 && colorcube[3][3] == 5)
        {
            //colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
        }
        
        /*Already done in RedBlueEdge
        else if(colorcube[2][7] == 6 && colorcube[5][5] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
        }*/
        else if(colorcube[3][1] == 3 && colorcube[4][1] == 5)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
        }
        else if(colorcube[3][3] == 3 && colorcube[2][5] == 5)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
        }
        
        else if(colorcube[3][5] == 3 && colorcube[0][3] == 5)
        {
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][7] == 3 && colorcube[5][7] == 5)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            //colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][1] == 3 && colorcube[3][1] == 5)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
        }
        /*else if(colorcube[4][3] == 6 && colorcube[0][1] == 3)  already done
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            
        }*/
        
        
        else if(colorcube[4][5] == 3 && colorcube[2][1] == 5)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
            
           // colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
        }
        /* Already taken in white layer 
        else if(colorcube[4][7] == 6 && colorcube[1][1] == 3)
        {
            colorcube =   clocks.OrangeCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
        }
        else if(colorcube[5][1] == 6 && colorcube[1][7] == 3)
        {
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
        }
*/
        /* already done in GreenRed
        else if(colorcube[5][3] == 6 && colorcube[0][7] == 3)
        {
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }
            
         Already done in Red Blue
        else if(colorcube[5][5] == 6 && colorcube[2][7] == 3)
        {
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.greenCCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.redCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.redCW(colorcube);
        }*/
        else if(colorcube[5][7] == 3 && colorcube[3][7] == 5)
        {
            //colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.OrangeCCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.OrangeCW(colorcube);
           // colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCW(colorcube);
            colorcube =   clocks.blueCW(colorcube);
            colorcube =   clocks.YellowCCW(colorcube);
            colorcube =   clocks.blueCCW(colorcube);
        }
     return colorcube;    
 }
}