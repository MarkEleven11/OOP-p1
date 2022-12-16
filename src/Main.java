public class Main {
    public static void main(String[] args) {
        Man maxim = new Man();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 1988;
        maxim.jobTitle = "Бренд-менеджер";
        System.out.println("Привет, меня зовут " + maxim.name + ". Я из города " + maxim.town + ". Я родился в " + maxim.yearOfBirth + " году." +
                " Я работаю на должности " + maxim.jobTitle + ". Будем знакомы!");
        System.out.println();

        Man anya = new Man();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;
        anya.jobTitle = "Методист образовательных программ";
        System.out.println("Привет, меня зовут " + anya.name + ". Я из города " + anya.town + ". Я родилась в " + anya.yearOfBirth + " году." +
                " Я работаю на должности " + anya.jobTitle + ". Будем знакомы!");
        System.out.println();

        Man katya = new Man();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1992;
        katya.jobTitle = "Продакт-менеджер";
        System.out.println("Привет, меня зовут " + katya.name + ". Я из города " + katya.town + ". Я родилась в " + katya.yearOfBirth + " году." +
                " Я работаю на должности " + katya.jobTitle + ". Будем знакомы!");
        System.out.println();

        Man artem = new Man();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "Директор по развитию бизнеса";
        System.out.println("Привет, меня зовут " + artem.name + ". Я из города " + artem.town + ". Я родился в " + artem.yearOfBirth + " году." +
                " Я работаю на должности " + artem.jobTitle + ". Будем знакомы!");
        System.out.println();

    }
}