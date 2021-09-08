package mellat.ir.card.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConvertTo implements Serializable{

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
	private String id;
	private String epub;
	private String fb2;
	private String mobi;
	private String txt;
	private String rtf;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEpub() {
		return epub;
	}

	public void setEpub(String epub) {
		this.epub = epub;
	}

	public String getFb2() {
		return fb2;
	}

	public void setFb2(String fb2) {
		this.fb2 = fb2;
	}

	public String getMobi() {
		return mobi;
	}

	public void setMobi(String mobi) {
		this.mobi = mobi;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String getRtf() {
		return rtf;
	}

	public void setRtf(String rtf) {
		this.rtf = rtf;
	}

}
