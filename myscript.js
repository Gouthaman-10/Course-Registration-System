function loadCourses() {
    fetch("http://localhost:8080/courses")
        .then((res) => res.json())
        .then((courses) => {
            const table = document.getElementById("course_table");
            table.innerHTML = "";
            courses.forEach(course => {
                table.innerHTML += `
                    <tr class="border-b hover:bg-gray-100">
                        <td class="px-4 py-2">${course.courseId}</td>
                        <td class="px-4 py-2">${course.courseName}</td>
                        <td class="px-4 py-2">${course.duration}</td>
                        <td class="px-4 py-2">${course.trainer}</td>
                    </tr>`;
            });
        });
}

function loadEnrolled() {
    fetch("http://localhost:8080/courses/entroll")
        .then((res) => res.json())
        .then((students) => {
            const table = document.getElementById("entroll");
            table.innerHTML = "";
            students.forEach(student => {
                table.innerHTML += `
                    <tr class="border-b hover:bg-gray-100">
                        <td class="px-4 py-2">${student.name}</td>
                        <td class="px-4 py-2">${student.emailID}</td>
                        <td class="px-4 py-2">${student.courseName}</td>
                    </tr>`;
            });
        });
}
