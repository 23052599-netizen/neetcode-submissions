class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Pass 1 — rows
        for (int row = 0; row < 9; row++) {           // fix 1: < not <=
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {             // fix 2: complete the loop
                if (board[row][i] == '.') continue;
                if (seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);               // fix 3: outside the if-block
            }
        }

        // Pass 2 — columns
        for (int col = 0; col < 9; col++) {           // fix 1 (same): < not <=
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {             // fix 4: add the missing inner loop
                if (board[i][col] == '.') continue;   // fix 5: just continue, don't wrap
                if (seen.contains(board[i][col])) return false;
                seen.add(board[i][col]);               // fix 5: outside the if-block
            }
        }

        // Pass 3 — 3×3 boxes
        for (int sq = 0; sq < 9; sq++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);         // fix 6: outside the if-block
                }
            }
        }

        return true;                                   // fix 7: required return
    }
}