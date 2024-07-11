public class Enrollee {
    private String exam;
    private String documents;
    private String uni;
    public Enrollee(String exam, String documents, String uni){
        this.exam=exam;
        this.documents=documents;
        this.uni=uni;
    }
    public void get_grades(){
        System.out.println("аттестат получен");
    }
    public void uni_name(String name){
        this.uni=name;
    };
    public void fill_application(){
        System.out.println("заявление заполнено");
    }
    public String get_exam(){
        return exam;
    }
    public String get_documents() {
        return documents;
    }
    public void exams(String exam_stage){
        this.exam=exam_stage;
        System.out.println(exam_stage);
    }
    public void send_docs(){
        if (uni=="БГУ") System.out.println("документы на поступление на льготной основе поданы");
        else if (uni=="БГУИР") System.out.println("документы на поступление на приоритетной основе поданы");
    }

}
