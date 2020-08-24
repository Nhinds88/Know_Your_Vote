package org.nickhinds.know_your_vote;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class HowToVote extends Fragment implements AdapterView.OnItemSelectedListener {
	private Spinner stateSpinner;
	private TextView tvVoteInfo;
	private ImageView imgFlag;

	// inflates and displays the this fragment
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.vote, container, false);
	}

	// loads the information used in this fragment
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		stateSpinner = view.findViewById(R.id.spinner_vote_states);

		// makes and fill an arraylist of voterInformation objects that will be displayed based on the users selection from the spinner
		List<VoterInformation> voteInfoList = new ArrayList<>();

		VoterInformation voteFirst = new VoterInformation("", "", R.drawable.ic_nothing);
		voteInfoList.add(voteFirst);
		VoterInformation voteAlabama = new VoterInformation("Alabama", getString(R.string.voteAlabama), R.drawable.al);
		voteInfoList.add(voteAlabama);
		VoterInformation voteAlaska = new VoterInformation("Alaska", getString(R.string.voteAlaska), R.drawable.ak);
		voteInfoList.add(voteAlaska);
		VoterInformation voteArizona = new VoterInformation("Arizona", getString(R.string.voteArizona), R.drawable.az);
		voteInfoList.add(voteArizona);
		VoterInformation voteArkansas = new VoterInformation("Arkansas", getString(R.string.voteArkansas), R.drawable.ar);
		voteInfoList.add(voteArkansas);
		VoterInformation voteCalifornia = new VoterInformation("California", getString(R.string.voteCalifornia), R.drawable.ca);
		voteInfoList.add(voteCalifornia);
		VoterInformation voteColorado = new VoterInformation("Colorado", getString(R.string.voteColorado), R.drawable.co);
		voteInfoList.add(voteColorado);
		VoterInformation voteConnecticut = new VoterInformation("Connecticut", getString(R.string.voteConnecticut), R.drawable.ct);
		voteInfoList.add(voteConnecticut);
		VoterInformation voteDelaware = new VoterInformation("Delaware",  getString(R.string.voteDelaware), R.drawable.de);
		voteInfoList.add(voteDelaware);
		VoterInformation voteFlorida = new VoterInformation("Florida", getString(R.string.voteFlorida), R.drawable.fl);
		voteInfoList.add(voteFlorida);
		VoterInformation voteGeorgia = new VoterInformation("Georgia", getString(R.string.voteGeorgia), R.drawable.ga);
		voteInfoList.add(voteGeorgia);
		VoterInformation voteHawaii = new VoterInformation("Hawaii", getString(R.string.voteHawaii), R.drawable.hi);
		voteInfoList.add(voteHawaii);
		VoterInformation voteIdaho = new VoterInformation("Idaho", getString(R.string.voteIdaho), R.drawable.id);
		voteInfoList.add(voteIdaho);
		VoterInformation voteIllinois = new VoterInformation("Illinois", getString(R.string.voteIllinois), R.drawable.il);
		voteInfoList.add(voteIllinois);
		VoterInformation voteIndiana = new VoterInformation("Indiana", getString(R.string.voteIndiana), R.drawable.in);
		voteInfoList.add(voteIndiana);
		VoterInformation voteIowa = new VoterInformation("Iowa", getString(R.string.voteIowa), R.drawable.ia);
		voteInfoList.add(voteIowa);
		VoterInformation voteKansas = new VoterInformation("Kansas", getString(R.string.voteKansas), R.drawable.ks);
		voteInfoList.add(voteKansas);
		VoterInformation voteKentucky = new VoterInformation("Kentucky", getString(R.string.voteKentucky), R.drawable.ky);
		voteInfoList.add(voteKentucky);
		VoterInformation voteLouisiana = new VoterInformation("Louisiana", getString(R.string.voteLouisiana), R.drawable.la);
		voteInfoList.add(voteLouisiana);
		VoterInformation voteMaine = new VoterInformation("Maine", getString(R.string.voteMaine), R.drawable.me);
		voteInfoList.add(voteMaine);
		VoterInformation voteMaryland = new VoterInformation("Maryland", getString(R.string.voteMaryland), R.drawable.md);
		voteInfoList.add(voteMaryland);
		VoterInformation voteMassachusetts = new VoterInformation("Massachusetts", getString(R.string.voteMassachusetts), R.drawable.ma);
		voteInfoList.add(voteMassachusetts);
		VoterInformation voteMichigan = new VoterInformation("Michigan", getString(R.string.voteMichigan), R.drawable.mi);
		voteInfoList.add(voteMichigan);
		VoterInformation voteMinnesota = new VoterInformation("Minnesota", getString(R.string.voteMinnesota), R.drawable.mn);
		voteInfoList.add(voteMinnesota);
		VoterInformation voteMississippi = new VoterInformation("Mississippi", getString(R.string.voteMississippi), R.drawable.ms);
		voteInfoList.add(voteMississippi);
		VoterInformation voteMissouri = new VoterInformation("Missouri", getString(R.string.voteMissouri), R.drawable.mo);
		voteInfoList.add(voteMissouri);
		VoterInformation voteMontana = new VoterInformation("Montana", getString(R.string.voteMontana), R.drawable.mt);
		voteInfoList.add(voteMontana);
		VoterInformation voteNebraska = new VoterInformation("Nebraska", getString(R.string.voteNebraska), R.drawable.ne);
		voteInfoList.add(voteNebraska);
		VoterInformation voteNevada = new VoterInformation("Nevada", getString(R.string.voteNevada), R.drawable.nv);
		voteInfoList.add(voteNevada);
		VoterInformation voteNewHampshire = new VoterInformation("New Hampshire", getString(R.string.voteNewHampshire), R.drawable.nh);
		voteInfoList.add(voteNewHampshire);
		VoterInformation voteNewJersey = new VoterInformation("New Jersey", getString(R.string.voteNewJersey), R.drawable.nj);
		voteInfoList.add(voteNewJersey);
		VoterInformation voteNewMexico = new VoterInformation("New Mexico", getString(R.string.voteNewMexico), R.drawable.nm);
		voteInfoList.add(voteNewMexico);
		VoterInformation voteNewYork = new VoterInformation("New York", getString(R.string.voteNewYork), R.drawable.ny);
		voteInfoList.add(voteNewYork);
		VoterInformation voteNorthCarolina = new VoterInformation("North Carolina", getString(R.string.voteNorthCarolina), R.drawable.nc);
		voteInfoList.add(voteNorthCarolina);
		VoterInformation voteNorthDakota = new VoterInformation("North Dakota", getString(R.string.voteNorthDakota), R.drawable.nd);
		voteInfoList.add(voteNorthDakota);
		VoterInformation voteOhio = new VoterInformation("Ohio", getString(R.string.voteOhio), R.drawable.oh);
		voteInfoList.add(voteOhio);
		VoterInformation voteOklahoma = new VoterInformation("Oklahoma", getString(R.string.voteOklahoma), R.drawable.ok);
		voteInfoList.add(voteOklahoma);
		VoterInformation voteOregon = new VoterInformation("Oregon", getString(R.string.voteOregon), R.drawable.or);
		voteInfoList.add(voteOregon);
		VoterInformation votePennsylvania = new VoterInformation("Pennsylvania", getString(R.string.votePennsylvania), R.drawable.pa);
		voteInfoList.add(votePennsylvania);
		VoterInformation voteRhodeIsland = new VoterInformation("Rhode Island", getString(R.string.voteRhodeIsland), R.drawable.ri);
		voteInfoList.add(voteRhodeIsland);
		VoterInformation voteSouthCarolina = new VoterInformation("South carolina", getString(R.string.voteSouthCarolina), R.drawable.sc);
		voteInfoList.add(voteSouthCarolina);
		VoterInformation voteSouthDakota = new VoterInformation("South Dakota", getString(R.string.voteSouthDakota), R.drawable.sd);
		voteInfoList.add(voteSouthDakota);
		VoterInformation voteTennessee = new VoterInformation("Tennessee", getString(R.string.voteTennessee), R.drawable.tn);
		voteInfoList.add(voteTennessee);
		VoterInformation voteTexas = new VoterInformation("Texas", getString(R.string.voteTexas), R.drawable.tx);
		voteInfoList.add(voteTexas);
		VoterInformation voteUtah = new VoterInformation("Utah", getString(R.string.voteUtah), R.drawable.ut);
		voteInfoList.add(voteUtah);
		VoterInformation voteVermont = new VoterInformation("Vermont", getString(R.string.voteVermont), R.drawable.vt);
		voteInfoList.add(voteVermont);
		VoterInformation voteVirginia = new VoterInformation("Virginia", getString(R.string.voteVirginia), R.drawable.va);
		voteInfoList.add(voteVirginia);
		VoterInformation voteWashington = new VoterInformation("Washington", getString(R.string.voteWashington), R.drawable.wa);
		voteInfoList.add(voteWashington);
		VoterInformation voteWestVirginia = new VoterInformation("West Virginia", getString(R.string.voteWestVirginia), R.drawable.wv);
		voteInfoList.add(voteWestVirginia);
		VoterInformation voteWisconsin = new VoterInformation("Wisconsin", getString(R.string.voteWisconsin), R.drawable.wi);
		voteInfoList.add(voteWisconsin);
		VoterInformation voteWyoming = new VoterInformation("Wyoming", getString(R.string.voteWyoming), R.drawable.wy);
		voteInfoList.add(voteWyoming);

		// fills the spinner
		ArrayAdapter<VoterInformation> adapter = new ArrayAdapter<VoterInformation>(getContext(), android.R.layout.simple_spinner_item, voteInfoList);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		// the the textviews and spinner
		tvVoteInfo = view.findViewById(R.id.vote_info);
		tvVoteInfo.setVisibility(View.GONE);
		imgFlag = view.findViewById(R.id.state_flag);
		imgFlag.setVisibility(View.GONE);
		stateSpinner.setAdapter(adapter);
		stateSpinner.setSelection(0, true);
		stateSpinner.setOnItemSelectedListener(this);
	}

	// gets the users selects and sets the associate information to tvVoteInfo
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		VoterInformation voterInformation = (VoterInformation) parent.getSelectedItem();
		displayStateVoteInfo(voterInformation);
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {

	}

	// build the string to be put in tvVoteInfo then makes the textview visible
	public void displayStateVoteInfo(VoterInformation voterInformation)
	{
		String stateName = voterInformation.getStateName();
		String stateVoteInfo = voterInformation.getStateVoteInfo();

		int flagID = voterInformation.getFlag();

		String voteData = "State: "+stateName+"\n"+stateVoteInfo;

		tvVoteInfo.setText(voteData);
		imgFlag.setImageResource(flagID);
		tvVoteInfo.setVisibility(View.VISIBLE);
		imgFlag.setVisibility(View.VISIBLE);
	}

}
