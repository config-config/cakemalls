(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-4d6c6987"],{"018e":function(t,e,n){},"149f":function(t,e,n){"use strict";var r=n("d7e3"),o=n.n(r);o.a},"25f0":function(t,e,n){"use strict";var r=n("6eeb"),o=n("825a"),i=n("d039"),c=n("ad6d"),a="toString",s=RegExp.prototype,l=s[a],u=i((function(){return"/a/b"!=l.call({source:"a",flags:"b"})})),f=l.name!=a;(u||f)&&r(RegExp.prototype,a,(function(){var t=o(this),e=String(t.source),n=t.flags,r=String(void 0===n&&t instanceof RegExp&&!("flags"in s)?c.call(t):n);return"/"+e+"/"+r}),{unsafe:!0})},2909:function(t,e,n){"use strict";function r(t){if(Array.isArray(t)){for(var e=0,n=new Array(t.length);e<t.length;e++)n[e]=t[e];return n}}n("a4d3"),n("e01a"),n("d28b"),n("a630"),n("e260"),n("d3b7"),n("25f0"),n("3ca3"),n("ddb0");function o(t){if(Symbol.iterator in Object(t)||"[object Arguments]"===Object.prototype.toString.call(t))return Array.from(t)}function i(){throw new TypeError("Invalid attempt to spread non-iterable instance")}function c(t){return r(t)||o(t)||i()}n.d(e,"a",(function(){return c}))},"32c6":function(t,e,n){},3395:function(t,e,n){"use strict";var r=n("5ef5"),o=n.n(r);o.a},"44e7":function(t,e,n){var r=n("861d"),o=n("c6b6"),i=n("b622"),c=i("match");t.exports=function(t){var e;return r(t)&&(void 0!==(e=t[c])?!!e:"RegExp"==o(t))}},"4d63":function(t,e,n){var r=n("83ab"),o=n("da84"),i=n("94ca"),c=n("7156"),a=n("9bf2").f,s=n("241c").f,l=n("44e7"),u=n("ad6d"),f=n("9f7f"),d=n("6eeb"),A=n("d039"),v=n("69f3").set,g=n("2626"),p=n("b622"),m=p("match"),b=o.RegExp,h=b.prototype,y=/a/g,D=/a/g,z=new b(y)!==y,P=f.UNSUPPORTED_Y,k=r&&i("RegExp",!z||P||A((function(){return D[m]=!1,b(y)!=y||b(D)==D||"/a/i"!=b(y,"i")})));if(k){var C=function(t,e){var n,r=this instanceof C,o=l(t),i=void 0===e;if(!r&&o&&t.constructor===C&&i)return t;z?o&&!i&&(t=t.source):t instanceof C&&(i&&(e=u.call(t)),t=t.source),P&&(n=!!e&&e.indexOf("y")>-1,n&&(e=e.replace(/y/g,"")));var a=c(z?new b(t,e):b(t,e),r?this:h,C);return P&&n&&v(a,{sticky:n}),a},T=function(t){t in C||a(C,t,{configurable:!0,get:function(){return b[t]},set:function(e){b[t]=e}})},H=s(b),w=0;while(H.length>w)T(H[w++]);h.constructor=C,C.prototype=h,d(o,"RegExp",C)}g("RegExp")},"4df4":function(t,e,n){"use strict";var r=n("0366"),o=n("7b0b"),i=n("9bdd"),c=n("e95a"),a=n("50c4"),s=n("8418"),l=n("35a1");t.exports=function(t){var e,n,u,f,d,A,v=o(t),g="function"==typeof this?this:Array,p=arguments.length,m=p>1?arguments[1]:void 0,b=void 0!==m,h=l(v),y=0;if(b&&(m=r(m,p>2?arguments[2]:void 0,2)),void 0==h||g==Array&&c(h))for(e=a(v.length),n=new g(e);e>y;y++)A=b?m(v[y],y):v[y],s(n,y,A);else for(f=h.call(v),d=f.next,n=new g;!(u=d.call(f)).done;y++)A=b?i(f,m,[u.value,y],!0):u.value,s(n,y,A);return n.length=y,n}},"4fe8":function(t,e,n){"use strict";var r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"goods",on:{click:t.itemClick}},[n("img",{attrs:{src:t.goodsItem.gimage,alt:""},on:{load:t.imgLoad}}),n("div",{staticClass:"goods-info"},[n("p",[t._v(t._s(t.goodsItem.gtitle))]),n("span",{staticClass:"price"},[t._v("￥"+t._s(t.goodsItem.gsize6))]),n("span",{staticClass:"collect"},[t._v(t._s(t.goodsItem.gcollect))])])])},o=[],i={name:"GoodsItem",props:{goodsItem:{type:Object,default:function(){return{}}}},methods:{imgLoad:function(){this.$bus.$emit("itemImageLoad")},itemClick:function(){this.$router.push("/detail/"+this.goodsItem.gid)}}},c=i,a=(n("149f"),n("2877")),s=Object(a["a"])(c,r,o,!1,null,"6dd6e8cc",null);e["a"]=s.exports},"5ef5":function(t,e,n){},"735b":function(t,e,n){"use strict";n.d(e,"b",(function(){return o})),n.d(e,"a",(function(){return i}));var r=n("1bab");function o(){return Object(r["a"])({url:"getAllHomeGoods.do",method:"post"})}function i(t){return Object(r["a"])({url:"getKindGoods.do",method:"post",data:{gkind:t}})}},"778d":function(t,e,n){"use strict";n.r(e);var r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{attrs:{id:"category"}},[n("nav-bar",{staticClass:"nav-bar"},[n("div",{attrs:{slot:"center"},slot:"center"},[t._v("商品分类")])]),n("div",{staticClass:"content"},[n("tab-menu",{attrs:{categories:t.categories},on:{selectItem:t.selectItem}}),n("div",{attrs:{id:"tab-content"}},[n("scroll",{ref:"scroll",staticClass:"tab-content",attrs:{"probe-type":3,"pull-up-load":!0},on:{scroll:t.caScroll,pullingUp:t.loadMores}},[n("tab-content-detail",{attrs:{"category-detail":t.showGoods}})],1)],1)],1),n("back-top",{directives:[{name:"show",rawName:"v-show",value:t.isShowBackTop,expression:"isShowBackTop"}],nativeOn:{click:function(e){return t.backClick(e)}}})],1)},o=[],i=n("2909"),c=n("a7ac"),a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"menu-list"},t._l(t.categories,(function(e,r){return n("div",{key:r,staticClass:"menu-list-item",class:{active:r===t.currentIndex},on:{click:function(e){return t.itemClick(r)}}},[t._v(" "+t._s(e.title)+" ")])})),0)},s=[],l=(n("b0c0"),n("5d17")),u={name:"TabMenu",components:{Scroll:l["a"]},props:{categories:{type:Array,default:[]}},data:function(){return{currentIndex:0}},methods:{itemClick:function(t){this.currentIndex=t;var e=this.categories[t].name;this.$emit("selectItem",e)}}},f=u,d=(n("b44f"),n("2877")),A=Object(d["a"])(f,a,s,!1,null,"409baf0d",null),v=A.exports,g=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"category-item"},t._l(t.categoryDetail,(function(t,e){return n("goods-item",{key:e,attrs:{"goods-item":t}})})),1)},p=[],m=n("4fe8"),b={name:"TabContentDetail",components:{GoodsItem:m["a"]},props:{categoryDetail:{type:Array,default:function(){return[]}}}},h=b,y=(n("7d0c"),Object(d["a"])(h,g,p,!1,null,"5f2c0c7a",null)),D=y.exports,z=n("eecb"),P=n("735b"),k={name:"Category",components:{NavBar:c["a"],TabMenu:v,Scroll:l["a"],TabContentDetail:D},data:function(){return{categories:[{title:"新品",name:"news"},{title:"流行",name:"pop"},{title:"精选",name:"sell"},{title:"生日",name:"birth"},{title:"寿糕",name:"older"},{title:"卡通",name:"katong"},{title:"水果",name:"friut"},{title:"儿童",name:"child"},{title:"植脂",name:"zhizhi"},{title:"植脂",name:"ruzhi"}],goods:{pop:{page:0,list:[]},news:{page:0,list:[]},sell:{page:0,list:[]},birth:{page:0,list:[]},older:{page:0,list:[]},katong:{page:0,list:[]},friut:{page:0,list:[]},child:{page:0,list:[]},zhizhi:{page:0,list:[]},ruzhi:{page:0,list:[]}},currentType:"news",saveY:0}},mixins:[z["b"],z["a"]],activated:function(){this.$refs.scroll.scrollTo(0,this.saveY,0),this.$refs.scroll.refresh()},mounted:function(){var t=this;this.$bus.$on("changeCounts",(function(e,n,r){for(var o=["pop","sell","news","birth","older","katong","friut","child","zhizhi","ruzhi"],i=0;i<o.length;i++){var c=o[i];if(c==r)for(var a=t.goods[c].list,s=0;s<a.length;s++)a[s].gid==e&&(a[s].gcollect=n)}}))},deactivated:function(){this.saveY=this.$refs.scroll.getScrollY(),this.$bus.$off("itemImageLoad",this.itemListener)},computed:{showGoods:function(){return this.goods[this.currentType].list}},created:function(){this.getHomeGoods(this.currentType)},methods:{selectItem:function(t){this.currentType=t,this.getHomeGoods(this.currentType)},caScroll:function(t){this.isShowBackTop=-t.y>700},getHomeGoods:function(t){var e=this,n=this.goods[t].page+1,r=t+"_"+n;Object(P["a"])(r).then((function(n){var r;(r=e.goods[t].list).push.apply(r,Object(i["a"])(n)),e.goods[t].page+=1,e.$refs.scroll.finishPullUp()}))},loadMores:function(){this.getHomeGoods(this.currentType),this.$refs.scroll.refresh()}}},C=k,T=(n("3395"),Object(d["a"])(C,r,o,!1,null,"680ca3be",null));e["default"]=T.exports},"7d0c":function(t,e,n){"use strict";var r=n("d9fd"),o=n.n(r);o.a},8418:function(t,e,n){"use strict";var r=n("c04e"),o=n("9bf2"),i=n("5c6c");t.exports=function(t,e,n){var c=r(e);c in t?o.f(t,c,i(0,n)):t[c]=n}},"90b9":function(t,e,n){"use strict";n.d(e,"a",(function(){return r})),n.d(e,"b",(function(){return o}));n("4d63"),n("ac1f"),n("25f0"),n("5319");function r(t,e){var n=null;return function(){for(var r=this,o=arguments.length,i=new Array(o),c=0;c<o;c++)i[c]=arguments[c];null!=n&&clearTimeout(n),n=setTimeout((function(){t.apply(r,i)}),e)}}function o(t){var e=t.getFullYear(),n=t.getMonth()+1,r=t.getDate(),o=t.getHours(),i=t.getMinutes();i<10&&(i="0"+i);var c=t.getSeconds();return c<10&&(c="0"+c),e+"-"+n+"-"+r+" "+o+":"+i+":"+c}},"90c5":function(t,e){t.exports="data:image/png;base64,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"},a630:function(t,e,n){var r=n("23e7"),o=n("4df4"),i=n("1c7e"),c=!i((function(t){Array.from(t)}));r({target:"Array",stat:!0,forced:c},{from:o})},b0c0:function(t,e,n){var r=n("83ab"),o=n("9bf2").f,i=Function.prototype,c=i.toString,a=/^\s*function ([^ (]*)/,s="name";!r||s in i||o(i,s,{configurable:!0,get:function(){try{return c.call(this).match(a)[1]}catch(t){return""}}})},b0e9:function(t,e,n){"use strict";var r=n("32c6"),o=n.n(r);o.a},b44f:function(t,e,n){"use strict";var r=n("018e"),o=n.n(r);o.a},d7e3:function(t,e,n){},d9fd:function(t,e,n){},eecb:function(t,e,n){"use strict";var r=n("90b9"),o=function(){var t=this,e=t.$createElement;t._self._c;return t._m(0)},i=[function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("div",{staticClass:"back-top"},[r("img",{attrs:{src:n("90c5"),alt:""}})])}],c={name:"BackTop"},a=c,s=(n("b0e9"),n("2877")),l=Object(s["a"])(a,o,i,!1,null,"351253d2",null),u=l.exports;n.d(e,"b",(function(){return f})),n.d(e,"a",(function(){return d}));var f={data:function(){return{itemListener:null}},mounted:function(){var t=Object(r["a"])(this.$refs.scroll.refresh,50);this.itemListener=function(){t()},this.$bus.$on("itemImageLoad",this.itemListener)}},d={components:{BackTop:u},data:function(){return{isShowBackTop:!1}},methods:{backClick:function(){this.$refs.scroll.scrollTo(0,0)}}}}}]);
//# sourceMappingURL=chunk-4d6c6987.14b15292.js.map