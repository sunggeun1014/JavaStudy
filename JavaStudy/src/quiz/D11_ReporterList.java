package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.sampled.DataLine.Info;

import myobj.Reporter;

public class D11_ReporterList {

	/*
		1. 어떤 이메일 도메인(yna.co.kr)이 몇 개씩 있는지 세어서 출력해보기
		
		2. 어떤 신문사의 기자가 몇 명씩 있는지 세어서 출력해보기
		
		3. 어떤 분야의 기자가 몇 명씩 있는지 세어서 출력해보기
		
		4. 모든 기자의 이름/이메일/분야를 신문사별로 분류하여 출력해주기
		
		5. 모든 기자의 이름/이메일/신문사를 분야별로 분류하여 출력해주기
	 */
	
	public static String reporters = "\r\n"
			+ "한국경제 통신/뉴미디어 박영태 pyt@hankyung.com \r\n"
			+ "연합뉴스 통신/뉴미디어 박창욱 pcw@yna.co.kr \r\n"
			+ "헤럴드 통신/뉴미디어 박영훈 park@heraldm.com \r\n"
			+ "연합뉴스 통신/뉴미디어 이광빈 lkbin@yna.co.kr \r\n"
			+ "연합뉴스 통신/뉴미디어 이경욱 kyunglee@yna.co.kr \r\n"
			+ "한국경제 통신/뉴미디어 안정락 jran@hankyung.com \r\n"
			+ "조선일보 통신/뉴미디어 장상진 jhin@chosun.com \r\n"
			+ "지디넷코리아 통신/뉴미디어 김효정 hjkim@zdnet.co.kr \r\n"
			+ "MBC 뉴스 통신/뉴미디어 남상호 fatshady@imbc.com \r\n"
			+ "뉴시스 통신/뉴미디어 정옥주 channa224@newsis.com \r\n"
			+ "머니투데이 통신/뉴미디어 김경미 camille@moneytoday.co.kr \r\n"
			+ "파이낸셜뉴스 통신/뉴미디어 이구순 cafe9@fnnews.com \r\n"
			+ "경향신문 통신/뉴미디어 권오용 bandy@kyunghyang.com \r\n"
			+ "세계일보 통신/뉴미디어 박성준 alex@segye.com \r\n"
			+ "조선일보 패션/뷰티 신정선 violet@chosun.com \r\n"
			+ "부산일보 패션/뷰티 김효정 teresa@busan.com \r\n"
			+ "한국경제 패션/뷰티 김명신 sin@hankyung.com \r\n"
			+ "한겨례 패션/뷰티 정세라 seraj@hani.co.kr \r\n"
			+ "조이뉴스 패션/뷰티 홍미경 mkhong@joynews24.com \r\n"
			+ "노컷뉴스 패션/뷰티 김정욱 jkim1999@cbs.co.kr \r\n"
			+ "스포츠월드 패션/뷰티 정정욱 jjay@sportsworldi.com \r\n"
			+ "한국경제 패션/뷰티 최지영 jiyoung@bntnews.co.kr \r\n"
			+ "한국경제 패션/뷰티 이지현 jihyun@bntnews.co.kr \r\n"
			+ "한국경제 패션/뷰티 송영원 fashion@bntnews.co.kr \r\n"
			+ "스포츠조선 패션/뷰티 김보라 boradori@sportschosun.com \r\n"
			+ "지디넷코리아 환경 김태정 tjkim@zdnet.co.kr \r\n"
			+ "연합뉴스 환경 신민재 smj@yna.co.kr \r\n"
			+ "한겨례 환경 권오성 sage5th@hani.co.kr \r\n"
			+ "뉴시스 환경 최일영 one@newsis.com \r\n"
			+ "SBSTV 환경 김범주 news4u@sbs.co.kr \r\n"
			+ "뉴시스 환경 배민욱 mkbae@newsis.com \r\n"
			+ "연합뉴스 환경 이우명 lwm123@yna.co.kr \r\n"
			+ "경향신문 환경 권기정 kwon@kyunghyang.com \r\n"
			+ "한겨례 환경 김광수 kskim@hani.co.kr \r\n"
			+ "동아일보 환경 허진석 jameshuh@donga.com \r\n"
			+ "연합뉴스 환경 박수현 ccho@yna.co.kr \r\n"
			+ "연합뉴스 환경 박병기 bgipark@yna.co.kr \r\n"
			+ "뉴시스 환경 우종원 atoz@newsis.com \r\n"
			+ "헤럴드 휴대폰/디지털기기 이영란 yrlee@heraldm.com \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 김우용 yong2@zdnet.co.kr \r\n"
			+ "국민일보 휴대폰/디지털기기 김원철 wonchul@kmib.co.kr \r\n"
			+ "경향신문 휴대폰/디지털기기 윤민용 vista@kyunghyang.com \r\n"
			+ "전자신문 휴대폰/디지털기기 이정환 victolee@etnews.co.kr \r\n"
			+ "노컷뉴스 휴대폰/디지털기기 권민철 twinpine@cbs.co.kr \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 서소정 ssj6@inews24.com \r\n"
			+ "프레시안 휴대폰/디지털기기 김봉규 srv@pressian.com \r\n"
			+ "머니투데이 휴대폰/디지털기기 송정렬 songjr@moneytoday.co.kr \r\n"
			+ "디지털데일리 휴대폰/디지털기기 심재석 sjs@ddaily.co.kr \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 김익현 sini@inews24.com \r\n"
			+ "SBSTV 휴대폰/디지털기기 김수형 sean@sbs.co.kr \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 이설영 ronia@zdnet.co.kr \r\n"
			+ "국민일보 휴대폰/디지털기기 천지우 mogul@kmib.co.kr \r\n"
			+ "디지털데일리 휴대폰/디지털기기 이민형 kiku@ddaily.co.kr \r\n"
			+ "뉴시스 휴대폰/디지털기기 강세훈 kangse@newsis.com \r\n"
			+ "한겨례 휴대폰/디지털기기 김재섭 jskim@hani.co.kr \r\n"
			+ "부산일보 휴대폰/디지털기기 이주환 jhwan@busanilbo.com \r\n"
			+ "MBC 뉴스 휴대폰/디지털기기 현원섭 hyunny@imbc.com \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 남혜연 hyun@zdnet.co.kr \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 이장혁 hymagic@zdnet.co.kr \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 정병묵 honnezo@inews24.com \r\n"
			+ "파이낸셜 휴대폰/디지털기기 홍석희 hong@fnnews.com \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 임혜정 heather@inews24.com \r\n"
			+ "동아일보 휴대폰/디지털기기 김원겸 gyummy@donga.com \r\n"
			+ "동아일보 휴대폰/디지털기기 김동현 game@gamedonga.co.kr \r\n"
			+ "파이낸셜 휴대폰/디지털기기 백인성 fxman@fnnews.com&nbsp; \r\n"
			+ "조선일보 휴대폰/디지털기기 이동훈 ﬂatron2@chosun.com \r\n"
			+ "블로터닷넷 휴대폰/디지털기기 도안구 eyeball@bloter.net \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 강은성 esther@inews24.com \r\n"
			+ "전자신문 휴대폰/디지털기기 조중혁 doimoi00@gmail.com \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 황치규 delight@zdnet.co.kr \r\n"
			+ "조선일보 휴대폰/디지털기기 정진영 cya@chosun.com \r\n"
			+ "한겨례 휴대폰/디지털기기 최성진 csj@hani.co.kr \r\n"
			+ "아이뉴스 24 휴대폰/디지털기기 강호성 chaosing@inews24.com \r\n"
			+ "지디넷코리아 휴대폰/디지털기기 최병준 ccbbjj@zdnet.co.kr \r\n"
			+ "디지털타임스 휴대폰/디지털기기 이형근 bruprin@gmail.com \r\n"
			+ "전자신문 휴대폰/디지털기기 이성현 argos@etnews.co.kr \r\n"
			+ "디지털타임스 IT 정유진 yjin@dt.co.kr \r\n"
			+ "디지털타임스 IT 허우영 yenny@dt.co.kr \r\n"
			+ "지디넷코리아 IT 김태정 tjkim@zdnet.co.kr \r\n"
			+ "뉴시스경제 IT 김정남 surrender@newsis.com \r\n"
			+ "전자신문 IT 김원석 stone201@etnews.co.kr \r\n"
			+ "한국경제 IT 문혜정 selenmoon@hankyung.com \r\n"
			+ "한국경제 IT 박영태 pyt@hankyung.com \r\n"
			+ "디지털데일리 IT 한주엽 powerusr@ddaily.co.kr \r\n"
			+ "프라임경제 IT 나원재 nwj@newsprime.co.kr \r\n"
			+ "경제투데이 IT 김남규 ngkim@eto.co.kr \r\n"
			+ "아시아투데이 IT 정석만 naﬂnaﬂ@asiatoday.co.kr \r\n"
			+ "디지털타임스 IT 강희종 mindle@dt.co.kr \r\n"
			+ "헤럴드생생뉴스 IT 이권형 kwonhl@heraldm.com \r\n"
			+ "경제투데이 IT 김태균 ksgit@eto.co.kr \r\n"
			+ "경제투데이 IT 한지운 juhan@eto.co.kr \r\n"
			+ "디지털타임스 IT 박지성 jspark@dt.co.kr \r\n"
			+ "전자신문 IT 김준배 joon@etnews.co.kr \r\n"
			+ "아시아경제 IT 조강욱 jomarok@asiae.co.kr \r\n"
			+ "아시아투데이 IT 김효정 jhkim@asiatoday.co.kr \r\n"
			+ "이데일리 IT 신혜리 hyeree@ \r\n"
			+ "아주경제 IT 윤혜미 hm@ajnews.co.kr \r\n"
			+ "헤럴드경제 IT 황혜진 hhj6386@heraldm.com \r\n"
			+ "아시아경제 IT 이승종 hanarum@asiae.co.kr \r\n"
			+ "이투데이 It 최재혁 freshphase@etoday.co.kr \r\n"
			+ "디지털타임스 IT 심화영 dorothy@dt.co.kr \r\n"
			+ "한국경제 IT 김동훈 DHK@hankyung.com \r\n"
			+ "아이티투데이 IT 최고야 cky@ittoday.co.kr \r\n"
			+ "아이뉴스 24 IT 박웅서 ckoudpark@inews24.com \r\n"
			+ "뉴시스 IT 정옥주 channa224@newsis.com \r\n"
			+ "지디넷코리아 IT 봉성창 bong@zdnet.co.kr \r\n"
			+ "보안뉴스 IT 김정완 boan3@boannews.com \r\n"
			+ "아주경제 It 조영빈 agamee81@ajnews.co.kr \r\n"
			+ "산업뉴스 IT 박영국 24pyk@ebn.co.kr \r\n"
			+ "디지털데일리 IT 이상일 2401@ddaily.co.kr \r\n"
			+ "아이뉴스 24 IT/통신방송 박정일 comja@inews24.com \r\n"
			+ "이데일리 IT산업동향/정책 지영한 yhji@edaily.co.kr \r\n"
			+ "한국경제 IT산업동향/정책 서기열 philos@hankyung.com \r\n"
			+ "동아일보 IT산업동향/정책 이헌진 mungchii@donga.com \r\n"
			+ "연합뉴스 IT산업동향/정책 인교준 kjihn@yna.co.kr \r\n"
			+ "연합뉴스 IT산업동향/정책 홍제성 jsa@yna.co.kr \r\n"
			+ "연합뉴스 IT산업동향/정책 김재홍 jaehong@yna.co.kr \r\n"
			+ "연합뉴스 IT산업동향/정책 김지훈 hoonkim@yna.co.kr \r\n"
			+ "연합뉴스 IT산업동향/정책 함보현 hanarmdri@yna.co.kr \r\n"
			+ "머니투데이 IT산업동향/정책 김성현 sean@moneytoday.co.kr \r\n"
			+ "머니투데이 IT산업동향/정책 정현수 gustn99@moneytoday.co.kr \r\n"
			+ "SBSTV IT산업동향/정책 표언구 eungoo@sbs.co.kr \r\n"
			+ "헤럴드 IT산업동향/정책 김상수 dlcw@heraldm.com \r\n"
			+ "머니투데이 IT산업동향/정책 김경미 camille@moneytoday.co.kr \r\n"
			+ "아이뉴스 24 IT산업동향/정책 서정근 antilaw@inews24.com \r\n"
			+ "아시아투데이 없음 김옥빈 obkim5153@hanmail.net \r\n"
			+ "매경헬스 없음 이상미 lsmclick@mkhealth.co.kr \r\n"
			+ "블로터닷넷 없음 주민영 ezoomin@bloter.net \r\n"
			+ "매일경제 없음 황시영 @shinyandloose";
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(.+)\\s+(\\S+)\\s+([가-힣]+)\\s+((\\w*)@(\\w*(\\.\\w+)*))");
		Matcher m = p.matcher(reporters);
		
