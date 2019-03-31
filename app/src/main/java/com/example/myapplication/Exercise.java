package com.example.myapplication;

/**
 * Exercise object to store basic exercise info
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
public class Exercise
{

    String label;
    int multiplier;
    double setMult;
    String ex;
    int numSets;
    int numReps;

    /**
     * Constructor for objects of class Exercise
     */
    public Exercise(String exercise,int sets, int reps)
    {
//        ex = exercise;
//        numSets = sets;
//        numReps = reps;
        label = exercise + ": ";// + sets + "x" + reps;
    }

//    public String getExercise(){
//        return ex;
//    }
//
//    public int getSets() {
//        return numSets;
//    }
//
//    public int getReps() {
//        return numReps;
//    }
    }


