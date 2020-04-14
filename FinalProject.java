import java.util.Scanner;
public class FinalProject{
	static int trust = 0;
	static int spencdamage = 0;
	static int damage = 0;
	public static void main(String[] args){
		print("Welcome to Don't Die");
		print("In this game you play as an operator of a phone line, you have to work to help people survive certain situations simply by giving them instructions and choosing from certain options. There will be many different stories that you can choose from and each one provides a completely different feeling. Throughout the stories you can gain someone's trust which can help you give them instructions. You attempt to help everyone you can by telling them things that you believe will help them survive.");
		Scanner in = new Scanner (System.in);
		print("press any key to begin");
		String answer = in.nextLine();
		if(!(answer.equals(""))){
			print("To start the Demo Story, press d");
				answer = in.nextLine();
			if(answer.equals("d")){
				demoStory();
			}//nested if
		}//if
	}//main
	public static void print(String input) {
		System.out.println(input);
	}
	public static void demoStory(){
		Scanner in = new Scanner (System.in);
		print("Welcome to your first story");
		print("The story will begin in...");
		wait(1000);
		print("5");
		wait(1000);
		print("4");
		wait(1000);
		print("3");
		wait(1000);
		print("2");			
		wait(1000);
		print("1");
		wait(1000);
		print("He..Hello, is anyone there. pl..please help me");
		wait(1000);
		twoChoice("1.Hello what seems to be the problem", "2.How can I help you");
		int choice = in.nextInt();
		if(choice == 1){
			a();
		}else{
			b();
		}//else
	}//demoStory
		
		
		public static void a (){
			Scanner in = new Scanner (System.in);
			print("he's here, help me please");
			wait(1000);
			twoChoice("1. Who's there, I cannot help you unless you tell me what I need to know", "2. It's ok, I'll help you, but first I need to know what's happening.");
			int choice = in.nextInt();
			if(choice == 1){
				a1();
			}else{
				a2();
			}//if/else
		}//a
		public static void b () {
			print ("Please, make him go away");
			wait(1000);
			twoChoice("1. Who's there, I cannot help you unless you tell me what I need to know", "2. It's ok, I'll help you, but first I need to know what's happening.");
			Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				a1();
			}else{
				trust++;
				a1();
			}//if/else
		}//b
	public static void a1 () {
		print("I already told you, HE'S HERE FOR ME");
		wait(1000);
		twoChoice ("1.Maam don't overreact everything is going to be okay, can you describe him.", "2.It's okay, i'm here for you. Could you please describe him to me.");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				a2();
			}else{
				trust++;
				describe();
			}//if/else
	}//
	public static void a2 () {
		if(trust >= 2){
			describe();
		}//if
		print("he heard me, he knows im here");
		wait(1000);
		twoChoice("1.step out, let him see you", "2.Maam it's okay, I'm here to help you.");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				death();
			}else{
				trust++;
				describe();
			}//if/else
	}//a2
	public static void b1 () {
		print("he'll hear me if I talk, please help me now");
		wait(1000);
		twoChoice("1.MAAM TELL ME WHAT YOU ARE SEEING", "2.maam, are you hiding anywhere?");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				b11();
			}else{
				trust++;
				b12();
			}//if/else
	}//b1
	public static void death() {
		wait(3000);
		print("MY ELBOW");
		wait(1000);
		print("AAAAHHHHHHH");
		print("GAME OVER");
	}//death
	public static void describe(){
		print("he's tall, pale, he has long brown hair, he has no remorse in his eyes, please help me");
		middle();
	}//describe
	
	public static void b11(){
		trust--;
		print("STOP SCREAMING AT ME");
		wait(1000);
		twoChoice("1.MAAM IF YOU DON'T STOP SCREAMINg THEY'LL HERE YOU", "2.maam please calm down, everything is going to be ok");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				nearDeath();
			}else{
				nearPrep();
			}//if/else
	}
	public static void b12(){
		print("yes, i'm in a closet, but I think he's going to find me soon");
		wait(1000);
		twoChoice("1.Maam, hiding won't do you any good, step out and face him head on","2.stay hiding, you will need to face him alone, the police won't respond. Everything will ok");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				nearDeath();
			}else{
				trust++;
				preparation();
			}//if/else
	}//b12
	public static void nearDeath(){
		print("He heard me, he's coming for me, I can't fight him");
		wait(3000);
		death();
	}//nearDeath
	public static void preparation(){
		print("ok, ok, ok, I can do this, I can fight him. Please help me defeat him");
		wait(1000);
		twoChoice("1. Okay maam, go right after him, use the element of surprise", "2. grab any tools near you, you will need them to take him down");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				stealth();
			}else{
				
				hammer();
			}//if/else
	}//preparation
	public static void stealth(){
		print("okay, i'm right behind him, what should I do now");
		wait(1000);
		twoChoice("1.punch him in the back of the head ","2.put him in a chokehold");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			punch();
			spencdamage++;
			damage++;
			}else{
				
			choke();
			}//if/else
	}//stealth
	public static void punch(){
		print("We're punching eachother now, he hit me in the head really bad, I need to get him down soon");
		wait(1000);
		twoChoice("1. Stay in the punching fight, don't give up ","2.back up, regain your strength");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
				punchdeath();
			
			}else{
				punchnearwin();
			
			}//if/else
	}//punch
	public static void punchdeath(){
		print("he's got me down, I can't do this, I can't win.");
		wait(2000);
		death();
	}//punchdeath
	public static void punchwin(){
		print("We did it, I got him down, he is a bloodied mess on the floor, thank you so much");
		print("YOU WON");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	public static void choke(){
			print("okay, he's in a chokehold, but he's about to ... HE GOT OUT");
			wait(1000);
		twoChoice("1. maam, back up, don't let him get your elbows","2.go back in,take him down");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			backup();
			}else{
				
			charge();
			}//if/else
	}
	public static void backup(){
			print("ok, I think I can go back in, what should I do");
			wait(1000);
		twoChoice("1. charge right at him, you can do this ","2.be cautious, don't let him get you");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			charge();
			}else{
				
			chokeDeath1();
			}//if/else
	}
	public static void charge(){
			print("I charged him, he's on the ground, what should I do to him");
			wait(1000);
		twoChoice("1. Eviscerate him until he becomes a corpse","2. run away as fast as you can");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			brutalwin();
			}else{
				
			runwin();
			}//if/else
	}
	public static void chokeDeath1(){
		print("I can't do this, he's got me, it's too late");
		death();
	}
	public static void runwin(){
		print("I did it I ran away, but this brutal murderer is still on the loose");
		print("YOU WON?");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	public static void brutalwin(){
		print("It's over, he's done for, no more elbows will be touched and no more lives will be taken by this horrible murderer");
		print("YOU WON");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	
	
	public static void nearPrep(){
	print("I think I need to fight him head on, should I?");
	wait(1000);
		twoChoice("1. go after him, you need to ","2.run away as fast as you can");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			preparation();
			}else{
				
			runwin();
			}//if/else
	}
	public static void middle(){
		
		wait(1000);
		twoChoice("1. OH NO, I think you might be facing the razzler, maam try to run, if you can't you will need  to fight ","2.This is the Razzler, I don't know what you can do, just stay calm maam");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			runtry();
			}else{
				
			runtry();
			}//if/else
	}
	public static void runtry(){
		print("I can't fight him, I need to run");
		wait(1000);
		twoChoice("1. run, it's your only the chance, the razzler is a dangerous criminal you cannot defeat ","2. You need to fight him, he will catch you if you run away");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			runwin();
			}else{
				
			nearPrep();
			}//if/else
	}
	public static void punchnearwin(){
		print("Ok, ok, I can do this. I can take him down");
		wait(1000);
		twoChoice("1.Go straight in, charge him and take him down in one fell swoop ","2. Stay back, just don't let him get close to you");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			punchwin();
			}else{
				
			stayback();
	}//punchnearwin
	}
	public static void stayback(){
		print("okay, he's coming towards me, what should I do. dont let me die");
		wait(1000);
		twoChoice("1. charge at him with all your strength, destroy him now","2. Be careful, take calculated steps and punch him in the face");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			punchdeath();
			}else{
				
			punchwin();
	}//stayback
	}
	public static void hammer(){
		print("Okay, I have a hammer now, what should I do with it");
		wait(1000);
		twoChoice("1.Go right at him maam, you can do this, I know you can","2.Stay back, only use it for defense ");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			hammerCharge();
			}else{
				
			defensehammer();
	}
	}//hammer
	public static void hammerCharge(){
		print("I'm going after him, he hasn't heard me yet. where should I hit him");
		wait(1000);
		twoChoice("1.Hit him in the head, knock him out","2.Go for the elbows, he won't feel it");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			headhit();
			}else{
				
			elbowhit();
	}
	}//hammerCharge
	public static void headhit(){
		print("It didn't knock him out, he's just angry");
		wait(1000);
		twoChoice("1.You can't run any more, stay in this fight and take him down","2. be careful, don't just charge right in, take slow and calculated moves");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			chargehammer();
			}else{
				
			carefulhammer();
	}
	}//headhit
	public static void chargehammer(){
		print("I got a solid hit, I think I could take him down right now");
		wait(1000);
		twoChoice("1.Beat him to a pulp","2.Finish him with one hit to the head");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			brutalwin();
			}else{
				
			hammerwin1();
	}
	}
	public static void hammerwin1(){
		print("We did it, thank you, no one will need to worry about being razzled anymore");
		print("YOU WON");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	public static void carefulhammer(){
		print("Okay, i've backed up, but he's ... he's charging right at me.");
		wait(1000);
		twoChoice("1.MAAM TRY TO OUTRUN HIM","2.Charge right back at him");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			outrundeath();
			}else{
				
			chargebattle();
	}
	}
	public static void outrundeath(){
		print("I can't.... I can't outrun him, this is it for me");
		death();
	}
	public static void chargebattle(){
		print("We're charging at eachother, where should I aim my hit");
		wait(1000);
		twoChoice("1.take him out in the kneecaps","2.Go for the head");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			kneecaphit();
			}else{
				
			ducklose();
	}
	}
	public static void ducklose(){
		print("HE DUCKED, HE'S GOT ME DOWN, THIS IS MY END");
		death();
	}
	public static void kneecaphit(){
		print("I got a solid hit on his kneecap, should I finish him");
		wait(1000);
		twoChoice("1.Show mercy","2.NO MERCY");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			mercydeath();
			}else{
				
			brutalwin();
	}
	}
	public static void mercydeath(){
		print("I showed him mercy, but.... NO HE GOT BACK UP, HELP ME HE..HE...HE");
		death();
				
		
		
	}
	public static void elbowhit(){
		print("I got him in the elbow, he didn't seem to notice anything, but it did some damage");
		wait(1000);
		twoChoice("1. Keep on hitting him in the elbow","2.now go for the head and knock him out");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			elbownearwin();
			}else{
				
			headhit();
	}
	}
	public static void elbownearwin(){
		print("I've hit him in the elbow three times and he still hasn't noticed me");
		wait(1000);
		twoChoice("1.HIT HIM IN THE ELBOW MORE","2. LICK IT");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			elbowwin();
			}else{
				
			lickwin();
	}
	}
	public static void elbowwin(){
		print("It worked, he's dead from multiple elbow hits");
		print("YOU WON");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	public static void lickwin(){
		print("It was the lick, once I licked his elbow he fell dead");
		print("YOU WON");
		wait(1000);
		print("Suddenly a dog walks up to you and you pet the dog");
		print("You are happy");
	}
	public static void defensehammer(){
		print("Okay, I here him coming right at me, should I stay in defense mode");
		wait(1000);
		twoChoice("1.Switch to charging at him","2.stay there and defend yourself");
		Scanner in = new Scanner (System.in);
			int choice = in.nextInt();
			if(choice == 1){
			hammerCharge();
			}else{
				
			defenselose();
			}
	}
	public static void defenselose(){
		print("He's here, my hammer can't hold him back, help me.....HELP ME");
		death();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void twoChoice(String x, String y){
		Scanner in = new Scanner (System.in);
		print("	"+x);
		print("	"+y);
	}//twochoice
	public static void wait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
			
		}
		catch (InterruptedException e) {
			
			
		}
		
	}
}//class