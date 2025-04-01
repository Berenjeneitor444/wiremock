
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class EndpointStubber {
    //Crea los endpoints mockeados, definiendo la respuesta de manera programatica
    public void setupMocks(){
        stubFor(post(urlEqualTo("/reserva/crear"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", "application/json")
                        .withBody("")));

        stubFor(post(urlEqualTo("/reserva/listar"))
        .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("HelloWorld")));

        stubFor(post(urlEqualTo("/huesped/crear"))
        .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("HelloWorld")));

        stubFor(post(urlEqualTo("/huesped/listar"))
        .willReturn(aResponse()
                .withHeader("Content-Type", "application/json")
                .withBody("HelloWorld")));

    }
}
