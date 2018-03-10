package com.example.android.monsterquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Static Final Values
    static final String BEHOLDER_ANSWER = "answerOne";
    static final String DISPLACER_ANSWER = "answerTwo";
    static final String GNOLL_ANSWER = "answerThree";
    static final String OWLBEAR_ANSWER = "answerFour";
    static final String DWARF_ANSWER = "dwarfAnswerOne";
    static final String DWARF_ONE_ANSWER = "dwarfAnswerOne";
    static final String DWARF_TWO_ANSWER = "dwarfAnswerTwo";
    static final String DWARF_THREE_ANSWER = "dwarfAnswerThree";
    static final String DWARF_TOTAL_ANSWER = "dwarfAnswerThree";
    static final String DRIZZT_ANSWER = "drizztAnswer";

    //Question values
    boolean beholder;
    boolean displacer;
    boolean gnoll;
    boolean owlbear;
    boolean dwarfOne;
    boolean dwarfTwo;
    boolean dwarfThree;
    boolean dwarf;
    boolean drizzt;
    EditText drizztAnswer;

    //Other variables
    int totalRight = 0;
    int totalQuestions = 6;
    int dwarfTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // recovering the instance state
        if (savedInstanceState != null) {
            beholder = savedInstanceState.getBoolean(BEHOLDER_ANSWER);
            displacer = savedInstanceState.getBoolean(DISPLACER_ANSWER);
            gnoll = savedInstanceState.getBoolean(GNOLL_ANSWER);
            owlbear = savedInstanceState.getBoolean(OWLBEAR_ANSWER);
            dwarf = savedInstanceState.getBoolean(DWARF_ANSWER);
            dwarfOne = savedInstanceState.getBoolean(DWARF_ONE_ANSWER);
            dwarfTwo = savedInstanceState.getBoolean(DWARF_TWO_ANSWER);
            dwarfThree = savedInstanceState.getBoolean(DWARF_THREE_ANSWER);
            dwarfTotal = savedInstanceState.getInt(DWARF_TOTAL_ANSWER);
            drizzt = savedInstanceState.getBoolean(DRIZZT_ANSWER);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        //Saving important values
        outState.putBoolean(BEHOLDER_ANSWER, beholder);
        outState.putBoolean(DISPLACER_ANSWER, displacer);
        outState.putBoolean(GNOLL_ANSWER, gnoll);
        outState.putBoolean(OWLBEAR_ANSWER, owlbear);
        outState.putBoolean(DWARF_ANSWER, dwarf);
        outState.putBoolean(DWARF_ONE_ANSWER, dwarfOne);
        outState.putBoolean(DWARF_TWO_ANSWER, dwarf);
        outState.putBoolean(DWARF_THREE_ANSWER, dwarf);
        outState.putInt(DWARF_TOTAL_ANSWER, dwarfTotal);
        outState.putBoolean(DRIZZT_ANSWER, drizzt);

        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

    /**
     * Called when the submitButton is clicked, sends values to checkAnswers method.
     *
     * @param view submitButton
     */
    public void submitButton(View view) {
        drizztCheck();
        checkAnswer(beholder, displacer, gnoll, owlbear, dwarf, drizzt);
    }

    /**
     * Calculates the value of totalRight, then sends that value to displayAnswer method
     *
     * @param beholder  boolean value of the beholder question
     * @param displacer boolean value of the displacer beast question
     * @param gnoll     boolean value of the gnoll question
     * @param owlbear   boolean value of the owlbear question
     * @param dwarf     boolean value of the dwarf question
     * @param drizzt    boolean value of the drizzt question
     */
    private void checkAnswer(boolean beholder, boolean displacer, boolean gnoll, boolean owlbear, boolean dwarf, boolean drizzt) {
        if (beholder) {
            totalRight += 1;
        }
        if (displacer) {
            totalRight += 1;
        }
        if (gnoll) {
            totalRight += 1;
        }
        if (owlbear) {
            totalRight += 1;
        }
        if (dwarf) {
            totalRight += 1;
        }
        if (drizzt) {
            totalRight += 1;
        }
        displayAnswer(totalRight);
    }

    private void displayAnswer(int right) {
        Context context = getApplicationContext();
        CharSequence text = "You got " + right + " out of " + totalQuestions + " correct!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        totalRight = 0;
    }

    /**
     * The Beholder RadioGroup handler
     *
     * @param view which radio button is clicked
     */
    public void beholderCheck(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();



        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.beholder_one:
                if (checked) {
                    beholder = true;
                } else {
                    beholder = false;
                }
                break;

            case R.id.beholder_two:
                if (checked) {
                    beholder = false;
                }
                break;

            case R.id.beholder_three:
                if (checked) {
                    beholder = false;
                }
                break;

            case R.id.beholder_four:
                if (checked) {
                    beholder = false;
                }
                break;
        }

    }

    /**
     * The Displacer RadioGroup handler
     *
     * @param view which radio button is clicked
     */
    public void displacerCheck(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.displacer_one:
                if (checked) {
                    displacer = false;
                }
                break;

            case R.id.displacer_two:
                if (checked) {
                    displacer = false;
                }
                break;

            case R.id.displacer_three:
                if (checked) {
                    displacer = true;
                } else {
                    displacer = false;
                }
                break;

            case R.id.displacer_four:
                if (checked) {
                    displacer = false;
                }
                break;

        }

    }

    /**
     * The Gnoll RadioGroup handler
     *
     * @param view which radio button is clicked
     */
    public void gnollCheck(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.gnoll_one:
                if (checked) {
                    gnoll = false;
                }
                break;

            case R.id.gnoll_two:
                if (checked) {
                    gnoll = false;
                }
                break;

            case R.id.gnoll_three:
                if (checked) {
                    gnoll = false;
                }
                break;

            case R.id.gnoll_four:
                if (checked) {
                    gnoll = true;
                } else {
                    gnoll = false;
                }
                break;

        }

    }

    /**
     * The Owlbear RadioGroup handler
     *
     * @param view which radio button is clicked
     */
    public void owlbearCheck(View view) {
        // Is the view now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.owlbear_one:
                if (checked) {
                    owlbear = false;
                }
                break;

            case R.id.owlbear_two:
                if (checked) {
                    owlbear = true;
                } else {
                    owlbear = false;
                }
                break;

            case R.id.owlbear_three:
                if (checked) {
                    owlbear = false;
                }
                break;

            case R.id.owlbear_four:
                if (checked) {
                    owlbear = false;
                }
                break;

        }

    }

    public void dwarfChecker(View view){
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.dwarf_answer_one:
                if (checked) {
                    dwarfOne = true;
                    dwarfTotal += 1;
                } else {
                    dwarfOne = false;
                    dwarfTotal -= 1;
                }
                break;

            case R.id.dwarf_answer_two:
                if (checked) {
                    dwarfTwo = true;
                    dwarfTotal += 1;
                } else {
                    dwarfTwo = false;
                    dwarfTotal -= 1;
                }
                break;

            case R.id.dwarf_answer_three:
                if (checked) {
                    dwarfThree = true;
                    dwarfTotal += 1;
                } else {
                    dwarfThree = false;
                    dwarfTotal -= 1;
                }
                break;

        }

        if (dwarfTotal == 3) {
            dwarf = true;
        }   else {
            dwarf = false;
        }

    }

    private void drizztCheck (){
        drizztAnswer = findViewById(R.id.drizzt_answer);
        if (drizztAnswer.getText().toString().equals("Drizzt")){
            drizzt = true;
        }
    }

}
