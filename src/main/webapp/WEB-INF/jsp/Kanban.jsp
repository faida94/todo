<!-- Simple MDL Progress Bar -->
<div id="p1" class="mdl-progress mdl-js-progress"></div>
<script>
    document.querySelector('#p1').addEventListener('mdl-componentupgraded', function() {
        this.MaterialProgress.setProgress(44);
    });
</script><div class="kanban__title">
    <h1><i class="material-icons">check</i> To do list</h1></div>
<div class="dd">

    <ol class="kanban To-do">
        <div class="kanban__title">
            <h2><i class="material-icons">report_problem</i> To do </h2></div>
        <li class="dd-item" data-id="1">
            <h3 class="title dd-handle" >Assignment<i class=" material-icons ">filter_none</i></h3>
            <div class="text" contenteditable="true">Finish up Assignment</div> <i class="material-icons" id="label blue">label</i><div class="actions">
            <i class="material-icons" id="color">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

        </li>
        <li class="dd-item" data-id="4">
            <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>log-in bug</h3>
            <div class="text" contenteditable="true">Finish up Assignment </div><div class="actions">
            <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

        </li>
        <li class="dd-item" data-id="3">
            <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>UX design</h3>
            <div class="text" contenteditable="true">Finish up assignment "Should be complete"</div><div class="actions">
            <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>


            <div class="actions">
                <button class="abut"><i class="material-icons">control_point</i> Add new</button>
            </div>
    </ol>
    <ol class="kanban progress">
        <h2><i class="material-icons">build</i> In progress</h2>
        <li class="dd-item" data-id="5">
            <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>  title of job</h3>
            <div class="text" contenteditable="true">Progressing Assignments, </div><div class="actions">
            <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

        </li>
    </ol>
    <ol class="kanban  Done">
        <h2><i class="material-icons">check_circle</i> Done</h2>
        <li class="dd-item" data-id="5">
            <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>  title of job</h3>
            <div class="text" contenteditable="true"> DONE </div><div class="actions">
            <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

        </li></li><li class="dd-item" data-id="2">
        <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>  title of job</h3>
        <div class="text" contenteditable="true">Assigments should be done,</div><div class="actions">
        <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

    </li>
        <div class="actions">
            <button class="addbutt"><i class="material-icons">control_point</i> Add new</button>
        </div>
    </ol>
    <ol class="kanban Gone">
        <h2><i class="material-icons">delete</i> Ready</h2>
        <li class="dd-item" data-id="5">
            <h3 class="title dd-handle"><i class=" material-icons ">filter_none</i>  title of job</h3>
            <div class="text" contenteditable="true">Assessments and assignments, DONE,</div><div class="actions">
            <i class="material-icons">palette</i><i class="material-icons">edit</i><i class="material-icons">insert_link</i><i class="material-icons">attach_file</i></div>

        </li>
        <div class="actions">
            <button class="addbutt"><i class="material-icons">control_point</i> Add new</button>
        </div>
    </ol>

</div>
<menu class="kanban"><button><i class="material-icons">settings</i></button> <button><i class="material-icons">chevron_left</i></button>
    <button class="viewkanban"><i class="material-icons ">view_column</i></button>
    <button class="viewlist"><i class="material-icons">view_list</i></button>
    <button><i class="material-icons">playlist_add</i> Add new Column</button></menu>