package com.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	ArrayList<States> stateList = new ArrayList<States>(Arrays.asList(new States(101, "kerala"),new States(102, "Karnataka"), new States(103, "Tamil Nadu")));
	
	public ArrayList<States> getStateList() {
		return stateList;
	}

	public void setStateList(ArrayList<States> stateList) {
		this.stateList = stateList;
	}

	public void addStates(States s) {
		this.stateList.add(s);
	}

	public void updateState(States s, int id) {

		for (int count = 0; count < stateList.size(); count++) {
			States t =stateList.get(count);
			if(t.getId()== id) {
				stateList.set(count, s);
				return;
			}
			
		}
	}

	public void deleteState(int id) {
		stateList.removeIf(t->t.getId()==id);
	}



}
