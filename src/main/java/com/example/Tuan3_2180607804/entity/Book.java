package com.example.Tuan3_2180607804.entity;
import com.example.Tuan3_2180607804.validator.annotation.ValidCategoryId;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import com.example.Tuan3_2180607804.validator.annotation.ValidUserId;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="title")
    @NotEmpty(message = "Tên không được quá 50 ký tự")
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="price")
    @NotNull(message = "Giá tiền phải có")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @ValidCategoryId
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ValidUserId
    private User user;
}
