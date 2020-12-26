package boj.graphSearchAlgorithm.basic.efficientHacking.sol2;

/*
 *   문제명 : 효율적인 해킹
 *
 *   - https://www.acmicpc.net/problem/1325
 *   - 성공
 *
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static StringTokenizer st;
    private static int n, m;
    private static List<List<Integer>> graph;
    private static int maxVal = -1;
    private static List<Integer> result;

    private static int bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        boolean[] visited = new boolean[n+1];
        visited[x] = true;
        int count = 1;
        while (!q.isEmpty()) {
            int now_pos = q.poll();
            for (int next_pos : graph.get(now_pos)) {
                if (!visited[next_pos]) {
                    q.offer(next_pos);
                    visited[next_pos] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for (int i=0; i < n+1; i++) graph.add(new ArrayList<>());

        for (int i=0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(y).add(x);
        }

        result = new ArrayList<>();

        for (int i=1; i < n+1; i++) {
            int count = bfs(i);
            if (count > maxVal) { // 새로운 최대값이 나타났을 경우, 기존 결과 목록 초기화
                result = new ArrayList<>();
                result.add(i);
                maxVal = count;
            } else if (count == maxVal) {
                result.add(i);
                maxVal = count;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            sb.append(r).append(" ");
        }

        System.out.println(sb.toString());

        br.close();
    }
}
