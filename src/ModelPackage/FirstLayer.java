
package ModelPackage;


public class FirstLayer {
    
    
     
     public static Clocks clocks = new Clocks();
     public   int[][] whiteside(int colorcube[][])
    {

                
         colorcube = whiteCross(colorcube);
      //   System.out.println("White Cross is Done");
         
         colorcube = whiteCorner(colorcube);
        // System.out.println("First Layer is Done");
        
        return colorcube;
    }
    
    public   int[][] whiteCross(int colorcube[][])
    { 
        System.out.println("First Step : ");
        colorcube = whitefirstEdge(colorcube);
     //  System.out.println("First Edge is done");
    
       colorcube = whitesecondEdge(colorcube);
     //   System.out.println("Second Edge is done");
   
       
        colorcube = whitethirdEdge(colorcube);
     //   System.out.println("Third Edge is done");
     
        colorcube = whitefourthEdge(colorcube);
     //   System.out.println("Forth Edge is done");
     
        return colorcube;
    }
     
    public   int[][] whitefirstEdge(int colorcube[][])
    {
        
        //System.out.println("white first edge");
        if(colorcube[0][1] == 2 && colorcube[4][3] == 1)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[0][3] == 2 && colorcube[3][5] == 1)
        {
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[0][5] == 2 && colorcube[1][3] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[0][7] == 2 && colorcube[5][3] == 1)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][1] ==  2 && colorcube[4][7] == 1)
        {
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[1][3] == 2 && colorcube[0][5] == 1)
        {
            //this is in the right place so it doesnt need to be moved
        }
        else if(colorcube[1][5] == 2 && colorcube[2][3] == 1)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[1][7] == 2 && colorcube[5][1] == 1)
        {
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[2][1] == 2 && colorcube[4][5] == 1)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[2][3] == 2 && colorcube[1][5] == 1)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[2][5] == 2 && colorcube[3][3] == 1)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[2][7] == 2 && colorcube[5][5] == 1)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[3][1] == 2 && colorcube[4][1] == 1)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[3][3] == 2 && colorcube[2][5] == 1)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][5] == 2 && colorcube[0][3] == 1)
        {
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[3][7] == 2 && colorcube[5][7] == 1)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][1] == 2 && colorcube[3][1] == 1)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][3] == 2 && colorcube[0][1] == 1)
        {
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][5] == 2 && colorcube[2][1] == 1)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][7] == 2 && colorcube[1][1] == 1)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[5][1] == 2 && colorcube[1][7] == 1)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
        }
        else if(colorcube[5][3] == 2 && colorcube[0][7] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
        }
        else if(colorcube[5][5] == 2 && colorcube[2][7] == 1)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
        }
        else if(colorcube[5][7] == 2 && colorcube[3][7] == 1)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
        }
        
        return colorcube;
    }
    public   int[][] whitesecondEdge(int colorcube[][])
    {
        
       // System.out.println("white second edge");
        if(colorcube[0][1] == 2 && colorcube[4][3] == 5)
        {
            colorcube = clocks.OrangeCCW(colorcube);
        }
        else if(colorcube[0][3] == 2 && colorcube[3][5] == 5)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        
        else if(colorcube[0][7] == 2 && colorcube[5][3] == 5)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[1][1] == 2 && colorcube[4][7] == 5)
        {
            //this piece is in the right place
        }
        else if(colorcube[1][3] == 2 && colorcube[0][5] == 5)
        {
            //it wouldn't be here because the other picee is already in this place
        }
        else if(colorcube[1][5] == 2 && colorcube[2][3] == 5)
        {
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            
        }
        else if(colorcube[1][7] == 2 && colorcube[5][1] == 5)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[2][1] == 2 && colorcube[4][5] == 5)
        {
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][3] == 2 && colorcube[1][5] == 5)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][5] == 2 && colorcube[3][3] == 5)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][7] == 2 && colorcube[5][5] == 5)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][1] == 2 && colorcube[4][1] == 5)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][3] == 2 && colorcube[2][5] == 5)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][5] == 2 && colorcube[0][3] == 5)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][7] == 2 && colorcube[5][7] == 5)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][1] == 2 && colorcube[3][1] == 5)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][3] == 2 && colorcube[0][1] == 5)
        {
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][5] == 2 && colorcube[2][1] == 5)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][7] == 2 && colorcube[1][1] == 5)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[5][1] == 2 && colorcube[1][7] == 5)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[5][3] == 2 && colorcube[0][7] == 5)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[5][5] == 2 && colorcube[2][7] == 5)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[5][7] == 2 && colorcube[3][7] == 5)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
       
        return colorcube;
    }
    public   int[][] whitethirdEdge(int colorcube[][])
    {
       // System.out.println("white third edge");
        if(colorcube[0][1] == 2 && colorcube[4][3] == 3)
        {
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[0][3] == 2 && colorcube[3][5] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
//        else if(colorcube[0][5] == 2 && colorcube[1][3] == 3)
//        {
//            /*
//            it cant be in this place
//            because there is another piece in this place
//            */
//        }
        else if(colorcube[0][7] == 2 && colorcube[5][3] == 3)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
//        else if(colorcube[1][1] == 2 && colorcube[4][7] == 3)
//        {
//            /*
//            It cant be here because
//            there is another piece here
//            */
//        }
//        else if(colorcube[1][3] == 2 && colorcube[0][5] == 3)
//        {
//            /*
//            It cant be here because
//            there is another piece here
//            */
//        }
//        else if(colorcube[1][5] == 2 && colorcube[2][3] == 3)
//        {
//            /*
//            if it is here then it is in the right place
//            */
//        }
        else if(colorcube[1][7] == 2 && colorcube[5][1] == 3)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[2][1] == 2 && colorcube[4][5] == 3)
        {
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[2][3] == 2 && colorcube[1][5] == 3)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[2][5] == 2 && colorcube[3][3] == 3)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[2][7] == 2 && colorcube[5][5] == 3)
        {
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][1] == 2 && colorcube[4][1] == 3)
        {
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][3] == 2 && colorcube[2][5] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][5] == 2 && colorcube[0][3] == 3)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][7] == 2 && colorcube[5][7] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[4][1] == 2 && colorcube[3][1] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[4][3] == 2 && colorcube[0][1] == 3)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[4][5] == 2 && colorcube[2][1] == 3)
        {
            colorcube = clocks.blueCCW(colorcube);
        }
