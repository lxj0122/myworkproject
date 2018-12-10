<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>物资管理系统</title>
    <link rel="stylesheet" type="text/css" href="/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/easyui/themes/icon.css">
    <script type="text/javascript" src="/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">

</script>
<body class="easyui-layout" >
    <%--<div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>--%>
    <%--<div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>--%>
    <%--<div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>--%>
    <div data-options="region:'west',title:'菜单',split:true" style="width:150px;">
        <ul id="tt" class="easyui-tree">
            <li>
                <span>Folder</span>
                <ul>
                    <li>
                        <span>Sub Folder 1</span>
                        <ul>
                            <li><span><a href="#">File 11</a></span></li>
                            <li><span>File 12</span></li>
                            <li><span>File 13</span></li>
                        </ul>
                    </li>
                    <li><span>File 2</span></li>
                    <li><span>File 3</span></li>
                </ul>
            </li>
            <li><span>File21</span></li>
        </ul>
    </div>
    <div data-options="region:'center',title:''"  ></div>
</body>
</html>