# MonsterQuiz
6 question quiz about Forgotten Realms lore.

Each question is contained in a CardView, with an ImageView and some type of question format.

There are 4 RadioGroups, each calling on their own method for handling the logic behind that group.

A group of CheckBox views, where all three CheckBox views call on the same method to handle the logic. 

And the final question that includes an EditText view. 

The Submit Button calls upon a method that calls on two other methods. The first checks the EditText view for the correct answer. 
The second handles the logic on the amount of correct answers.

I've also added in an onSaveInstanceState, saving the values need to keep the values of the already answered questions.
