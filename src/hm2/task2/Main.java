package hm2.task2;

//Cтворити клас ланцюг  наслідування:
//        Папірус-Кинга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.

public class Main {
    public static void main(String[] args){
        Book book = new Book(200, 200);
        System.out.println(book);
        Magazine magazine = new Magazine(150, 230,3);
        System.out.println(magazine);
        Comics comics = new Comics(160, 150,Genre.Novel );
        System.out.println(comics);
    }
}
