package com.bookstore.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	
	private String volume;
	
	private String authors;
	
	private String categories;
	
	private Integer year;
	
	private Double rating ; 
	
	private String edition;
	
	private String language;
	
	private String extension;
	
	private Integer pages;
	
	private String filesize;
	
	private String md5;
	
	private String series;
	
	private String periodical;
	
	private String fileExtension;
	
	private String url;
	
	private String cover;
	
	private String epub;
	
	private String fb2;
	
	private String mobi;
	
	private String txt;
	
	private String rtf;
	
	private Boolean isAvailable;
	
	//Maybe description has long value, so defined as varchar and length not specofied
	@Column(columnDefinition = "varchar")
	private String description;
		
  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}

	
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public String getFilesize() {
		return filesize;
	}
	public void setFilesize(String filesize) {
		this.filesize = filesize;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getPeriodical() {
		return periodical;
	}
	public void setPeriodical(String periodical) {
		this.periodical = periodical;
	}
	public String getFileExtension() {
		return fileExtension;
	}
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
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
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", volume=" + volume + ", authors=" + authors + ", categories="
				+ categories + ", year=" + year + ", rating=" + rating + ", edition=" + edition + ", language="
				+ language + ", extension=" + extension + ", pages=" + pages + ", filesize=" + filesize + ", md5=" + md5
				+ ", series=" + series + ", periodical=" + periodical + ", fileExtension=" + fileExtension + ", url="
				+ url + ", cover=" + cover + ", epub=" + epub + ", fb2=" + fb2 + ", mobi=" + mobi + ", txt=" + txt
				+ ", rtf=" + rtf + ", isAvailable=" + isAvailable + ", description=" + description + "]";
	}
	
	

	
	
	

}
