package io.manasobi;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AppBootSecurityTest {

	@Test(expected = HttpClientErrorException.class)
	public void testVanillaService() {

		RestTemplate restTemplate = new RestTemplate();

		restTemplate.getForObject("http://localhost:8080/greet", Greet.class);
	}

	@Test
	public void testSecureService() {

		String plainCreds = "guest:guest";

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + Base64Utils.encodeToString(plainCreds.getBytes()));

		HttpEntity<String> request = new HttpEntity<>(headers);

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Greet> response = restTemplate.exchange("http://localhost:8080/greet", HttpMethod.GET, request, Greet.class);
		Assert.assertEquals("Hello World!", response.getBody().getMessage());
	}

}
