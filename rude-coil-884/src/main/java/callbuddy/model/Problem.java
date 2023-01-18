package callbuddy.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Problem {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer problemId;
	private String problem;
	private ProblemType problemType;
	

	@OneToOne 
	private Call call;
	
	
	@OneToOne
	private Solution solution;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	
	



}