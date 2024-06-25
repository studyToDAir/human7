-- 한줄 주석
/* 범위 주석 */
SELECT
    *
FROM
    emp;
-- sql developer 자동 정렬 단축키 : Ctrl + F7
SELECT
    empno,-- 조회하고 싶은 컬럼 명들
    ename,
    deptno
FROM
    emp;

SELECT
    1, 'a', 30*654
FROM
    emp;
    
select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 복사 단축키 : ctrl + shift + d
-- 한줄 지우기 : ctrl + x , alt + shift + d
-- distinct : select에서 중복되는 자료를 제거해준다
select distinct deptno from emp;
select distinct job from emp;

select deptno, job from emp;
-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는걸 제거한다
select distinct deptno, job from emp;

-- null과 연산하면 무조건 null이다
select ename, sal, sal*12+comm, comm from emp;

-- 컬럼명에 별칭 사용
-- " 생략 가능
-- as 생략 가능
-- 별칭안에 띄어쓰기가 있는 경우 " 생략 불가
-- 가능하면 띄어쓰기보다 _를 넣자
select ename, sal, sal*12+comm as "new sal", comm from emp;

-- order by : 해당 컬럼으로 정렬
-- 오름차순 : asc 생략가능
-- 내림차순 : desc
select * from emp
order by sal asc;

select * from emp
order by comm;

select * from emp
order by sal desc;

-- order by 첫번째거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
select * from emp
order by deptno asc, sal desc;

select distinct job from emp
order by job;

select * from emp
where deptno = 30;

select * from emp
where empno = 7782;

select * from emp
where sal >= 2000
order by sal;

select * from emp
where ename = 'KING';

select * from emp
where deptno = 30 and job = 'SALESMAN';

select * from emp
where job = 'CLERK' and deptno = 30;

select * from emp
where job = 'CLERK' and deptno = 30 or deptno = 20;

select * from emp
where job = 'CLERK' and (deptno = 30 or deptno = 20);

select * from emp
where sal >= 2000 and sal < 3000;
--2000 <= sal < 3000

select * from emp
--where sal != 3000;
where sal <> 3000;


/*
    !(a != b)
*/
select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job = 'MANAGER' or job = 'SALESMAN' or job = 'CLERK';

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where sal >= 2000 and sal <= 3000;

select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- %는 어떤거든 관계없음
select * from emp
where ename like 'S%';

select * from emp where ename like 'A%';

-- _는 딱 한글자인데 어떤 글자던 관계 없음
select * from emp
where ename like '_L%';

select * from emp
where ename not like '____';

select * from emp
where ename like '%AM%';

select * from emp
where comm <= 400;

select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where comm is not null;

-- emp에서 deptno가 10 또는 20인 사원의
-- empno, ename, sal, deptno를 출력하세요
select empno, ename, sal, deptno from emp
--where deptno = 10 or deptno = 20;
where deptno in (10, 20);

-- 서로 다른 조회 결과물을 합쳐줍니다.
-- 단, 조회한 컬럼의 개수, 타입이 같아야 한다.
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 20;

-- union : 중복된 자료를 제거해줌
select empno, ename, sal, deptno from emp
where deptno = 10
union
select empno, ename, sal, deptno from emp
where deptno = 10;

-- union all : 중복에 관계없이 합쳐준다
select empno, ename, sal, deptno from emp
where deptno = 10
union all
select empno, ename, sal, deptno from emp
where deptno = 10;

-- 125p.
-- Q1
select * from emp where ename like '%S';
-- Q2
select empno, ename, job, sal, deptno from emp where deptno = 30 and job = 'SALESMAN';
-- Q3
select empno, ename, job, sal, deptno from emp
where deptno in (20, 30) and sal > 2000;
-- Q3-union
select empno, ename, job, sal, deptno from emp
where deptno = 20 and sal > 2000
union all
select empno, ename, job, sal, deptno from emp
where deptno = 30 and sal > 2000;
-- Q4
select * from emp 
where not (2000 <= sal and sal <= 3000);
-- Q5
select ename, empno, sal, deptno
from emp
where ename like '%E%'
and deptno = 30
and not (sal > 1000 and sal < 2000);
-- Q6
select * from emp
where
        comm is null
    and mgr is not null
    and job in ('MANAGER', 'CLERK')
    and ename not like ('_L%');

select ename, upper(ename), lower(ename), initcap(ename)
from emp;

-- upper, lower는 대소문자 구분 없이 like할때 딱 좋다
select * from emp
where lower(ename) like lower('%Mi%');

-- length : 문자 개수
select ename, length(ename)
from emp;

select * from emp 
where length(ename) >= 5;

-- dual : 임시 테이블
select length('한'), lengthb('한') from dual;

-- substr  : 대상이되는 문자, 시작위치, 가져올 개수
-- 가져올 개수를 안쓰거나 너무 크면 끝까지
select 
    job, 
    substr(job, 1, 2), substr(job, 0, 2), 
    substr(job, 3, 3), 
    substr(job, 5),
    ename,
    substr(job, -3, 2),
    length( lower( substr(job, 5, 100) ) )
from emp;

