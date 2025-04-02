import com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterAction;
import com.github.tomakehurst.wiremock.extension.requestfilter.StubRequestFilterV2;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;

public class RequestProcessor implements StubRequestFilterV2 {
    @Override
    public RequestFilterAction filter(Request request, ServeEvent serveEvent) {
        //TODO: VALIDAR ENDPOINT Y JSON VALIDO
    }

    @Override
    public String getName() {
        return "";
    }
}
