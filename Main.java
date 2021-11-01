package CV_7;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Kostka kostka1 = new Kostka(10);
        kostka1.hodKoskou();
        System.out.println(kostka1.toString());

        ValidatorTextu text1 = new ValidatorTextu("Karel Jaromir");
        ValidatorTextu text2 = new ValidatorTextu("Ka4el Jaromir");
        ValidatorTextu text3 = new ValidatorTextu("Karel jaromir");
        System.out.println(text1.toString());
        System.out.println(text2.toString());
        System.out.println(text3.toString());
    }
}
