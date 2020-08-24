package org.nickhinds.know_your_vote;

// builds a VoterInformation object to be used in the HowToVote class
public class VoterInformation
{
	// int flag is the id for the flag images stored in drawable
	private String stateName;
	private String stateVoteInfo;
	private int flag;


	public VoterInformation(String stateName, String stateVoteInfo, int flag) {
		this.stateName = stateName;
		this.stateVoteInfo = stateVoteInfo;
		this.flag = flag;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateVoteInfo() {
		return stateVoteInfo;
	}

	public void setStateVoteInfo(String stateVoteInfo) {
		this.stateVoteInfo = stateVoteInfo;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	// this is to just show the stateName in the spinner instead of the all three fields of this object
	@Override
	public String toString() {
		return stateName;
	}
}