		HashMap<String, Integer> domainCountMap = new HashMap<>();
		HashMap<String, Integer> reporterCountMap = new HashMap<>();
		HashMap<String, Integer> fieldCountMap = new HashMap<>();
		
		ArrayList<Reporter> reporters = new ArrayList<>();
		
		while (m.find()) {
//			System.out.println("-------------------------------------");
//			System.out.println("언론사 : " + m.group(1));
//			System.out.println("분야 : " + m.group(2));
//			System.out.println("이름 : " + m.group(3));
//			System.out.println("이메일 : " + m.group(4));
//			System.out.println("아이디 : " + m.group(5));
//			System.out.println("도메인 : " + m.group(6));
			
			String company = m.group(1);
			String field = m.group(2);
			//String reporterName = m.group(3);
			String domainName = m.group(6);
			
			domainCountMap.put(domainName, domainCountMap.getOrDefault(domainName, 0) + 1);
			reporterCountMap.put(company, reporterCountMap.getOrDefault(company, 0) + 1);
			fieldCountMap.put(field, fieldCountMap.getOrDefault(field, 0) + 1);
			
			reporters.add(new Reporter(m.group(3), m.group(1), m.group(2), m.group(4)));
		}
		System.out.println("# 각 도메인의 개수");
		System.out.println(domainCountMap);
		System.out.println("# 각 언로사의 기자 수");
		System.out.println(reporterCountMap);
		System.out.println("# 각 분야의 기자 수");
		System.out.println(fieldCountMap);
		
