function showCourses() {
fetch("http://localhost:8080/Courses")
.then((response)=>response.json())
.then((courses)=>{
    const dataTable =document.getElementById("coursetable");

courses.forEach(Course => {
        var row =`<tr>
     <td>${Course.courseId} </td>
     <td>${Course.courseName} </td>
     <td>${Course.trainer} </td>
     <td>${Course.durationInWeeks} </td>
     </tr>`
         dataTable.innerHTML += row;
    
    });
});
}
function  showEnrolledStudents() {
    fetch("http://localhost:8080/Courses/enrolled")
.then((response)=>response.json())
.then((students)=>{
    const dataTable =document.getElementById("enrolledtable");

students.forEach(student => {
        var row =`<tr>
     <td>${student.name} </td>
     <td>${student.emailId} </td>
     <td>${student.courseName} </td>
     </tr>`
         dataTable.innerHTML += row;
    
    });
});
}