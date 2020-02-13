
package ru.esphere.school.service;

import ru.esphere.school.data.MembersGroup;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Finder {
	
	public static void main(String args[]) {
		
	}

    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        groups.stream().forEach(membersGroup -> membersGroup.getMembers().stream().
                filter(member -> member.getAge() > targetAge).
                forEach(member -> groupsNames.add(member.getName())));

        return groupsNames;
    }
}

