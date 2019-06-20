/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final03;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NCB03 {
    public void imprimir(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    public int[][] ejer1(int dimen, int NumInit){
       System.out.println("Ejercicio 1: ");
        int[][] matriz=new int[dimen][dimen];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimen-i){
                matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+i;
               }else{
                 matriz[i][j]=-1;
                }
            }
        }
        return matriz;
    
    }
    public int[][] ejer2(int dimen, int NumInit){
        System.out.println("Ejercicio 2: ");
        int[][] matriz=new int[dimen][dimen];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimen-i){
                matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+j;
               }else{
                 matriz[i][j]=-1;
                }
            }
        }
        return matriz;
    
    }
    public int[][] ejer3(int dimen, int NumInit){
         System.out.println("Ejercicio 3: ");
          int[][] matriz=new int[dimen][dimen];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimen-i){
                if((i+j)%2==0){
                    matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+j;
                }else{
                    matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+i;
                }
               }else{
                 matriz[i][j]=-1;
                }
            }
        }
        return matriz;
    }
    public int[][] ejer4(int dimen, int NumInit){
         System.out.println("Ejercicio 4: ");
          int[][] matriz=new int[dimen][dimen];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimen-i){
                if((i+j)%2==0){
                    matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+i;
                }else{
                    matriz[i][j]=NumInit+(i+j)*(i+j+1)/2+j;
                }
               }else{
                 matriz[i][j]=-1;
                }
            }
        }
        return matriz;
    }
     public int[][] ejer5(int dimen, int NumInit){
         System.out.println("Ejercicio 5: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[i][j]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer6(int dimen, int NumInit){
          System.out.println("Ejercicio 6: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     }
         public int[][] ejer7(int dimen, int NumInit){
         System.out.println("Ejercicio 7: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                   if (j<dimen-i){
                       matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
         public int[][] ejer8(int dimen, int NumInit){
         System.out.println("Ejercicio 8: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                   if (j>=i){
                       matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer9(int dimen, int NumInit){
          System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }    
    public int[][] ejer10(int dimen, int NumInit){
          System.out.println("Ejercicio 10: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j<=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }      
     public int[][] ejer11(int dimen, int NumInit){
          System.out.println("Ejercicio 11: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j<=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     } 
     public int[][] ejer12(int dimen, int NumInit){
          System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
     public int[][] ejer13(int dimen, int NumInit){
          System.out.println("Ejercicio 13: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
          for (int j = 0; j < matriz.length ; j++) {
                  if (j<dimen-i){
                      matriz[j][i] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
         public int[][] ejer14(int dimen, int NumInit){
          System.out.println("Ejercicio 14: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
          for (int j = 0; j < matriz.length ; j++) {
              if (j<=i){
                      matriz[j][i] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[j][i]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
       public int[][] ejer15(int dimen, int NumInit){
          System.out.println("Ejercicio 15: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
        for (int j = matriz[0].length-1; j>=0; j--) {
              if (j>=i){
                      matriz[j][i] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[j][i]=-1;
                }
            } contador=0;
        }
          return matriz;
     }  
     public int[][] ejer16(int dimen, int NumInit){
         System.out.println("Ejercicio 16: ");
          int[][] matriz=new int[dimen][dimen];
          int contador=0;
           for (int i = 0; i < matriz.length ; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[j][i]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[j][i]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer17(int dimen, int NumInit){
         System.out.println("Ejercicio 17: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int j = matriz[0].length-1; j>=0; j--) {
          for (int i = 0; i < matriz.length ; i++) {
                if(contador<=j){
                    matriz[i][j]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer18(int dimen, int NumInit){
         System.out.println("Ejercicio 18: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = matriz[0].length-1; i>=0; i--) {
          for (int j = 0; j < matriz.length ; j++) {
                if(j<dimen-i){
                    matriz[j][i]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer19(int dimen, int NumInit){
         System.out.println("Ejercicio 19: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
         for (int i = matriz[0].length-1; i>=0; i--) {
          for (int j = matriz[0].length-1; j>=0; j--) {
                if(j>=dimen-(i+1)){
                    matriz[j][i]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer20(int dimen, int NumInit){
         System.out.println("Ejercicio 20: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
         for (int i = matriz[0].length-1; i>=0; i--) {
          for (int j = matriz[0].length-1; j>=0; j--) {
                if(j>=i){
                    matriz[j][i]=NumInit;
                    NumInit++;
                    contador++;
                }else{
                matriz[j][i]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
     public int[][] ejer21(int dimen, int NumInit){
         System.out.println("Ejercicio 21: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
         for (int i = 0; i < matriz.length ; i++) {
                if(contador%2==0){
         for (int j = 0; j< matriz.length ; j ++) {
                    matriz[j][i]=NumInit;
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = matriz[0].length-1; j>=0; j--) {
                matriz[j][i]=NumInit ;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     public int[][] ejer22(int dimen, int NumInit){
         System.out.println("Ejercicio 22: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
         for (int i = 0; i < matriz.length ; i++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) {
                    matriz[j][i]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = 0; j< matriz.length ; j ++) {
                matriz[j][i]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     public int[][] ejer23(int dimen, int NumInit){
         System.out.println("Ejercicio 23: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = matriz[0].length-1; i>=0; i--) {
                if(contador%2==0){
                    for (int j = 0; j< matriz.length ; j ++) {
                    matriz[j][i]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = matriz[0].length-1; j>=0; j--) {
                matriz[j][i]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     public int[][] ejer24(int dimen, int NumInit){
         System.out.println("Ejercicio 24: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = matriz[0].length-1; i>=0; i--) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) {
                    matriz[j][i]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = 0; j< matriz.length ; j ++) {
                matriz[j][i]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
      public int[][] ejer25(int dimen, int NumInit){
         System.out.println("Ejercicio 25: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = 0; j< matriz.length ; j ++) {
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
              for (int j = matriz[0].length-1; j>=0; j--) {  
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
      public int[][] ejer26(int dimen, int NumInit){
         System.out.println("Ejercicio 26: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) { 
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
               for (int j = 0; j< matriz.length ; j ++) {
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     public int[][] ejer27(int dimen, int NumInit){
        System.out.println("Ejercicio 27: ");
    int cont=0; int[][] matriz=new int[dimen][dimen];
        for (int i = matriz.length-1; i >=0 ; i--) {
            if (cont%2==0){
                for (int j = matriz[0].length-1;j >=0; j--) {
            matriz[i][j]=NumInit;
             NumInit++;
         }
   
         }else{
                 for (int j = 0 ; j < matriz[0].length; j++) {
            matriz[i][j]=NumInit;
            NumInit++;
        }
      }
          cont++;   
   }
     return matriz;
  }
    public int[][] ejer28(int dimen, int NumInit){
        System.out.println("Ejercicio 28: ");
    int cont=0; int[][] matriz=new int[dimen][dimen];
        for (int i = matriz.length-1; i >=0 ; i--) {
            if (cont%2==0){
        for (int j = 0 ; j < matriz[0].length; j++) {
            matriz[i][j]=NumInit;
            NumInit++;
        }
         }else{    
         for (int j = matriz[0].length-1;j >=0; j--) {
            matriz[i][j]=NumInit;
             NumInit++;
         }
      }
          cont++;   
   }
     return matriz;
  } 
 public int[][] ejer29(int dimen, int NumInit){
     System.out.println("Ejercicio 29: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
               
            for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
            
            for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
            for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
            } 
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
 public int[][] ejer30(int dimen, int NumInit){
     System.out.println("Ejercicio 30: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
             for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
             for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
           for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
           }
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
 public int[][] ejer31(int dimen, int NumInit){
     System.out.println("Ejercicio 31: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
            for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
            for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
            } 
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
            for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
        } 
       if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
  public int[][] ejer32(int dimen, int NumInit){
     System.out.println("Ejercicio 32: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
            for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
            } 
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
              for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            } 
            for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
   public int[][] ejer33(int dimen, int NumInit){
     System.out.println("Ejercicio 33: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
            
            for (int lix = dimen-c-1;lix >= c; lix--) {
                matriz[c][lix]= NumInit;
                NumInit++;
            }            
            
            for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx+1][c]= NumInit;
                NumInit++;   
            }
            
            for (int lsx = c+1; lsx <= dimen-c-1; lsx++) {
                matriz[dimen-c-1][lsx]= NumInit;
             NumInit++;   
            }
                         
            for (int lxx = dimen-c-2;lxx > c; lxx--) {
                matriz[lxx][dimen-c-1]= NumInit;
                NumInit++;  
            } 
        } 
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
   public int[][] ejer34(int dimen, int NumInit){
     System.out.println("Ejercicio 34: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
           for (int lsx = c; lsx <= dimen-c-1; lsx++) {
                matriz[lsx][c]= NumInit;
             NumInit++;   
            }
            for (int ldx = c+1;ldx <= dimen-c-1; ldx++) {
                matriz[dimen-1-c][ldx]= NumInit;
                NumInit++;   
            }
             for (int lix = dimen-c-1;lix >= c; lix--) {
                matriz[lix][dimen-1-c]= NumInit;
                NumInit++;
            }
             for (int lxx = dimen-c-2;lxx > c; lxx--) {
                matriz[c][lxx]= NumInit;
                NumInit++;  
            }  
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        return matriz;
 }      
   public int[][] ejer35(int xy, int NumInit){
     System.out.println("Ejercicio 35: ");
        int matriz[][] = new int[xy][xy];
        int x,x1,x2,y,y1;
        
        for (x =matriz.length-1;x>=matriz.length/2; x --) {
           for (y =(xy-1)-x ;y<=x;y++) {
               matriz[x][y] = NumInit++;
            }
           for (x1 =y-2;x1>=(xy-1)-x; x1 --) {
               matriz[x1][x]=NumInit++;
           }
            for (y1=y-2; y1>=(xy-1)-x;y1--) {
               matriz[x1+1][y1]=NumInit++; 
            }
            for (x2=y1+2;x2<y-1;x2++){
                matriz[x2][y1+1]=NumInit++;
            }
         }
          return matriz;
   }
       
      public int[][] ejer38(int dimen, int NumInit){
     System.out.println("Ejercicio 38: ");
        int[][] matriz=new int[dimen][dimen];
        for (int prin = 0; prin < dimen/2; prin++) {
            for (int ldx = dimen-prin-1;ldx > prin; ldx--) {
                matriz[ldx][dimen-prin-1]= NumInit;
                NumInit++;
            }
            for (int lsx = dimen-prin-1;lsx > prin; lsx--) {
                matriz[prin][lsx]= NumInit;
                NumInit++;  
            } 
            for (int lxx = prin; lxx < dimen-prin-1; lxx++) {
                matriz[lxx][prin]= NumInit;
             NumInit++;   
            }
            for (int lix = prin;lix < dimen-prin-1; lix++) {
                matriz[dimen-prin-1][lix]= NumInit;
                NumInit++;   
            }
        } 
       if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }   
                
 public int[][] ejer36(int dimen, int NumInit){
     System.out.println("Ejercicio 36: ");
        int[][] matriz=new int[dimen][dimen];
        for (int prin = 0; prin < dimen/2; prin++) {
            for (int ldx = dimen-prin-1;ldx > prin; ldx--) {
                matriz[ldx][dimen-prin-1]= NumInit;
                NumInit++;
            }
            for (int lsx = dimen-prin-1;lsx > prin; lsx--) {
                matriz[prin][lsx]= NumInit;
                NumInit++;  
            } 
            for (int lxx = prin; lxx < dimen-prin-1; lxx++) {
                matriz[lxx][prin]= NumInit;
             NumInit++;   
            }
            for (int lix = prin;lix < dimen-prin-1; lix++) {
                matriz[dimen-prin-1][lix]= NumInit;
                NumInit++;   
            }
        } 
       if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }         
    public static void main(String[] args) {
               Scanner o=new Scanner(System.in);
               NCB03 or=new NCB03();
               System.out.println("Ingrese la dimencion de la matriz: ");
               int din=o.nextInt();
               System.out.println("Ingrese el numero de inicio: ");
               int ini=o.nextInt();
               System.out.println("\n");
               or.imprimir(or.ejer1(din, ini));
               or.imprimir(or.ejer2(din, ini));
               or.imprimir(or.ejer3(din, ini));
               or.imprimir(or.ejer4(din, ini));
               or.imprimir(or.ejer5(din, ini));
               or.imprimir(or.ejer6(din, ini));
               or.imprimir(or.ejer7(din, ini));
               or.imprimir(or.ejer8(din, ini));
               or.imprimir(or.ejer9(din, ini));
               or.imprimir(or.ejer10(din, ini));
               or.imprimir(or.ejer11(din, ini));
               or.imprimir(or.ejer12(din, ini));
               or.imprimir(or.ejer13(din, ini));
               or.imprimir(or.ejer14(din, ini));
               or.imprimir(or.ejer15(din, ini));
               or.imprimir(or.ejer16(din, ini));
               or.imprimir(or.ejer17(din, ini));
               or.imprimir(or.ejer18(din, ini));
               or.imprimir(or.ejer19(din, ini));
               or.imprimir(or.ejer20(din, ini));
               or.imprimir(or.ejer21(din, ini));
               or.imprimir(or.ejer22(din, ini));
               or.imprimir(or.ejer23(din, ini));
               or.imprimir(or.ejer24(din, ini));
               or.imprimir(or.ejer25(din, ini));
               or.imprimir(or.ejer26(din, ini));
               or.imprimir(or.ejer27(din, ini));
               or.imprimir(or.ejer28(din, ini));
               or.imprimir(or.ejer29(din, ini));
               or.imprimir(or.ejer30(din, ini));
               or.imprimir(or.ejer31(din, ini));
               or.imprimir(or.ejer32(din, ini));
               or.imprimir(or.ejer33(din, ini));
               or.imprimir(or.ejer34(din, ini));
               or.imprimir(or.ejer35(din, ini));
               or.imprimir(or.ejer36(din, ini));

    }
    
}
