package com.tiagosilvagomes.ApiRestfulSpringBootMongoDB.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text;
	private Date data;
	private AuthorDTO author;

	public CommentDTO() {
	}

	public CommentDTO(String text, Date data, AuthorDTO author) {
		super();
		this.text = text;
		this.data = data;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
}