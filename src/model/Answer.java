package src.model;

public class Answer {

 	private int id;
	private String content;
	
	
	
	public Answer( String a) {
	
		this.content = a;
	
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	@Override
	public int hashCode() {
		return Objects.hash(content, id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		return Objects.equals(content, other.content) && id == other.id;
	}



	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + "]";
	}
	
	
	
	
	

}
