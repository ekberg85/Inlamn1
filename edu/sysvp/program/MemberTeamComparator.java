package tig058.handin01.member;

import java.util.*;
/**
 * Simple compator class intented to be used when wanting to Sort
 * lists of members alphabetically. Sorts primarily on family name and
 * secondaily on given name.
 *
 */
public class MemberTeamComparator implements Comparator<Member>{

    public int compare(Member s1, Member s2){
	if(s1.getTeamMembers().equals(s2.getTeamMembers())){
	    return s1.getTeamMembers().compareTo(s2.getTeamMembers());
	}else{
	    return s1.getTeamMembers().compareTo(s2.getTeamMembers());
	}
    }
}
