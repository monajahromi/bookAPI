package mellat.ir.card.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Book implements Serializable{

	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	private String title;
	private String author;
	private String authorFirstname;
	private String authorLastname;
	private String authorMiddlename;
	private String categories;
	private String volume;
	private Integer year;
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
	private String description;
	private String cover;
	
	@OneToMany
	private Set<ConvertTo> converts;
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}


	

	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getAuthorFirstname() {
		return authorFirstname;
	}



	public void setAuthorFirstname(String authorFirstname) {
		this.authorFirstname = authorFirstname;
	}



	public String getAuthorLastname() {
		return authorLastname;
	}



	public void setAuthorLastname(String authorLastname) {
		this.authorLastname = authorLastname;
	}



	public String getAuthorMiddlename() {
		return authorMiddlename;
	}



	public void setAuthorMiddlename(String authorMiddlename) {
		this.authorMiddlename = authorMiddlename;
	}



	public String getCategories() {
		return categories;
	}



	public void setCategories(String categories) {
		this.categories = categories;
	}



	public String getVolume() {
		return volume;
	}



	public void setVolume(String volume) {
		this.volume = volume;
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








	public Set<ConvertTo> getConverts() {
		return converts;
	}



	public void setConverts(Set<ConvertTo> converts) {
		this.converts = converts;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authorFirstname=" + authorFirstname + ", authorLastname="
				+ authorLastname + ", authorMiddlename=" + authorMiddlename + ", categories=" + categories + ", volume="
				+ volume + ", year=" + year + ", edition=" + edition + ", language=" + language + ", extension="
				+ extension + ", pages=" + pages + ", filesize=" + filesize + ", md5=" + md5 + ", series=" + series
				+ ", periodical=" + periodical + ", fileExtension=" + fileExtension + ", url=" + url + ", description="
				+ description + ", cover=" + cover + ", converts=" + converts + "]";
	}




	


}
