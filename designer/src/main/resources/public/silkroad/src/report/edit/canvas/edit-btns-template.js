define(['template'], function (template) {
    function anonymous($data,$filename) {
        'use strict';
        $data=$data||{};
        var $utils=template.utils,$helpers=$utils.$helpers,$out='';$out+='<div class="con-edit-btns j-con-edit-btns hide">\n    <!--<label class="btn-has-icon btn-has-icon-drag special" title="勾选此项，按键盘的上下左右键"><input class="j-keyboard" type="checkbox"/>键盘调位</label>-->\n    <span class="btn-report-icon btn-has-icon-edit btn-cavnas-icon-edit c-p j-setting" title="编辑数据及关联"></span>\n    <span class="btn-report-icon btn-has-icon-drag c-m j-drag" title="拖拽调整位置"></span>\n    <span class="btn-report-icon btn-has-icon-delete btn-cavnas-icon-delete c-p j-delete" title="删除"></span>\n</div>';
        return $out;
    }
    return { render: anonymous };
});