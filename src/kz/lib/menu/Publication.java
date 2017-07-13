package kz.lib.menu;

import java.sql.Date;

public class Publication {
    private int id;
    private String type;
    private String name;
    private Date year;
    private Integer pages;
    private String publishing;
    private  String description;
    private String article;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Date getYear() {
        return year;
    }

    public Integer getPages() {
        return pages;
    }

    public String getPublishing() {
        return publishing;
    }

    public String getDescription(){return description;}

    public String getArticle() {return article;}


}
