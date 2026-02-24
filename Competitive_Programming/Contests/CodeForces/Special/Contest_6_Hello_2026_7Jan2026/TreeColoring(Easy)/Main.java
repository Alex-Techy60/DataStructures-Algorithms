import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n=Integer.parseInt(br.readLine().trim());
            ArrayList<Integer>[] g=new ArrayList[n+1];
            for(int i=1;i<=n;i++)g[i]=new ArrayList<>();
            for(int i=0;i<n-1;i++){
                StringTokenizer st=new StringTokenizer(br.readLine());
                int u=Integer.parseInt(st.nextToken());
                int v=Integer.parseInt(st.nextToken());
                g[u].add(v);
                g[v].add(u);
            }
            int[] depth=new int[n+1];
            Arrays.fill(depth,-1);
            int[] parent=new int[n+1];
            Arrays.fill(parent,-1);
            Queue<Integer> q=new ArrayDeque<>();
            q.add(1);
            depth[1]=0;
            parent[1]=0;
            int maxDepth=0;
            while(!q.isEmpty()){
                int u=q.poll();
                for(int v:g[u]){
                    if(depth[v]==-1){
                        depth[v]=depth[u]+1;
                        parent[v]=u;
                        maxDepth=Math.max(maxDepth,depth[v]);
                        q.add(v);
                    }
                }
            }
            int[] cntDepth=new int[maxDepth+1];
            for(int i=1;i<=n;i++)cntDepth[depth[i]]++;
            int maxDepthCount=0;
            for(int c:cntDepth)if(c>maxDepthCount)maxDepthCount=c;
            int[] children=new int[n+1];
            for(int v=2;v<=n;v++){
                int p=parent[v];
                if(p>=1)children[p]++;
            }
            int maxParentChildrenPlusOne=0;
            for(int i=1;i<=n;i++)maxParentChildrenPlusOne=Math.max(maxParentChildrenPlusOne,children[i]+1);
            int ans=Math.max(maxDepthCount,maxParentChildrenPlusOne);
            System.out.println(ans);
        }
    }
}
