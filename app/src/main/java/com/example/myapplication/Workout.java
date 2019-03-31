package com.example.myapplication;

import android.widget.Toast;

import java.util.Random;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import static com.example.myapplication.Main2Activity.Goals;
import static com.example.myapplication.Main4Activity.timePeriod;
import static com.example.myapplication.Main3Activity.Experience;


/**
 * Greates workout object to hold a list of exercises
 *
 * @author Paul Macfarlane
 * @version 1.0
 */
public class Workout
{
    String[] back = {"Deadlift", "Weighted Pullup", "Dumbbell Romanian Deadlift", "Pallof Press Iso Hold", "Incline Dumbbell Row", "Chinup", "Trap-Bar Deadlift", "Alternating Dumbbell Row", "Inverted Row", "Snatch-Grip Rack Deadlift", "Swiss Ball Leg Curl", "Wide-Grip Pullup", "Landmine One-Arm Row", "Towel Cable Row", "Rotational Inverted Row", "Burpee", "Pike-Up to Superman", "Lying Lateral Raise", "Hang Clean", "Back Extension", "Seated Cable Row", "Bentover Reverse Flye", "Aquaman", "Superman", "Suspension Trainer Chinup", "Squat", "Suspension Trainer Inverted Row", "Swiss Ball Reverse Back Extension", "Yates Row", "Bentover Row to Neck"};
    String[] bis = {"STANDING BARBELL CURL", "CONCENTRATION CURL", "STANDING RESISTANCE BAND HAMMER CURL", "STANDING DUMBBELL CURL", "PARALLEL PAUSE CURL W/ ESCALATING ISOMETRIC HOLD", "OFFSET-GRIP DUMBBELL CURL", "HAMMER CURL", "STATIC DUMBBELL CURL", "DECLINE DUMBBELL CURL", "INCLINE DUMBBELL CURL", "KNEELING SINGLE-ARM CURL", "ZOTTMAN CURL", "CABLE ROPE HAMMER CURL", "CABLE ALTERNATING FLEX CURL", "EZ-BAR PREACHER CURL", "LYING PREACHER CURLS", "OPEN-PALM MACHINE CURLS", "CHINUP", "NEGATIVE CHINUP", "START-AND-STOP CHINUP", "SEATED CABLE ROW", "BENT-OVER BARBELL ROW", "PUSHUP-POSITION HAMMER CURL", "SPLIT-JACK CURL", "RESISTANCE-BAND JUMPING-JACK HAMMER CURL", "SQUAT CONCENTRATION CURL", "RACKED FARMER’S CARRY", "DUMBBELL CLEAN", "UNDERHAND-GRIP INVERTED ROW", "SLOW-MO 21s"};
    String[] calves = {"Jumping Jack", "Seated Calf Raise (Toes Out)", "Seal Jump", "Seated Calf Raise (Toes Neutral)", "Seated Calf Raise (Toes In)", "Ankle Mobilization", "Single-Leg Calf Raise", "Hole Calf Raise", "Tiptoe Walk", "Jumping Calf Raise", "Standing Calf Raise", "Seated Calf Raise Machine", "Lateral Lunge to Curtsy", "Agility Ladder", "Bosu Ball Squat"};
    String[] cardio = {"Inchworm", "Power Skip", "Uppercut", "Mountain Climber Twist", "High Knees", "Punch", "Plank Jacks", "Butt Kick", "Fast Feet Shuffle", "Plank-to-Knee Tap", "Jumping Jack", "Vertical Jump", "Skaters", "Long Jump With Jog Back", "Tuck Jump", "Corkscrew", "Diver’s Push-Up", "Wide Mountain Climbers", "Invisible Jump Rope", "3 Hops to Push-Up", "Step-Up", "Classic Burpee", "Single-Leg Hop", "Runner's Skip", "Flutter Kick", "Sprinter Sit-Ups", "Squat Jump", "Plyometric Push-Up", "Tricep Push-Up With Mountain Climber", "Box Jump", "Donkey Kick", "Lateral Jump", "Jumping Lunges"};
    String[] chest = {"Barbell Bench Press", "Dumbbell Bench Press", "Smith Machine Incline Press", "Incline Dumbbell Flye", "Cable Crossover", "Incline Dumbbell Press", "Chest Press Machine", "Dumbbell Flye", "Low-Cable Crossover", "Low-Incline Press", "Speed Bench Press", "Landmine Press", "Floor Press", "Prone Flye", "Pullover", "Plate Pressout", "3-Way Flye", "Pushup", "3-Way Finisher", "One-Armed Medicine Ball Pushup", "Medicine Ball Pushup ", "Close-Grip Pushup", "Medicine Ball Crossover Pushup", "Plyo Pushup", "Wide-Grip Pushup", "Band-Resisted Pushup w/ Feet Elevated", "Band-Resisted Flye", "Triceps Extension", "Pec Deck", "Wide-Grip Dips"};
    String[] hamstrings = {"Glute Bridge", "Single-leg Glute Bridge", "Bench Hip Thrust", "Single-leg Bench Hip Thrust", "Swiss Ball Hamstring Curl", "Single-leg Swiss Ball Hamstring Curl", "Cable or Band Pull-through", "Kettlebell Deadlift", "Dumbbell Romanian Deadlift", "Barbell Romanian Deadlift", "Hamstring Curl with Sliders", "Nordic Hamstring Curl", "Single-leg Romanian Deadlift"}; 
    String[] lats = {"Deadlifts", "Barbell Row", "Dumbbell Row", "Pull-ups and Chin-ups", "Lat Pulldowns", "Landmine Row", "Dumbbell Pullover", "Meadows Row", "Renegade Row", "Inverted Bodyweight Row", "Deadstop Row"};
    String[] quads = {"Bulgarian Split Squat", "BOSU Ball Squat", "Bodyweight Squat", "Barbell Front Squat", "Goblet Squat", "Barbell Box Squat", "TRX Single-Leg Squat", "TRX Single-Leg Step Back Lunge", "TRX Single-Leg Balance Lunge", "TRX Crossing Balance Lunge", "TRX Single-Leg Forward Lunge", "Wall Sit", "Diagonal Walking Lunges", "Hack Squat", "Leg Press", "Sprints", "Weighted Jump Squat", "Box Jump", "Seated Single-Leg Jump Squat", "Kettlebell Pistol Squat", "Goblet Squat to Reverse Lunge", "Goblet Alternating Lateral Lunges", "Double Kettlebell Front Squat (3:1 count)", "Dumbbell Reverse Lunge to Stepup", "Weighted Hill Sprints", "Dumbbell Alternating Walking Lunge", "Leg Extensions", "Barbell Back Squat", "Alternating Lateral Box Jumps", "Dumbbell Deficit Sumo Squat"};
    String[] shoulders = {"Cable Reverse Flye", "Bent-Over Dumbbell Lateral Raise", "One-Arm Cable Lateral Raise", "Cable Front Raise", "Push Press", "Wide-Grip Smith-Machine Upright Row", "Face Pull", "Dumbbell Lateral Raise", "Seated Barbell Shoulder Press", "Seated Dumbbell Shoulder Press"};
    String[] tris = {"Close Hands Pushup", "Standing Dumbbell Overhead Tricep Extension", "TRX Tricep Extension", "Seated Overhead Triceps Extension", "MA40 Program", "Dumbbell Lying Triceps Extensions", "Tate Presses", "Foam Roller Press", "Dips", "Close-Grip Bench Press", "Rolling EZ-Bar Triceps Extensions", "Kettlebell Floor Press", "Rope Triceps Pressdown"};
    int[] numExcs = {back.length, bis.length, calves.length, cardio.length, chest.length,hamstrings.length,lats.length,quads.length,shoulders.length,tris.length};
    Exercise[] list = new Exercise[10];
    public Workout(int time, String dif, String goal){
        double mult =1;

        for (int i =0; i <list.length;i++){
            list[i]= new Exercise("",1,1);
        }
        int tempsets;
        if (dif.equalsIgnoreCase("Never")){
            mult = 1.0;
        }
        if (dif.equalsIgnoreCase("Beginner")){
            mult = 1.25;
        }
        if (dif.equalsIgnoreCase("Intermediate")){
            mult = 1.5;
        }
        if (dif.equalsIgnoreCase("Expert")){
            mult = 2.0;
        }
        if (goal.equalsIgnoreCase("Lose Weight")){
            list[0].multiplier=1;
            list[1].multiplier=1;
            list[2].multiplier=1;
            list[3].multiplier=4;
            list[4].multiplier=1;
            list[5].multiplier=2;
            list[6].multiplier=1;
            list[7].multiplier=2;
            list[8].multiplier=1;
            list[9].multiplier=1;
        }
        if (goal.equalsIgnoreCase("Bulk Up")){
            list[0].multiplier=2;
            list[1].multiplier=1;
            list[2].multiplier=1;
            list[3].multiplier=1;
            list[4].multiplier=2;
            list[5].multiplier=1;
            list[6].multiplier=1;
            list[7].multiplier=2;
            list[8].multiplier=2;
            list[9].multiplier=2;
        }
        if (goal.equalsIgnoreCase("Stay Fit")){
            list[0].multiplier=2;
            list[1].multiplier=2;
            list[2].multiplier=1;
            list[3].multiplier=2;
            list[4].multiplier=2;
            list[5].multiplier=1;
            list[6].multiplier=1;
            list[7].multiplier=1;
            list[8].multiplier=1;
            list[9].multiplier=2;
        }
        time = time/15;

        Random rand = new Random();

        int rB = rand.nextInt(back.length);
        tempsets = 1 * time * list[0].multiplier;
        int tempreps;
        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[0] = new Exercise(back[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(bis.length);
        tempsets = 1 * time * list[1].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[1] = new Exercise(bis[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(calves.length);
        tempsets = 1 * time * list[2].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[2] = new Exercise(calves[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(cardio.length);
        tempsets = 1 * time * list[3].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[3] = new Exercise(cardio[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(chest.length);
        tempsets = 1 * time * list[4].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[4] = new Exercise(chest[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(hamstrings.length);
        tempsets = 1 * time * list[5].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[5] = new Exercise(hamstrings[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(lats.length);
        tempsets = 1 * time * list[6].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[6] = new Exercise(lats[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(quads.length);
        tempsets = 1 * time * list[7].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[7] = new Exercise(quads[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(shoulders.length);
        tempsets = 1 * time * list[8].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[8] = new Exercise(shoulders[rB],tempsets,(int)Math.floor(tempreps*mult));

        rB = rand.nextInt(tris.length);
        tempsets = 1 * time * list[9].multiplier;

        if (tempsets==1){
            tempreps =15;
        }
        else if (tempsets==2){
            tempreps = 12;
        }
        else if (tempsets==3){
            tempreps = 10;
        }
        else if (tempsets==4){
            tempreps = 8;
        }
        else {
            tempreps = 5;
        }

        list[9] = new Exercise(tris[rB],tempsets,(int)Math.floor(tempreps*mult));

    }
    
    public void printWorkOut() {
//        for (Exercise str: list){
//            writer.println("      " + str.label);
//            writer.println();
//        }
//        writer.println();
//
//        writer.flush();
//        writer.close();
    }

    public String getWorkout1(){
        return list[0].label;
    }
    public String getWorkout2(){
        return list[1].label;
    }
    public String getWorkout3(){
        return list[2].label;
    }
    public String getWorkout4(){
        return list[3].label;
    }
    public String getWorkout5(){
        return list[4].label;
    }
    public String getWorkout6(){
        return list[5].label;
    }
    public String getWorkout7(){
        return list[6].label;
    }
    public String getWorkout8(){
        return list[7].label;
    }
    public String getWorkout9(){
        return list[8].label;
    }
    public String getWorkout10() {
        return list[9].label;
    }


    public static void main(String args[]){
        Workout work = new Workout(timePeriod, Experience, Goals);
        work.printWorkOut();

    }
}
