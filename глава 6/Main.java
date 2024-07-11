/*Шарыгина Надежда Б763-2
глава 6. вариант А
 25. Абитуриент. Возможности: получить аттестат; заполнить заявление;
 зарегистрироваться\пройти вступительные испытания; подать документы
в приемную комиссию. Добавить дополнительные возможности для
Абитуриента БГУ, Абитуриента БГУИР.*/
public static void main(String[] args){
    Enrollee enrollee = new Enrollee("вы зарегистрировались на прохождение вступительных испытаний",
            "документы на поступление поданы","БГУ");
    enrollee.get_grades();
    enrollee.fill_application();
    System.out.println(enrollee.get_exam());
    enrollee.exams("вступительные экзамены пройдены");
    System.out.println(enrollee.get_documents());
    enrollee.send_docs();
}