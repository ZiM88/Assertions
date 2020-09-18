public class AssertioinsExampl {
    public static void main(String[] args) {
        new AssertioinsExampl().someMethod(-6);

    }

    private void someMethod(int a) {
        assert (a > 0);
        System.out.println(a);
    }

}
