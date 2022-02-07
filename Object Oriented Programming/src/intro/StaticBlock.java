package intro;

public class StaticBlock {
    static class Test{
        static String name;
        public Test(String name){
            Test.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Aditya");
        Test obj2 = new Test("Joshi");
        System.out.println(Test.name);
    }
}