select job, replace(job, 'A', '*') from emp;

select 
    job,
    length(job),
    (length(job)+1) / 2,
    substr(job, (length(job)+1) / 2, 1),
    replace(
        job,
        substr(job, (length(job)+1) / 2, 1),
        '*'
    )
from emp;

-- lpad : 대상이 되는 문자, 전체 자리수, 채울 문자
-- 채울 문자 생략 시 공백문자
select 
    job,
    lpad(job, 10, '#'),
    lpad(job, 4, '#')
from emp;

select 
    job, length(job), (15 - length(job))/2
from emp;

-- 뭔가 가운데 정렬 느낌
select
    rpad(
        lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*'
        ),
            
        (16 - (length(job)))/2 + length(lpad(
            job, 
            (16 - (length(job)))/2 + length(job), 
            '*')
        ),
        
        '*')
from emp;

-- 문자열 더하기
select empno || ename || '님'
from emp;

-- trim : 앞 뒤 공백 제거
-- 글씨 사이의 공백은 제거하지 않음
select 
    '   a b c      ',
    trim('   a b c      ')
from dual;

-- 실습문제 1
select
    '210621-3123456',
    '210621-3******'
from dual;

select
    '210621-3' || '******',
    substr('210621-3123456', 1, 8) || '******',
    rpad('210621-3', 14, '*'),
    rpad(
        substr('210621-3123456', 1, 8), 
        length('210621-3123456'), 
        '*'
    )
from dual;

-- 실습문제2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : WARD -> WA**, MARTIN -> MA****
-- 쉬운버전 : 앞 두글자 + '***'
select 
    ename,
    substr(ename, 1, 2),
    rpad( substr(ename, 1, 2), length(ename), '*'),
    substr(ename, 1, 2) || '***'
from emp;


-- 실습문제3
-- 앞글자 하나만
-- WARD -> *ARD, MARTIN -> *ARTIN

select '*' || substr(ename, 2) from emp;

-- 실습문제4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename, 1, 1) || '*' || substr(ename, 3) from emp;

-- 실습문제5
-- 가운데 글씨만 *
-- MARTIN -> MA*TIN, SCOTT -> SC*TT
select
    length(ename)/2 + 1,
    substr(ename, 1, length(ename)/2-0.5)|| '*' || substr(ename, length(ename)/2 + 1.5 )
from emp;

select 
    trunc(1234.5678),
    trunc(1234.5678, 2),
    trunc(1234.5678, -2),
    trunc(-12.34)
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14)
from dual;

-- sysdate : 지금 오라클 pc의 시간이 나옵니다
-- 강사 pc는 9시간 차이 난다(영국 0시 기준 한국 +9시)
-- 날짜 정보 중 일부만 select로 표시 됨
select sysdate, sysdate+1, sysdate-1 from dual;

-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용 함
-- || 숫자도 문자로 적용
select
    to_char(sysdate+(9/24), 'yyyy"년" MM"월" dd"일"  hh24"시" mi"분" ss"초"')
from dual;

select 
    sysdate - to_date('2024-05-07', 'yyyy-mm-dd')
from dual;


select
    to_char(to_date('2024-05-07', 'yyyy-mm-dd'), 'yyyy"년" MM"월" dd"일"  hh24"시" mi"분" ss"초"')
from dual;

select 
    comm, 
    nvl(comm, -1),
    sal,
    sal + comm,
    sal + nvl(comm, 0)
from emp;

select * from emp
where comm = 0 or comm is null;

select * from emp
where nvl(comm, 0) = 0;

select
    case
        when 
            comm is null 
            then
--                'N/A'
                0
        else
--            to_char(comm)
--            '' || comm
            comm
    end new_comm
from emp;

-- Q2
select empno, ename, sal,
trunc(sal / 21.5, 2) as day_pay,
round((sal / 21.5) / 8, 1) time_pay1,
trunc(sal / 21.5, 2) / 8 time_pay2
from emp;

-- Q3
select empno, ename, hiredate,
to_char( add_months(hiredate, 3), 'yyyy-mm-dd') r_job_0,
next_day(add_months(hiredate, 3), 2) r_job_1,   -- 일욜1, 월욜2,..., 토욜7
comm,
nvl( to_char(comm), 'N/A'),
to_char(null),
case
    when comm is null then 'N/A'
    else to_char(comm)
end,
decode(comm, 
    null, 'N/A',
    comm)   -- decode는 to_char 안써도 알아서 해줌
from emp;

-- Q4
select empno, ename, mgr,
case
    when mgr is null then '0000'
    else
        case
            when substr(mgr, 1, 2) = 75 then '5555'
            when substr(mgr, 1, 2) = 76 then '6666'
            else to_char(mgr)
        end
end chg_mgr_1,
case 
    when mgr is null then '0000'
    else
        case substr(mgr, 1, 2)
            when '75' then '5555'
            when '76' then '6666'
            else to_char(mgr)
        end
