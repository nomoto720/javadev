package my.util;
import java.util.*;
public class Common{
	//int型配列をシャッフルするメソッド
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=new Random().nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	//配列のクローンを返却するメソッド
	public static int[] arrClone(int[] arr){
		int[] arrClone=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrClone[i]=arr[i];
		}
		return arrClone;
	}
	//配列を昇順に並び替えるメソッド
	public static void arrSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//配列を降順に並び替えるメソッド
	public static void arrSort(int[] arr, boolean isDesc){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//要素数と指定範囲を受け取り、指定範囲の乱数で埋め尽くした配列を返すメソッド
	public static int[] arrRandomRange(int min,int max,int count){
		int[] arrRandom=new int[count];
		for(int i=0;i<arrRandom.length;i++){
			arrRandom[i]=new Random().nextInt(max+1-min)+min;
		}
		return arrRandom;
	}
}
