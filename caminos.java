package practice;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class caminos {
	static int memo[][]=new int[100][100];
	static Queue<nodo> Q;
	static int visitado[]= new int[7];
	static int mayor=0;

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("src/practice/entada.in"));
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				memo[i][j]=-1;
			}
		}
		
		for (int i = 0; i < 10; i++) {
				String a=in.nextLine();
				String[] n=a.split(" ");
				int n1=Integer.parseInt(n[0]);
				int n2=Integer.parseInt(n[1]);
				int n3=Integer.parseInt(n[2]);
				memo[n1][n2]=n3;
				memo[n2][n1]=n3;
		}
	
		Q= new LinkedList<caminos.nodo>();
		Q.add(new nodo(0,1,0,1000000));
		
		while(!Q.isEmpty()){
			nodo P= Q.poll();
			if(P.fin==7){System.out.println("ok con :"+P.contador+" y "+P.valores);break;}
			generaHijos(P.fin, P.contador,P.valores);
		}
		
		in.close();

	}

	
	public static void generaHijos(int i, int cont, int valor){
		for (int j = 0; j < 100; j++) {
			if(memo[i][j]!=-1||memo[j][i]!=-1){
					Q.add(new nodo(i,j,cont+1,Math.min(valor,memo[i][j])));
					//System.out.println(i+"/"+j+"/"+(cont+1)+"/"+Math.min(valor,memo[i][j]));
			}
		}
		
		
	}
	
	static class nodo{
		int inicio, fin, contador,valores;
		public nodo(int inicio, int fin, int contador,int valores){
			super();
			this.inicio= inicio;
			this.fin=fin;
			this.contador=contador;
			this.valores=valores;
		}
		
	}
	
	private static void print(Object... rs) {
		   System.err.println(Arrays.deepToString(rs));
		   }
	
	
	

/*	public static int volver(int a,  int dist,int llegada){
		if(a==llegada)return mayor=Math.max(dist, mayor);
		for (int i = 0; i < 8; i++) {
			if(memo[a][i]!=0){
				if(dist==0)volver(i,dist+memo[a][i],llegada);
				else{volver(i, Math.min(dist,memo[a][i]),llegada);
				}
			}
		}
		return mayor;
	}*/
	
}
