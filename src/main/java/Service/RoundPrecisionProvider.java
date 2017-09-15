package Service;

public interface RoundPrecisionProvider {

    int getRoundPrecision(String currency);
    boolean isSupported(String currency);
}
