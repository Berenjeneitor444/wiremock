import java.io.IOException;
// clase main
public class Main {
    public static void main(String[] args) throws IOException {
        // Inicia el servidor WireMock
        MockServerManager serverSetup = new MockServerManager();
        serverSetup.startServer();

        // Configura los mocks/endpoints
        EndpointStubber endpointStubber = new EndpointStubber();
        endpointStubber.setupMocks();

        // Mantén el servidor activo
        System.in.read(); // Mantiene el servidor corriendo hasta que el usuario presione enter

        // Detén el servidor
        serverSetup.stopServer();
    }
}

