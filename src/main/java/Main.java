public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Ivan";
        post.passport = "4444 № 444444444";
        post.patronymic = "Ivanovich";
        post.phone = "5049876543";
        post.surname = "Ivanov";
        post.subscription = true;
     }
}