package Service;

public class FixedPrecisionProvider implements RoundPrecisionProvider{

    public int getRoundPrecision(String currency) {
        return 2;
    }
}
