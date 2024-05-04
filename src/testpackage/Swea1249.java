package testpackage;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Swea1249 {
    private static int N; // 지도의 크기
    private static int[][] map; // 각 지점의 복구 시간을 저장하는 배열
    private final static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // 이동 가능한 방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int TC = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
        for (int T = 1; T <= TC; T++) {
            N = Integer.parseInt(br.readLine()); // 지도의 크기 입력
            map = new int[N][N];
            for (int i = 0; i < N; i++) {
                char[] row = br.readLine().toCharArray(); // 각 줄의 복구 시간 입력
                for (int j = 0; j < N; j++) {
                    map[i][j] = row[j] - '0'; // 문자를 숫자로 변환하여 저장
                }
            }
            sb.append("#").append(T).append(" ").append(sol()).append("\n"); // 결과 문자열 구성
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int sol() {
        Queue<Point> pq = new PriorityQueue<>(); // 우선순위 큐 사용
        pq.offer(new Point(0, 0, 0)); // 시작점 추가
        boolean[][] visited = new boolean[N][N]; // 방문 처리 배열
        visited[0][0] = true;

        while (!pq.isEmpty()) {
            Point p = pq.poll(); // 가장 복구 시간이 짧은 지점을 꺼냄
            for (int[] d : direction) { // 가능한 모든 방향으로 이동 시도
                int nx = p.x + d[0];
                int ny = p.y + d[1];

                if (nx == N-1 && ny == N-1) return p.w; // 종점 도달 시 현재 복구 시간 반환

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue; // 지도 범위를 벗어나면 무시
                if (visited[nx][ny]) continue; // 이미 방문했으면 무시

                visited[nx][ny] = true;
                pq.offer(new Point(nx, ny, p.w + map[nx][ny])); // 새 위치를 큐에 추가
            }
        }
        return -1; // 경로를 찾지 못한 경우
    }

    static class Point implements Comparable<Point> {
        int x, y, w; // 위치와 누적 복구 시간

        public Point(int x, int y, int w) {
            this.x = x;
            this.y = y;
            this.w = w;
        }

        @Override
        public int compareTo(Point o) {
            return this.w - o.w; // 복구 시간 기준으로 비교
        }
    }
}