function includeHTML(){for(var t,e,n,i=document.getElementsByTagName("*"),s=0;s<i.length;s++)if(e=(t=i[s]).getAttribute("include-html"))return(n=new XMLHttpRequest).onreadystatechange=function(){4==this.readyState&&(200==this.status&&(t.innerHTML=this.responseText),404==this.status&&(t.innerHTML="Page not found."),t.removeAttribute("include-html"),includeHTML())},n.open("GET",e,!0),void n.send()}