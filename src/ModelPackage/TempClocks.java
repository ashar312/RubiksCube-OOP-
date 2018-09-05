/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelPackage;

/**
 *
 * @author Lenovo
 */
public class TempClocks {
 
        public  int[][] greenCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for(int i = 0; i<=8; i++)
        {
            primaryface[i] = colorcube[0][i];
        }
        colorcube[0][2] = primaryface[0];
        colorcube[0][5] = primaryface[1];
        colorcube[0][8] = primaryface[2];
        colorcube[0][1] = primaryface[3];
        colorcube[0][4] = primaryface[4];
        colorcube[0][7] = primaryface[5];
        colorcube[0][0] = primaryface[6];
        colorcube[0][3] = primaryface[7];
        colorcube[0][6] = primaryface[8];
        
        int[] primaryOuter = new int[60];
           primaryOuter[40] = colorcube[4][0];         
           primaryOuter[43] = colorcube[4][3];        
           primaryOuter[46] = colorcube[4][6];        
           primaryOuter[10] = colorcube[1][0];       
           primaryOuter[13] = colorcube[1][3];  
           primaryOuter[16] = colorcube[1][6];   
           primaryOuter[50] = colorcube[5][0]; 
           primaryOuter[53] = colorcube[5][3];  
           primaryOuter[56] = colorcube[5][6];  
           primaryOuter[38] = colorcube[3][8];   
           primaryOuter[35] = colorcube[3][5];         
           primaryOuter[32] = colorcube[3][2];
           
           colorcube[1][0] = primaryOuter[40];
           colorcube[1][3] = primaryOuter[43];
           colorcube[1][6] = primaryOuter[46];
           colorcube[5][0] = primaryOuter[10];
           colorcube[5][3] = primaryOuter[13];
           colorcube[5][6] = primaryOuter[16];
           colorcube[3][8] = primaryOuter[50];
           colorcube[3][5] = primaryOuter[53];
           colorcube[3][2] = primaryOuter[56];
           colorcube[4][0] = primaryOuter[38];
           colorcube[4][3] = primaryOuter[35];
           colorcube[4][6] = primaryOuter[32];
           
           System.out.println();
        System.out.println("green ClockWise");
        
