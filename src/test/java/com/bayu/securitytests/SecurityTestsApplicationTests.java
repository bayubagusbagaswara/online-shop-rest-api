package com.bayu.securitytests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@SpringBootTest
class SecurityTestsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void date() {
		String utcTimestamp = "2020-05-25 08:03:24";
		// parse the datetime as it is to an object that only knows date and time (no zone)
		LocalDateTime datetimeWithoutZone = LocalDateTime.parse(utcTimestamp,
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		// convert it to a zone-aware datetime object by adding a zone
		ZonedDateTime utcZdt = datetimeWithoutZone.atZone(ZoneId.of("UTC"));
		// print the datetime in utc once
		System.out.println(utcZdt);
		// then convert the zoned datetime to a different time zone
		ZonedDateTime asiaJakartaZdt = utcZdt.withZoneSameInstant(ZoneId.of("Asia/Jakarta"));
		// and print the result
		System.out.println(asiaJakartaZdt);
		int value = asiaJakartaZdt.getMonth().getValue();

		ZoneId zoneId = ZoneId.of("Asia/Jakarta");

		LocalDateTime now = LocalDateTime.now(zoneId);

		Locale localeIndonesia = new Locale("id", "ID");

		String displayName = now.getMonth().getDisplayName(TextStyle.SHORT, localeIndonesia);

		String name = mappingMonth(value);

		System.out.println("Name Jakarta Month : " + displayName);
	}

	private String mappingMonth(int value) {
		switch (value) {
			case 1:
				return "JANUARI";
			case 2:
				return "FEBRUARI";
			case 3:
				return "MARET";
			case 4:
				return "APRIL";
			case 5:
				return "MEI";
			case 6:
				return "JUNI";
			case 7:
				return "JULI";
			case 8:
				return "AGUSTUS";
			case 9:
				return "SEPTEMBER";
			case 10:
				return "OKTOBER";
			case 11:
				return "NOVEMBER";
			default:
				return "DESEMBER";
		}
	}
}
