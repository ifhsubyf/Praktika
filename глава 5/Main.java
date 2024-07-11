public static void main(String[] args) {
        Film film = new Film("Интерстеллар");
        film.setinfo(169, "Научная фантастика", "Кристофер Нолан");

        Info info = film.getinfo();
        System.out.println("Название: " + film.get_name());
        System.out.println("Продолжительность: " + info.get_length() + " минут");
        System.out.println("Жанр: " + info.get_genre());
        System.out.println("Режиссёр: " + info.get_director());
}