        return colorcube;
    }
        
    ///    
    public  int[][] greenCCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for(int i = 0; i<=8; i++)
        {
            primaryface[i] = colorcube[0][i];
        }
        colorcube[0][6] = primaryface[0];
        colorcube[0][3] = primaryface[1];
        colorcube[0][0] = primaryface[2];
        colorcube[0][7] = primaryface[3];
        colorcube[0][4] = primaryface[4];
        colorcube[0][1] = primaryface[5];
        colorcube[0][8] = primaryface[6];
        colorcube[0][5] = primaryface[7];
        colorcube[0][2] = primaryface[8];
        
        int[] primaryOuter = new int[60];
        primaryOuter[40] = colorcube[4][0];
        primaryOuter[43] = colorcube[4][3];
        primaryOuter[46] = colorcube[4][6];
        primaryOuter[50] = colorcube[5][0];
        primaryOuter[53] = colorcube[5][3];
        primaryOuter[56] = colorcube[5][6];
        primaryOuter[10] = colorcube[1][0];
        primaryOuter[13] = colorcube[1][3];
        primaryOuter[16] = colorcube[1][6];
        primaryOuter[32] = colorcube[3][2];
        primaryOuter[35] = colorcube[3][5];
        primaryOuter[38] = colorcube[3][8];
        
        
        
        colorcube[3][8] = primaryOuter[40];
        colorcube[3][5] = primaryOuter[43];
        colorcube[3][2] = primaryOuter[46];
        colorcube[4][0] = primaryOuter[10]; 
        colorcube[4][3] = primaryOuter[13];   
        colorcube[4][6] = primaryOuter[16];  
        colorcube[1][0] = primaryOuter[50];  
        colorcube[1][3] = primaryOuter[53];    
        colorcube[1][6] = primaryOuter[56];      
        colorcube[5][0] = primaryOuter[38];      
        colorcube[5][3] = primaryOuter[35]; 
        colorcube[5][6] = primaryOuter[32]; 
        System.out.println();
        System.out.println("green CounterClockWise"); 
        
        return colorcube;
    }
    public  int[][] whiteCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for(int i=0; i<=8; i++)
        {
            primaryface[i] = colorcube[1][i];
        }
        colorcube[1][2] = primaryface[0];     
        colorcube[1][5] = primaryface[1];    
        colorcube[1][8] = primaryface[2];       
        colorcube[1][1] = primaryface[3];      
        colorcube[1][4] = primaryface[4];        
        colorcube[1][7] = primaryface[5];        
        colorcube[1][0] = primaryface[6];      
        colorcube[1][3] = primaryface[7];     
        colorcube[1][6] = primaryface[8];
        
        int[] primaryOuter = new int[60];
        primaryOuter[46] = colorcube[4][6];     
        primaryOuter[47] = colorcube[4][7];
        primaryOuter[48] = colorcube[4][8];
        primaryOuter[20] = colorcube[2][0]; 
        primaryOuter[23] = colorcube[2][3];
        primaryOuter[26] = colorcube[2][6];
        primaryOuter[52] = colorcube[5][2];  
        primaryOuter[51] = colorcube[5][1];
        primaryOuter[50] = colorcube[5][0];
        primaryOuter[8] = colorcube[0][8];
        primaryOuter[5] = colorcube[0][5];  
        primaryOuter[2] = colorcube[0][2]; 
        
         colorcube[2][0] = primaryOuter[46];   
         colorcube[2][3] = primaryOuter[47]; 
         colorcube[2][6] = primaryOuter[48];  
         colorcube[5][2] = primaryOuter[20]; 
         colorcube[5][1] = primaryOuter[23];
         colorcube[5][0] = primaryOuter[26];  
         colorcube[0][8] = primaryOuter[52];
         colorcube[0][5] = primaryOuter[51]; 
         colorcube[0][2] = primaryOuter[50];
         colorcube[4][6] = primaryOuter[8]; 
         colorcube[4][7] = primaryOuter[5];
         colorcube[4][8] = primaryOuter[2]; 
         System.out.println();
         System.out.println("white ClockWise");
        
        return colorcube;
    }
    public  int[][] whiteCCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for (int i = 0; i <= 8; i++) {
            primaryface[i] = colorcube[1][i];
        }
        
        colorcube[1][6] = primaryface[0];   
        colorcube[1][3] = primaryface[1]; 
        colorcube[1][0] = primaryface[2]; 
        colorcube[1][7] = primaryface[3]; 
        colorcube[1][4] = primaryface[4];   
        colorcube[1][1] = primaryface[5];
        colorcube[1][8] = primaryface[6]; 
        colorcube[1][5] = primaryface[7]; 
        colorcube[1][2] = primaryface[8];
            
         int[] primaryOuter = new int[60];   
         primaryOuter[46] = colorcube[4][6]; 
         primaryOuter[47] = colorcube[4][7];
         primaryOuter[48] = colorcube[4][8];  
         primaryOuter[20] = colorcube[2][0];  
         primaryOuter[23] = colorcube[2][3];
         primaryOuter[26] = colorcube[2][6];
         primaryOuter[52] = colorcube[5][2];
         primaryOuter[51] = colorcube[5][1]; 
         primaryOuter[50] = colorcube[5][0];  
         primaryOuter[8] = colorcube[0][8];
         primaryOuter[5] = colorcube[0][5];  
         primaryOuter[2] = colorcube[0][2];
         
         colorcube[0][8] = primaryOuter[46];      
         colorcube[0][5] = primaryOuter[47];      
         colorcube[0][2] = primaryOuter[48];       
         colorcube[4][6] = primaryOuter[20]; 
         colorcube[4][7] = primaryOuter[23];  
         colorcube[4][8] = primaryOuter[26]; 
         colorcube[2][0] = primaryOuter[52]; 
         colorcube[2][3] = primaryOuter[51];  
         colorcube[2][6] = primaryOuter[50]; 
         colorcube[5][2] = primaryOuter[8];
         colorcube[5][1] = primaryOuter[5];   
         colorcube[5][0] = primaryOuter[2];
         
        System.out.println();
         System.out.println("white CounteClockWise");

        return colorcube;
    }
    
    public  int[][] blueCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for (int i = 0; i <=8; i++) {
           primaryface[i] = colorcube[2][i]; 
        }
        
        colorcube[2][2] = primaryface[0];   
        colorcube[2][5] = primaryface[1];   
        colorcube[2][8] = primaryface[2];   
        colorcube[2][1] = primaryface[3];  
        colorcube[2][4] = primaryface[4];   
        colorcube[2][7] = primaryface[5];  
        colorcube[2][0] = primaryface[6]; 
        colorcube[2][3] = primaryface[7];  
        colorcube[2][6] = primaryface[8]; 
        
        int[] primaryOuter = new int[60];
         primaryOuter[48] = colorcube[4][8];     
         primaryOuter[45] = colorcube[4][5];
         primaryOuter[42] = colorcube[4][2]; 
         primaryOuter[30] = colorcube[3][0]; 
         primaryOuter[33] = colorcube[3][3]; 
         primaryOuter[36] = colorcube[3][6];  
         primaryOuter[58] = colorcube[5][8];  
         primaryOuter[55] = colorcube[5][5];
         primaryOuter[52] = colorcube[5][2];   
         primaryOuter[18] = colorcube[1][8]; 
         primaryOuter[15] = colorcube[1][5];  
         primaryOuter[12] = colorcube[1][2]; 
        
         
          colorcube[3][0] = primaryOuter[48];    
          colorcube[3][3] = primaryOuter[45];  
          colorcube[3][6] = primaryOuter[42];   
          colorcube[5][8] = primaryOuter[30];  
          colorcube[5][5] = primaryOuter[33];  
          colorcube[5][2] = primaryOuter[36];  
          colorcube[1][8] = primaryOuter[58]; 
          colorcube[1][5] = primaryOuter[55]; 
          colorcube[1][2] = primaryOuter[52];  
          colorcube[4][8] = primaryOuter[18]; 
          colorcube[4][5] = primaryOuter[15];  
          colorcube[4][2] = primaryOuter[12];
        
          System.out.println();
         System.out.println("blue ClockWise");
         
        return colorcube;
    }
    
    public  int[][] blueCCW(int colorcube[][])
    {
        int[] primaryface = new int[10];
        for (int i = 0; i <=8; i++) {
            primaryface[i] = colorcube[2][i];
        }
        colorcube[2][6] = primaryface[0];  
        colorcube[2][3] = primaryface[1];  
        colorcube[2][0] = primaryface[2];  
        colorcube[2][7] = primaryface[3];  
        colorcube[2][4] = primaryface[4]; 
        colorcube[2][1] = primaryface[5]; 
        colorcube[2][8] = primaryface[6];  
        colorcube[2][5] = primaryface[7];
        colorcube[2][2] = primaryface[8];
        
          int[] primaryOuter = new int[60];       
          primaryOuter[48] = colorcube[4][8]; 
          primaryOuter[45] = colorcube[4][5];  
          primaryOuter[42] = colorcube[4][2];   
          primaryOuter[30] = colorcube[3][0]; 
          primaryOuter[33] = colorcube[3][3]; 
          primaryOuter[36] = colorcube[3][6];  
          primaryOuter[58] = colorcube[5][8];  
          primaryOuter[55] = colorcube[5][5]; 
          primaryOuter[52] = colorcube[5][2]; 
          primaryOuter[18] = colorcube[1][8];    
          primaryOuter[15] = colorcube[1][5]; 
          primaryOuter[12] = colorcube[1][2]; 
          
          colorcube[1][8] = primaryOuter[48];      
          colorcube[1][5] = primaryOuter[45];  
          colorcube[1][2] = primaryOuter[42];  
          colorcube[4][8] = primaryOuter[30];  
          colorcube[4][5] = primaryOuter[33];   
          colorcube[4][2] = primaryOuter[36];  
          colorcube[3][0] = primaryOuter[58];  
          colorcube[3][3] = primaryOuter[55];   
          colorcube[3][6] = primaryOuter[52];  
          colorcube[5][8] = primaryOuter[18];  
          colorcube[5][5] = primaryOuter[15];  
          colorcube[5][2] = primaryOuter[12];
          System.out.println();
          System.out.println("blue CounterClockWise");
        return colorcube;
    }
    
    public  int[][] YellowCW(int colorcube[][])    
    {            
        int[] primaryFace = new int[10]; 
        
        for (int i = 0; i <= 8; i++) {
            primaryFace[i] = colorcube[3][i];
        }
        colorcube[3][2] = primaryFace[0];   
        colorcube[3][5] = primaryFace[1];   
        colorcube[3][8] = primaryFace[2];   
        colorcube[3][1] = primaryFace[3];   
        colorcube[3][4] = primaryFace[4];   
        colorcube[3][7] = primaryFace[5];  
        colorcube[3][0] = primaryFace[6]; 
        colorcube[3][3] = primaryFace[7];   
        colorcube[3][6] = primaryFace[8];    
        
        int[] primaryOuter = new int[60];  
        primaryOuter[42] = colorcube[4][2];  
        primaryOuter[41] = colorcube[4][1]; 
        primaryOuter[40] = colorcube[4][0];   
        primaryOuter[00] = colorcube[0][0];   
        primaryOuter[03] = colorcube[0][3];   
        primaryOuter[06] = colorcube[0][6];    
        primaryOuter[56] = colorcube[5][6];  
        primaryOuter[57] = colorcube[5][7];   
        primaryOuter[58] = colorcube[5][8];  
        primaryOuter[28] = colorcube[2][8];   
        primaryOuter[25] = colorcube[2][5];  
        primaryOuter[22] = colorcube[2][2]; 
  
        colorcube[0][0] = primaryOuter[42];   
        colorcube[0][3] = primaryOuter[41];  
        colorcube[0][6] = primaryOuter[40];  
        colorcube[5][6] = primaryOuter[00]; 
        colorcube[5][7] = primaryOuter[03];   
        colorcube[5][8] = primaryOuter[06];   
        colorcube[2][8] = primaryOuter[56];  
        colorcube[2][5] = primaryOuter[57];  
        colorcube[2][2] = primaryOuter[58];    
        colorcube[4][2] = primaryOuter[28];  
        colorcube[4][1] = primaryOuter[25];   
        colorcube[4][0] = primaryOuter[22];    
        
        System.out.println();
        System.out.println("Yellow ClockWise");    
        return colorcube;   
    }
    
     public  int[][] YellowCCW(int colorcube[][])  
     {         //First you have to change the face parts    
         int[] primaryFace = new int[60];      
           
         for (int i = 0; i <=8; i++) {
             primaryFace[i] = colorcube[3][i];
         }
 
         
         colorcube[3][6] = primaryFace[0];   
         colorcube[3][3] = primaryFace[1]; 
         colorcube[3][0] = primaryFace[2];   
         colorcube[3][7] = primaryFace[3];   
         colorcube[3][4] = primaryFace[4]; 
         colorcube[3][1] = primaryFace[5];   
         colorcube[3][8] = primaryFace[6];  
         colorcube[3][5] = primaryFace[7];   
         colorcube[3][2] = primaryFace[8];   
            
         
         int[] primaryOuter = new int[60];   
         primaryOuter[42] = colorcube[4][2];  
         primaryOuter[41] = colorcube[4][1]; 
         primaryOuter[40] = colorcube[4][0];  
         primaryOuter[00] = colorcube[0][0];   
         primaryOuter[03] = colorcube[0][3];   
         primaryOuter[06] = colorcube[0][6];  
         primaryOuter[56] = colorcube[5][6];   
         primaryOuter[57] = colorcube[5][7];  
         primaryOuter[58] = colorcube[5][8];  
         primaryOuter[28] = colorcube[2][8];  
         primaryOuter[25] = colorcube[2][5];  
         primaryOuter[22] = colorcube[2][2];    
         
         
         colorcube[2][8] = primaryOuter[42];  
         colorcube[2][5] = primaryOuter[41];  
         colorcube[2][2] = primaryOuter[40];  
         colorcube[4][2] = primaryOuter[00]; 
         colorcube[4][1] = primaryOuter[03]; 
         colorcube[4][0] = primaryOuter[06]; 
         colorcube[0][0] = primaryOuter[56]; 
         colorcube[0][3] = primaryOuter[57];  
         colorcube[0][6] = primaryOuter[58];  
         colorcube[5][6] = primaryOuter[28];  
         colorcube[5][7] = primaryOuter[25];   
         colorcube[5][8] = primaryOuter[22]; 
            
         System.out.println();
          System.out.println("Yellow CounterClockWise");  
          return colorcube;  
     } 
     
      public  int[][] OrangeCW(int colorcube[][])   
      {  
          int[] primaryFace = new int[10];     
             
         for (int i = 0; i <=8; i++) {
              primaryFace[i] = colorcube[4][i];
              
          }
          
          colorcube[4][2] = primaryFace[0];  
          colorcube[4][5] = primaryFace[1];  
          colorcube[4][8] = primaryFace[2];    
          colorcube[4][1] = primaryFace[3];   
          colorcube[4][4] = primaryFace[4];    
          colorcube[4][7] = primaryFace[5];     
          colorcube[4][0] = primaryFace[6];  
          colorcube[4][3] = primaryFace[7];   
          colorcube[4][6] = primaryFace[8];    
            
          int[] primaryOuter = new int[60];   
          primaryOuter[32] = colorcube[3][2];    
          primaryOuter[31] = colorcube[3][1];    
          primaryOuter[30] = colorcube[3][0];   
          primaryOuter[22] = colorcube[2][2];  
          primaryOuter[21] = colorcube[2][1];    
          primaryOuter[20] = colorcube[2][0]; 
          primaryOuter[12] = colorcube[1][2]; 
          primaryOuter[11] = colorcube[1][1];  
          primaryOuter[10] = colorcube[1][0];  
          primaryOuter[02] = colorcube[0][2];  
          primaryOuter[01] = colorcube[0][1]; 
          primaryOuter[00] = colorcube[0][0]; 
          
          colorcube[2][2] = primaryOuter[32];    
          colorcube[2][1] = primaryOuter[31];  
          colorcube[2][0] = primaryOuter[30];   
          colorcube[1][2] = primaryOuter[22];  
          colorcube[1][1] = primaryOuter[21];    
          colorcube[1][0] = primaryOuter[20];     
          colorcube[0][2] = primaryOuter[12];  
          colorcube[0][1] = primaryOuter[11];   
          colorcube[0][0] = primaryOuter[10];   
          colorcube[3][2] = primaryOuter[02];   
          colorcube[3][1] = primaryOuter[01];      
          colorcube[3][0] = primaryOuter[00];  
           
          System.out.println();
          System.out.println("Orange ClockWise");  
          return colorcube;   
      }   
    public  int[][] OrangeCCW(int colorcube[][])
    {
        int[] primaryFace = new int[10];
        for (int i = 0; i <=8; i++) {
            primaryFace[i] = colorcube[4][i];
        }
        
         colorcube[4][6] = primaryFace[0];    
         colorcube[4][3] = primaryFace[1];  
         colorcube[4][0] = primaryFace[2];   
         colorcube[4][7] = primaryFace[3];  
         colorcube[4][4] = primaryFace[4];  
         colorcube[4][1] = primaryFace[5];  
         colorcube[4][8] = primaryFace[6];   
         colorcube[4][5] = primaryFace[7];   
         colorcube[4][2] = primaryFace[8];   
          
         
        int[] primaryOuter = new int[60];  
        primaryOuter[32] = colorcube[3][2];    
        primaryOuter[31] = colorcube[3][1];  
        primaryOuter[30] = colorcube[3][0]; 
        primaryOuter[22] = colorcube[2][2];   
        primaryOuter[21] = colorcube[2][1];    
        primaryOuter[20] = colorcube[2][0];  
        primaryOuter[12] = colorcube[1][2]; 
        primaryOuter[11] = colorcube[1][1];  
        primaryOuter[10] = colorcube[1][0]; 
        primaryOuter[02] = colorcube[0][2];  
        primaryOuter[01] = colorcube[0][1];  
        primaryOuter[00] = colorcube[0][0];  
        
        
        colorcube[0][2] = primaryOuter[32];  
        colorcube[0][1] = primaryOuter[31];   
        colorcube[0][0] = primaryOuter[30];   
        colorcube[3][2] = primaryOuter[22];  
        colorcube[3][1] = primaryOuter[21]; 
        colorcube[3][0] = primaryOuter[20];  
        colorcube[2][2] = primaryOuter[12]; 
        colorcube[2][1] = primaryOuter[11];  
        colorcube[2][0] = primaryOuter[10];  
        colorcube[1][2] = primaryOuter[02]; 
        colorcube[1][1] = primaryOuter[01];  
        colorcube[1][0] = primaryOuter[00];  
          
        System.out.println();
        System.out.println("Orange CounterClockWise"); 
        
        
        return colorcube;
    }
     public int[][] redCW(int colorcube[][])     
     {
         int[] primaryFace = new int[10];
         for (int i = 0; i <=8; i++) {
             primaryFace[i] = colorcube[5][i];
         }
         
         colorcube[5][2] = primaryFace[0];     
         colorcube[5][5] = primaryFace[1];     
         colorcube[5][8] = primaryFace[2];     
         colorcube[5][1] = primaryFace[3];    
         colorcube[5][4] = primaryFace[4];  
         colorcube[5][7] = primaryFace[5];    
         colorcube[5][0] = primaryFace[6];   
         colorcube[5][3] = primaryFace[7];   
         colorcube[5][6] = primaryFace[8];   
           
         int[] primaryOuter = new int[60]; 
         
         primaryOuter[16] = colorcube[1][6]; 
         primaryOuter[17] = colorcube[1][7];   
         primaryOuter[18] = colorcube[1][8];  
         primaryOuter[26] = colorcube[2][6];  
         primaryOuter[27] = colorcube[2][7];  
         primaryOuter[28] = colorcube[2][8];  
         primaryOuter[36] = colorcube[3][6];  
         primaryOuter[37] = colorcube[3][7];  
         primaryOuter[38] = colorcube[3][8]; 
         primaryOuter[6] = colorcube[0][6]; 
         primaryOuter[7] = colorcube[0][7];  
         primaryOuter[8] = colorcube[0][8];   
         
         
         colorcube[2][6] = primaryOuter[16];    
         colorcube[2][7] = primaryOuter[17];   
         colorcube[2][8] = primaryOuter[18];  
         colorcube[3][6] = primaryOuter[26];  
         colorcube[3][7] = primaryOuter[27];  
         colorcube[3][8] = primaryOuter[28];  
         colorcube[0][6] = primaryOuter[36];  
         colorcube[0][7] = primaryOuter[37];  
         colorcube[0][8] = primaryOuter[38];  
         colorcube[1][6] = primaryOuter[6];  
         colorcube[1][7] = primaryOuter[7];  
         colorcube[1][8] = primaryOuter[8];    
            
         System.out.println();
         System.out.println("red ClockWise");
         return colorcube;
     }
    public int[][] redCCW(int colorcube[][])
    {
        int[] primaryFace = new int[10];
        for (int i = 0; i <=8; i++) {
            primaryFace[i] = colorcube[5][i];
            
        }
         colorcube[5][6] = primaryFace[0];   
         colorcube[5][3] = primaryFace[1];   
         colorcube[5][0] = primaryFace[2];  
         colorcube[5][7] = primaryFace[3];  
         colorcube[5][4] = primaryFace[4];  
         colorcube[5][1] = primaryFace[5];
         colorcube[5][8] = primaryFace[6];  
         colorcube[5][5] = primaryFace[7];
         colorcube[5][2] = primaryFace[8];    
         
    
        int[] primaryOuter = new int[60];    
        primaryOuter[16] = colorcube[1][6];  
        primaryOuter[17] = colorcube[1][7];  
        primaryOuter[18] = colorcube[1][8];  
        primaryOuter[26] = colorcube[2][6];   
        primaryOuter[27] = colorcube[2][7];   
        primaryOuter[28] = colorcube[2][8];  
        primaryOuter[36] = colorcube[3][6];  
        primaryOuter[37] = colorcube[3][7];   
        primaryOuter[38] = colorcube[3][8];   
        primaryOuter[6] = colorcube[0][6];    
        primaryOuter[7] = colorcube[0][7]; 
        primaryOuter[8] = colorcube[0][8]; 
        
        colorcube[0][6] = primaryOuter[16];    
        colorcube[0][7] = primaryOuter[17];   
        colorcube[0][8] = primaryOuter[18]; 
        colorcube[1][6] = primaryOuter[26]; 
        colorcube[1][7] = primaryOuter[27];  
        colorcube[1][8] = primaryOuter[28];  
        colorcube[2][6] = primaryOuter[36];  
        colorcube[2][7] = primaryOuter[37];  
        colorcube[2][8] = primaryOuter[38];  
        colorcube[3][6] = primaryOuter[6];  
        colorcube[3][7] = primaryOuter[7];   
        colorcube[3][8] = primaryOuter[8];   
          
        System.out.println();
        System.out.println("red CounterClockWise"); 
        
        return colorcube;
    }
    
}
