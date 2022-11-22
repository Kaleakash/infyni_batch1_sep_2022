show databases;
use infi_batch1;
show tables;
select * from trainer;
select * from student;
insert into trainer values(3,'Raju','Anggular');
select t1.tname,t1.tech,s1.sname from trainer t1,student s1 where t1.tid = s1.tsid;
select t1.tname,t1.tech,s1.sname from trainer t1 inner join student s1 on t1.tid = s1.tsid;
select t1.tname,t1.tech,s1.sname from trainer t1 left outer join student s1 on t1.tid = s1.tsid;
select t1.tname,t1.tech,s1.sname from trainer t1 right outer join student s1 on t1.tid = s1.tsid;

select * from employee;
select * from department;
select e.first_name,e.salary,d.department_name from employee e inner join department d on e.department_id=d.department_id;


desc employee;

select trainer.tname,trainer.tech,student.sname from trainer,student where trainer.tid = student.tsid;
desc employee;
desc department;

select e1.first_name,e1.job_id,e2.first_name,e2.job_id from employee e1 inner join employee e2 on e2.employee_id=e1.manager_id;
select concat(e1.first_name,' is ',e1.job_id,' report to ',e2.first_name,e2.job_id) as Report from employee e1 inner join employee e2 on e2.employee_id=e1.manager_id;


select * from jobs;

select concat(e1.first_name,' is ',e1.job_id,' report to ',e2.first_name,e2.job_id) as Report 
from employee e1 inner join employee e2 on e2.employee_id=e1.manager_id;

select concat(e1.first_name,' is ',j1.job_title,' report to ',e2.first_name,j2.job_title) as Report 
from employee e1, employee e2, jobs j1,jobs j2 where e2.employee_id=e1.manager_id and e1.job_id=j1.job_id and e2.job_id=j2.job_id;


select concat(e1.first_name,' is ',e1.job_id,' report to ',e2.first_name,e2.job_id) as Report from employee e1 inner join employee e2 on e2.employee_id=e1.manager_id;

select * from employee;

select * from jobs;



