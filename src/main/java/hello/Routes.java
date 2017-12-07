package hello;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routes {

	@Bean
	public RouterFunction<ServerResponse> router(){
		return route(RequestPredicates.GET("/reactive"),request->ServerResponse.ok().body(BodyInserters.fromObject("hello reactive world")));
	}
}
