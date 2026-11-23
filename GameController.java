
import java.io.*;
import java.util.*;

class GameController {

    static FastScanner fs = new FastScanner(System.in);
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // true: input starts with t
        // false: single test case
        boolean multipleTestCases = false;

        int t = multipleTestCases ? fs.nextInt() : 1;

        while (t-- > 0) {
            solve();
            if (t != 0) out.append("\n");
        }

        System.out.print(out);
    }

    static void solve() throws IOException {

        // Solution goes here.
        int ans = Math.abs(fs.nextInt() - fs.nextInt());

        out.append(ans);
    }

    static class FastScanner {

        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;

            do {
                c = read();
            } while (c <= 32 && c != -1);

            while (c > 32) {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        char nextChar() throws IOException {
            return next().charAt(0);
        }

        int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        double[] nextDoubleArray(int n) throws IOException {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = nextDouble();
            return a;
        }

        String[] nextStringArray(int n) throws IOException {
            String[] a = new String[n];
            for (int i = 0; i < n; i++) a[i] = next();
            return a;
        }

        char[] nextCharArray() throws IOException {
            return next().toCharArray();
        }

        int[][] nextIntMatrix(int n, int m) throws IOException {
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    a[i][j] = nextInt();

            return a;
        }

        long[][] nextLongMatrix(int n, int m) throws IOException {
            long[][] a = new long[n][m];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    a[i][j] = nextLong();

            return a;
        }

        char[][] nextCharGrid(int n) throws IOException {
            char[][] a = new char[n][];

            for (int i = 0; i < n; i++)
                a[i] = nextCharArray();

            return a;
        }
    }
}
