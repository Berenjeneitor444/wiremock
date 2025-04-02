import com.fasterxml.jackson.annotation.JsonProperty;

class DatosComunicacion {
    @JsonProperty("Descripcion")
    private String descripcion;
    @JsonProperty("Direccion")
    private String direccion;
    @JsonProperty("CodigoPostal")
    private String codigoPostal;
    @JsonProperty("Poblacion")
    private String poblacion;
    @JsonProperty("Provincia")
    private String provincia;
    @JsonProperty("ComunidadAutonoma")
    private String comunidadAutonoma;
    @JsonProperty("Pais")
    private String pais;
    @JsonProperty("ApartadoCorreos")
    private String apartadoCorreos;
    @JsonProperty("Telefono")
    private String telefono;
    @JsonProperty("TelefonoMovil")
    private String telefonoMovil;
    @JsonProperty("FaxNumber")
    private String faxNumber;
    @JsonProperty("EMail")
    private String email;

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public String getPais() {
        return pais;
    }

    public String getApartadoCorreos() {
        return apartadoCorreos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setComunidadAutonoma(String comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setApartadoCorreos(String apartadoCorreos) {
        this.apartadoCorreos = apartadoCorreos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class Huesped {
    @JsonProperty("hotel")
    private String hotel;
    @JsonProperty("reservationNumber")
    private String reservationNumber;
    @JsonProperty("DatosComunicacion")
    private DatosComunicacion datosComunicacion;
    @JsonProperty("HotelFactura")
    private String hotelFactura;
    @JsonProperty("NumReserva")
    private String numReserva;
    @JsonProperty("NumeroCliente")
    private String numeroCliente;
    @JsonProperty("IDHuesped")
    private String idHuesped;
    @JsonProperty("TipoPersona")
    private String tipoPersona;
    @JsonProperty("Nombre_Pila")
    private String nombrePila;
    @JsonProperty("Nombre")
    private String nombre;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("FechaNacimiento")
    private String fechaNacimiento;
    @JsonProperty("PaisNacimiento")
    private String paisNacimiento;
    @JsonProperty("TipoDocumento")
    private String tipoDocumento;
    @JsonProperty("FechaExpedicion")
    private String fechaExpedicion;
    @JsonProperty("FechaCaducidad")
    private String fechaCaducidad;
    @JsonProperty("Edad")
    private String edad;
    @JsonProperty("IDDocumento")
    private String idDocumento;
    @JsonProperty("TipoCliente")
    private String tipoCliente;
    @JsonProperty("Sexo")
    private String sexo;
    @JsonProperty("AceptaInfo")
    private String aceptaInfo;
    @JsonProperty("Repetidor")
    private String repetidor;
    @JsonProperty("Vip")
    private String vip;
    @JsonProperty("FechaEntrada")
    private String fechaEntrada;
    @JsonProperty("FechaSalida")
    private String fechaSalida;

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(String reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public DatosComunicacion getDatosComunicacion() {
        return datosComunicacion;
    }

    public void setDatosComunicacion(DatosComunicacion datosComunicacion) {
        this.datosComunicacion = datosComunicacion;
    }

    public String getHotelFactura() {
        return hotelFactura;
    }

    public void setHotelFactura(String hotelFactura) {
        this.hotelFactura = hotelFactura;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(String idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAceptaInfo() {
        return aceptaInfo;
    }

    public void setAceptaInfo(String aceptaInfo) {
        this.aceptaInfo = aceptaInfo;
    }

    public String getRepetidor() {
        return repetidor;
    }

    public void setRepetidor(String repetidor) {
        this.repetidor = repetidor;
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
