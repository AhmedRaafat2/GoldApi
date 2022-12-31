import java.util.ArrayList;
import java.util.List;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/prices")
public class PriceAPI {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Price> getPrices() {
        List<Price> prices = new ArrayList<>();

        prices.add(new Price(1, "جرام عيار ٢٤", 1897, 1862, 35));
        prices.add(new Price(2, "جرام عيار ٢٢", 1739, 1706, 33));
        prices.add(new Price(3, "جرام عيار ٢١", 1660, 1630, 30));

        return prices;
    }
    
}