package sk.kasv;

import jakarta.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "hobby")
  private String hobby;

  @Column(name = "youtube_channel")
  private String youtube;

  public InstructorDetail(){
  }

  public InstructorDetail(String hobby, String youtube) {
    this.hobby = hobby;
    this.youtube = youtube;
  }

  public Long getId() {
    return id;
  }

  public String getHobby() {
    return hobby;
  }

  public String getYoutube() {
    return youtube;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }

  @Override
  public String toString() {
    return "InstructorDetail{" +
            "id=" + id +
            ", hobby='" + hobby + '\'' +
            ", youtube='" + youtube + '\'' +
            '}';
  }
}

