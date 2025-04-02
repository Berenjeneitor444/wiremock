import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    @JsonProperty("hotel")
    private String hotel;

    @JsonProperty("ReservationNumber")
    private String reservationNumber;

    @JsonProperty("checkoutRealized")
    private boolean checkoutRealized;

    @JsonProperty("CheckIn")
    private String checkIn;

    @JsonProperty("Localizador")
    private String localizador;

    @JsonProperty("HotelFactura")
    private String hotelFactura;

    @JsonProperty("NumReserva")
    private String numReserva;

    @JsonProperty("Bono")
    private String bono;

    @JsonProperty("Estado")
    private int estado;

    @JsonProperty("Habitacion")
    private String habitacion;

    @JsonProperty("THDescripcion")
    private String thDescripcion;

    @JsonProperty("THUso")
    private String thUso;

    @JsonProperty("Seccion")
    private String seccion;

    @JsonProperty("Tarifa")
    private String tarifa;

    @JsonProperty("AD")
    private int ad;

    @JsonProperty("NI")
    private int ni;

    @JsonProperty("JR")
    private int jr;

    @JsonProperty("CU")
    private int cu;

    @JsonProperty("PreCheckIn")
    private String preCheckIn;

    @JsonProperty("FechaEntrada")
    private String fechaEntrada;

    @JsonProperty("FechaSalida")
    private String fechaSalida;

    @JsonProperty("MotivoViaje")
    private String motivoViaje;

    @JsonProperty("LlegadaHora")
    private String llegadaHora;

    @JsonProperty("THFactura")
    private String thFactura;

    @JsonProperty("Bienvenida")
    private String bienvenida;

    @JsonProperty("FechaBienv")
    private String fechaBienv;

    @JsonProperty("HoraBienv")
    private String horaBienv;

    public String getHotel() {
        return hotel;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public boolean isCheckoutRealized() {
        return checkoutRealized;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getLocalizador() {
        return localizador;
    }

    public String getHotelFactura() {
        return hotelFactura;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public String getBono() {
        return bono;
    }

    public int getEstado() {
        return estado;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public String getThDescripcion() {
        return thDescripcion;
    }

    public String getThUso() {
        return thUso;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getTarifa() {
        return tarifa;
    }

    public int getAd() {
        return ad;
    }

    public int getNi() {
        return ni;
    }

    public int getJr() {
        return jr;
    }

    public int getCu() {
        return cu;
    }

    public String getPreCheckIn() {
        return preCheckIn;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getMotivoViaje() {
        return motivoViaje;
    }

    public String getLlegadaHora() {
        return llegadaHora;
    }

    public String getThFactura() {
        return thFactura;
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public String getFechaBienv() {
        return fechaBienv;
    }

    public String getHoraBienv() {
        return horaBienv;
    }
    public String[] validate(){
        List<String> errores = new ArrayList<>();
        // TODO: validar, llenar array de errores en cada campo pero no abortar
    }
}