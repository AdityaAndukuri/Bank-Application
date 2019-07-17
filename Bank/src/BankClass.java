import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
class Myexp extends Exception
{   String s;
    Myexp(String s)
    {
    	this.s=s;
    }
	public String toString()
	{
		return "\tLOAN IS NOT SANCTIONED"+"\n"+"\t\tREASONS:"+"\n"+s;
	}
}
class CarCustomer implements Serializable
{
	String name;
	String gen;
	String dob;
	int age;
	String pro;
	String ph;
	float sal;
    String lic;
    String carm;
    float loan;
    int t;
    int r;
    int e=0;
    int f1=0;
    float pay;
    Date d;
    int id;
	
}
class HomeCustomer implements Serializable
{
	String name;
	String gen;
	String dob;
	int age;
	String pro;
	String ph;
	float sal;
	String tol;
	String htype;
    float loan;
    int t;
    int r;
    int e=0;
    int f1=0;
    float pay;
    Date d;
    int id;
	
}
class PerCustomer implements Serializable
{
	String name;
	String gen;
	String dob;
	int age;
	String pro;
	String ph;
	float sal;
	String pur;
	String prop;
	float proval;
    float loan;
    int t;
    int r;
    int e=0;
    int f1=0;
    float pay;
    Date d;
    int id;
    int flag=0;
	
}
public class BankClass extends Applet implements ActionListener, ItemListener{
	int id=0;
	int f11=0,f22=0,f33=0;
	Date d;
	int x=1900;
	Myttask tt;
	Timer t;
	CardLayout cd;
	Panel deck;
	Button pl, cl, hl;
    Choice one=new Choice();
    Choice two=new Choice();
	Label n1;
	Label dob1;
	Label age1;
	Label sal1;
	Label gen1;
	Label dl;
	Label md;
	Label ex;
	Label in;
	Label tol;
	Label htype;
	Label exc;
	Label inh;
	Label pur;
	Label prop;
	Label proval;
	Label exp;
	Label inp;
	TextField purt;
	TextField prot;
	TextField provalt;
    TextField expt;
    Choice inpp;
	Choice dll;
	Choice tolc;
	Choice htypec;
	Choice inn2;
	TextField mdd;
	TextField exx;
	TextField exxc;
	Choice inn;
	CheckboxGroup cb1;
	Checkbox m1,f1;
	Label ph1;
	TextField na1;
	TextField dobb1;
	TextField agge1;
	TextField sall1;
	Label n;
	Label dob;
	Label age;
	Label sal;
	Label gen;
	CheckboxGroup cb;
	Checkbox m,f;
	Label ph;
	TextField na;
	TextField dobb;
	TextField agge;
	TextField sall;
	Label n2;
	Label dob2;
	Label age2;
	Label sal2;
	Label gen2;
	Label ad;
	Label ad1;
	Label ad2;
	Label p;
	Label p1;
	Label p2;
	Choice c1,c2,c3;
	TextField add;
	TextField add1;
	TextField add2;
	CheckboxGroup cb2;
	Checkbox m2,f2;
	Label ph2;
	TextField na2;
	TextField dobb2;
	TextField agge2;
	TextField sall2;
	TextArea ta;
	Label user;
	TextField usert;
	Label cus;
	TextField cust;
	Button lg;
	Button next,next1,next2,save11,saveh,savep,back1,back2,back3;
	Checkbox show;
	Button app,log;
	Panel login=new Panel();
	 Label l=new Label("INVALID USERNAME OR PASSWORD");
	 Button b=new Button("LOGOUT");
	 Panel lt=new Panel();
	 Panel title=new Panel();
	 Label tit=new Label();
	int cnt=0;
	Image i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
	CarCustomer cc;
	HomeCustomer hc;
	PerCustomer pc;
	HashMap<String,CarCustomer> cf=new HashMap<String,CarCustomer>();
	HashMap<String,HomeCustomer> hf=new HashMap<String,HomeCustomer>();
	HashMap<String,PerCustomer> pf=new HashMap<String,PerCustomer>();
	int s=0;
	Panel bar=new Panel();
	public void start()
	{
	 cc=new CarCustomer();
     hc=new HomeCustomer();
	 pc=new PerCustomer();
	}
	public void init()
	{   try
	{   FileInputStream fis=new FileInputStream("cusid.txt");
		DataInputStream dis=new DataInputStream(fis);
		id=dis.readInt();
		dis.close();
		fis.close();
	}
	catch(Exception e)
	{ try
	{   FileOutputStream fout=new FileOutputStream("cusid.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(id);
		dout.close();
		fout.close();
	}
	catch(Exception e1)
	{
		;
	}
	}
	  try
		{   FileInputStream fis=new FileInputStream("carid.txt");
			ObjectInputStream dis=new ObjectInputStream(fis);
			cf=(HashMap<String,CarCustomer>)dis.readObject();
			dis.close();
			fis.close();
		}
		catch(Exception e)
		{ try
		{   FileOutputStream fout=new FileOutputStream("carid.txt");
		    ObjectOutputStream dout=new ObjectOutputStream(fout);
			dout.writeObject(cf);
			dout.flush();
			dout.close();
			fout.close();
		}
		catch(Exception e1)
		{
			;
		}
		}
	  try
		{   FileInputStream fis=new FileInputStream("homeid.txt");
			ObjectInputStream dis=new ObjectInputStream(fis);
			hf=(HashMap<String,HomeCustomer>)dis.readObject();
			dis.close();
			fis.close();
		}
		catch(Exception e)
		{ try
		{   FileOutputStream fout=new FileOutputStream("homeid.txt");
		    ObjectOutputStream dout=new ObjectOutputStream(fout);
			dout.writeObject(hf);
			dout.flush();
			dout.close();
			fout.close();
		}
		catch(Exception e1)
		{
			;
		}
		}
	
	  try
		{   FileInputStream fis=new FileInputStream("perid.txt");
			ObjectInputStream dis=new ObjectInputStream(fis);
			pf=(HashMap<String,PerCustomer>)dis.readObject();
			dis.close();
			fis.close();
		}
		catch(Exception e)
		{ try
		{   FileOutputStream fout=new FileOutputStream("perid.txt");
		    ObjectOutputStream dout=new ObjectOutputStream(fout);
			dout.writeObject(pf);
			dout.flush();
			dout.close();
			fout.close();
		}
		catch(Exception e1)
		{
			;
		}
		}
	    setFont(new Font("times new roman",Font.PLAIN,20));
	    one.add("PAGES");
	    one.add("HOME");
	    one.add("LOGIN");
	    one.add("QUIT");
	    two.add("LOANS");
	    two.add("PERSONAL");
	    two.add("CAR");
	    two.add("HOME");
	    bar.add(one);
	    bar.add(two);
	    bar.setLayout(null);
	    one.setBounds(5,5,150,20);
	    two.setBounds(160,5,200,20);
	    add(bar);
	    bar.setBounds(0,0,370,50);
	    title.add(tit);
	    tit.setFont(new Font("Serif",Font.BOLD,120));
	    add(title);
	    tit.setText("BANK OF VASAVI");
	    title.setBounds(420,10,1100,130);
	    tit.setForeground(Color.red);
		i1=getImage(getDocumentBase(),"car.jpg");
    	i2=getImage(getDocumentBase(),"home.jpg");
	    i3=getImage(getDocumentBase(),"per.jpg");
	    i4=getImage(getDocumentBase(),"bank.jpg");
	    i5=getImage(getDocumentBase(),"carapp.jpg");
	    i6=getImage(getDocumentBase(),"carrej.jpg");
	    i7=getImage(getDocumentBase(),"hla.jpg");
	    i8=getImage(getDocumentBase(),"hlr.jpg");
	    i9=getImage(getDocumentBase(),"pla.png");
	    i10=getImage(getDocumentBase(),"plr.jpg");
	    next=new Button("NEXT-->");
	    next1=new Button("NEXT-->");
	    next2=new Button("NEXT-->");
	    back1=new Button("<--BACK");
	    back2=new Button("<--BACK");
	    back3=new Button("<--BACK");
	    back1.addActionListener(this);
	    back2.addActionListener(this);
	    back3.addActionListener(this);
		setBackground(Color.white);
	    setLayout(null);
		tt=new Myttask(this);
		t=new Timer();
		t.schedule(tt, 100,200);
		deck=new Panel();
		cd=new CardLayout();
		deck.setLayout(cd);
		Panel menu=new Panel();
		if(cnt==0)
		{setFont(new Font("times new roamn",Font.BOLD,30));
		}
		pl=new Button("PERSONAL LOAN");
		cl=new Button("CAR LOAN");
		hl=new Button("HOME LOAN");
		pl.setBackground(Color.orange);
		cl.setBackground(Color.white);
		hl.setBackground(Color.green);
	   Panel first=new Panel();
		first.setLayout(new GridLayout(2,0));
		app=new Button("CLICK HERE TO APPLY FOR LOAN");
		log=new Button("CLICK HERE TO LOGIN IF YOU ALREADY APPLIED FOR LOAN");
    	app.setBackground(Color.ORANGE);
    	log.setBackground(Color.green);
		 first.add(app);
         first.add(log);
		deck.add(first, "first");
	    user=new Label("USER NAME:  ");
		usert=new TextField(50);
		cus=new Label("CUSTOMER ID:  ");
	    cust=new TextField(50);
		lg=new Button("LOGIN!");
		login.setLayout(null);
		login.add(user);
		login.add(usert);
		login.add(cus);
		login.add(cust);
		login.add(lg);
		
		cust.setEchoChar('*');
		user.setBounds(50,50,250,60);
		usert.setBounds(320,50,250,60);
		cus.setBounds(50,150,250,60);
		cust.setBounds(320,150,250,60);
		lg.setBounds(300,250,200,100);
		
		deck.add(login,"login");
		menu.setLayout(new GridLayout(3,0));
        menu.add(pl);
        menu.add(cl);
        menu.add(hl);
		deck.add(menu,"menu");
		setFont(new Font("times new roamn",Font.BOLD,25));
		n=new Label("NAME   :  ");
		dob=new Label("DOB  :  ");
		age=new Label("AGE  :  ");
		sal=new Label("INCOME  :  ");
		gen=new Label("GENDER  :  ");
		ad=new Label("PHONE NO:");
		ad1=new Label("PHONE NO:");
		ad2=new Label("PHONE NO:");
		cb=new CheckboxGroup();
		m=new Checkbox("MALE",cb,false);
		f=new Checkbox("FEMALE",cb,false);
		na=new TextField(30);
		dobb=new TextField("dd/mm/yyyy",25);
		agge=new TextField(20);
		sall=new TextField("in LPA",20);
		add=new TextField(30);
		add1=new TextField(30);
		add2=new TextField(30);
		n1=new Label("NAME   :  ");
		dob1=new Label("DOB  :  ");
		age1=new Label("AGE  :  ");
		sal1=new Label("INCOME  :  ");
		gen1=new Label("GENDER  :  ");
		cb1=new CheckboxGroup();
		m1=new Checkbox("MALE",cb1,false);
		f1=new Checkbox("FEMALE",cb1,false);
		na1=new TextField(30);
		dobb1=new TextField("dd/mm/yyyy",25);
		agge1=new TextField(20);
		sall1=new TextField("in LPA",20);
		n2=new Label("NAME   :  ");
		dob2=new Label("DOB  :  ");
		age2=new Label("AGE  :  ");
		sal2=new Label("INCOME  :  ");
		gen2=new Label("GENDER  :  ");
		cb2=new CheckboxGroup();
		m2=new Checkbox("MALE",cb2,false);
		f2=new Checkbox("FEMALE",cb2,false);
		na2=new TextField(30);
		dobb2=new TextField("dd/mm/yyyy",25);
		agge2=new TextField(20);
		sall2=new TextField("in LPA",20);
		p=new Label("PROFESSION:");
		c1=new Choice();
		c1.add("EMPLOYEE");
		c1.add("BUSINESS");
		p1=new Label("PROFESSION:");
		c2=new Choice();
		c2.add("EMPLOYEE");
		c2.add("BUSINESS");
		p2=new Label("PROFESSION:");
		c3=new Choice();
		c3.add("EMPLOYEE");
		c3.add("BUSINESS");
		dl=new Label("LICENSE:");
		md=new Label("CAR MODEL:");
		ex=new Label("EXPECTED LOAN AMOUNT:");
		in=new Label("TIME AND INTEREST RATE:");
		tol=new Label("TYPE OF LAND:  ");
		htype=new Label("TYPE OF HOME:  ");
		inh=new Label("TIME AND INTEREST RATE:");
		dll=new Choice();
		dll.add("YES");
		dll.add("NO");
		dll.addItemListener(this);
		mdd=new TextField(30);
		exx=new TextField("IN LAKHS",30);
		inn=new Choice();
		inn.add("  3 months at 9%");
		inn.add("  6 months at 12%");
		inn.add("  9 months at 15%");
		tolc=new Choice();
		tolc.add("REGISTERED LAND");
		tolc.add("UNREGISTERED LAND");
	    htypec=new Choice();
	    htypec.add("FLAT");
	    htypec.add("INDIVIDUAL HOUSE");
	    exc=new Label("EXPECTED LOAN AMOUNT:");
	    exxc=new TextField("IN LAKHS",30);
		inn2=new Choice();
		inn2.add("  3 months at 9%");
		inn2.add("  6 months at 12%");
		inn2.add("  9 months at 15%");
		save11=new Button("SAVE AND PROCEED");
		saveh=new Button("SAVE AND PROCEED");
		savep=new Button("SAVE AND PROCEED");
		pur=new Label("PURPOSE OF LOAN:  ");
		prop=new Label("PROPERTY(SURETY):  ");
		proval=new Label("PROPERTY VALUE:  ");
		exp=new Label("EXPECTED LOAN AMOUNT:  ");
		inp=new Label("TIME AND INTEREST RATE:  ");
		purt=new TextField(60);
		prot=new TextField(60);
		provalt=new TextField(" IN LAKHS",60);
		expt=new TextField(" IN LAKHS",60);
		inpp=new Choice();
		inpp.add("  3 months at 9%");
		inpp.add("  6 months at 12%");
		inpp.add("  9 months at 15%");
		Panel car1=new Panel();
		car1.setLayout(null);
		Panel car=new Panel();
		Panel home=new Panel();
		Panel home1=new Panel();
		Panel per1=new Panel();
		per1.setLayout(null);
		home1.setLayout(null);
		Panel per=new Panel();
		car.setLayout(null);
		home.setLayout(null);
		per.setLayout(null);
		dl.setBounds(15,30,120,50);
		dll.setBounds(360,30,300,50);
		md.setBounds(15,100,160,50);
		mdd.setBounds(360,100,400,50);
		ex.setBounds(15,170,345,50);
		exx.setBounds(360,170,300,50);
		in.setBounds(15,240,350,50);
		inn.setBounds(360,240,300,50);
		tol.setBounds(15,30,200,50);
	    tolc.setBounds(360,30,300,50);
		htype.setBounds(15,100,200,50);
		htypec.setBounds(360,100,400,50);
		exc.setBounds(15,170,345,50);
		exxc.setBounds(360,170,300,50);
		inh.setBounds(15,240,350,50);
		inn2.setBounds(360,240,300,50);
		pur.setBounds(15,30,300,50);
		purt.setBounds(380,30,300,50);
		prop.setBounds(15,100,300,50);
		prot.setBounds(380,100,300,50);
		proval.setBounds(15,170,345,50);
		provalt.setBounds(380,170,300,50);
		exp.setBounds(15,240,350,50);
		expt.setBounds(380,240,300,50);
		inp.setBounds(15,310,350,50);
		inpp.setBounds(380,310,300,50);
		save11.setBounds(230,340,300,80);
		saveh.setBounds(230,340,300,80);
		savep.setBounds(230,410,300,80);
		n.setBounds(30,30,120,50);
		na.setBounds(180,30,400,50);
		gen.setBounds(30,100,140,50);
		m.setBounds(180,100,200,50);
		f.setBounds(400,100,200,50);
		dob.setBounds(30,170,120,50);
		dobb.setBounds(180,170,200,50);
		age.setBounds(30,240,140,50);
		agge.setBounds(180,240,200,50);
		p.setBounds(2,310,180,50);
		c1.setBounds(180,310,400,50);
		n1.setBounds(30,30,120,50);
		na1.setBounds(180,30,400,50);
		gen1.setBounds(30,100,140,50);
		m1.setBounds(180,100,200,50);
		f1.setBounds(400,100,200,50);
		dob1.setBounds(30,170,120,50);
		dobb1.setBounds(180,170,200,50);
		age1.setBounds(30,240,140,50);
		agge1.setBounds(180,240,200,50);
		p1.setBounds(2,310,180,50);
		c2.setBounds(180,310,400,50);
		n2.setBounds(30,30,120,50);
		na2.setBounds(180,30,400,50);
		gen2.setBounds(30,100,140,50);
		m2.setBounds(180,100,200,50);
		f2.setBounds(400,100,200,50);
		dob2.setBounds(30,170,120,50);
		dobb2.setBounds(180,170,200,50);
		age2.setBounds(30,240,140,50);
		agge2.setBounds(180,240,200,50);
		p2.setBounds(2,310,180,50);
		c3.setBounds(180,310,400,50);
		ad.setBounds(10, 380, 160, 50);
		add.setBounds(180, 380, 260, 50);
		ad1.setBounds(10, 380, 160, 50);
		add1.setBounds(180, 380, 260, 50);
		ad2.setBounds(10, 380, 160, 50);
		add2.setBounds(180, 380, 260, 50);
		sal.setBounds(30,450,140,50);
		sall.setBounds(180,450,240,50);
		sal1.setBounds(30,450,140,50);
		sall1.setBounds(180,450,240,50);
		sal2.setBounds(30,450,140,50);
		sall2.setBounds(180,450,240,50);
		next.setBounds(550,600,120,60);
		next1.setBounds(550,600,120,60);
		next2.setBounds(550,600,120,60);
		back1.setBounds(100,600,120,60);
		back2.setBounds(100,600,120,60);
		back3.setBounds(100,600,120,60);
		lt.add(b);
		lt.setBounds(1700,100,120,40);
		add(lt);
		lt.setVisible(false);
		b.addActionListener(this);
		car.add(n1);
		car.add(na1);
		car.add(gen1);
		car.add(m1);
		car.add(f1);
		car.add(dob1);
		car.add(dobb1);
		car.add(age1);
		car.add(agge1);
		car.add(p1);
		car.add(c2);
		car.add(ad1);
		car.add(add1);
		car.add(sal1);
		car.add(sall1);
		car.add(next1);
		home.add(next2);
		per.add(next);
		home.add(ad2);
		home.add(add2);
		per.add(ad);
		per.add(add);
		home.add(n2);
		home.add(na2);
		home.add(gen2);
		home.add(m2);
		home.add(f2);
		home.add(dob2);
		home.add(dobb2);
		home.add(age2);
		home.add(agge2);
		home.add(p2);
		home.add(c3);
		home.add(ad2);
		home.add(add2);
		home.add(sal2);
		home.add(sall2);
		home1.add(tol);
		home1.add(htype);
		home1.add(inh);
		home1.add(tolc);
		home1.add(htypec);
		home1.add(inn2);
		home1.add(exc);
		home1.add(exxc);
		home1.add(saveh);
		per.add(n);
		per.add(na);
		per.add(gen);
		per.add(m);
		per.add(f);
		per.add(dob);
		per.add(dobb);
		per.add(age);
		per.add(agge);
		per.add(p);
		per.add(c1);
		per.add(sal);
		per.add(sall);
		per1.add(pur);
		per1.add(prop);
		per1.add(proval);
		per1.add(exp);
		per1.add(inp);
		per1.add(purt);
		per1.add(prot);
		per1.add(provalt);
		per1.add(expt);
		per1.add(inpp);
		per1.add(savep);
		per1.add(back1);
		car1.add(back2);
		home1.add(back3);
		car1.add(dl);
		car1.add(dll);
		car1.add(md);
		car1.add(mdd);
		car1.add(ex);
		car1.add(exx);
		car1.add(in);
		car1.add(inn);
		car1.add(save11);
		deck.add(car1,"car1");
		deck.add(car, "car");
		deck.add(home,"home");
		deck.add(per, "per");
		deck.add(home1, "home1");
		deck.add(per1, "per1");
		deck.setBounds(100,250,800,700);
		deck.setBackground(Color.cyan);
		add(deck);	
		pl.addActionListener(this);
		cl.addActionListener(this);
		hl.addActionListener(this);
		next.addActionListener(this);
		next1.addActionListener(this);
		next2.addActionListener(this);
		m1.addItemListener(this);
		f1.addItemListener(this);
		m.addItemListener(this);
		f.addItemListener(this);
		m2.addItemListener(this);
		f2.addItemListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		dll.addItemListener(this);
		inn.addItemListener(this);
		save11.addActionListener(this);
		tolc.addItemListener(this);
		htypec.addItemListener(this);
		inn2.addItemListener(this);
		saveh.addActionListener(this);
		savep.addActionListener(this);
		inpp.addItemListener(this);
		app.addActionListener(this);
		log.addActionListener(this);
		lg.addActionListener(this);
		show=new Checkbox("SHOW");
		show.addItemListener(this);
		login.add(show);
		show.setBounds(580,155,100,50);
		one.addItemListener(this);
		two.addItemListener(this);
		ta=new TextArea();
		  ta.setBounds(0,0,800,700);
	      ta.setForeground(Color.red);
	      ta.setBackground(Color.yellow);
	      ta.setEditable(false);
		 Panel p=new Panel();
   	   p.setLayout(null);
   	   p.add(ta);
   	deck.add(ta,"exp");
	
	}
	public void actionPerformed(ActionEvent ae)
	{  
	  repaint(500);
		if(ae.getSource()==app)
	{
		cd.show(deck, "menu");
	}
		if(ae.getSource()==cl||ae.getSource()==back2)
		{   start();
			cd.show(deck, "car");
			cnt=2;
			cc.f1=1;
			cc.e=0;
			repaint();
		}
		if(ae.getSource()==hl||ae.getSource()==back3)
		{   start();
			cd.show(deck, "home");
			cnt=3;
			hc.f1=1;
			hc.e=0;
			repaint();
			
		}
		
		if(ae.getSource()==pl||ae.getSource()==back1)
		{   start();
			cd.show(deck, "per");
			cnt=1;
			pc.f1=1;
			pc.e=0;
			repaint();
		}
		if(ae.getSource()==next1)
		{
			cd.show(deck, "car1");
			cnt=2;
			repaint();
		}
		if(ae.getSource()==next)
		{
			cd.show(deck, "per1");
			cnt=1;
			repaint();
		}
		if(ae.getSource()==save11)
		{   id++;
		    cc.id=id;
			cc.e=1;
			cf.put(""+id,cc);
			deck.setVisible(false);
			repaint();
		}
		if(ae.getSource()==saveh)
		{   id++;
		    hc.id=id;
			hc.e=1;
			hf.put(""+id,hc);
			deck.setVisible(false);
			repaint();
		}
		if(ae.getSource()==savep)
		{   id++;
		    pc.id=id;
			pc.e=1;
			pf.put(""+id,pc);
			deck.setVisible(false);
			repaint();
		}
		if(ae.getSource()==next2)
		{
			cd.show(deck, "home1");
			cnt=3;
			repaint();
	    }
		if(ae.getSource()==log)
		{   
			cd.show(deck, "login");
		}
		if(ae.getSource()==lg)
		{  
		    start();
			String s=usert.getText();
			cc=(CarCustomer)cf.get(""+cust.getText());
			if(cc==null)
			{ 
				hc=(HomeCustomer)hf.get(""+cust.getText());
			   if(hc==null)
			   {
				   pc=(PerCustomer)pf.get(""+cust.getText());
				   if(pc==null)
				   {
					 
					   login.add(l);
					   l.setForeground(Color.red);
					   l.setBounds(150,500,600,50);
					   start();
					   
				   }
				   else
				   {    if(pc!=null&&s.compareTo(pc.name)!=0)
				   {
					   login.add(l);
					   l.setForeground(Color.red);
					   l.setBounds(150,500,600,50);
					   start();
					
				   }
				   else
				   {
					    logout();
					    cnt=1;
						pc.e=1;
						pc.f1=0;
						deck.setVisible(false);
						repaint();
				   }
						
				   }
			   }
			   else
			   {     if(hc!=null&&s.compareTo(hc.name)!=0)
			   {
				   login.add(l);
				   l.setForeground(Color.red);
				   l.setBounds(150,500,600,50);
				   start();
				
			   }
			   else
			   { logout();
				   cnt=3;
					hc.e=1;
					hc.f1=0;
					deck.setVisible(false);
					repaint();
			   }
					
			   }
			   
			}
			else
			{ 
				 if(cc!=null&&s.compareTo(cc.name)!=0)
				   {   
					   login.add(l);
					   l.setForeground(Color.red);
					   l.setBounds(150,500,600,50);
					   start();
					
				   }
				   else
				   {logout();
		        	cnt=2;
		            cc.e=1;
			        cc.f1=0;
			        deck.setVisible(false);
		        	repaint();
				   }
			
			}
			
		}
		if(ae.getSource()==b)
		{   cnt=0;
		start();
		deck.setVisible(true);
	    repaint();
		cd.show(deck, "first");
		lt.setVisible(false);
		one.select("PAGES");
		two.select("LOANS");
		one.addItemListener(this);
		two.addItemListener(this);
		}
	}
	public void logout()
	{  
		lt.setVisible(true);
	}
	public void log()
	{
		lt.setVisible(false);
	}
	public void itemStateChanged(ItemEvent ie)
	{  
		repaint(500); 
		if(inn.getSelectedItem().equals("  3 months at 9%"))
		{  
			cc.t=3;
			cc.r=9;
		}
		if(inn.getSelectedItem().equals("  6 months at 12%"))
		{
			cc.t=6;
			cc.r=12;
		}
		if(inn.getSelectedItem().equals("  9 months at 15%"))
		{
			cc.t=9;
			cc.r=15;
		}
		if(inn2.getSelectedItem().equals("  3 months at 9%"))
		{  
			hc.t=3;
			hc.r=9;
		}
		if(inn2.getSelectedItem().equals("  6 months at 12%"))
		{
			hc.t=6;
			hc.r=12;
		}
		if(inn2.getSelectedItem().equals("  9 months at 15%"))
		{
			hc.t=9;
			hc.r=15;
		}
		if(inpp.getSelectedItem().equals("  3 months at 9%"))
		{  
			pc.t=3;
			pc.r=9;
		}
		if(inpp.getSelectedItem().equals("  6 months at 12%"))
		{
			pc.t=6;
			pc.r=12;
		}
		if(inpp.getSelectedItem().equals("  9 months at 15%"))
		{
			pc.t=9;
			pc.r=15;
		}
		if(show.getState()==false)
		{
			cust.setEchoChar('*');
		}
		if(show.getState()==true)
		{
			cust.setEchoChar((char)0);
		}
		if(one.getSelectedItem()=="QUIT")
		{    try
		{ FileOutputStream fout=new FileOutputStream("cusid.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeInt(id);
		dout.close();
		fout.close();
		
		}
		catch(Exception e1)
		{
			;
		}
             System.exit(0);
		}
		if(one.getSelectedItem()=="HOME")
		{   
		     cnt=0;
		    start();
			deck.setVisible(true);
			repaint(500);
			cd.show(deck, "first");
		    one.select("PAGES");	
		}
		if(one.getSelectedItem()=="LOGIN")
		{   
		     cnt=0;
	    	deck.setVisible(true);
	    	start();
	    	repaint(500);
			cd.show(deck, "login");
		    one.select("PAGES");	
		}
		if(two.getSelectedItem()=="PERSONAL")
		{deck.setVisible(true);
			start();
			cnt=1;
			pc.f1=1;
			pc.e=0;
			cd.show(deck, "per");
			repaint(500);
		    two.select("LOANS");	
		}
		if(two.getSelectedItem()=="HOME")
		{  deck.setVisible(true);
			start();
			cnt=3;
			hc.f1=1;
			hc.e=0;
			cd.show(deck, "home");
			repaint(500);
		    two.select("LOANS");	
		}
		if(two.getSelectedItem()=="CAR")
		{  
			deck.setVisible(true);
			start();
			cnt=2;
			cc.f1=1;
			cc.e=0;
			cd.show(deck, "car");
			repaint(500);
		    two.select("LOANS");	
		}
	}
	public void paint(Graphics g)
	{ 
		g.setColor(Color.black);
	  g.setFont(new Font("times new roman",Font.BOLD,25));
	  d=new Date();
	  g.drawString(""+d,1550,40);
	  if(cnt==0)
	  {  g.setColor(Color.blue);
	  g.setFont(new Font("times new roman",Font.ITALIC,30));
	  g.drawImage(i4, 950, 350, 900,500, this);
	  if(x==-1300)
		  x=1900;
	  g.drawString("***we provide all kind of loans including home loan, car loan, personal loan etc at very affordable interest rates***", x-=20, 200);
		}
	  if(cnt==1)
	  {   
	      g.setFont(new Font("georgia",Font.BOLD,40));
	      g.setColor(Color.black);
	      if(pc.e!=1)
		  g.drawString("APPLICATION FORM",150, 220);
		  g.setFont(new Font("times new roman",Font.PLAIN,50));
	      g.setColor(Color.blue);
		  if(pc.e!=1)
	      {  g.drawString("PERSONAL LOAN",1000, 220);
		  g.drawImage(i3, 950, 300, 900,500, this);
	      }
		  if(pc.f1==1)
		  {
			  pc.name=na.getText();
		       pc.gen=cb.getSelectedCheckbox().getLabel();
		       pc.dob=dobb.getText();
		       pc.age=Integer.parseInt(agge.getText());
		       pc.pro=c1.getSelectedItem();
		       pc.ph=add.getText();
	           pc.sal=Float.parseFloat(sall.getText());
	           pc.pur=purt.getText();
		       pc.prop=prot.getText();
		       pc.proval=Float.parseFloat(provalt.getText());
	           pc.loan=Float.parseFloat(expt.getText());
	           pc.d=new Date();
		  }
		  if(pc.e==1)
		  { 
		      g.setColor(Color.black);
		      g.drawString("APPLICATION STATUS : ",150, 220);
		      try
		  {  if((pc.age<18)||(pc.proval<pc.loan)||(pc.loan-pc.sal>20))
		     {
			   String s1="";
			   if(pc.age<18)
				   s1+="\t**THE ENTERED AGE IS LESSER THAN 18**"+"\n";
			   if(pc.proval<pc.loan)
			       s1+="\t**PROPERTY DOES NOT MEET UP WITH LOAN AMOUNT**\n";
			   if(pc.loan-pc.sal>20)
				   s1+="\t**EXPECTED LOAN EXCEEDS INCOME BY MORE THAN OR EQUAL TO 20 LPA**\n";
			   
			   throw new Myexp(s1);
		     }
		     ta.setVisible(false);
		      g.setColor(Color.green);
		      g.drawString("APPROVED",750,220);
		      g.setColor(Color.cyan);
		      g.fillRect(100, 250, 750, 700);
			  g.setColor(Color.red);
		     g.setFont(new Font("times new roman",Font.BOLD,30));
			  g.drawString("NAME:  "+pc.name,120, 300);
		      g.drawString("GENDER:  "+pc.gen, 120, 340);
		  g.drawString("DOB:  "+pc.dob, 120, 380);
		  g.drawString("AGE:  "+pc.age, 120, 420);
		  g.drawString("PROFESSION:  "+pc.pro, 120, 460);
		  g.drawString("PH NO:  "+pc.ph, 120, 500);
		  g.drawString("SALARY(LPA):  "+pc.sal, 120, 540);
		  g.drawString("PURPOSE:  "+pc.pur, 120, 580);
		  g.drawString("PROPERTY:  "+pc.prop, 120, 620);
		  g.drawString("PROPERTY VALUE:  "+pc.proval, 120, 660);
		  g.drawString("GRANTED LOAN(LAKHS):  "+pc.loan, 120, 700);
		  g.drawString("MAX TIME:  "+pc.t+" MONTHS", 120, 740);
		  g.drawString("INTEREST:  "+pc.r+"%", 120,780);
		  pc.pay=(pc.loan+(pc.loan*pc.t*pc.r/100));
		  g.drawString("AMOUNT TO BE REPAID(LAKHS):  "+pc.pay, 120, 820);
		  g.drawImage(i9,900,250,900,650,this);
		  g.drawString("SANCTIONED DATE:  "+pc.d,120,860);
		  g.drawString("CUSTOMER ID:  "+pc.id,120,900);
		  try
			{   FileOutputStream fout=new FileOutputStream("perid.txt");
			    ObjectOutputStream dout=new ObjectOutputStream(fout);
				dout.writeObject(pf);
				dout.flush();
				dout.close();
				fout.close();
			}
			catch(Exception e1)
			{
				;
			}
		  
		  
		 
		  }
		  catch(Myexp e)
		  {    g.drawImage(i10, 900, 280, 800,400, this);
		       g.setColor(Color.red);
	     	   g.drawString("REJECTED",750,220);
	     	    deck.setVisible(true);
			   cd.show(deck,"exp");
			  ta.setText(""+e);
		      if(f11==0)
		      {
		    	  pf.remove(""+pc.id);
		    	  id--;
		     
		      }
		      f11=1;
		 
		  }
		  }
	  }
	  if(cnt==2)
	  { 
	      g.setFont(new Font("georgia",Font.BOLD,40));
	      g.setColor(Color.black);
	      if(cc.e!=1)
		  g.drawString("APPLICATION FORM",150, 220);
		  g.setFont(new Font("times new roman",Font.PLAIN,50));
	      g.setColor(Color.MAGENTA);
	      if(cc.e!=1)
	      {  g.drawString("CAR LOAN",1000, 220);
		  g.drawImage(i1, 900, 400, 800,400, this);
	      }
		  if(cc.f1==1)
		  {
			  cc.name=na1.getText();
		       cc.gen=cb1.getSelectedCheckbox().getLabel();
		       cc.dob=dobb1.getText();
		       cc.age=Integer.parseInt(agge1.getText());
		       cc.pro=c2.getSelectedItem();
		       cc.ph=add1.getText();
	           cc.sal=Float.parseFloat(sall1.getText());
	           cc.lic=dll.getSelectedItem();
		       cc.carm=mdd.getText();
	           cc.loan=Float.parseFloat(exx.getText());  
	           cc.d=new Date();
		  }
		  if(cc.e==1)
		  { 
		      g.setColor(Color.black);
		      g.drawString("APPLICATION STATUS : ",150, 220);
		      try
		  {  if((cc.age<18)||(cc.lic.compareTo("NO"))==0||(cc.loan-cc.sal>20))
		     {
			   String s="";
			   if(cc.age<18)
				   s+="\t**THE ENTERED AGE IS LESSER THAN 18**"+"\n";
			   if(cc.lic.compareTo("NO")==0)
			       s+="\t**NO DRIVING LICENSE**\n";
			   if(cc.loan-cc.sal>20)
				   s+="\t**EXPECTED LOAN EXCEEDS INCOME BY MORE THAN OR EQUAL TO 20 LPA**\n";
			   throw new Myexp(s);
		     }
		
		      g.setColor(Color.green);
		      g.drawString("APPROVED",800,220);
		      g.setColor(Color.cyan);
		      g.fillRect(100, 250, 750, 700);
			  g.setColor(Color.red);
		     g.setFont(new Font("times new roman",Font.BOLD,30));
			  g.drawString("NAME:  "+cc.name,120, 300);
		      g.drawString("GENDER:  "+cc.gen, 120, 340);
		  g.drawString("DOB:  "+cc.dob, 120, 380);
		  g.drawString("AGE:  "+cc.age, 120, 420);
		  g.drawString("PROFESSION:  "+cc.pro, 120, 460);
		  g.drawString("PH NO:  "+cc.ph, 120, 500);
		  g.drawString("SALARY(LPA):  "+cc.sal, 120, 540);
		  g.drawString("LICENSE:  "+cc.lic, 120, 580);
		  g.drawString("CAR MODEL:  "+cc.carm, 120, 620);
		  g.drawString("GRANTED LOAN(LAKHS):  "+cc.loan, 120, 660);
		  g.drawString("MAX TIME:  "+cc.t+" MONTHS", 120, 700);
		  g.drawString("INTEREST:  "+cc.r+"%", 120,740);
		  cc.pay=(cc.loan+(cc.loan*cc.t*cc.r/100));
		  g.drawString("AMOUNT TO BE REPAID(LAKHS):  "+cc.pay, 120, 780);
		  g.drawImage(i5,900,250,900,650,this);
		  g.drawString("SANCTIONED DATE:  "+cc.d,120,820);
		  g.drawString("CUSTOMER ID:  "+cc.id,120,900);
		  try
			{   FileOutputStream fout=new FileOutputStream("carid.txt");
			    ObjectOutputStream dout=new ObjectOutputStream(fout);
				dout.writeObject(cf);
				dout.flush();
				dout.close();
				fout.close();
			}
			catch(Exception e1)
			{
				;
			}
		  
		 
		  }
		  catch(Myexp e)
		  {    g.drawImage(i6, 900, 280, 800,400, this);
		       g.setColor(Color.red);
	     	   g.drawString("REJECTED",800,220);
	     	   deck.setVisible(true);
			   cd.show(deck,"exp");
			  ta.setText(""+e);
		      if(f22==0)
		      { cf.remove(""+cc.id);
		      id--;
		    
		     
		      }
		      f22=1;
		    
		  }
		  }
		  
	  }
	  if(cnt==3)
	  {   
	      g.setFont(new Font("georgia",Font.BOLD,40));
	      g.setColor(Color.black);
	      if(hc.e!=1)
		  g.drawString("APPLICATION FORM",150, 220);
		  g.setFont(new Font("times new roman",Font.PLAIN,50));
	      g.setColor(Color.orange);
		  if(hc.e!=1)
	      {  g.drawString("HOME LOAN",1000, 220);
		  g.drawImage(i2, 1000, 400, 800,400, this);
	      }
		  if(hc.f1==1)
		  {
			  hc.name=na2.getText();
		       hc.gen=cb2.getSelectedCheckbox().getLabel();
		       hc.dob=dobb2.getText();
		       hc.age=Integer.parseInt(agge2.getText());
		       hc.pro=c3.getSelectedItem();
		       hc.ph=add2.getText();
	           hc.sal=Float.parseFloat(sall2.getText());
	           hc.tol=tolc.getSelectedItem();
		       hc.htype=htypec.getSelectedItem();
	           hc.loan=Float.parseFloat(exxc.getText());  
	           hc.d=new Date();
		  }
		  if(hc.e==1)
		  { 
		      g.setColor(Color.black);
		      g.drawString("APPLICATION STATUS : ",150, 220);
		      try
		  {  if((hc.age<18)||(hc.tol.compareTo("UNREGISTERED LAND"))==0||(hc.loan-hc.sal>20))
		     {
			   String s1="";
			   if(hc.age<18)
				   s1+="\t**THE ENTERED AGE IS LESSER THAN 18**"+"\n";
			   if(hc.tol.compareTo("UNREGISTERED LAND")==0)
			       s1+="\t**LOANS ARE NOT PROVIDED FOR UNREGISTERED LANDS**\n";
			   if(hc.loan-hc.sal>20)
				   s1+="\t**EXPECTED LOAN EXCEEDS INCOME BY MORE THAN OR EQUAL TO 20 LPA**\n";
			   s=0;
			   throw new Myexp(s1);
		     }
		  ta.setVisible(false);
		      g.setColor(Color.green);
		      g.drawString("APPROVED",720,220);
		      g.setColor(Color.cyan);
		      g.fillRect(100, 250, 750, 700);
			  g.setColor(Color.red);
		     g.setFont(new Font("times new roman",Font.BOLD,30));
			  g.drawString("NAME:  "+hc.name,120, 300);
		      g.drawString("GENDER:  "+hc.gen, 120, 340);
		  g.drawString("DOB:  "+hc.dob, 120, 380);
		  g.drawString("AGE:  "+hc.age, 120, 420);
		  g.drawString("PROFESSION:  "+hc.pro, 120, 460);
		  g.drawString("PH NO:  "+hc.ph, 120, 500);
		  g.drawString("SALARY(LPA):  "+hc.sal, 120, 540);
		  g.drawString("TYPE OF LAND:  "+hc.tol, 120, 580);
		  g.drawString("HOUSE TYPE:  "+hc.htype, 120, 620);
		  g.drawString("GRANTED LOAN(LAKHS):  "+hc.loan, 120, 660);
		  g.drawString("MAX TIME:  "+hc.t+" MONTHS", 120, 700);
		  g.drawString("INTEREST:  "+hc.r+"%", 120,740);
		  hc.pay=(hc.loan+(hc.loan*hc.t*hc.r/100));
		  g.drawString("AMOUNT TO BE REPAID(LAKHS):  "+hc.pay, 120, 780);
		  g.drawImage(i7,900,250,900,650,this);
		  g.drawString("SANCTIONED DATE:  "+hc.d,120,820);
		  g.drawString("CUSTOMER ID:  "+hc.id,120,900);
		  try
			{   FileOutputStream fout=new FileOutputStream("homeid.txt");
			    ObjectOutputStream dout=new ObjectOutputStream(fout);
				dout.writeObject(hf);
				dout.flush();
				dout.close();
				fout.close();
			}
			catch(Exception e1)
			{
				;
			}
		 
		  
		  }
		  catch(Myexp e)
		  {    g.drawImage(i8, 1000, 280, 800,400, this);
		       g.setColor(Color.red);
	     	   g.drawString("REJECTED",720,220);	     	  
	     	   deck.setVisible(true);
			   cd.show(deck,"exp");
			  ta.setText(""+e);
		   if(f33==0)
		      {
		    	  hf.remove(""+hc.id);
		    	  id--;
		      }
		      f33=1;
		  }
		  }
		  
	  }
	
	
	}
	
	public void destroy()
	{
		 try
			{ FileOutputStream fout=new FileOutputStream("cusid.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(id);
			dout.close();
			fout.close();
			
			}
			catch(Exception e1)
			{
				;
			}
	}	

}

class Myttask extends TimerTask
{   BankClass bc;
    Myttask(BankClass bc)
    {
    	this.bc=bc;
    }
	public void run()
	{
		bc.repaint(800,1540,15,400,30);
		if(bc.cnt==0)
		  bc.repaint(0,250, 2000, 25);
	}
}
