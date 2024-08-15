package com.crimsonLogic.EmployeeData;

public class Programmer extends Employee {
	private String projectName;
	private String projectId;
	private float bonus;
	public Programmer() {
		// TODO Auto-generated constructor stub
	}
	
	public Programmer(String projectName, String projectId, float bonus) {
		super();
		this.projectName = projectName;
		this.projectId = projectId;
		this.bonus = bonus;
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(bonus);
		result = prime * result + ((projectId == null) ? 0 : projectId.hashCode());
		result = prime * result + ((projectName == null) ? 0 : projectName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programmer other = (Programmer) obj;
		if (Float.floatToIntBits(bonus) != Float.floatToIntBits(other.bonus))
			return false;
		if (projectId == null) {
			if (other.projectId != null)
				return false;
		} else if (!projectId.equals(other.projectId))
			return false;
		if (projectName == null) {
			if (other.projectName != null)
				return false;
		} else if (!projectName.equals(other.projectName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Programmer [projectName=" + projectName + ", projectId=" + projectId + ", bonus=" + bonus + "]";
	}
	
	
	
}
