package org.pro.demang.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

	private int p_id;
	private int p_origin;
	private String p_type;
	private int p_writer;
	private String p_content;
	private Timestamp p_regDate;
	private MemberDTO memberDTO;
	private PostImgDTO postImgDTO;
	private int p_likeCount;
	
	public PostDTO(String p_type, int p_writer, String p_content) {
		this.p_type = p_type;
		this.p_writer = p_writer;
		this.p_content = p_content;
	}
	
	public PostDTO(int p_origin, String p_type, int p_writer, String p_content) {
		this.p_origin = p_origin;
		this.p_type = p_type;
		this.p_writer = p_writer;
		this.p_content = p_content;
	}
	
	//// String으로 setter
	public void setP_writer(String p_writer) {
		this.p_writer = Integer.parseInt(p_writer);
	}
	
}
