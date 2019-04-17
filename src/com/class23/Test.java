package com.class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("------Creating Employee object-------");
		
		Employee emp=new Employee();
		
		System.out.println(Employee.department);
		Employee.work();  //Preferred way to access static members via Class Name
		//emp.work();     //Not preferred way
		emp.salary=90000;
		emp.getPaid();
		
		
		System.out.println("------Creating Scrum Team object-----");
		
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		
		System.out.println("------Creating Developer object-----");
		
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		dev.attendScrumMeetings();
		dev.code();
		
		
		System.out.println("------Creating Tester object-----");
		
		Tester ts=new Tester();
		ts.salary=100000;
		ts.getPaid();
		ts.artifacts="Sprint backlog";
		ts.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		ts.attendScrumMeetings();
		ts.test();
		
		
		System.out.println("------Creating Business Analyst object-----");
		
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=90000;
		ba.getPaid();
		ba.artifacts="Sprint backlog";
		ba.ceremonies="Sprint grooming, Sprint planning, Sprint Demo";
		ba.attendScrumMeetings();
		ba.workOnArtifacts();
		
		
		System.out.println("------Creating Scrum Master object-----");
		
		ScrumMaster sm=new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		sm.attendScrumMeetings();
		sm.drivesScrumMeetings();
		sm.workOnArtifacts();
		
		
		System.out.println("------Creating Product Owner object-----");
		
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint backlog, Product backlog";
		po.ceremonies="Sprint grooming, Sprint planning";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		
		System.out.println("------Creating Front End Developer object-----");
		
		FrontEnd front=new FrontEnd();
		front.salary=125000;
		front.getPaid();
		front.artifacts="Sprint backlog";
		front.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		front.attendScrumMeetings();
		front.code();
		front.doHtml();
		
		
		System.out.println("------Creating Back End Developer object-----");
		
		BackEnd back=new BackEnd();
		back.salary=120000;
		back.getPaid();
		back.artifacts="Sprint backlog";
		back.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		back.attendScrumMeetings();
		back.code();
		back.doSql();
		
		
		System.out.println("------Creating Manual Tester object-----");
		
		ManualTester mt=new ManualTester();
		mt.salary=80000;
		mt.getPaid();
		mt.artifacts="Sprint backlog";
		mt.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		mt.attendScrumMeetings();
		mt.test();
		mt.testManualy();
		
		System.out.println("------Creating Automation Tester object-----");
		
		AutomationTester at=new AutomationTester();
		at.salary=85000;
		at.getPaid();
		at.artifacts="Sprint backlog";
		at.ceremonies="Sprint grooming, Sprint planning, Daily Stanups, Sprint Demo, Sprint Retro";
		at.attendScrumMeetings();
		at.test();
		at.codeInJava();
		
		
	}

}