//        else if(colorcube[4][7] == 2 && colorcube[1][1] == 3)
//        {
//            /*
//            cant be here becaue there 
//            is already another piece here
//            */
//        }
        else if(colorcube[5][1] == 2 && colorcube[1][7] == 3)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[5][3] == 2 && colorcube[0][7] == 3)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[5][5] == 2 && colorcube[2][7] == 3)
        {
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[5][7] == 2 && colorcube[3][7] == 3)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
         
        return colorcube;
    }
    public   int[][] whitefourthEdge(int colorcube[][])
    {
       //System.out.println("white forth edge");
         if(colorcube[0][1] == 2 && colorcube[4][3] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[0][3] == 2 && colorcube[3][5] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
//        else if(colorcube[0][5] == 2 && colorcube[1][3] == 6)
//        {
//            //it wouldnt be here because there is the other piece there
//        }
        else if(colorcube[0][7] == 2 && colorcube[5][3] == 6)
        {
            colorcube = clocks.redCW(colorcube);
        }
//        else if(colorcube[1][1] == 2 && colorcube[4][7] == 6)
//        {
//            //it wouldnt be here becasue the other piece is there
//        }
//        else if(colorcube[1][3] == 2 && colorcube[0][5] == 6)
//        {
//            //it woulndt be here becasue the other piece is there
//        }
//        else if(colorcube[1][5] == 2 && colorcube[2][3] == 6)
//        {
//            //it woulnt be here becasue the other piece is there
//        }
//        else if(colorcube[1][7] == 2 && colorcube[5][1] == 6)
//        {
//            //if it is here then it is in ther ight place
//        }
        else if(colorcube[2][1] == 2 && colorcube[4][5] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
//        else if(colorcube[2][3] == 2 && colorcube[1][5] == 6)
//        {
//            //it wouldnt be here because there is already a piece there
//        }
        else if(colorcube[2][5] == 2 && colorcube[3][3] == 6)
        {
//            colorcube = clocks.whiteCCW(colorcube);
//            colorcube = clocks.blueCW(colorcube);
//            colorcube = clocks.whiteCW(colorcube);
//            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            
        }
        else if(colorcube[2][7] == 2 && colorcube[5][5] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
        }
        else if(colorcube[3][1] == 2 && colorcube[4][1] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][3] == 2 && colorcube[2][5] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);            
        }
        else if(colorcube[3][5] == 2 && colorcube[0][3] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[3][7] == 2 && colorcube[5][7] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[4][1] == 2 && colorcube[3][1] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[4][3] == 2 && colorcube[0][1] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[4][5] == 2 && colorcube[2][1] == 6)
        {
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
//        else if(colorcube[4][7] == 2 && colorcube[1][1] == 6)
//        {
//            //it wouldnt be here becaue there is already a piece here
//        }
        else if(colorcube[5][1] == 2 && colorcube[1][7] == 6)
        {
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[5][3] == 2 && colorcube[0][7] == 6)
        {
            colorcube = clocks.whiteCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
        }
        else if(colorcube[5][5] == 2 && colorcube[2][7] == 6)
        {
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        else if(colorcube[5][7] == 2 && colorcube[3][7] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.whiteCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.whiteCW(colorcube);
        }
        return colorcube;
    }
    
    
    
    public   int[][] whiteCorner(int colorcube[][])
    {
        System.out.println("Second Step : ");
        colorcube = whitefirstcorner(colorcube);
    //    System.out.println("First Corner Done");
        
        colorcube = whitesecondcorner(colorcube);
      //  System.out.println("Second Corner Done");
        colorcube = whitethirdcorner(colorcube);
      //  System.out.println("Third Corner Done");
        colorcube = whiteforthcorner(colorcube);
                
     //   System.out.println("Fourth Corner Done");
        
        return colorcube;
    }

    public   int[][] whitefirstcorner(int colorcube[][])
    {
        ///
        if(colorcube[0][0] == 2 && colorcube[4][0] == 5 && colorcube[3][2] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        ///
        else if(colorcube[0][2] == 2 && colorcube[1][0] == 5 && colorcube[4][6] == 1)
        {
//            colorcube = clocks.greenCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.greenCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.greenCCW(colorcube);
//            colorcube = clocks.greenCW(colorcube);
              colorcube = clocks.greenCCW(colorcube);
              colorcube = clocks.YellowCCW(colorcube);
              colorcube = clocks.greenCW(colorcube);
              colorcube = clocks.YellowCW(colorcube);
              colorcube = clocks.greenCCW(colorcube);
              colorcube = clocks.YellowCCW(colorcube);
              colorcube = clocks.greenCW(colorcube);
              colorcube = clocks.YellowCW(colorcube);
              
        }
        ///
        else if(colorcube[0][6] == 2 && colorcube[3][8] == 5 && colorcube[5][6] == 1)
        {
//            colorcube = clocks.whiteCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.redCCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.redCW(colorcube);
//            colorcube = clocks.whiteCW(colorcube);
              colorcube = clocks.redCW(colorcube);
              for (int i = 0; i <=2; i++) {
              colorcube = clocks.whiteCCW(colorcube);
              colorcube = clocks.redCCW(colorcube);
              colorcube = clocks.whiteCW(colorcube);
              colorcube = clocks.redCW(colorcube);
              }
        }
        ///
        else if(colorcube[0][8] == 2 && colorcube[5][0] == 5 && colorcube[1][6] == 1)
        {
//            colorcube = clocks.redCCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.redCW(colorcube);
//            colorcube = clocks.whiteCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.redCCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.redCW(colorcube);
//            colorcube = clocks.whiteCW(colorcube);
             for (int i = 0; i <=2; i++) {
              colorcube = clocks.whiteCCW(colorcube);
              colorcube = clocks.redCCW(colorcube);
              colorcube = clocks.whiteCW(colorcube);
              colorcube = clocks.redCW(colorcube);
             }
            
        }
       
        ///
        else if(colorcube[1][2] == 2 && colorcube[2][0] == 5 && colorcube[4][8] == 1)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        ///
        else if(colorcube[1][6] == 2 && colorcube[0][8] == 5 && colorcube[5][0] == 1)
        {
//            colorcube = clocks.redCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.redCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.greenCCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.greenCW(colorcube);
              for (int i = 0; i <=4; i++) {
               colorcube = clocks.whiteCCW(colorcube);
               colorcube = clocks.redCCW(colorcube);
               colorcube = clocks.whiteCW(colorcube);
               colorcube = clocks.redCW(colorcube);
              }
              
        }
        ///
        else if(colorcube[1][8] == 2 && colorcube[5][2] == 5 && colorcube[2][6] == 1)
        {
//            colorcube = clocks.blueCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.blueCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.YellowCCW(colorcube);
//            colorcube = clocks.greenCCW(colorcube);
//            colorcube = clocks.YellowCW(colorcube);
//            colorcube = clocks.greenCW(colorcube);
              colorcube = clocks.redCCW(colorcube);
              for (int i = 0; i <=2; i++) {
               colorcube = clocks.whiteCCW(colorcube);
               colorcube = clocks.redCCW(colorcube);
               colorcube = clocks.whiteCW(colorcube);
               colorcube = clocks.redCW(colorcube);
              }
            
        }
        else if(colorcube[1][8] == 2 && colorcube[5][2] == 5 && colorcube[2][6] == 1)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        
        else if(colorcube[2][2] == 2 && colorcube[3][0] == 5 && colorcube[4][2] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[2][6] == 2 && colorcube[1][8] == 5 && colorcube[5][2] == 1)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);      
        }
        else if(colorcube[2][8] == 2 && colorcube[5][8] == 5 && colorcube[3][6] == 1)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[3][0] == 2 && colorcube[4][2] == 5 && colorcube[2][2] == 1)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[3][2] == 2 && colorcube[0][0] == 5 && colorcube[4][0] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[3][6] == 2 && colorcube[2][8] == 5 && colorcube[5][8] == 1)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);   
        }
        else if(colorcube[3][8] == 2 && colorcube[5][6] == 5 && colorcube[0][6] == 1)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][0] == 2 && colorcube[3][2] == 5 && colorcube[0][0] == 1)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][2] == 2 && colorcube[2][2] == 5 && colorcube[3][0] == 1)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][6] == 2 && colorcube[0][2] == 5 && colorcube[1][0] == 1)
        {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[4][8] == 2 && colorcube[1][2] == 5 && colorcube[2][0] == 1)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[5][0] == 2 && colorcube[1][6] == 5 && colorcube[0][8] == 1)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[5][2] == 2 && colorcube[2][6] == 5 && colorcube[1][8] == 1)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }
        else if(colorcube[5][6] == 2 && colorcube[0][2] == 5 && colorcube[1][0] == 1)
        {
           // colorcube = clocks.YellowCCW(colorcube);
            for (int i = 0; i <=3; i++) {
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            }
        }
        else if(colorcube[5][8] == 2 && colorcube[3][6] == 5 && colorcube[2][8] == 1)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.greenCW(colorcube);
        }  
        
        return colorcube;
    }
    public   int[][] whitesecondcorner(int colorcube[][])
    {
        if(colorcube[0][0] == 2 && colorcube[4][0] == 1 && colorcube[3][2] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        // 02 is where the white orange green is
        else if(colorcube[0][6] == 2 && colorcube[3][8] == 1 && colorcube[5][6] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[0][8] == 2 && colorcube[5][0] == 1 && colorcube[1][6] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[1][2] == 2 && colorcube[2][0] == 1 && colorcube[4][8] == 6)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[1][6] == 2 && colorcube[0][8] == 1 && colorcube[5][0] == 6)
        {
            //this is the place it should be in so its fine
        }
        else if(colorcube[1][8] == 2 && colorcube[5][2] == 1 && colorcube[2][6] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[2][0] == 2 && colorcube[4][8] == 1 && colorcube[1][2] == 6)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[2][2] == 2 && colorcube[3][0] == 1 && colorcube[4][2] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[2][6] == 2 && colorcube[1][8] == 1 && colorcube[5][2] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[3][0] == 2 && colorcube[4][2] == 1 && colorcube[2][2] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[3][2] == 2 && colorcube[0][0] == 1 && colorcube[4][0] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[3][6] == 2 && colorcube[2][8] == 1 && colorcube[5][8] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[3][8] == 2 && colorcube[5][6] == 1 && colorcube[0][6] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        //for 46 there is already something there
        else if(colorcube[4][0] == 2 && colorcube[3][2] == 1 && colorcube[0][0] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[4][2] == 2 && colorcube[2][2] == 1 && colorcube[3][0] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[4][8] == 2 && colorcube[1][2] == 1 && colorcube[2][0] == 6)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[5][0] == 2 && colorcube[1][6] == 1 && colorcube[0][8] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[5][2] == 2 && colorcube[2][6] == 1 && colorcube[1][8] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[5][6] == 2 && colorcube[0][6] == 1 && colorcube[3][8] == 6)
        {
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        else if(colorcube[5][8] == 2 && colorcube[3][6] == 1 && colorcube[2][8] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.redCW(colorcube);
        }
        return colorcube;
    }
    public   int[][] whitethirdcorner(int colorcube[][])
    {
        if(colorcube[0][0] == 2 && colorcube[4][0] == 5 && colorcube[3][2] == 3)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        //wont be here because it is already taken
        else if(colorcube[0][6] == 2 && colorcube[5][6] == 5 && colorcube[3][8] == 3)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        
        //wont be here because 08 is already take
        // wint be here because 10 is already taken
        //if it is here then it is in the right place
        //wont be here because 16 is already taken
        else if(colorcube[1][8] == 2 && colorcube[2][6] == 5 && colorcube[5][2] == 3)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][0] == 2 && colorcube[1][2] == 5 && colorcube[4][8] == 3)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][2] == 2 && colorcube[4][2] == 5 && colorcube[3][0] == 3)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[2][6] == 2 && colorcube[5][2] == 5 && colorcube[1][8] == 3)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
        }
        else if(colorcube[2][8] == 2 && colorcube[3][6] == 5 && colorcube[5][8] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][0] == 2 && colorcube[2][2] == 5 && colorcube[4][2] == 3)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][2] == 2 && colorcube[4][0] == 5 && colorcube[0][0] == 3)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][6] == 2 && colorcube[5][8] == 5 && colorcube[2][8] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[3][8] == 2 && colorcube[0][6] == 5 && colorcube[5][6] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][0] == 2 && colorcube[0][0] == 5 && colorcube[3][2] == 3)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[4][2] == 2 && colorcube[3][0] == 5 && colorcube[2][2] == 3)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
       /////// 
        else if(colorcube[4][6] == 2 && colorcube[1][0] == 5 && colorcube[0][2] == 3)
                {
//                    colorcube = clocks.OrangeCCW(colorcube);
//                    colorcube = clocks.YellowCCW(colorcube);
//                    colorcube = clocks.OrangeCW(colorcube);
//                    colorcube = clocks.YellowCW(colorcube);
//                    colorcube = clocks.OrangeCCW(colorcube);
//                    colorcube = clocks.OrangeCCW(colorcube);
//                    colorcube = clocks.OrangeCW(colorcube);
//                    colorcube = clocks.YellowCW(colorcube);
                
                    colorcube = clocks.greenCCW(colorcube);
                    colorcube = clocks.YellowCCW(colorcube);
                    colorcube = clocks.greenCW(colorcube);
                    for (int i = 0; i <=2; i++) {
                    colorcube = clocks.OrangeCCW(colorcube);
                    colorcube = clocks.YellowCCW(colorcube);
                    colorcube = clocks.OrangeCW(colorcube);
                    colorcube = clocks.YellowCW(colorcube);
                        
                    }
                    
                }
        
        else if(colorcube[5][2] == 2 && colorcube[1][8] == 5 && colorcube[2][6] == 3)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[5][6] == 2 && colorcube[3][8] == 5 && colorcube[0][6] == 3)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        else if(colorcube[5][8] == 2 && colorcube[2][8] == 5 && colorcube[3][6] == 3)
        {
            colorcube = clocks.OrangeCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.OrangeCW(colorcube);
        }
        
        return colorcube;
    }
    public   int[][] whiteforthcorner(int colorcube[][])
    {
        if(colorcube[0][0] == 2 && colorcube[3][2] == 3 && colorcube[4][0] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        //it wont be at 02 because there is already a picec there
        else if(colorcube[0][6] == 2 && colorcube[5][6] == 3 && colorcube[3][8] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        //it wouldnt be at 08 becuase there is already a piece there
        //10 piece already there
        //12 piece alrady there
        //16 piece already there
        //18 if it is there it is in the right place
        //20 cant becuase there is a piece already there
        else if(colorcube[2][2] == 2 && colorcube[4][2] == 3 && colorcube[3][0] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[2][6] == 2 && colorcube[5][2] == 3 && colorcube[1][8] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[2][8] == 2 && colorcube[3][6] == 3 && colorcube[5][8] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[3][0] == 2 && colorcube[2][2] == 3 && colorcube[4][2] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[3][2] == 2 && colorcube[4][0] == 3 && colorcube[0][0] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[3][6] == 2 && colorcube[5][8] == 3 && colorcube[2][8] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[3][8] == 2 && colorcube[0][6] == 3 && colorcube[5][6] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[4][0] == 2 && colorcube[0][0] == 3 && colorcube[3][2] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[4][2] == 2 && colorcube[2][2] == 3 && colorcube[3][0] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        //50 is already taken by another poiece 
        else if(colorcube[5][2] == 2 && colorcube[1][8] == 3 && colorcube[2][6] == 6)
        {
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[5][6] == 2 && colorcube[3][8] == 3 && colorcube[0][6] == 6)
        {
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        else if(colorcube[5][8] == 2 && colorcube[2][8] == 3 && colorcube[3][6] == 6)
        {
            colorcube = clocks.YellowCCW(colorcube);
            colorcube = clocks.blueCCW(colorcube);
            colorcube = clocks.YellowCW(colorcube);
            colorcube = clocks.blueCW(colorcube);
        }
        return colorcube;
    }
    
}