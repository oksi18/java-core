package hm2.task3;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.

public class Main {

    public static void main(String[] args){
        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.Male, new Car("toyota", 2021, 250));
        user.getSkills().add(new Skills("java", 10));
        user.getSkills().add(new Skills("js", 10));
        user.getSkills().add(new Skills("c++", 10));

        System.out.println(user);
    }
}
