<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>安全中心</title>
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container" id="myWizard">

    <h3>安全中心</h3>

    <hr>

    <div class="progress">
        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="4" style="width: 20%;">
            Step 1 / 4
        </div>
    </div>

    <div class="navbar">
        <div class="navbar-inner">
            <ul class="nav nav-pills">
                <li class="active"><a href="#step1" data-toggle="tab" data-step="1">第 1 步</a></li>
                <li><a href="#step2" data-toggle="tab" data-step="2">第 2 步</a></li>
                <li><a href="#step3" data-toggle="tab" data-step="3">第 3 步</a></li>
                <li><a href="#step4" data-toggle="tab" data-step="4">第 4 步</a></li>
            </ul>
        </div>
    </div>

    <div class="tab-content">
        <div class="tab-pane fade in active" id="step1">

            <div class="well">

                <label>邮箱</label>
                <input type="text" class="form-control" placeholder="请输入你的邮箱">
                <br>
                <label>验证码</label>
                <input type="text" class="form-control" placeholder="请输入验证码">


            </div>

            <a class="btn btn-default btn-lg next" href="#">下一步</a>
        </div>

        <div class="tab-pane fade" id="step2">
            <div class="well">

                <label>Security Question 2</label>
                <select class="form-control  input-lg">
                    <option value="What was the name of your first pet?">What was the name of your first pet?</option>
                    <option selected="" value="Where did you first attend school?">Where did you first attend school?</option>
                    <option value="What is your mother's maiden name?">What is your mother's maiden name?</option>
                    <option value="What is your favorite car model?">What is your favorite car model?</option>
                </select>
                <br>
                <label>Enter Response</label>
                <input class="form-control  input-lg">

            </div>
            <a class="btn btn-default next" href="#">Continue</a>
        </div>

        <div class="tab-pane fade" id="step3">
            <div class="well"> <h2>Step 3</h2> Add another step here..</div>
            <a class="btn btn-default next" href="#">Continue</a>
        </div>

        <div class="tab-pane fade" id="step4">
            <div class="well"> <h2>Step 4</h2> Add another almost done step here..</div>
            <a class="btn btn-default next" href="#">Continue</a>
        </div>
    </div>

    <hr>

    <h3>|影约|</h3>

    <hr>

</div>




<script type="text/javascript" src="static/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/js/step.js"></script>

</body></html>
