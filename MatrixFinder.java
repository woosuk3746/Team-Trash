//Team Trash - Ryan Kim, Adrian Kloskowski, Woosuk Lee
//APCS2 pd8
//HW03 -- I Am Still Searching
//2018-02-02

/***********
Algo Summary
************/
/*
Start from the top right corner of the matrix. Have 3 variables that each store the row number (r), the column number (c), and the value of the number on that spot (a.k.a. the tracking variable which is denoted by k). Inside a while loop, if this tracking variable k is less than the target, move down the row ( increment r). If k is greater than the target, just move left (decrement c). If k is equal to the target, return the row and column of k.
*/

public class MatrixFinder{    
        
    public static String find(int[][] array, int target){
        int r = 0;
        int c = array.length - 1;
        int k = array[r][c]; //this serves to keep track of which number to compare with the input target value
        while( true ){
            if(k < target){
                r += 1; //increment r
                if(r >= array.length){
                    break; //this block makes sure no out of bound exception is thrown.
                }
                k = array[r][c]; //update the tracking variable
            }
            else if(k > target){
                c -= 1; //decrement c
                if(c < 0 ){ 
                    break;
                }
                k = array[r][c]; //update k
            }
            else{
                return "(" + r + ", " + c + ")"; //if it's equal, return the r and c value in string
            }
        }
        return "(-1,-1)"; //if the r or c value goes out of bound, it is ensured that the target is not in the array, and the code is broken out of the loop, and just return (-1,-1).
    }
}