/**
 * Created by cuican on 2016-9-7.
 */

/**
 * 下载文件,以POST的方式提交
 * @param options{url,data}
 * 使用方式
 * downLoadFile({
 *      url:'xxx.download', //请求的url
 *      data:{name:xxx,age:xxx}//要发送的数据
 *      callback:function(){}
 * });
 *
 */
var downLoadFile = function (options) {
    var config = $.extend(true, {method: 'post'}, options);
    var $form = $('<form target="_self" method="' + config.method + '" />');
    $form.attr('action', config.url);
    for (var key in config.data) {
        $form.append('<input type="hidden" name="' + key + '" value="' + config.data[key] + '" />');
    }
    $(document.body).append($form);
    if (config.callback != undefined) {
        config.callback();
    }
    $form[0].submit();
};

var downloadFileByTagA = function () {
    var a = $("<a></a>").appendTo($("body"));
    a.attr("href", e.data.filePath);
    a.attr("download", e.data.fileName);
    a.appendTo($("body"));
    a.css("display", "none");
    $("<span>AAAAAAA</span>").appendTo(a).trigger("click");
    window.setTimeout(function () {
        a.remove();
    }, 3000);
};

/**
 * 处理null值的字段
 * 判断 是、否,上报、分配等。
 */
var dealNull = function (field, num1, num2, val1, val2) {
    var str = "";
    if (field == num1) {
        str = val1;
    } else if (field == num2) {
        str = val2;
    }
    return str;
};


/**
 * 处理null值的字段
 * 有值就显示，null就不显示
 */
var dealIfNull = function (field) {
    return (field == null) ? "" : field;
};






