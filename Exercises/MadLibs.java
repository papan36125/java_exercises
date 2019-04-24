public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Arka Roy
  Date: 24/04/2019
  */
  	public static void main(String[] args){

      String name1 = "Zoya";
      String adjective1 = "awesome";
      String adjective2 = "badass";
      String adjective3 = "amazing";
      String verb1 = "move";
      String noun1 = "book";
      String noun2 = "girl";
      String noun3 = "chair";
      String noun4 = "boy";
      String noun5 = "bed";
      String noun6 = "baby";
      String name2 = "Zeeshan";
      int number = 9;
      String place1 = "Hogwarts";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }
}
