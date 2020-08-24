package org.nickhinds.know_your_vote;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class RegisterToVote extends Fragment implements AdapterView.OnItemSelectedListener {
	private Spinner stateSpinner;
	private TextView tvRegInfo;

	// inflates and displays the this fragment
	@Nullable
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		return inflater.inflate(R.layout.register, container, false);
	}

	// loads the information used in this fragment
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		stateSpinner = view.findViewById(R.id.spinner_reg_states);

		// makes and fill an arraylist of RegistrationInformation objects that will be displayed based on the users selection from the spinner
		List<RegistrationInformation> regInfoList = new ArrayList<>();

		RegistrationInformation regFirst = new RegistrationInformation("", "");
		regInfoList.add(regFirst);
		RegistrationInformation regAlabama = new RegistrationInformation("Alabama", getString(R.string.reg_Alabama));
		regInfoList.add(regAlabama);
		RegistrationInformation regAlaska = new RegistrationInformation("Alaska", getString(R.string.reg_Alaska));
		regInfoList.add(regAlaska);
		RegistrationInformation regArizona = new RegistrationInformation("Arizona", getString(R.string.reg_Arizona));
		regInfoList.add(regArizona);
		RegistrationInformation regArkansas = new RegistrationInformation("Arkansas", getString(R.string.reg_Arkansas));
		regInfoList.add(regArkansas);
		RegistrationInformation regCalifornia = new RegistrationInformation("California", getString(R.string.reg_California));
		regInfoList.add(regCalifornia);
		RegistrationInformation regColorado = new RegistrationInformation("Colorado", getString(R.string.reg_Colorado));
		regInfoList.add(regColorado);
		RegistrationInformation regConnecticut = new RegistrationInformation("Connecticut", getString(R.string.reg_Connecticut));
		regInfoList.add(regConnecticut);
		RegistrationInformation regDelaware = new RegistrationInformation("Delaware", getString(R.string.reg_Delaware));
		regInfoList.add(regDelaware);
		RegistrationInformation regFlorida = new RegistrationInformation("Florida", getString(R.string.reg_Florida));
		regInfoList.add(regFlorida);
		RegistrationInformation regGeorgia = new RegistrationInformation("Georgia", getString(R.string.reg_Georgia));
		regInfoList.add(regGeorgia);
		RegistrationInformation regHawaii = new RegistrationInformation("Hawaii", getString(R.string.reg_Hawaii));
		regInfoList.add(regHawaii);
		RegistrationInformation regIdaho = new RegistrationInformation("Idaho", getString(R.string.reg_Idaho));
		regInfoList.add(regIdaho);
		RegistrationInformation regIllinois = new RegistrationInformation("Illinois", getString(R.string.reg_Illinois));
		regInfoList.add(regIllinois);
		RegistrationInformation regIndiana = new RegistrationInformation("Indiana", getString(R.string.reg_Indian));
		regInfoList.add(regIndiana);
		RegistrationInformation regIowa = new RegistrationInformation("Iowa", getString(R.string.reg_Iowa));
		regInfoList.add(regIowa);
		RegistrationInformation regKansas = new RegistrationInformation("Kansas", getString(R.string.reg_Kansas));
		regInfoList.add(regKansas);
		RegistrationInformation regKentucky = new RegistrationInformation("Kentucky", getString(R.string.reg_Kentucky));
		regInfoList.add(regKentucky);
		RegistrationInformation regLouisiana = new RegistrationInformation("Louisiana", getString(R.string.reg_Louisiana));
		regInfoList.add(regLouisiana);
		RegistrationInformation regMaine = new RegistrationInformation("Maine", getString(R.string.reg_Maine));
		regInfoList.add(regMaine);
		RegistrationInformation regMaryland = new RegistrationInformation("Maryland", getString(R.string.reg_Maryland));
		regInfoList.add(regMaryland);
		RegistrationInformation regMassachusetts = new RegistrationInformation("Massachusetts", getString(R.string.reg_Massachusetts));
		regInfoList.add(regMassachusetts);
		RegistrationInformation regMichigan = new RegistrationInformation("Michigan", getString(R.string.reg_Michigan));
		regInfoList.add(regMichigan);
		RegistrationInformation regMinnesota = new RegistrationInformation("Minnesota", getString(R.string.reg_Minnesota));
		regInfoList.add(regMinnesota);
		RegistrationInformation regMississippi = new RegistrationInformation("Mississippi", getString(R.string.reg_Mississippi));
		regInfoList.add(regMississippi);
		RegistrationInformation regMissouri = new RegistrationInformation("Missouri", getString(R.string.reg_Missouri));
		regInfoList.add(regMissouri);
		RegistrationInformation regMontana = new RegistrationInformation("Montana", getString(R.string.reg_Montana));
		regInfoList.add(regMontana);
		RegistrationInformation regNebraska = new RegistrationInformation("Nebraska", getString(R.string.reg_Neb));
		regInfoList.add(regNebraska);
		RegistrationInformation regNevada = new RegistrationInformation("Nevada", getString(R.string.reg_Nevada));
		regInfoList.add(regNevada);
		RegistrationInformation regNewHampshire = new RegistrationInformation("New Hampshire", getString(R.string.reg_NewHampshire));
		regInfoList.add(regNewHampshire);
		RegistrationInformation regNewJersey = new RegistrationInformation("New Jersey", getString(R.string.reg_NewJersey));
		regInfoList.add(regNewJersey);
		RegistrationInformation regNewMexico = new RegistrationInformation("New Mexico", getString(R.string.reg_NewMexico));
		regInfoList.add(regNewMexico);
		RegistrationInformation regNewYork = new RegistrationInformation("New York", getString(R.string.reg_NewYork));
		regInfoList.add(regNewYork);
		RegistrationInformation regNorthCarolina = new RegistrationInformation("North Carolina", getString(R.string.reg_NorthCarolina));
		regInfoList.add(regNorthCarolina);
		RegistrationInformation regNorthDakota = new RegistrationInformation("North Dakota", getString(R.string.reg_NorthDak));
		regInfoList.add(regNorthDakota);
		RegistrationInformation regOhio = new RegistrationInformation("Ohio", getString(R.string.reg_Ohio));
		regInfoList.add(regOhio);
		RegistrationInformation regOklahoma = new RegistrationInformation("Oklahoma", getString(R.string.reg_Ok));
		regInfoList.add(regOklahoma);
		RegistrationInformation regOregon = new RegistrationInformation("Oregon", getString(R.string.reg_Oregon));
		regInfoList.add(regOregon);
		RegistrationInformation regPennsylvania = new RegistrationInformation("Pennsylvania", getString(R.string.reg_Pennsylvania));
		regInfoList.add(regPennsylvania);
		RegistrationInformation regRhodeIsland = new RegistrationInformation("Rhode Island", getString(R.string.reg_RhodeIsland));
		regInfoList.add(regRhodeIsland);
		RegistrationInformation regSouthCarolina = new RegistrationInformation("South carolina", getString(R.string.reg_SouthCarolina));
		regInfoList.add(regSouthCarolina);
		RegistrationInformation regSouthDakota = new RegistrationInformation("South Dakota", getString(R.string.reg_SouthDakota));
		regInfoList.add(regSouthDakota);
		RegistrationInformation regTennessee = new RegistrationInformation("Tennessee", getString(R.string.reg_Tennessee));
		regInfoList.add(regTennessee);
		RegistrationInformation regTexas = new RegistrationInformation("Texas", getString(R.string.reg_Texas));
		regInfoList.add(regTexas);
		RegistrationInformation regUtah = new RegistrationInformation("Utah", getString(R.string.reg_Utah));
		regInfoList.add(regUtah);
		RegistrationInformation regVermont = new RegistrationInformation("Vermont", getString(R.string.reg_Vermont));
		regInfoList.add(regVermont);
		RegistrationInformation regVirginia = new RegistrationInformation("Virginia", getString(R.string.reg_Virginia));
		regInfoList.add(regVirginia);
		RegistrationInformation regWashington = new RegistrationInformation("Washington", getString(R.string.reg_Washington));
		regInfoList.add(regWashington);
		RegistrationInformation regWestVirginia = new RegistrationInformation("West Virginia", getString(R.string.reg_WestVirginia));
		regInfoList.add(regWestVirginia);
		RegistrationInformation regWisconsin = new RegistrationInformation("Wisconsin", getString(R.string.reg_Wisconsin));
		regInfoList.add(regWisconsin);
		RegistrationInformation regWyoming = new RegistrationInformation("Wyoming", getString(R.string.reg_Wyoming));
		regInfoList.add(regWyoming);

		ArrayAdapter<RegistrationInformation> adapter = new ArrayAdapter<RegistrationInformation>(getContext(), android.R.layout.simple_spinner_item, regInfoList);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		tvRegInfo = view.findViewById(R.id.reg_info);
		tvRegInfo.setVisibility(View.GONE);
		tvRegInfo.setMovementMethod(new ScrollingMovementMethod());
		stateSpinner.setAdapter(adapter);
		stateSpinner.setSelection(0,true);
		stateSpinner.setOnItemSelectedListener(this);
	}

	// gets the users selects and sets the associate information to tvRegInfo
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		RegistrationInformation registrationInformation = (RegistrationInformation) parent.getSelectedItem();
		displayStateRegInfo(registrationInformation);
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {

	}

	// build the string to be put in tvRegInfo then makes the textview visible
	public void displayStateRegInfo(RegistrationInformation registrationInformation)
	{
		String stateName = registrationInformation.getStateName();
		String stateRegInto = registrationInformation.getStateRegInfo();
		String regData = "State: "+stateName+"\n"+stateRegInto;

		tvRegInfo.setText(regData);
		tvRegInfo.setVisibility(View.VISIBLE);
	}
}