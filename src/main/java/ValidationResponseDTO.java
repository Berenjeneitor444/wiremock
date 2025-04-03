public class ValidationResponseDTO {
    private final boolean isFatal;
    private final String[] errors;

    public boolean isFatal() {
        return isFatal;
    }

    public String[] getErrors() {
        return errors;
    }

    public ValidationResponseDTO(boolean isFatal, String[] errors) {
        this.isFatal = isFatal;
        this.errors = errors;
    }
}