end chg_mgr_2,
case 
    when mgr is null then '0000'
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else to_char(mgr)
end chg_mgr_3,
case
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else nvl(to_char(mgr), '0000')
end chg_mgr_4,
case
    when substr(mgr, 2, 1) in ('5','6','7','8') 
        then lpad(substr(mgr, 2, 1), 4, substr(mgr, 2, 1))
    else nvl(to_char(mgr), '0000')
end chg_mgr_5,
case
when mgr is null then '0000'
when mgr >= 7500 and mgr < 7600 then '5555'
when mgr >= 7600 and mgr < 7700 then '6666'
when mgr >= 7700 and mgr < 7800 then '7777'
when mgr >= 7800 and mgr < 7900 then '8888'
else to_char(mgr)
end as chg_mgr_6
from emp;

-- count처럼 null은 제외됨
-- count는 *를 많이 씀
select sum(sal), count(sal), count(*), count(comm) from emp;

select count(*) from emp where ename like '%A%';

select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- 부서별 급여 총합, 평균 표시
-- deptno, sum, avg
select sum(sal), avg(sal) from emp
where deptno = 10
union all
select sum(sal), avg(sal) from emp
where deptno = 20
union all
select sum(sal), avg(sal) from emp
where deptno = 30;

-- distinct처럼 중복을 제거해줌, 분류해줌
-- select에는 group by한 것이나 다중행 함수(집계 함수)만 올 수 있음
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno;

select deptno, empno, sum(sal), count(*) from emp
group by deptno, empno;

select deptno, job, count(*)
from emp
--where count(*) >= 2
group by deptno, job
order by deptno, job;

-- having : group by에서만 사용된다.
-- 집계함수를 조건으로 걸고 싶은 경우에 사용
select deptno, job, avg(sal)
from emp
group by deptno, job
--    having avg(sal) >= 2000;
--    having count(*) >= 2;
    having deptno = 20;

-- 212p.
-- q1
select 
    deptno, floor(avg(sal)) avg_sal, max(sal) as max_sal, min(sal) min_sal, count(*) cnt
from emp
group by deptno;

-- q2
select job, count(*)
from emp
--where count(*) >= 3
group by job
    having count(*) >= 3
;




/* 5 */ select job, count(*) cnt
/* 1 */ from emp
/* 2 */ where sal > 1000
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;

select * from dept;

select * 
from emp, dept
order by empno;

select 14 * 4 from dual;

select /*emp.ename*/ ename, /*emp.loc*/dept.loc, /*deptno,*/ emp.deptno
from emp, dept
where emp.deptno = dept.deptno
order by empno;
-- 테이블 두개 이상 조회할때 관계를 꼭 알려줘야 원하는 정보만 출력된다
-- 전체 테이블 수 - 1개의 조건이 적당하다

select EnAmE
from eMp e, dept d
--where e.deptno = d.deptno;
where E.deptno = d.deptno;


select e.ename from emp e;

-- *와 컬럼을 같이 쓰는 경우 *에 테이블을 지정해줘야 한다.
select ename, e.*, d.*
from eMp e, dept d
--where e.deptno = d.deptno;
where E.deptno = d.deptno;

select ename, emp.* from emp;

select * from salgrade;

select *
from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;

select * from emp;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;

-- using에는 둘다 같은 컬럼명이 있는 경우만 쓸 수 있다
select deptno /*emp.deptno 못씀*/
from emp join dept using (deptno);

select *
from emp join dept on (emp.deptno = dept.deptno);

select *
from emp e1 join emp e2 on(e1.mgr = e2.empno);

-- left outer join이란? 왼쪽 테이블을 모두 출력하는걸 보장해준다
select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno);

-- quiz 1
-- empno, ename, dname, loc 출력 : 결과 14줄
select empno, ename, dname, loc
from emp, dept
where emp.deptno = dept.deptno
order by emp.deptno;

select empno, ename, dname, loc
from emp join dept using (deptno);

select empno, ename, dname, loc
from emp left outer join dept on(emp.deptno = dept.deptno);

-- quiz 2
-- 사번, 이름, 부서명, 급여등급을 출력 : 결과 14줄
select e.empno, e.ename, d.dname, s.grade
  from emp e, dept d, salgrade s
 where e.deptno = d.deptno
   and (e.sal >= s.losal and e.sal <= s.hisal);

select e.empno, e.ename, d.dname, s.grade
from salgrade s , emp e join dept d using (deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);

select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal);

-- quiz 3
-- 상사 보다 월급이 높은 사원의 이름, 급여, 상사 이름, 매니저 급여
select e1.ename, e1.sal, e1.mgr, e2.empno, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal > e2.sal;

-- q1
select emp.deptno, dept.dname, emp.empno, emp.ename, emp.sal from emp, dept
where emp.deptno = dept.deptno
and sal > 2000
order by deptno;

-- q2
select d.deptno, d.dname, floor(avg(e.sal)), max(e.sal), min(e.sal), count(*)
from emp e left outer join dept d on (e.deptno = d.deptno)
group by d.deptno, d.dname;

-- q3
select *
from dept d left outer join emp e on (e.deptno = d.deptno)
order by d.deptno
;
select sal from emp where ename = 'JONES';

select * from emp
where sal > (select sal from emp where ename = 'JONES');


