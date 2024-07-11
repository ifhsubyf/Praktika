public class Film {
    private Info info;
    private String name;

    public Film(String name) {
        this.name = name;
        this.info = new Info();
    }
    public String get_name(){
        return name;
    }
    public void setinfo(int length, String genre, String director) {
        info.length = length;
        info.genre = genre;
        info.director = director;
    }
    public Info getinfo() {
        return info;
    }
}
