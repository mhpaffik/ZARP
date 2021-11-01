package CV_7;

public class ValidatorTextu {
    private String vzor;

    public ValidatorTextu(String vzor)
    {
        this.vzor = vzor;
    }

    public boolean validujText(String vzor)
    {
        if(vzor.matches("[A-Z][a-zA-Z]+\\s[A-Z][a-zA-Z]+")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "ValidatorTextu{" +
                "vzor='" + validujText(vzor) + '\'' +
                '}';
    }
}
