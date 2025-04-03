import com.github.tomakehurst.wiremock.extension.ResponseTransformerV2;
import com.github.tomakehurst.wiremock.http.Response;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;

import java.io.IOException;

public class ResponseProcessor implements ResponseTransformerV2 {

    @Override
    public Response transform(Response response, ServeEvent serveEvent) {
        byte[] responseBody;
        BodyProcessor bodyProcessor = new BodyProcessor();
        try {
            switch (serveEvent.getRequest().getUrl()) {
                case "reserva/crear":
                    responseBody = bodyProcessor.reservaCrear(serveEvent.getRequest().getBody());
                    break;
                case "reserva/listar":
                    responseBody = bodyProcessor.reservaListar(serveEvent.getRequest().getBody());
                    break;
                case "huesped/crear":
                    responseBody = bodyProcessor.huespedCrear(serveEvent.getRequest().getBody());
                    break;
                case "huesped/listar":
                    responseBody = bodyProcessor.huespedListar(serveEvent.getRequest().getBody());
                    break;
                default:
                    throw new RuntimeException("not valid stub, shouldn't arrived here");
            }
        }
        // TODO: mejorar manejo de errores
        catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        catch(RuntimeException e){
            return Response.Builder.like(response).but().body(e.getMessage()).build();
        }
        return Response.Builder.like(response).but().body(responseBody).build();
    }

    @Override
    public String getName() {
        return "data-processor";
    }
}
