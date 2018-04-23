/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicingjava;

/**
 *
 * @author Edit
 */
public class PracticingJava {

    /**
     * @param args the command line arguments
     */
    
    //Multiplication table
    public static void main(String[] args) {
        
        Timetable timetable1 = new Timetable();
        timetable1.createTimetable();
        
        //Multiplication table
        for (int row = 1; row < 11; row++) {
           
           //print every second row 
           if (row % 2 != 0){
               continue;
           }
               
            for (int col = 1; col < 11; col++) {
               System.out.print(row*col + "  ");
            }
            System.out.println();
        }

        
        
//       int [] numArr = {
//        10,
//        20,
//        30,
//        40,
//        50,
//        60,
//        70,
//        80
//       };
//       
////       int i = 0;
////       while (i < numArr.length) {
////           System.out.println(numArr[i]);
////           i++;
////       }
//       
////       for (int i = 0; i < numArr.length; i++) {
////            System.out.println(numArr[i]);
////       }
//       
//         for (int arrElement: numArr) {
//             System.out.println(arrElement);
//         }   
    }
    
}

class Timetable
{
    void createTimetable() {
        System.out.println("test");
    }
}
