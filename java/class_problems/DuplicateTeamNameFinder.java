/**
 * PROBLEM 2 - Duplicate Team Name Finder
 * Plain O(n^2) nested loops. No HashSet, no Collections, no Arrays.sort.
 * Inner loop starts at i+1 so every unordered pair is checked exactly once.
 */
public class DuplicateTeamNameFinder {

    static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null || teamNames.length < 2) {
            return "No Duplicates Found";
        }
        for (int i = 0; i < teamNames.length - 1; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                // case-sensitive compare; equals() not ==, because String
                // identity is not value equality
                if (teamNames[i] != null && teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        System.out.println(findDuplicateTeam(
                new String[]{"ByteForce", "CodeCrafters", "ByteForce"}));
        // Duplicate Found: ByteForce

        System.out.println(findDuplicateTeam(
                new String[]{"ByteForce", "CodeCrafters", "NullPointers"}));
        // No Duplicates Found

        System.out.println(findDuplicateTeam(
                new String[]{"byteforce", "ByteForce"}));
        // No Duplicates Found  (case-sensitive)

        System.out.println(findDuplicateTeam(
                new String[]{"A", "B", "C", "B", "A"}));
        // Duplicate Found: A   (first duplicate in scan order)
    }
}
