<h3 align="center">
  JEJU어때
</h3>
<h4 align="center">작업기간: 2023.10.04 ~ 2023.11.07
<h6 align="center">제주도의 숙박과 주변관광지까지 볼 수 있는 <br/>여행 플랫폼으로 제주어때를 기획했습니다.</h6>
<p align="center">
  <img src="https://github.com/jungyeon53/senuJeju/assets/150405152/acc0d1ff-e24b-44c6-8032-4b8106ed6641" style="width:1200px">
</p>

<h2 align="center">Language</h2>
<div align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-007396?&style=for-the-badge&logo=Java&logoColor=white"/>
  <img alt="JavaScript" src="https://img.shields.io/badge/JavaScript-F7DF1E?&style=for-the-badge&logo=JavaScript&logoColor=white"/>
  <img alt="JSP" src="https://img.shields.io/badge/JSP-007396?&style=for-the-badge&logo=Java&logoColor=white"/>
  <br/>
  <img alt="CSS3" src="https://img.shields.io/badge/CSS3-1572B6?&style=for-the-badge&logo=CSS3&logoColor=white"/>
  <img alt="HTML5" src="https://img.shields.io/badge/HTML5-E34F26?&style=for-the-badge&logo=HTML5&logoColor=white"/>
  <br/>
  <img alt="jQuery" src="https://img.shields.io/badge/jQuery-0769AD?&style=for-the-badge&logo=jQuery&logoColor=white"/>
  <img alt="MariaDB" src="https://img.shields.io/badge/MariaDB-003545?&style=for-the-badge&logo=MariaDB&logoColor=white"/>
  <img alt="Bootstrap" src="https://img.shields.io/badge/Bootstrap-7952B3?&style=for-the-badge&logo=Bootstrap&logoColor=white"/>
  <br/>
  <img alt="Tomcat" src="https://img.shields.io/badge/Tomcat-F8DC75?&style=for-the-badge&logo=Apache%20Tomcat&logoColor=black"/>
  <img alt="MyBatis" src="https://img.shields.io/badge/MyBatis-007396?&style=for-the-badge&logo=Apache%20MyBatis&logoColor=white"/>
</div>

## 제주어때 프로젝트 목차

