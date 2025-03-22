with counter_students as(
    select class, count(*) as counter
    from Courses
    group by class
)
select distinct Courses.class
from Courses
join counter_students on Courses.class=counter_students.class
where counter>=5
