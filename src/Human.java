public class Human {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;
 Human(String name, String town, int yearOfBirth, String jobTitle) {
     if (yearOfBirth <= 0) {
         System.out.println("Год рождения указан не верно!");;
     } else this.yearOfBirth = yearOfBirth;

     if (name == null) {
         this.name = "Информация не указана";
     } else this.name = name;

     if (town == null) {
         this.town = "Информация не указана";
     } else this.town = town;

     if (jobTitle == null) {
         this.jobTitle = "Информация не указана";
     } else this.jobTitle = jobTitle;
 }
}
