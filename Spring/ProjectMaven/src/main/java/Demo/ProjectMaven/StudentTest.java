package Demo.ProjectMaven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class StudentTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	private long rollno;
	private int marks;
	/**
	 * 
	 */
	public StudentTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param rollno
	 * @param marks
	 */
	public StudentTest(int id, String name, long rollno, int marks) {
		super();
		this.id = id;
		Name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the rollno
	 */
	public long getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentTest [id=" + id + ", Name=" + Name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
	
}
