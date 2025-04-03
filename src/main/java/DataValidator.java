import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    /**
     * valida el objeto
     * @return ValidateResponseDTO, contiene la array de errores y un booleano para saber si se debe abortar la operacion o no
     */
    public static ValidationResponseDTO reservaValidate(Reserva reserva){
        // validar, llenar array de errores en cada campo pero no abortar, a menos que haya problemas con Reservation number y/o hotel

        // validar campos obligatorios
        String[] erroresRF = ReservaValidationTool.validateRequiredFields(reserva);
        if(erroresRF.length != 0){
            // si hay errores en esos campos, se devuelven los errores y se aborta la operacion
            return new ValidationResponseDTO(true, erroresRF);
        }
        // si hay errores en los demás campos, se pone un valor default, se indica en errores y se sigue con la operación
        ReservaValidationTool.adjustRequiredFields(reserva);
        String[] erroresOF = ReservaValidationTool.validateOptionalFields(reserva);
        return new ValidationResponseDTO(false, erroresOF);

    }
//    public static ValidationResponseDTO huespedValidate(Huesped huesped){
//
//    }

    private static class HuespedValidationTool{
    }
    private static class ReservaValidationTool{
        private static Map<String, Object> defaultValuesIfWrong;
        private static Map<String,String> errorMap;
        private static Map<String,Pattern> patternMap = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("localizador", Pattern.compile("^[A-Z0-9]{10}/\\d{6}$")),
                new AbstractMap.SimpleEntry<>("bono", Pattern.compile("^[A-Z]{4}[0-9]{4}$")),
                new AbstractMap.SimpleEntry<>("habitacion", Pattern.compile("^\\d{4}$")),
                new AbstractMap.SimpleEntry<>("FechaEntrada", Pattern.compile("^\\d{8}$")),
                new AbstractMap.SimpleEntry<>("FechaSalida", Pattern.compile("^\\d{8}$")),
                new AbstractMap.SimpleEntry<>("LlegadaHora", Pattern.compile("^\\d{6}$")),
                new AbstractMap.SimpleEntry<>("FechaBienvenida", Pattern.compile("^\\d{8}$"))
        ));
        // validar campos obligatorios
        //TODO al hacer el huespedvalidatiaontool aprovechar para hacer una superclase de las dos y evitar repetir código
        private static String[] validateRequiredFields(Reserva reserva) {
            List<String> errores = new ArrayList<>();
            Pattern hotelRegex = Pattern.compile("^M[1-4]$");
            Pattern reservationNumberRegex = Pattern.compile("^[0-9]{10}$");
            Matcher hotelMatch = hotelRegex.matcher(reserva.getHotel());
            Matcher reservationNumberMatch = reservationNumberRegex.matcher(reserva.getReservationNumber());
            //hotel
            if (reserva.getHotel() == null) {
                errores.add("El campo hotel no puede estar vacio");
            } else if (!hotelMatch.matches()) {
                errores.add("El hotel introducido no es válido");
            }
            //reservationNumber
            if (reserva.getReservationNumber() == null) {
                errores.add("El campo ReservationNumber no puede estar vacio");
            } else if (!reservationNumberMatch.matches()) {
                errores.add("El ReservationNumber introducido no es válido");
            }
            return errores.toArray(new String[0]);
        }
        private static String[] validateOptionalFields(Reserva reserva){
            List<String> errores = new ArrayList<>();
            //TODO
            return new String[0];
        }
        private static void adjustRequiredFields(Reserva reserva){
            reserva.setHotelFactura(reserva.getHotel());
            reserva.setNumReserva(reserva.getReservationNumber());
        }
    }
}
