import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;

public class BodyProcessor {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public byte[] reservaCrear(byte[] body) throws IOException {
        HashMap<String, Object> bodyResponse = new HashMap<>();
        Reserva reserva = objectMapper.readValue(body, Reserva.class);
        ValidationResponseDTO errors = DataValidator.reservaValidate(reserva);
        bodyResponse.put("result", (errors.isFatal()) ? "OK" : "KO" );
        bodyResponse.put("errors", errors.getErrors());
        bodyResponse.put("inserted-data", reserva);
        return objectMapper.writeValueAsBytes(bodyResponse);
    }

    public byte[] reservaListar(byte[] body) {
        return null;
    }

    public byte[] huespedCrear(byte[] body) {
        return null;
    }

    public byte[] huespedListar(byte[] body) {
        return null;
    }
}