		HashMap<String, List<Reporter>> categoryCompany = new HashMap<>();
		HashMap<String, List<Reporter>> categoryField = new HashMap<>();
		
		for(Reporter reporter : reporters) {
			String companyName = reporter.getCompany();
			
			if(categoryCompany.containsKey(companyName)) {
				categoryCompany.get(companyName).add(reporter);
			}else {
				ArrayList<Reporter> list = new ArrayList<>();
				list.add(reporter);
				categoryCompany.put(companyName, list);
			}
		}
		
		for(String company : categoryCompany.keySet()) {
			System.out.println("###" + company + "의 기자들 ###");
			for (Reporter reporter : categoryCompany.get(company)) {
				System.out.println(reporter);
			}
		}
		System.out.println("-------------------------------------");
		
		for (Reporter reporter : reporters) {
			String field = reporter.getField();
			
			if(categoryField.containsKey(field)) {
				categoryField.get(field).add(reporter);
			}else {
				ArrayList<Reporter> list = new ArrayList<>();
				list.add(reporter);
				categoryField.put(field, list);
			}
		}
		
		for(String field : categoryField.keySet()) {
			System.out.println("분야: " + field);
			for(Reporter reporter : categoryField.get(field)) {
				System.out.printf("=> %s/%s/%s\n", reporter.getName(), reporter.getEmail(), reporter.getCompany());
			}
		}
	}
	
	
}
