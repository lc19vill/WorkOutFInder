package com.example.myapplication;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
/**
 * Write a description of class WorkoutProgram here.
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
public class WorkoutProgram { 

    /**
     * Constructor for objects of class WorkoutProgram
     */
    public WorkoutProgram(int time, String dif, String goal, int daysPer,int weeks) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter("workout.txt");
        int day =1;
        int week=1;
        for (int i = 1;i<=weeks;i++){
            writer.println("Week" + i + ":");
            writer.println();
            for (int j =1;j<=daysPer;j++){
                writer.println("   Day" + j + ":");
                writer.println();
                Workout temp = new Workout(time,dif,goal);
                
                for (Exercise str: temp.list){
                    writer.println("      " + str.label);
                    writer.println();
                }
                writer.println();

            }

        }
        writer.flush();
        writer.close();
    }

    public static void main(String args[]) throws FileNotFoundException{ 
        WorkoutProgram test = new WorkoutProgram(45,"Intermediate","Lose Weight",3,8);
    }

}
