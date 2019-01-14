(function($) {
    var elmDrag, replacerSet = $();
    var eventStack = ['dragstart', 'dragend', 'selectstart', 'dragover', 'dragenter', 'drop'];
    
    $.fn.dropme = function(options) {

        var userOpt = options.toString();

        options = $.extend({
            linkTo: false
        }, options);

        if (options.contId) {
            //var elmes = '<ul class="sortable">';
            var elmes = '';
            var lnth = options.elem.length;
            var i;
            for (i = 0; i < lnth; i++) {
                elmes += '<li id=' + options.elem[i].id + '>' + options.elem[i].title + '</li>';
            }
            // elmes += '</ul>';
            $('#' + options.contId + ' .dropme').html(elmes);
        }

        return this.each(function() {
            var regEx = new RegExp("/^enable|disable|destroy$/");
            if (userOpt.match(regEx)) {

                var itemInOpt = $(this).data('items');

                var items = $(this).children(itemInOpt);

                if (userOpt == 'enable') {
                    items.attr('draggable', true);
                } else {
                    items.attr('draggable', false);
                }

                if (userOpt == 'destroy') {
                    items.add(this).removeData('linkTo items').off(JSON.stringify(eventStack));
                }
                return;
            }
            var index, items = $(this).children(options.items);

            var replacer = $('<' + (this.tagName.match(/^ul|ol|div$/i) ? 'li' : 'div') + ' class="drop-replacer">');

            $(this).data('items', options.items);

            replacerSet = replacerSet.add(replacer);

            if (options.linkTo) {
                $(options.linkTo).add(this).data('linkTo', options.linkTo);
            }

            items.attr('draggable', 'true').on(eventStack[0], function(e) {
                var dataTrnsfr = e.originalEvent.dataTransfer;
                dataTrnsfr.effectAllowed = 'move';
                dataTrnsfr.setData('Text', 'dummy');
                elmDrag = $(this);
                index = (elmDrag).addClass('drop-elmDrag').index();
            }).on(eventStack[1], function() {
                (elmDrag = $(this)).removeClass('drop-elmDrag').show();
                replacerSet.detach();
                if (index != elmDrag.index()) {
                    items.parent().trigger('sortupdate', {
                        item: elmDrag
                    });
                }
                elmDrag = null;
            }).not('a[href], img').on(eventStack[2], function() {
                this.dragDrop && this.dragDrop();
                return false;
            }).end().add([this, replacer]).on('dragover dragenter drop', function(event) {
                if (!items.is(elmDrag) && options.linkTo !== $(elmDrag).parent().data('linkTo')) {
                    return true;
                }
                if (event.type == 'drop') {
                    event.stopPropagation();
                    replacerSet.filter(':visible').after(elmDrag);
                    return false;
                }
                event.preventDefault();
                event.originalEvent.dataTransfer.dropEffect = 'move';
                if (items.is(this)) {
                    if (options.replacerSize) {
                        replacer.height(elmDrag.outerHeight());
                    }
                    elmDrag.hide();
                    $(this)[replacer.index() < $(this).index() ? 'after' : 'before'](replacer);
                    replacerSet.not(replacer).detach();
                } else if (!replacerSet.is(this) && !$(this).children(options.items).length) {
                    replacerSet.detach();
                    $(this).append(replacer);
                }
                return false;
            });
        });
    };
})(jQuery);

/* 드래그 창 */
$('.dropme').dropme('enable');
$('.exclude').dropme({
				items: ':not(.disabled)'
			});
			$('.li_common_style').dropme({
				linkTo: '.li_common_style'
			});

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-36251023-1']);
  _gaq.push(['_setDomainName', 'jqueryscript.net']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

/* 모달 창 */
//Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("calenderWriteBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
$(function(event){
  if (event.target == modal) {
    modal.style.display = "none";
  }
  
  
  
});

/* 일정 데이터 전달 */
var add_category_id = 0;		// 카테고리 아이디
var add_project_id = 0;			// 프로젝트 아이디
// 일정 추가 버튼 '+' 눌렀을 때
$(document).on("click", "#calenderWriteBtn", function(){
	var par = $(this).parent();	// 부모노드
 	var category_id = $(par).children().eq(1).val();
 	var project_id = $(par).children().eq(2).val();
	
 	add_category_id = category_id;
	add_project_id = project_id;
});

// 일정 추가 버튼 눌렀을 때
$('#calender_add').click(function() {
	
	 var write = $("input[name=write]").val();
	 var color = $("input[name=color]").val();
	 var completion_per = $("input[name=completion_per]").val();
	 var tag = $("input[name=tag]").val();
	 
	 console.log("write:"+write);
	 console.log("color:"+color);
	 console.log("completion_per:"+completion_per);
	 console.log("tag:"+tag);
	 
		  
	  $.ajax({
	    type:"POST",
	    data : { project_id:add_project_id, category_id:add_category_id,write:write,color:color, completion_per:completion_per,tag:tag  },
	    dataType:"json",
	    url:"./calenderWrite.do",
	    success: function(data) {
	    	console.log("성공!");
	      
	    },
	  });
	  
	});
