## Shared Truths

We're going to collaborate on a project where we all add a truth to the collective project. 

We'll do all this together in class.

steps:
1. Fork the project and clone to your computer.
2. Create a new package using your fist initial and last name so for Jane Doe it would be `edu.csueastbay.cs401.jdoe`
   1. You'll need to create the path in both `java` and `resources`
3. Create a new Class that extends `edu.csueastbay.cs401.share.PersonalTruth`
   1. Add and constructor that call the super
   2. Add getters and setters that override the super.
4. In Scene Builder create a `reveal.fmxl` file 
   1. Add a label with a fx:id of `displayLabel`
   2. Add a button with an action On Action of `reveal`
   3. Set the controller to RevealController
   4. Save the reveal.fxml file in your package resource path
   5. Copy the sample controller to your clipboard 
5. Create the Reveal Controller in your package and paste in the sample code but leave the package at the top. 
   1. Make the new controller implement Initializable
   2. update your reveal.fxml with the correct path to your controller.
6. Copy a student button the mainMenu.fxml and replace the text with your name.
7. Add your name to the case statement in the MainMenu.studentButtonClick method with the path to your reveal.fxml 
8. Add `opens [your package] to javafx.fxml;` to the module-info.java file. 
9. In your controller: 
   1. In your initialize methode create a truth object with your question and answer
   2. set the label text to the question 
   3. wire the button action to set the label text to the answer when the button is pressed. 
10. Test your application
11. On GitHub pull any changes from the base project you forked 
12. pull and merge those changes to your local code 
13. Test your application again 
14. Push your code to your repository 
15. Make a pull request for your changes to the original repository. 