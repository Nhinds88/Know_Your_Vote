package org.nickhinds.know_your_vote;

// build an Object of Registration information to be used in RegisterToVote
public class RegistrationInformation
{
	private String stateName;
	private String stateRegInfo;

	public RegistrationInformation(String stateName, String stateRegInfo) {
		this.stateName = stateName;
		this.stateRegInfo = stateRegInfo;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateRegInfo() {
		return stateRegInfo;
	}

	public void setStateRegInfo(String stateRegInfo) {
		this.stateRegInfo = stateRegInfo;
	}

	// Overrides toString to only display stateName, this is used in the spinner so it doesn't show the reg info in the spinner
	@Override
	public String toString() {
		return stateName;
	}
}