1. [프로젝트 개요](#프로젝트-개요)
   - [제주어때란?](#제주어때란?)
   
2. [설계](#설계)
   - [요구사항 정의서](#요구사항-정의서)
   - [데이터 베이스](#데이터-베이스)

3. [제주어때 기능](#제주어때-기능)
4. [이슈사항 및 리뷰](#이슈사항-및-리뷰)

<br/>

## 프로젝트 개요

개발기간 : 2023.10.16 ~ 2023.11.07<br/>
버전 정보 :
Java 8
Eclipse
<br/>

### 프로젝트 선정 배경

코로나로 인해 해외여행이 금지되면서 많은 관광객이 제주도로 몰리는 현상이 있었습니다.<br/>
제주도로 여행을 가고싶었던 관광객들은 숙소를 예약하고 주변 관광지를 알아보지만 <br/>
한번에 볼 수 있는 플랫폼이 없었습니다. <br/>
그래서 저희는 숙박과 주변관광지까지 볼 수 있는 여행 플랫폼으로 제주어때를 기획했습니다.<br/>

### 제주어때란?

호텔의 사장님이 제주어때에 호텔등록 및 객실을 등록하면 제주어때에서 홍보하고 고객님이 객실을 예약하는 구조입니다. <br/>
처음 기획할 때에는 호텔 반경 10km의 주변 관광지까지 볼 수 있도록 하는 것이 목표였습니다. 
<br/>

## Team Project

공통 : DB설계, 프로토 타이핑, 서류작성 (요구사항 정의서, 테이블 명세서, 팀 회의록)

**김정연(본인) : 조장, 게시판, 관리자 페이지 , 호텔 & 객실 CRUD**

유호진 : 회원(복호화) , 예약, 결제

윤주민 : 데이터 크롤링 , 호텔 & 객실 목록, 리뷰 
<br/>

## 설계

### 요구사항 정의서
[요구사항 정의서](https://docs.google.com/spreadsheets/d/17hfCd9a4bhDbJpbDySGt81o7KpOmWIun/edit#gid=1134625650)
<p align="">
  <img src="https://github.com/jungyeon53/senuJeju/assets/150405152/93f7bb71-205c-4faa-993e-ff60acc804d4" style="width:800px">
</p>

### 주요기능
1. 사장님
   - 호텔관리
   - 호텔 등록
   - 객실 등록
   - 호텔 상세조건 등록
   - 호텔 삭제 신청
2. 사용자
   - 회원가입 & 로그인 & 마이페이지
   - 호텔예약
   - 예약 확인 & 취소
   - 호텔 리뷰
   - 고객 문의
   - 호텔 결제
3. 관리자
   - 관리자 로그인
   - 게시글 등록 & 수정 & 삭제
   - 관리자 페이지
   - 고객 문의 답변

### 데이터 베이스
[테이블 명세서](https://docs.google.com/spreadsheets/d/17hfCd9a4bhDbJpbDySGt81o7KpOmWIun/edit#gid=179553652)<br/>
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b69dacdf-6220-4b2a-98c1-a051222dce9a" style="width:800px">

## 제주어때 기능

1. 호텔등록 & 객실등록
   - 호텔 & 객실의 CRUD는 사장님 페이지에서 가능하며 호텔을 등록한 후 객실등록이 가능합니다.<br/>
   - 1명의 사장님이 여러개의 호텔을 소유할 수 있는 1:다 구조이기 때문에 호텔테이블에서 멤버의 pk를 갖고 있도록 추후 수정했습니다.
   - 호텔 & 객실 수정 화면에서 첨부파일을 변경할 시 클릭이벤트를 통해 이미지가 보이지 않는 것처럼 하고, 실제 데이터가 전송 될 때 동기로 진행됩니다.
   - 체크박스를 통해 1개 이상 체크되면 버튼이 클릭 가능하게 하고, 전체 삭제, 개별 삭제가 가능합니다.
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b2462ddc-14fb-498b-8d15-8f2a178f0a59" style="width:500px">
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b5e630a9-969c-488b-ba51-7d66d184bf23" style="width:500px">
<br/>
<br/>

3. 게시글 등록 & 관리자 답변
   - 고객지원 페이지는 공지사항, 자주 찾는 질문 확인이 가능하고 1대1 문의를 통해 관리자에서 문의내역을 남길 수 있습니다.
   - 1대1 문의를 남길 때도 첨부파일이 가능합니다.
   - 관리자 페이지에서는 공지사항, 자주 찾는 질문 등록이 가능하며 1대1문의의 답변을 남길 수 있습니다.
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/54d5c660-185f-4719-a3ab-7740f7348122" style="width:500px">
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b8f8338b-7bfb-4574-a25f-7e73b33fba37" style="width:500px">
<br/>
<br/>

5. 호텔 목록 및 리뷰
   - 고객님은 호텔 예약 후 리뷰를 작성할 수 있습니다.
   - 리뷰를 작성할 때는 호텔의 별점을 줄 수 있습니다.
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/d91e27af-b41d-404a-93cf-3e3fc4f4eebc" style="width:500px">
<img src="https://github.com/jungyeon53/semiJeju/assets/150405152/e258ba22-795b-4f0b-b420-813422a0e496" style="width:500px">
<br/>
<br/>

6. 회원가입 및 로그인
   - 고객님과 사장님은 회원가입 후 로그인이 가능합니다.
   - 비빌번호는 복호화 되어 개인정보가 보호됩니다.
   - 마이페이지에서는 회원정보 수정, 예약내역 조회가 가능합니다.
<img src="https://github.com/jungyeon53/semiJeju/assets/150405152/739e68df-314d-4155-a487-aed39f8b8908" style="width:500px">
<img src="https://github.com/jungyeon53/semiJeju/assets/150405152/303ce2db-aedc-4ac6-b3ae-e0ab5c5197da" style="width:500px">
<br/>
<br/>

7. 예약
  - 회원가입 후 호텔을 예약할 때는 예약 페이지에 정보를 입력한 후 예약이 가능합니다. 
  - 예약 완료 내역은 마이페이지에서 확인이 가능합니다.

## 이슈사항 및 리뷰
프로젝트 시작하고 2주 뒤에 팀원 한명이 건강상의 이유로 빠지게 되었습니다. <br/>
그래서 원래 목표했던 주변 관광지 및 맛집 정보는 과감하게 후순위로 진행했지만 시간에 쫒겨 구현하지 못했습니다.<br/>
제가 맡은 역할은 게시판과 관리자 페이지, 호텔과 객실 등록 및 삭제인데 게시판 만들 때 <br/>
시간을 많이 소비해 관리자 페이지의 회원과 예약 내역은 구현하지 못해 아쉽습니다.<br/>
<br/>

처음 목표로 했던 데이터베이스 테이블은 1개~2개 빼고 모두 사용했지만 <br/>
지금 생각해보면 기능에 비해 너무 많다는 생각이 듭니다.<br/> 
그래서 파이널 프로젝트에는 최대한 테이블을 줄이고 효율적으로 사용하기 위해 노력했습니다. <br/>
코드를 작성할 당시 제가 편하려고 카테고리를 필터로 작성해 메인 페이지에서 이미지를 불러오는 것에 이슈가 있었습니다. <br/>
뒤늦게 코드를 수정해 작동은 잘 되었지만 필터같이 모든 페이지에서 영향을 주는 코드는 조심해야겠다고 생각했습니다. <br/>
<br/>

처음 팀장을 맡아 초반에는 열정 과다로 기능을 이것저것 많이 넣고 팀원들에게 일을 많이 준 것 같이 미안했지만 <br/>
마지막까지 함께 응원하고 서로 도와주며 진행해서 3명이서 할 수 있는 최대한 기능을 많이 구현한 것 같습니다. <br/>
주말에도 학원에서 만나 코딩하고 서로 의견을 존중해줘서 고마웠고, 팀워크를 배울 수 있었습니다. <br/>
파이널 프로젝트때는 미숙했던 점을 보완해서 더욱 완성도 있게 작업하려고 합니다. <br/>
<br/>
