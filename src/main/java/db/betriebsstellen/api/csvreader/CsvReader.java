package db.betriebsstellen.api.csvreader;

import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParserBuilder;

import db.betriebsstellen.api.persistence.model.Betriebsstelle;
import db.betriebsstellen.api.persistence.model.Betriebsstellen;

@Component
public class CsvReader {

	@Autowired
	private Betriebsstellen betriebsstellenObj;

	@Value("${db.api.readFilePath}")
	private String Filename;

	@EventListener(ApplicationReadyEvent.class)
	public void ReadCsv() {
		try {
			CSVReader reader = new CSVReaderBuilder(new FileReader(Filename))
					.withCSVParser(new CSVParserBuilder().withSeparator(';').build()).withSkipLines(1).build();

			List<Betriebsstelle> betriebstelleObjectList = reader.readAll().stream().map(data -> {
				Betriebsstelle betriebsstelleObject = new Betriebsstelle();
				betriebsstelleObject.setPlc(data[0]);
				betriebsstelleObject.setRL100Code(data[1]);
				betriebsstelleObject.setRL100Langname(data[2]);
				betriebsstelleObject.setRL100Kurzname(data[3]);
				betriebsstelleObject.setTypKurz(data[4]);
				betriebsstelleObject.setTypLang(data[5]);
				betriebsstelleObject.setBetriebszustand(data[6]);
				betriebsstelleObject.setDatumAb(data[7]);
				betriebsstelleObject.setDatumBis(data[8]);
				betriebsstelleObject.setNiederlassung(data[9]);
				betriebsstelleObject.setRegionalbereich(data[10]);
				betriebsstelleObject.setLetzteAenderung(data[11]);
				return betriebsstelleObject;
			}).collect(Collectors.toList());

			betriebsstellenObj.setBetriebstellenListe(betriebstelleObjectList);

			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
