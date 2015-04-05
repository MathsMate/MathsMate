Aaron Meaney [x14326016]:
Main Menu and Misc Section

MathsMateApp.java
MathsMate.java
MainMenu.java
GrindInterface.java
GrindPanel.java
GrindsFinder.java
PrivateGrind
InstitutionGrind.java
Course.java
CourseFinder.java
CoursePanel.java
ExtrasMenu.java
PointsCalc.java
Subject.java

In GrindsFinder and CourseFinder, I used an ArrayList to store the panels that would appear in the JScrollPane. Each individual panel is clickable and directs you to a website.
I setup the navigation bar on the top of each page.

==========

Ian Donnelly [x14111659]:
AlgebraMenu.java
* Created the GUI in similar format to MainMenu.java to have
AlgebraFormula.java
* Used Arraylists to switch JLabels and change text formulas when scrolling through next and previous.
* Used created class AlgebraFormulaStorage as class in Arraylist.
* Created next and previous formulas method for buttons, inserted code to make it loop back to start when next is hit on last and go to last when previous is hit on first.
* Used <html> on AF2 to change font color in order to clarify the formula to the student further.
AlgebraFormulaStorage.java
* Used for getters, setters and constructor of AlgebraFormula.java

==========

Bernard Skerritt [x14110717]:
Algebra Quiz, Geometry Quiz and Trigonometry Quiz

AlgebraQuiz.java
AlgebraQuestion.java
GeomQuiz.java
GeomQuestion.java
TrigQuiz.java
TrigQuestion.java

With AlgebraQuiz.java I first created the GUI. I put a jLabel for the question and a radiobutton group for the answers. I then added 2 jButtons, 1 to check answer and 1 to move to the next question. When you hit the check answer button a jLabel tells you if your answer choice is correct or incorrect. There are 5 questions in total and when you check your answers to your last question the next changes to finished and when you hit finished your tally out of 5 is displayed. The buttons then change to main menu or reset the quiz again.

TrigQuiz.java works in the same way except I added in a image for each question.

GeomQuiz.java again works in the same way except I added in a image for each question and changed the answers to be in a jComboBox.

I used html code to allow the questions to flow onto multiple lines. I also used unicode and html symbol code to display mathematical symbols in the questions and answers.

I added in an ArrayList to the TrigQuiz.java

I have TrigQuestion.java as a subclass of AlgebraQuestion.java superclass.

==========
Emlyn Farrell [x14438218]:
Algebra notes, Geometry notes and Trig notes

AlgebraNotes.java
GeometryNotes.java
TrigNotes.java


With AlgebraNotes I added a JText Area and 2 JButtons to cycle to cycle through through the notes pages 

TrigNotes 

GeomQuiz.similar except i added an image which refer to the notes 

made a  class imagenotes as class to extend the class Notes .
I added an ArrayList  to the three sections to hold the questions 

=================

