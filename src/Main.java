public class Main {
    public static void main(String[] args) {
        Member member = new Member("김정민", 25);
        member.printInfo();
    }
}
class Member {
    String name;
    int age;

    Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    void printInfo(){
        System.out.println("이름: " + name + "나이: "  + age);
    }
}