import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {
    public ValidationResponseDTO reservaValidate(Reserva reserva){
        // TODO RESOLVER LA ESTRUCTURACION DE ESTA CLASE AL VOLVER DE COMEEEEEER
    }
    public ValidationResponseDTO huespedValidate(Huesped huesped){

    }

    private class HuespedValidationTool{

    }
    private class ReservaValidationTool{
        /**
         * valida el objeto
         * @return ValidateResponseDTO, contiene la array de errores y un booleano para saber si se debe abortar la operacion o no
         */
        public ValidationResponseDTO validate(Reserva reserva){

            // validar, llenar array de errores en cada campo pero no abortar, a menos que haya problemas con Reservation number y/o hotel

            // validar campos obligatorios
            String[] erroresRF = validateRequiredFields();
            if(erroresRF.length != 0){
                // si hay errores en esos campos, se devuelven los errores y se aborta la operacion
                return new ValidationResponseDTO(true, erroresRF);
            }
            else{
                // si hay errores en los demás campos, se pone un valor default, se indica en errores y se sigue con la operación
                String[] erroresOF = validateOptionalFields();
                return new ValidationResponseDTO(false, erroresOF);
            }

        }
        // validar campos obligatorios
        private String[] validateRequiredFields(){
            List<String> errores = new ArrayList<>();
            Pattern hotelRegex = Pattern.compile("^M[1-4]$");
            Pattern reservationNumberRegex = Pattern.compile("^[0-9]{10}$");
            Matcher hotelMatch = hotelRegex.matcher(hotel);
            Matcher reservationNumberMatch = reservationNumberRegex.matcher(reservationNumber);
            //hotel
            if (hotel == null) {
                errores.add("El campo hotel no puede estar vacio");
            } else if (!hotelMatch.matches()) {
                errores.add("El hotel introducido no es válido");
            }
            //reservationNumber
            if (reservationNumber == null) {
                errores.add("El campo ReservationNumber no puede estar vacio");
            } else if (!reservationNumberMatch.matches()) {
                errores.add("El ReservationNumber introducido no es válido");
            }
            return errores.toArray(new String[0]);
        }
        private void adjustRequiredFields(){
            reservationNumber =
        }
        private String[] validateOptionalFields(){

        }
    }
}
