(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-336f51bc"],{"0780":function(t,e,s){},"0bb0":function(t,e,s){},"134f":function(t,e,s){t.exports=s.p+"img/down.8128180f.svg"},"288c":function(t,e,s){},"51c0":function(t,e,s){},"55a0":function(t,e,s){"use strict";s.d(e,"d",(function(){return o})),s.d(e,"a",(function(){return a})),s.d(e,"b",(function(){return n})),s.d(e,"c",(function(){return c}));var i=s("1bab");function o(t,e){return Object(i["a"])({url:"getCollectCid.do",method:"post",data:{gid:t,uid:e}})}function a(t,e,s,o,a,n){return Object(i["a"])({url:"addColect.do",method:"post",data:{uid:t,gid:e,cgtitle:s,cgprice:o,cgimg:a,cgcollect:n}})}function n(t,e,s){return Object(i["a"])({url:"delColect.do",method:"post",data:{cid:t,cgcollect:e,gid:s}})}function c(t){return Object(i["a"])({url:"getAllCollectById.do",method:"post",data:{uid:t}})}},"57d1":function(t,e,s){"use strict";var i=s("0780"),o=s.n(i);o.a},"5cbd":function(t,e,s){"use strict";var i=s("288c"),o=s.n(i);o.a},"5fde":function(t,e,s){"use strict";var i=s("51c0"),o=s.n(i);o.a},6870:function(t,e,s){},"6a93":function(t,e,s){"use strict";s.d(e,"a",(function(){return o}));var i=s("1bab");function o(t){return Object(i["a"])({url:"getDetailById.do",method:"post",data:{gid:t}})}},"6ee2":function(t,e,s){},"719a":function(t,e,s){"use strict";var i=s("6ee2"),o=s.n(i);o.a},a11e:function(t,e,s){t.exports=s.p+"img/back.d5a990cc.svg"},e05b:function(t,e,s){"use strict";s.d(e,"b",(function(){return o})),s.d(e,"a",(function(){return a})),s.d(e,"e",(function(){return n})),s.d(e,"c",(function(){return c})),s.d(e,"d",(function(){return r}));var i=s("1bab");function o(t,e,s,o,a,n,c){return Object(i["a"])({url:"insOrder.do",method:"post",data:{uid:t,gid:e,ogtitle:s,ogimg:o,ogsize:a,ogprice:n,ogcount:c}})}function a(t){return Object(i["a"])({url:"getUserOrders.do",method:"post",data:{uid:t}})}function n(t){return Object(i["a"])({url:"updOrderstatus.do",method:"post",data:{oid:t}})}function c(t,e,s,o){return Object(i["a"])({url:"selByOrders.do",method:"post",data:{uid:t,gid:e,otime:s,ogprice:o}})}function r(t){return Object(i["a"])({url:"selOrdersByOtime.do",method:"post",data:{otime:t}})}},e64c:function(t,e,s){"use strict";var i=s("6870"),o=s.n(i);o.a},e78c:function(t,e,s){"use strict";var i=s("0bb0"),o=s.n(i);o.a},ed06:function(t,e,s){"use strict";s.r(e);var i=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{attrs:{id:"detail"}},[s("detail-nav",{ref:"nav",on:{titleClick:t.titleClick}}),t.isGoodsHave?s("div",[s("scroll",{ref:"scroll",staticClass:"det-con",attrs:{"probe-type":3,"pull-up-load":!0},on:{scroll:t.pScroll,pullingUp:t.loadMore}},[s("detail-swiper",{attrs:{"top-images":t.topImages}}),s("detail-base",{attrs:{goods:t.goodsBase}}),s("detail-kinds",{ref:"kinds",attrs:{"goods-item":t.goodsBase},on:{changessactive:t.changessactive}}),s("div",{ref:"recommend",staticClass:"recommends-goods"},[t._v("推荐商品")]),s("goods-list",{attrs:{goods:t.goodsRecommend.list}})],1),s("back-top",{directives:[{name:"show",rawName:"v-show",value:t.isShowBackTop,expression:"isShowBackTop"}],nativeOn:{click:function(e){return t.backClick(e)}}}),s("detail-bottom",{attrs:{"is-select":t.isSelect,gprice:t.getGprice},on:{addCarts:t.addCarts,selectChange:t.selectChange,insOrder:t.insOrder}})],1):s("div",{staticClass:"delgood"},[t._v("商品已下架")])],1)},o=[],a=s("2909"),n=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("nav-bar",[i("div",{staticClass:"nav-left",attrs:{slot:"left"},on:{click:t.backClick},slot:"left"},[i("img",{attrs:{src:s("a11e"),alt:""}})]),i("div",{staticClass:"nav-titles",attrs:{slot:"center"},slot:"center"},t._l(t.titles,(function(e,s){return i("div",{key:s,staticClass:"item-titles",class:{active:s==t.currentIndex},on:{click:function(e){return t.navItemClick(s)}}},[t._v(" "+t._s(e)+" ")])})),0)])},c=[],r=s("a7ac"),d={name:"DetailNav",components:{NavBar:r["a"]},data:function(){return{titles:["商品","参数","推荐"],currentIndex:0}},methods:{navItemClick:function(t){this.currentIndex=t,this.$emit("titleClick",t)},backClick:function(){this.$router.back()}}},l=d,u=(s("719a"),s("2877")),g=Object(u["a"])(l,n,c,!1,null,"e4dec3ac",null),h=g.exports,f=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("swiper",{staticClass:"dswiper"},t._l(t.topImages,(function(t,e){return s("swiper-item",{key:e},[s("img",{attrs:{src:t.iimagesrc,alt:""}})])})),1)},m=[],p=s("dc2c"),v={name:"DetailSwiper",components:{Swiper:p["a"],SwiperItem:p["b"]},props:{topImages:{type:Array,default:function(){return[]}}}},b=v,C=(s("57d1"),Object(u["a"])(b,f,m,!1,null,"378f6999",null)),S=C.exports,_=function(){var t=this,e=t.$createElement,s=t._self._c||e;return 0!==Object.keys(t.goods).length?s("div",{staticClass:"base-info"},[s("div",{staticClass:"info-title"},[t._v(t._s(t.goods.gtitle))]),s("div",{staticClass:"info-price"},[s("span",{staticClass:"lprice"},[t._v("￥"+t._s(t.goods.gsize6))]),s("span",{staticClass:"prices"},[t._v("~")]),s("span",{staticClass:"tprice"},[t._v("￥"+t._s(t.goods.gsize20))])]),s("div",{staticClass:"info-others"},[s("span",{staticClass:"info-sale"},[t._v("销量 "+t._s(t.goods.gsale))]),s("span",{staticClass:"info-save"},[t._v("收藏 "+t._s(t.goods.gcollect))])])]):t._e()},B=[],k={name:"DetailBase",props:{goods:{type:Object,default:function(){return{}}}}},w=k,I=(s("e78c"),Object(u["a"])(w,_,B,!1,null,"776a00d6",null)),O=I.exports,z=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",{staticClass:"detail-main"},[i("div",{staticClass:"kinds"},[i("div",{staticClass:"dkinds"},[i("div",[t._v("选择")]),i("div",[t._v(t._s(t.currentIndexSize))]),i("div",{staticClass:"down-click",on:{click:t.changeShow}},[i("img",{attrs:{src:s("134f"),alt:""}})])]),i("div",{directives:[{name:"show",rawName:"v-show",value:t.isShowchanges,expression:"isShowchanges"}],staticClass:"ckinds"},[i("div",{staticClass:"ss"},t._l(t.goodsSize,(function(e,s){return i("div",{key:s,staticClass:"sitem"},[i("div",{class:{sactive:t.currentIndex==s},on:{click:function(e){return t.changessactive(s)}}},[t._v(t._s(e))])])})),0)])]),i("table",{staticClass:"info-param"},[i("tr",[i("td",{staticClass:"info-param-key"},[t._v("产地")]),i("td",{staticClass:"param-value"},[t._v(t._s(t.getGplace))])]),i("tr",[i("td",{staticClass:"info-param-key"},[t._v("价格")]),i("td",{staticClass:"param-value"},[t._v(t._s(t.getGprice))])]),i("tr",[i("td",{staticClass:"info-param-key"},[t._v("保质期")]),i("td",{staticClass:"param-value"},[t._v(t._s(t.getGlife))])])])])},$=[],j={name:"DetailKinds",props:{goodsItem:{type:Object,default:function(){return{}}}},data:function(){return{goodsSize:["6寸","8寸","10寸","12寸","14寸","16寸","18寸","20寸"],isShowchanges:!1,currentIndex:0,currentIndexSize:"6寸"}},mounted:function(){},computed:{getGlife:function(){return this.goodsItem.glife},getGprice:function(){return this.goodsItem.gsize6+"-"+this.goodsItem.gsize20+"元"},getGplace:function(){return this.goodsItem.gplace}},methods:{changessactive:function(t){this.currentIndex=t,this.currentIndexSize=this.goodsSize[t],this.$emit("changessactive",this.currentIndexSize)},changeShow:function(){0==this.isShowchanges?this.isShowchanges=!0:this.isShowchanges=!1}}},y=j,x=(s("5fde"),Object(u["a"])(y,z,$,!1,null,"4614bf9b",null)),G=x.exports,U=function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"bottom-bar"},[s("div",{staticClass:"bar-item bar-left"},[t._m(0),s("div",{on:{click:t.selectChange}},[s("i",{staticClass:"icon select",class:{selectaction:t.isSelectZ}}),s("span",{staticClass:"text"},[t._v("收藏")])])]),s("div",{staticClass:"bar-item bar-right"},[s("div",{staticClass:"cart",on:{click:t.addCarts}},[t._v("加入购物车")]),s("div",{staticClass:"buy",on:{click:t.buyCake}},[t._v("￥"+t._s(t.gprice)+" 购买")])])])},D=[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("i",{staticClass:"icon service"}),s("span",{staticClass:"text"},[t._v("客服")])])}],T=(s("a9e3"),{name:"DetailBottom",props:{isSelect:{type:Boolean,default:!1},gprice:{type:Number,dafault:0}},data:function(){return{isSelectZ:this.isSelect}},computed:{getUserInfo:function(){return this.$store.state.userInfo}},watch:{isSelect:function(t){this.isSelectZ=t}},methods:{addCarts:function(){0==this.getUserInfo.uid?this.$toast.show("请先登录"):this.$emit("addCarts",this.getUserInfo.uid)},selectChange:function(){0==this.getUserInfo.uid?this.$toast.show("请先登录"):(this.isSelectZ=!this.isSelectZ,this.$emit("selectChange",this.isSelectZ))},buyCake:function(){0==this.getUserInfo.uid?this.$toast.show("请先登录"):this.$emit("insOrder")}}}),E=T,H=(s("e64c"),Object(u["a"])(E,U,D,!1,null,"1fdccb1a",null)),N=H.exports,Z=s("5d17"),R=s("6d71"),L=s("eecb"),A=(s("90b9"),s("6a93")),J=s("735b"),K=s("55a0"),M=s("e05b"),P={name:"Detail",components:{DetailNav:h,DetailSwiper:S,DetailBase:O,Scroll:Z["a"],DetailKinds:G,GoodsList:R["a"],DetailBottom:N},data:function(){return{gid:null,topImages:[],goodsBase:{},goodsRecommend:{page:0,list:[]},themeTops:[0,400,550],getThemeTopY:null,getSonSize:"6寸",isSelect:!1,saveCid:0,isGoodsHave:!0}},created:function(){var t=this;this.gid=this.$route.params.gid,Object(A["a"])(this.gid).then((function(e){null!=e?(t.topImages=e[1],t.goodsBase=e[0]):t.isGoodsHave=!1})),this.getHomeGoods(this.goodsBase.gkind),0!=this.getUserInfo.uid&&Object(K["d"])(this.gid,this.getUserInfo.uid).then((function(e){0!=e&&(t.saveCid=e,t.isSelect=!0)}))},computed:{getGprice:function(){return"6寸"==this.getSonSize?this.goodsBase.gsize6:"8寸"==this.getSonSize?this.goodsBase.gsize8:"10寸"==this.getSonSize?this.goodsBase.gsize10:"12寸"==this.getSonSize?this.goodsBase.gsize12:"14寸"==this.getSonSize?this.goodsBase.gsize14:"16寸"==this.getSonSize?this.goodsBase.gsize16:"18寸"==this.getSonSize?this.goodsBase.gsize18:"20寸"==this.getSonSize?this.goodsBase.gsize20:void 0},getUserInfo:function(){return this.$store.state.userInfo}},mixins:[L["b"],L["a"]],destroyed:function(){this.$bus.$off("itemImageLoad",this.itemListener)},methods:{getHomeGoods:function(t){var e=this,s=this.goodsRecommend.page+1,i=t+"_"+s;Object(J["a"])(i).then((function(t){var s;(s=e.goodsRecommend.list).push.apply(s,Object(a["a"])(t)),e.goodsRecommend.page+=1,0==t.length||e.$refs.scroll.finishPullUp()}))},loadMore:function(){this.getHomeGoods(this.goodsBase.gkind),this.$refs.scroll.refresh()},titleClick:function(t){this.$refs.scroll.scrollTo(0,-this.themeTops[t],100)},pScroll:function(t){this.isShowBackTop=-t.y>450;var e=-t.y;this.$refs.nav.currentIndex=e>=0&&e<400?0:e>=400&&e<550?1:2},changessactive:function(t){this.getSonSize=t},addCarts:function(t){var e=this,s={};s.gid=this.goodsBase.gid,s.sgtitle=this.goodsBase.gtitle,s.sgimg=this.goodsBase.gimage,s.sgsize=this.getSonSize,s.sgprice=this.getGprice,s.uid=t,this.$store.dispatch("addCarts",s).then((function(t){e.$toast.show(t)}))},selectChange:function(t){var e=this;this.isSelect=t,t?Object(K["a"])(this.getUserInfo.uid,this.goodsBase.gid,this.goodsBase.gtitle,this.goodsBase.gsize6,this.goodsBase.gimage,this.goodsBase.gcollect+1).then((function(t){e.saveCid=t,e.goodsBase.gcollect+=1,e.$toast.show("收藏成功"),e.$bus.$emit("changeCounts",e.goodsBase.gid,e.goodsBase.gcollect,e.goodsBase.gkind)})):Object(K["b"])(this.saveCid,this.goodsBase.gcollect-1,this.goodsBase.gid).then((function(t){e.$toast.show("取消收藏"),e.goodsBase.gcollect-=1,e.$bus.$emit("changeCounts",e.goodsBase.gid,e.goodsBase.gcollect,e.goodsBase.gkind)}))},insOrder:function(){var t=this;Object(M["b"])(this.getUserInfo.uid,this.goodsBase.gid,this.goodsBase.gtitle,this.goodsBase.gimage,this.getSonSize,this.getGprice,1).then((function(e){t.$toast.show(e),t.goodsBase.gsale+=1}))}}},Y=P,q=(s("5cbd"),Object(u["a"])(Y,i,o,!1,null,"107f6665",null));e["default"]=q.exports}}]);
//# sourceMappingURL=chunk-336f51bc.37cdc905.js.map