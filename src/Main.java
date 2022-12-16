public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим","Минск",1988,",бренд-менеджер");
        System.out.println("Привет, меня зовут " + maxim.name + ". Я из города " + maxim.town + ". Я родился в " + maxim.yearOfBirth + " году." +
                " Я работаю на должности " + maxim.jobTitle + ". Будем знакомы!");
        System.out.println();


        Human anya = new Human( null,"Москва",1993,"методист образовательных программ");
        System.out.println("Привет, меня зовут " + anya.name + ". Я из города " + anya.town + ". Я родилась в " + anya.yearOfBirth + " году." +
                " Я работаю на должности " + anya.jobTitle + ". Будем знакомы!");
        System.out.println();

        Human katya = new Human("Катя","Калининград",0,"продакт-менеджер");
        System.out.println("Привет, меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родилась в " + katya.yearOfBirth + " году." +
                " Я работаю на должности " + katya.jobTitle + ". Будем знакомы!");
        System.out.println();

        Human artem = new Human("Артем","Москва",1995,"директор по развитию бизнеса");
        System.out.println("Привет, меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году." +
                " Я работаю на должности " + artem.jobTitle + ". Будем знакомы!");
        System.out.println();


    }
}