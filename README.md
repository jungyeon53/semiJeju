<h3 align="center">
  JEJU어때
</h3>
<h4 align="center">작업기간: 2023.10.16 ~ 2023.11.07
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

3. [제주어때 기능](#제주어때 기능)

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
   - 호텔과 객실등록의 첨부파일은 화면에서는 비동기처럼 보이지만 실제로는 동기로 처리했습니다. <br/>
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b2462ddc-14fb-498b-8d15-8f2a178f0a59" style="width:500px">
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b5e630a9-969c-488b-ba51-7d66d184bf23" style="width:500px">
<br/>
<br/>

2. 게시글 등록 & 관리자 답변
   - 고객님과 사장님의 게시글에 관리자는 답변을 달 수 있습니다. <br/>
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/54d5c660-185f-4719-a3ab-7740f7348122" style="width:500px">
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/b8f8338b-7bfb-4574-a25f-7e73b33fba37" style="width:500px">
<br/>
<br/>

3. 호텔 목록 및 리뷰
   - 고객님은 호텔 예약 후 리뷰를 작성할 수 있습니다. <br/>
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/d91e27af-b41d-404a-93cf-3e3fc4f4eebc" style="width:500px">
<img src="https://github.com/jungyeon53/senuJeju/assets/150405152/a820a457-0cc3-4625-802a-457adfc07358" style="width:500px">
