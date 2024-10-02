import java.io.*;
import java.util.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Integer n, m, start_num;
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static Set<Integer> visited = new HashSet<>();

    private static void dfs(int start_num) throws IOException{

        if (visited.contains(start_num)){
            return;
        }
        bw.write(String.valueOf(start_num) + " ");
        visited.add(start_num);

        for (Integer neighbor:graph.get(start_num)){
            dfs(neighbor);
        }
    }

    private static void bfs(int start_num) throws IOException{
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start_num);
        queue.offer(start_num);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            bw.write(String.valueOf(current) + " "); 

            for (Integer neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor); 
                    queue.offer(neighbor); 
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start_num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; ++i){
            st = new StringTokenizer(br.readLine(), " ");
            
            int base = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            graph.putIfAbsent(base, new ArrayList<Integer>());
            graph.putIfAbsent(target, new ArrayList<Integer>());
            graph.get(base).add(target);
            graph.get(target).add(base);
        }

        for (Integer key: graph.keySet()){
            Collections.sort(graph.get(key));
        }

        dfs(start_num);
        visited.clear();
        bw.write("\n");
        bfs(start_num);

        bw.flush();
        bw.close();
    }
}