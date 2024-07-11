/*
Шарыгина Надежда Б763-2
Вариант А
16. Создать объект класса Цветок, используя классы Лепесток, Бутон.
Методы: расцвести, завять, вывести на консоль цвет бутона.
*/

public class Main extends bud {
    public void garden(){
        System.out.println("цветок посажен в саду");
    }
    public static void main(String[] args) {
        Main Peony = new Main();
        Peony.garden();
        Peony.blossom();
        Peony.colour();
        Peony.wither();
    }
}