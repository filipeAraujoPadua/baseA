package basea.baseA.controller.exceptions.type;

public class DataIntegrationException extends RuntimeException {
    private static final long serialVersionUID = -4310191016910509560L;

    public DataIntegrationException(String ex) {
            super(ex);
        }
}