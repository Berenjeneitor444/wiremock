import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.regex.*;
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

    public Reserva(){}

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

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setCheckoutRealized(boolean checkoutRealized) {
        this.checkoutRealized = checkoutRealized;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public void setHotelFactura(String hotelFactura) {
        this.hotelFactura = hotelFactura;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public void setBono(String bono) {
        this.bono = bono;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setThDescripcion(String thDescripcion) {
        this.thDescripcion = thDescripcion;
    }

    public void setThUso(String thUso) {
        this.thUso = thUso;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public void setJr(int jr) {
        this.jr = jr;
    }

    public void setCu(int cu) {
        this.cu = cu;
    }

    public void setPreCheckIn(String preCheckIn) {
        this.preCheckIn = preCheckIn;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setMotivoViaje(String motivoViaje) {
        this.motivoViaje = motivoViaje;
    }

    public void setLlegadaHora(String llegadaHora) {
        this.llegadaHora = llegadaHora;
    }

    public void setThFactura(String thFactura) {
        this.thFactura = thFactura;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public void setFechaBienv(String fechaBienv) {
        this.fechaBienv = fechaBienv;
    }

    public void setHoraBienv(String horaBienv) {
        this.horaBienv = horaBienv;
    }
}