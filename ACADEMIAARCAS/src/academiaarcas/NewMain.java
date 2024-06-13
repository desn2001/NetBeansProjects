/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACADEMIAARCAS;

import ACADEMIAARCAS.*;

/**
 *
 * @author Usuario
 */
public class NewMain {
  
  // Valores iniciales
  static final int BMcQ = 30; //BIO/MAT/QUI
  static final int DFM = 10; //DIT/FIS/MAT
  static final int McQT = 7; //MAT/QUI/TEI
  static final int FMcQ = 6; //FIS/MAT/QUI
  static final int DMcT = 6; //DIT/MAT/TEI
  static final int BDMc = 1; //BIO/DIT/MAT
  static final int BMsQ = 1; //BIO/MCS/QUI
  static final int DMcQ = 1; //DIT/MAT/QUI
  static final int FMcT = 2; //FIS/MAT/TEI
  static final int MsQT = 1; //MCS/QUI/TEI
  
  // Resultados
  static int BIO_1, QUI_1, MAT_1, MCS_1, DIT_1; 
  static int BIO_2, QUI_2, MAT_2, MCS_2, FIS_2; 
  static int BIO_3, QUI_3, MAT_3, MCS_3, TEI_3; 
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    if(true) {
      System.out.println("Número de alumnos por materia:");
      System.out.println("MAT = " + (BMcQ+DFM+McQT+FMcQ+DMcT+BDMc+0*BMsQ+DMcQ+FMcT+0*MsQT));
      System.out.println("MCS = " + (0*BMcQ+0*DFM+0*McQT+0*FMcQ+0*DMcT+0*BDMc+BMsQ+0*DMcQ+0*FMcT+MsQT));
      System.out.println("BIO = " + (BMcQ+0*DFM+0*McQT+0*FMcQ+0*DMcT+BDMc+BMsQ+0*DMcQ+0*FMcT+0*MsQT));
      System.out.println("QUI = " + (BMcQ+0*DFM+McQT+FMcQ+0*DMcT+0*BDMc+BMsQ+DMcQ+0*FMcT+MsQT));
      System.out.println("DIT = " + (0*BMcQ+DFM+0*McQT+0*FMcQ+DMcT+BDMc+0*BMsQ+DMcQ+0*FMcT+0*MsQT));
      System.out.println("FIS = " + (0*BMcQ+DFM+0*McQT+FMcQ+0*DMcT+0*BDMc+0*BMsQ+0*DMcQ+FMcT+0*MsQT));
      System.out.println("TEI = " + (0*BMcQ+0*DFM+McQT+0*FMcQ+DMcT+0*BDMc+0*BMsQ+0*DMcQ+FMcT+MsQT));
      System.out.println("");
    }
    
   
    //Combinaciones
    if (true) {
    int x, s;
    // Contadores
    long contador = 0;
    int cBIO1=0, cMAT1 = 0, cQUI1=0;
    int cBIO2=0, cMAT2 = 0, cQUI2=0;
    int cBIO3=0, cMAT3 = 0, cQUI3=0;
    int cBIO12 = 0, cBIO13 = 0, cBIO23 = 0;
    int cMAT12 = 0, cMAT13 = 0, cMAT23 = 0;
    int cQUI12 = 0, cQUI13 = 0, cQUI23 = 0;
    int b12_q12=0, b12_q13=0, b12_q23=0;
    int b13_q12=0, b13_q13=0, b13_q23=0;
    int b23_q12=0, b23_q13=0, b23_q23=0;
    int b012_q12=0, b012_q13=0, b012_q23=0;
    int b013_q12=0, b013_q13=0, b013_q23=0;
    
    //Booleanos
    boolean matBool, bioBool12, bioBool13, bioBool23, quiBool12, quiBool13, quiBool23;
    
    System.out.printf("%10s | %3s %3s %3s %3s %3s | %3s %3s %3s %3s %3s | %3s %3s %3s %3s %3s |%n", "contador",
                                            "BIO", "QUI", "MAT", "MCS", "DIT",
                                            "BIO", "QUI", "MAT", "MCS", "FIS",
                                            "BIO", "QUI", "MAT", "MCS", "TEI"
    );
    for(int x1 = 0; x1<= BMcQ; x1++) {
      for(int x2 = 0; x2<= BMcQ - x1; x2++) {
        for(int x3 = 0; x3<= BMcQ - x1 - x2; x3++) {
          for(int x4 = 0; x4<= BMcQ - x1 -  x2 - x3; x4++) {
            for(int x5 = 0; x5<= BMcQ - x1 - x2 - x3 - x4; x5++) {
              for(int y=0; y<=McQT; y++) {
                for(int z=0; z<=FMcQ; z++) {
                  for(int s1 = 0; s1<= BMsQ; s1++) {
                    for(int s2 = 0; s2<= BMsQ - s1; s2++) {
                      for(int s3 = 0; s3<= BMsQ - s1 - s2; s3++) {
                        for(int s4 = 0; s4<= BMsQ - s1 -  s2 - s3; s4++) {
                          for(int s5 = 0; s5<= BMsQ - s1 - s2 - s3 - s4; s5++) {
                            for(int u=0; u<=BDMc; u++) {
                              for(int v=0; v<=DMcQ; v++) {
                                for(int w=0; w<=MsQT; w++) {
                                  contador++;
                                  ecuaciones(x1, x2, x3, x4, x5, y, z, s1, s2, s3, s4, s5, u, v, w);
                                  // 1ªs Condiciones
                                  if (true) {
                                      if (BIO_1==0) cBIO1++; if (BIO_2==0) cBIO2++; if (BIO_3==0) cBIO3++;
                                      if (MAT_1==0) cMAT1++; if (MAT_2==0) cMAT2++; if (MAT_3==0) cMAT3++;
                                      if (QUI_1==0) cQUI1++; if (QUI_2==0) cQUI2++; if (QUI_3==0) cQUI3++;
                                      if (BIO_1==0 && BIO_2==0) cBIO12++;
                                      if (BIO_1==0 && BIO_3==0) cBIO13++;
                                      if (BIO_2==0 && BIO_3==0) cBIO23++;
                                      if (MAT_1==0 && MAT_2==0) cMAT12++;
                                      if (MAT_1==0 && MAT_3==0) cMAT13++;
                                      if (MAT_2==0 && MAT_3==0) cMAT23++;
                                      if (QUI_1==0 && QUI_2==0) cQUI12++;
                                      if (QUI_1==0 && QUI_3==0) cQUI13++;
                                      if (QUI_2==0 && QUI_3==0) cQUI23++;
                                  }// 1ªs Condiciones
                                  // Condiciones MAT, QUI y BIO
                                  if (true) {
                                      matBool = MAT_1==2 && Math.abs(MAT_2-MAT_3)==5; 
                                      bioBool12 = Math.abs(BIO_1-BIO_2)<10 && BIO_3==0;
                                      bioBool13 = Math.abs(BIO_1-BIO_3)<10 && BIO_2==0;
                                      bioBool23 = Math.abs(BIO_2-BIO_3)<10 && BIO_1==0;
                                      quiBool12 = Math.abs(QUI_1-QUI_2)<10 && QUI_3==0;
                                      quiBool13 = Math.abs(QUI_1-QUI_3)<10 && QUI_2==0;
                                      quiBool23 = Math.abs(QUI_2-QUI_3)<10 && QUI_1==0;

                                      if(matBool && bioBool12 && quiBool12)
                                        b12_q12++;
                                      if(matBool && bioBool12 && quiBool13) {
                                        b12_q13++;
    //                                    System.out.printf("%09d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
    //                                            BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
    //                                            BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
    //                                            BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }  
                                      if(matBool && bioBool12 && quiBool23)
                                        b12_q23++;
                                      if(matBool && bioBool13 && quiBool12) {
                                        b13_q12++;
                                        System.out.printf("%010d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
                                                BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
                                                BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
                                                BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }
                                      if(matBool && bioBool13 && quiBool13) {
                                        b13_q13++;
    //                                    System.out.printf("%09d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
    //                                            BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
    //                                            BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
    //                                            BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }  
                                      if(matBool && bioBool13 && quiBool23)
                                        b13_q23++;
                                      if(matBool && bioBool23 && quiBool12)
                                        b23_q12++;
                                      if(matBool && bioBool23 && quiBool13)
                                        b23_q13++;
                                      if(matBool && bioBool23 && quiBool23)
                                        b23_q23++;

    //                                  if(matBool && bioBool12 && quiBool13) {
    //                                    contador++;
    ////                                    System.out.printf("%09d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
    ////                                            BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
    ////                                            BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
    ////                                            BIO_3, QUI_3, MAT_3, MCS_3, TEI_3
    ////                                    );
    //                                  }
                                  }// Condiciones MAT, QUI y BIO
                                  // Con una sola BIO
                                  if (true) {
                                      matBool = MAT_1==2;
                                      bioBool12 = BIO_1==0 && BIO_2==0;
                                      bioBool13 = BIO_1==0 && BIO_3==0;
                                      quiBool12 = Math.abs(QUI_1-QUI_2)>20 && QUI_3==0;
                                      quiBool13 = Math.abs(QUI_1-QUI_3)>20 && QUI_2==0;
                                      quiBool23 = Math.abs(QUI_2-QUI_3)>20 && QUI_1==0;
                                      if (matBool && bioBool12 && quiBool12) {
                                          b012_q12++;
//                                          System.out.printf("%010d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
//                                                BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
//                                                BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
//                                                BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }
                                      if (matBool && bioBool12 && quiBool13) {
                                          b012_q13++;
//                                          System.out.printf("%010d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
//                                                BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
//                                                BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
//                                                BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }
                                      if (matBool && bioBool12 && quiBool23) b012_q23++;
                                      if (matBool && bioBool13 && quiBool12) {
                                          b013_q12++;
//                                          System.out.printf("%010d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
//                                                BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
//                                                BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
//                                                BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      }
                                      if (matBool && bioBool13 && quiBool13) {
                                          b013_q13++;
//                                          System.out.printf("%010d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d | %3d %3d %3d %3d %3d |%n", contador,
//                                                BIO_1, QUI_1, MAT_1, MCS_1, DIT_1,
//                                                BIO_2, QUI_2, MAT_2, MCS_2, FIS_2,
//                                                BIO_3, QUI_3, MAT_3, MCS_3, TEI_3);
                                      } 
                                      if (matBool && bioBool13 && quiBool23) b013_q23++;
                                  }
                                }//w
                              }//v
                            }//u
                          }//s5              
                        }//s4
                      }//s3
                    }//s2
                  }//s1                  
                }//z
              }//y
            }//x5              
          }//x4
        }//x3
      }//x2
    }//x1
    
      System.out.println("\nContador Total: " + contador);
      if (true) {
          System.out.println("--------------------");
          System.out.println("BIO 1 = 0 -> " + cBIO1);
          System.out.println("BIO 2 = 0 -> " + cBIO2);
          System.out.println("BIO 3 = 0 -> " + cBIO3);
          System.out.println("--------------------");
          System.out.println("MAT 1 = 0 -> " + cMAT1);
          System.out.println("MAT 2 = 0 -> " + cMAT2);
          System.out.println("MAT 3 = 0 -> " + cMAT3);
          System.out.println("--------------------");
          System.out.println("QUI 1 = 0 -> " + cQUI1);
          System.out.println("QUI 2 = 0 -> " + cQUI2);
          System.out.println("QUI 3 = 0 -> " + cQUI3);
          System.out.println("----------------------------------");
          System.out.println("BIO 1 = 0 y BIO 2 = 0 -> " + cBIO12);
          System.out.println("BIO 1 = 0 y BIO 3 = 0 -> " + cBIO13);
          System.out.println("BIO 2 = 0 y BIO 3 = 0 -> " + cBIO23);
          System.out.println("----------------------------------");
          System.out.println("MAT 1 = 0 y MAT 2 = 0 -> " + cMAT12);
          System.out.println("MAT 1 = 0 y MAT 3 = 0 -> " + cMAT13);
          System.out.println("MAT 2 = 0 y MAT 3 = 0 -> " + cMAT23);
          System.out.println("----------------------------------");
          System.out.println("QUI 1 = 0 y QUI 2 = 0 -> " + cQUI12);
          System.out.println("QUI 1 = 0 y QUI 3 = 0 -> " + cQUI13);
          System.out.println("QUI 2 = 0 y QUI 3 = 0 -> " + cQUI23);
      }
      if (true) {
          System.out.println("--------------------------------------");
          System.out.println("Bio(1=2 3=0) Qui(1=2 3=0) = " + b12_q12);
          System.out.println("Bio(1=3 1=0) Qui(1=2 3=0) = " + b13_q12);
          System.out.println("Bio(2=3 1=0) Qui(1=2 3=0) = " + b23_q12);
          System.out.println("Bio(1=2 3=0) Qui(1=3 2=0) = " + b12_q13);
          System.out.println("Bio(1=3 1=0) Qui(1=3 2=0) = " + b13_q13);
          System.out.println("Bio(2=2 1=0) Qui(1=3 2=0) = " + b23_q13);
          System.out.println("Bio(1=2 3=0) Qui(2=3 1=0) = " + b12_q23);
          System.out.println("Bio(1=3 1=0) Qui(2=3 1=0) = " + b13_q23);
          System.out.println("Bio(2=2 1=0) Qui(2=3 1=0) = " + b23_q23);
      }
      if (true) {
          System.out.println("--------------------------------------");
          System.out.println("BIO1=BIO2=0 Qui(1=2 3=0) = " + b012_q12);
          System.out.println("BIO1=BIO2=0 Qui(1=3 2=0) = " + b012_q13);
          System.out.println("BIO1=BIO2=0 Qui(2=3 1=0) = " + b012_q23);
          System.out.println("--------------------------------------");
          System.out.println("BIO1=BIO3=0 Qui(1=2 3=0) = " + b013_q12);
          System.out.println("BIO1=BIO3=0 Qui(1=3 2=0) = " + b013_q13);
          System.out.println("BIO1=BIO3=0 Qui(2=3 1=0) = " + b013_q23);
      }
    }//Combinaciones        
     
    
    
            
    
  } //Main
  
  public static void ecuaciones(int x1, int x2, int x3, int x4, int x5, int y, int z, int s1, int s2, int s3, int s4, int s5, int u, int v, int w) {
    int x = x1 + x2 + x3 + x4 + x5;
    int s = s1 + s2 + s3 + s4 + s5;
    
    // Ecuaciones
    BIO_1 = BMcQ - x + x1 + BMsQ - s + s1;
    QUI_1 = x2 + x3 + McQT - y + FMcQ - z +s2 + s3 + w;
    MAT_1 = x4 + x5 + y + z +FMcT;
    MCS_1 = s4 + s5 + MsQT - w;
    DIT_1 = DFM + DMcT + BDMc + DMcQ;
    BIO_2 = x2 + x4 + s2 + s4 +BDMc - u; 
    QUI_2 = BMcQ - x + x5 + y + BMsQ - s + s5 +DMcQ - v + MsQT - w;
    MAT_2 = x1 + x3 + McQT - y + DMcT + u + v;
    MCS_2 = s1 + s3 + w;
    FIS_2 = DFM + FMcQ + FMcT;
    BIO_3 = x3 + x5 + s3 + s5 + u;
    QUI_3 = x1 + x4 + z + s4 + v;
    MAT_3 = BMcQ - x + x2 + DFM + FMcQ -z + s2 + BDMc - u + DMcQ - v;
    MCS_3 = 0;
    TEI_3 = McQT + DMcT + FMcT + MsQT;
  }
  
} //Fin


// Ecuaciones
//    int BIO_1 = BMcQ - x + x1 + BMsQ - s + s1;
//    int QUI_1 = x2 + x3 + McQT - y + FMcQ - z +s2 + s3 + w;
//    int MAT_1 = x4 + x5 + y + z +FMcT;
//    int MCS_1 = s4 + s5 + MsQT - w;
//    int DIT_1 = DFM + DMcT + BDMc + DMcQ;
//    int BIO_2 = x2 + x4 + s2 + s4 +BDMc - u; 
//    int QUI_2 = BMcQ - x + x5 + y + BMsQ - s + s5 +DMcQ - v + MsQT - w;
//    int MAT_2 = x1 + x3 + McQT - y + DMcT + u + v;
//    int MCS_2 = s1 + s3 + w;
//    int FIS_2 = DFM + FMcQ + FMcT;
//    int BIO_3 = x3 + x5 + s3 + s5 + u;
//    int QUI_3 = x1 + x4 + z + s4 + v;
//    int MAT_3 = BMcQ - x + x2 + DFM + FMcQ -z + s2 + BDMc - u + DMcQ - v;
//    int MCS_3 = 0;
//    int TEI_3 = McQT + DMcT + FMcT + MsQT;

 // Variables
//    int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0;
//    int y = 0, z = 0;
//    int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
//    int u = 0, v = 0, w = 0;
    
//    int x = x1 + x2 + x3 + x4 + x5;
//    int s = s1 + s2 + s3 + s4 + s5;
    
//   for(int w=0; w<=McQT; w++) {
//     System.out.printf("MsQT-w = %d    w = %d%n",McQT-w,w);
//   }