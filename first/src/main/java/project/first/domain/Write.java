package project.first.domain;

public class Write {
    public Long Id;

    public Long writer_Id;

    public String title;

    public String category;

    public String writer_name;

    public String detail;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getWriter_Id() {
        return writer_Id;
    }

    public void setWriter_Id(Long writer_Id) {
        this.writer_Id = writer_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getWriter_name() {
        return writer_name;
    }

    public void setWriter_name(String writer_name) {
        this.writer_name = writer_name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}