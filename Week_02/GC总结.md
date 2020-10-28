# 1 串行GC
## 1.1 将堆内存分配512M

```
java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T14:45:35.422-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.422-0800: [DefNew: 139776K->17472K(157248K), 0.0208034 secs] 139776K->47160K(506816K), 0.0208366 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
2020-10-27T14:45:35.459-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.459-0800: [DefNew: 157248K->17471K(157248K), 0.0315721 secs] 186936K->97383K(506816K), 0.0316074 secs] [Times: user=0.02 sys=0.01, real=0.04 secs]
2020-10-27T14:45:35.509-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.509-0800: [DefNew: 157247K->17471K(157248K), 0.0221690 secs] 237159K->139029K(506816K), 0.0222033 secs] [Times: user=0.01 sys=0.01, real=0.03 secs]
2020-10-27T14:45:35.550-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.550-0800: [DefNew: 157247K->17470K(157248K), 0.0212175 secs] 278805K->180881K(506816K), 0.0212495 secs] [Times: user=0.01 sys=0.01, real=0.02 secs]
2020-10-27T14:45:35.589-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.589-0800: [DefNew: 157246K->17471K(157248K), 0.0292041 secs] 320657K->231148K(506816K), 0.0292380 secs] [Times: user=0.02 sys=0.01, real=0.03 secs]
2020-10-27T14:45:35.639-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.639-0800: [DefNew: 157247K->17471K(157248K), 0.0248598 secs] 370924K->278409K(506816K), 0.0248943 secs] [Times: user=0.02 sys=0.01, real=0.03 secs]
2020-10-27T14:45:35.681-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.681-0800: [DefNew: 157232K->17472K(157248K), 0.0227529 secs] 418171K->320183K(506816K), 0.0227848 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
2020-10-27T14:45:35.723-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.723-0800: [DefNew: 157248K->157248K(157248K), 0.0000146 secs]2020-10-27T14:45:35.723-0800: [Tenured: 302711K->265886K(349568K), 0.0389997 secs] 459959K->265886K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0390517 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T14:45:35.780-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.780-0800: [DefNew: 139371K->17471K(157248K), 0.0074570 secs] 405258K->309358K(506816K), 0.0074959 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T14:45:35.806-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.806-0800: [DefNew: 157247K->17471K(157248K), 0.0215164 secs] 449134K->350728K(506816K), 0.0215711 secs] [Times: user=0.02 sys=0.01, real=0.02 secs]
2020-10-27T14:45:35.846-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.846-0800: [DefNew: 157247K->157247K(157248K), 0.0000547 secs]2020-10-27T14:45:35.846-0800: [Tenured: 333256K->296434K(349568K), 0.0431528 secs] 490504K->296434K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0432505 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T14:45:35.910-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.910-0800: [DefNew: 139648K->17469K(157248K), 0.0066357 secs] 436082K->338251K(506816K), 0.0066843 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T14:45:35.935-0800: [GC (Allocation Failure) 2020-10-27T14:45:35.935-0800: [DefNew: 157245K->157245K(157248K), 0.0000164 secs]2020-10-27T14:45:35.935-0800: [Tenured: 320782K->322793K(349568K), 0.0447004 secs] 478027K->322793K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0447632 secs] [Times: user=0.04 sys=0.00, real=0.05 secs]
2020-10-27T14:45:36.005-0800: [GC (Allocation Failure) 2020-10-27T14:45:36.005-0800: [DefNew: 139776K->139776K(157248K), 0.0000167 secs]2020-10-27T14:45:36.005-0800: [Tenured: 322793K->316825K(349568K), 0.0494161 secs] 462569K->316825K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0494819 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-10-27T14:45:36.075-0800: [GC (Allocation Failure) 2020-10-27T14:45:36.075-0800: [DefNew: 139776K->139776K(157248K), 0.0000186 secs]2020-10-27T14:45:36.075-0800: [Tenured: 316825K->337003K(349568K), 0.0397861 secs] 456601K->337003K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0398546 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T14:45:36.137-0800: [GC (Allocation Failure) 2020-10-27T14:45:36.137-0800: [DefNew: 139776K->139776K(157248K), 0.0000167 secs]2020-10-27T14:45:36.137-0800: [Tenured: 337003K->342432K(349568K), 0.0454028 secs] 476779K->342432K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0454635 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-10-27T14:45:36.206-0800: [GC (Allocation Failure) 2020-10-27T14:45:36.206-0800: [DefNew: 139776K->139776K(157248K), 0.0000188 secs]2020-10-27T14:45:36.206-0800: [Tenured: 342432K->346371K(349568K), 0.0575960 secs] 482208K->346371K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0576771 secs] [Times: user=0.06 sys=0.01, real=0.06 secs]
2020-10-27T14:45:36.281-0800: [GC (Allocation Failure) 2020-10-27T14:45:36.281-0800: [DefNew: 139776K->139776K(157248K), 0.0000126 secs]2020-10-27T14:45:36.282-0800: [Tenured: 346371K->339814K(349568K), 0.0565477 secs] 486147K->339814K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0566007 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
执行结束!共生成对象次数:9939
Heap
 def new generation   total 157248K, used 118281K [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,  84% used [0x00000007a0000000, 0x00000007a73825f0, 0x00000007a8880000)
  from space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
  to   space 17472K,   0% used [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
 tenured generation   total 349568K, used 339814K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 349568K,  97% used [0x00000007aaaa0000, 0x00000007bf679910, 0x00000007bf679a00, 0x00000007c0000000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
```
## 1.2 将堆内存分配2048M

```
java -XX:+UseSerialGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T14:54:05.762-0800: [GC (Allocation Failure) 2020-10-27T14:54:05.762-0800: [DefNew: 559232K->69888K(629120K), 0.0626978 secs] 559232K->145948K(2027264K), 0.0627298 secs] [Times: user=0.04 sys=0.02, real=0.06 secs]
2020-10-27T14:54:05.894-0800: [GC (Allocation Failure) 2020-10-27T14:54:05.894-0800: [DefNew: 629120K->69887K(629120K), 0.0858719 secs] 705180K->271505K(2027264K), 0.0859022 secs] [Times: user=0.05 sys=0.03, real=0.09 secs]
2020-10-27T14:54:06.042-0800: [GC (Allocation Failure) 2020-10-27T14:54:06.042-0800: [DefNew: 629119K->69887K(629120K), 0.0750115 secs] 830737K->420581K(2027264K), 0.0750458 secs] [Times: user=0.05 sys=0.03, real=0.07 secs]
2020-10-27T14:54:06.179-0800: [GC (Allocation Failure) 2020-10-27T14:54:06.179-0800: [DefNew: 629119K->69887K(629120K), 0.0700431 secs] 979813K->548048K(2027264K), 0.0700820 secs] [Times: user=0.04 sys=0.02, real=0.07 secs]
2020-10-27T14:54:06.310-0800: [GC (Allocation Failure) 2020-10-27T14:54:06.310-0800: [DefNew: 629119K->69887K(629120K), 0.0643461 secs] 1107280K->671878K(2027264K), 0.0643810 secs] [Times: user=0.05 sys=0.02, real=0.06 secs]
2020-10-27T14:54:06.433-0800: [GC (Allocation Failure) 2020-10-27T14:54:06.433-0800: [DefNew: 629119K->69888K(629120K), 0.0617281 secs] 1231110K->790931K(2027264K), 0.0617622 secs] [Times: user=0.05 sys=0.02, real=0.06 secs]
执行结束!共生成对象次数:14193
Heap
 def new generation   total 629120K, used 484507K [0x0000000740000000, 0x000000076aaa0000, 0x000000076aaa0000)
  eden space 559232K,  74% used [0x0000000740000000, 0x00000007594e6e38, 0x0000000762220000)
  from space 69888K, 100% used [0x0000000762220000, 0x0000000766660000, 0x0000000766660000)
  to   space 69888K,   0% used [0x0000000766660000, 0x0000000766660000, 0x000000076aaa0000)
 tenured generation   total 1398144K, used 721043K [0x000000076aaa0000, 0x00000007c0000000, 0x00000007c0000000)
   the space 1398144K,  51% used [0x000000076aaa0000, 0x0000000796ac4c60, 0x0000000796ac4e00, 0x00000007c0000000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
```
## 1.3 串行GC总结
1. 使用单线程做GC，GC效率低，会出发STW，暂停时间较长。
2. 提高堆内存大小，GC次数减小，但单次暂停时间变长。
3. 串行 GC 对年轻代使用 mark-copy（标记-复制） 算法，对老年代使用 mark-sweep-compact（标记-清除-整理）算法。
4. 尽量不要使用。

# 2 并行GC
## 2.1 将堆内存分配512M

```
java -XX:+UseParallelGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T15:13:17.686-0800: [GC (Allocation Failure) [PSYoungGen: 131584K->21501K(153088K)] 131584K->42319K(502784K), 0.0132098 secs] [Times: user=0.02 sys=0.11, real=0.02 secs]
2020-10-27T15:13:17.717-0800: [GC (Allocation Failure) [PSYoungGen: 153085K->21503K(153088K)] 173903K->84637K(502784K), 0.0204821 secs] [Times: user=0.04 sys=0.17, real=0.02 secs]
2020-10-27T15:13:17.757-0800: [GC (Allocation Failure) [PSYoungGen: 153087K->21503K(153088K)] 216221K->121677K(502784K), 0.0142203 secs] [Times: user=0.04 sys=0.10, real=0.02 secs]
2020-10-27T15:13:17.789-0800: [GC (Allocation Failure) [PSYoungGen: 153087K->21499K(153088K)] 253261K->169008K(502784K), 0.0176532 secs] [Times: user=0.05 sys=0.13, real=0.02 secs]
2020-10-27T15:13:17.828-0800: [GC (Allocation Failure) [PSYoungGen: 152702K->21490K(153088K)] 300211K->206414K(502784K), 0.0153807 secs] [Times: user=0.06 sys=0.10, real=0.02 secs]
2020-10-27T15:13:17.859-0800: [GC (Allocation Failure) [PSYoungGen: 153074K->21501K(80384K)] 337998K->253511K(430080K), 0.0184623 secs] [Times: user=0.07 sys=0.14, real=0.02 secs]
2020-10-27T15:13:17.885-0800: [GC (Allocation Failure) [PSYoungGen: 80381K->37066K(116736K)] 312391K->274395K(466432K), 0.0043732 secs] [Times: user=0.04 sys=0.01, real=0.01 secs]
2020-10-27T15:13:17.897-0800: [GC (Allocation Failure) [PSYoungGen: 95946K->53105K(116736K)] 333275K->294392K(466432K), 0.0057829 secs] [Times: user=0.06 sys=0.01, real=0.01 secs]
2020-10-27T15:13:17.913-0800: [GC (Allocation Failure) [PSYoungGen: 111985K->57851K(116736K)] 353272K->311455K(466432K), 0.0134076 secs] [Times: user=0.11 sys=0.04, real=0.01 secs]
2020-10-27T15:13:17.933-0800: [GC (Allocation Failure) [PSYoungGen: 116633K->39052K(116736K)] 370237K->328573K(466432K), 0.0166875 secs] [Times: user=0.05 sys=0.11, real=0.02 secs]
2020-10-27T15:13:17.950-0800: [Full GC (Ergonomics) [PSYoungGen: 39052K->0K(116736K)] [ParOldGen: 289520K->233493K(349696K)] 328573K->233493K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0296595 secs] [Times: user=0.32 sys=0.01, real=0.03 secs]
2020-10-27T15:13:17.992-0800: [GC (Allocation Failure) [PSYoungGen: 58795K->16515K(116736K)] 292289K->250009K(466432K), 0.0025977 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.004-0800: [GC (Allocation Failure) [PSYoungGen: 75395K->16477K(116736K)] 308889K->265857K(466432K), 0.0060440 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.018-0800: [GC (Allocation Failure) [PSYoungGen: 75357K->21943K(116736K)] 324737K->286900K(466432K), 0.0071825 secs] [Times: user=0.08 sys=0.01, real=0.01 secs]
2020-10-27T15:13:18.034-0800: [GC (Allocation Failure) [PSYoungGen: 80823K->19276K(116736K)] 345780K->305165K(466432K), 0.0043362 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.046-0800: [GC (Allocation Failure) [PSYoungGen: 78156K->21584K(116736K)] 364045K->325609K(466432K), 0.0075961 secs] [Times: user=0.03 sys=0.05, real=0.01 secs]
2020-10-27T15:13:18.054-0800: [Full GC (Ergonomics) [PSYoungGen: 21584K->0K(116736K)] [ParOldGen: 304025K->267407K(349696K)] 325609K->267407K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0371175 secs] [Times: user=0.42 sys=0.00, real=0.04 secs]
2020-10-27T15:13:18.102-0800: [GC (Allocation Failure) [PSYoungGen: 58295K->18146K(116736K)] 325703K->285554K(466432K), 0.0027108 secs] [Times: user=0.02 sys=0.01, real=0.00 secs]
2020-10-27T15:13:18.113-0800: [GC (Allocation Failure) [PSYoungGen: 77004K->20798K(116736K)] 344411K->305230K(466432K), 0.0068854 secs] [Times: user=0.08 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.129-0800: [GC (Allocation Failure) [PSYoungGen: 79397K->17975K(116736K)] 363829K->321951K(466432K), 0.0045222 secs] [Times: user=0.04 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.143-0800: [GC (Allocation Failure) [PSYoungGen: 76556K->20314K(116736K)] 380533K->339632K(466432K), 0.0074541 secs] [Times: user=0.03 sys=0.05, real=0.01 secs]
2020-10-27T15:13:18.150-0800: [Full GC (Ergonomics) [PSYoungGen: 20314K->0K(116736K)] [ParOldGen: 319318K->283332K(349696K)] 339632K->283332K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0306301 secs] [Times: user=0.35 sys=0.00, real=0.03 secs]
2020-10-27T15:13:18.192-0800: [GC (Allocation Failure) [PSYoungGen: 58692K->18099K(116736K)] 342025K->301432K(466432K), 0.0050672 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.207-0800: [GC (Allocation Failure) [PSYoungGen: 76878K->22878K(116736K)] 360211K->323237K(466432K), 0.0048630 secs] [Times: user=0.05 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.221-0800: [GC (Allocation Failure) [PSYoungGen: 81758K->21151K(116736K)] 382117K->341761K(466432K), 0.0075568 secs] [Times: user=0.09 sys=0.01, real=0.00 secs]
2020-10-27T15:13:18.229-0800: [Full GC (Ergonomics) [PSYoungGen: 21151K->0K(116736K)] [ParOldGen: 320610K->297436K(349696K)] 341761K->297436K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0348521 secs] [Times: user=0.39 sys=0.00, real=0.04 secs]
2020-10-27T15:13:18.273-0800: [GC (Allocation Failure) [PSYoungGen: 58701K->15636K(116736K)] 356138K->313072K(466432K), 0.0022709 secs] [Times: user=0.02 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.285-0800: [GC (Allocation Failure) [PSYoungGen: 74516K->15647K(116736K)] 371952K->327690K(466432K), 0.0033667 secs] [Times: user=0.04 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.299-0800: [GC (Allocation Failure) [PSYoungGen: 74527K->20103K(116736K)] 386570K->347422K(466432K), 0.0077288 secs] [Times: user=0.06 sys=0.03, real=0.01 secs]
2020-10-27T15:13:18.307-0800: [Full GC (Ergonomics) [PSYoungGen: 20103K->0K(116736K)] [ParOldGen: 327319K->305657K(349696K)] 347422K->305657K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0390697 secs] [Times: user=0.44 sys=0.00, real=0.04 secs]
2020-10-27T15:13:18.357-0800: [GC (Allocation Failure) [PSYoungGen: 58880K->17651K(116736K)] 364537K->323308K(466432K), 0.0024378 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.368-0800: [GC (Allocation Failure) [PSYoungGen: 75982K->23102K(116736K)] 381639K->345261K(466432K), 0.0046504 secs] [Times: user=0.05 sys=0.01, real=0.01 secs]
2020-10-27T15:13:18.372-0800: [Full GC (Ergonomics) [PSYoungGen: 23102K->0K(116736K)] [ParOldGen: 322158K->312067K(349696K)] 345261K->312067K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0384473 secs] [Times: user=0.43 sys=0.00, real=0.04 secs]
2020-10-27T15:13:18.420-0800: [GC (Allocation Failure) [PSYoungGen: 58624K->21202K(118272K)] 370691K->333270K(467968K), 0.0025550 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.432-0800: [GC (Allocation Failure) [PSYoungGen: 81618K->42271K(116736K)] 393686K->354339K(466432K), 0.0043774 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.446-0800: [GC (Allocation Failure) --[PSYoungGen: 102687K->102687K(116736K)] 414755K->452061K(466432K), 0.0171848 secs] [Times: user=0.09 sys=0.09, real=0.02 secs]
2020-10-27T15:13:18.463-0800: [Full GC (Ergonomics) [PSYoungGen: 102687K->0K(116736K)] [ParOldGen: 349373K->321808K(349696K)] 452061K->321808K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0475523 secs] [Times: user=0.53 sys=0.01, real=0.05 secs]
2020-10-27T15:13:18.522-0800: [GC (Allocation Failure) [PSYoungGen: 60081K->19684K(116736K)] 381890K->341493K(466432K), 0.0026652 secs] [Times: user=0.03 sys=0.00, real=0.00 secs]
2020-10-27T15:13:18.531-0800: [GC (Allocation Failure) [PSYoungGen: 77890K->39709K(116736K)] 399699K->361518K(466432K), 0.0071593 secs] [Times: user=0.08 sys=0.01, real=0.00 secs]
2020-10-27T15:13:18.548-0800: [GC (Allocation Failure) --[PSYoungGen: 98589K->98589K(116736K)] 420398K->448253K(466432K), 0.0063588 secs] [Times: user=0.07 sys=0.00, real=0.01 secs]
2020-10-27T15:13:18.554-0800: [Full GC (Ergonomics) [PSYoungGen: 98589K->0K(116736K)] [ParOldGen: 349663K->334086K(349696K)] 448253K->334086K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0388728 secs] [Times: user=0.45 sys=0.00, real=0.04 secs]
2020-10-27T15:13:18.604-0800: [Full GC (Ergonomics) [PSYoungGen: 58880K->0K(116736K)] [ParOldGen: 334086K->337262K(349696K)] 392966K->337262K(466432K), [Metaspace: 2732K->2732K(1056768K)], 0.0336827 secs] [Times: user=0.38 sys=0.01, real=0.03 secs]
执行结束!共生成对象次数:9225
Heap
 PSYoungGen      total 116736K, used 2407K [0x00000007b5580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 58880K, 4% used [0x00000007b5580000,0x00000007b57d9fe0,0x00000007b8f00000)
  from space 57856K, 0% used [0x00000007b8f00000,0x00000007b8f00000,0x00000007bc780000)
  to   space 57856K, 0% used [0x00000007bc780000,0x00000007bc780000,0x00000007c0000000)
 ParOldGen       total 349696K, used 337262K [0x00000007a0000000, 0x00000007b5580000, 0x00000007b5580000)
  object space 349696K, 96% used [0x00000007a0000000,0x00000007b495bb80,0x00000007b5580000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
```

2.2 将堆内存分配2048M

```
java -XX:+UseParallelGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T15:17:08.540-0800: [GC (Allocation Failure) [PSYoungGen: 524800K->87039K(611840K)] 524800K->141143K(2010112K), 0.0433134 secs] [Times: user=0.07 sys=0.39, real=0.04 secs]
2020-10-27T15:17:08.653-0800: [GC (Allocation Failure) [PSYoungGen: 611839K->87025K(611840K)] 665943K->248472K(2010112K), 0.0608153 secs] [Times: user=0.09 sys=0.55, real=0.06 secs]
2020-10-27T15:17:08.768-0800: [GC (Allocation Failure) [PSYoungGen: 611825K->87037K(611840K)] 773272K->360497K(2010112K), 0.0476646 secs] [Times: user=0.15 sys=0.36, real=0.05 secs]
2020-10-27T15:17:08.876-0800: [GC (Allocation Failure) [PSYoungGen: 611837K->87039K(611840K)] 885297K->473785K(2010112K), 0.0487065 secs] [Times: user=0.15 sys=0.37, real=0.05 secs]
2020-10-27T15:17:08.982-0800: [GC (Allocation Failure) [PSYoungGen: 611839K->87038K(611840K)] 998585K->588220K(2010112K), 0.0505974 secs] [Times: user=0.16 sys=0.37, real=0.05 secs]
2020-10-27T15:17:09.094-0800: [GC (Allocation Failure) [PSYoungGen: 611838K->87039K(320000K)] 1113020K->708197K(1718272K), 0.0497421 secs] [Times: user=0.15 sys=0.39, real=0.05 secs]
2020-10-27T15:17:09.171-0800: [GC (Allocation Failure) [PSYoungGen: 319999K->139287K(465920K)] 941157K->765097K(1864192K), 0.0129853 secs] [Times: user=0.15 sys=0.00, real=0.01 secs]
2020-10-27T15:17:09.220-0800: [GC (Allocation Failure) [PSYoungGen: 372247K->168910K(465920K)] 998057K->809218K(1864192K), 0.0265676 secs] [Times: user=0.27 sys=0.05, real=0.02 secs]
2020-10-27T15:17:09.277-0800: [GC (Allocation Failure) [PSYoungGen: 401870K->169916K(465920K)] 1042178K->845340K(1864192K), 0.0290873 secs] [Times: user=0.19 sys=0.12, real=0.03 secs]
执行结束!共生成对象次数:14972
Heap
 PSYoungGen      total 465920K, used 317027K [0x0000000795580000, 0x00000007c0000000, 0x00000007c0000000)
  eden space 232960K, 63% used [0x0000000795580000,0x000000079e529c38,0x00000007a3900000)
  from space 232960K, 72% used [0x00000007a3900000,0x00000007adeef108,0x00000007b1c80000)
  to   space 232960K, 0% used [0x00000007b1c80000,0x00000007b1c80000,0x00000007c0000000)
 ParOldGen       total 1398272K, used 675424K [0x0000000740000000, 0x0000000795580000, 0x0000000795580000)
  object space 1398272K, 48% used [0x0000000740000000,0x00000007693980b0,0x0000000795580000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
```

2.3 并行GC特点
1. 年轻代和老年代的垃圾回收都会触发STW事件。
2. 在年轻代使用标记-复制（mark-copy）算法，在老年代使用标记-清除-整理（mark-sweep-compact）算法。
3. Young区数据在GC过程中基本全部被清理。
4. 并行垃圾收集器适用于多核服务器，主要目标是增加吞吐量。
    1. 在 GC 期间，所有 CPU内核都在并行清理垃圾，所以总暂停时间更短。
    2. 在两次 GC 周期的间隔期，没有 GC线程在运行，不会消耗任何系统资源。
5. 系统考虑吞吐优先，CPU资源都用来最大程度处理业务，用并行GC。

# 3 CMS GC
## 3.1 将堆内存分配512M

```
java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T15:33:36.022-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.022-0800: [ParNew: 139680K->17470K(157248K), 0.0157865 secs] 139680K->49289K(506816K), 0.0158613 secs] [Times: user=0.04 sys=0.12, real=0.01 secs]
2020-10-27T15:33:36.054-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.054-0800: [ParNew: 157080K->17472K(157248K), 0.0175824 secs] 188899K->94663K(506816K), 0.0176180 secs] [Times: user=0.04 sys=0.13, real=0.02 secs]
2020-10-27T15:33:36.091-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.091-0800: [ParNew: 157248K->17468K(157248K), 0.0230158 secs] 234439K->137452K(506816K), 0.0230916 secs] [Times: user=0.28 sys=0.02, real=0.02 secs]
2020-10-27T15:33:36.131-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.131-0800: [ParNew: 156741K->17471K(157248K), 0.0216328 secs] 276724K->181681K(506816K), 0.0217002 secs] [Times: user=0.26 sys=0.01, real=0.02 secs]
2020-10-27T15:33:36.173-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.173-0800: [ParNew: 157247K->17470K(157248K), 0.0254739 secs] 321457K->227195K(506816K), 0.0255098 secs] [Times: user=0.31 sys=0.01, real=0.02 secs]
2020-10-27T15:33:36.198-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 209724K(349568K)] 230698K(506816K), 0.0004156 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.199-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.200-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-10-27T15:33:36.200-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.201-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.201-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.217-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.217-0800: [ParNew: 157191K->17470K(157248K), 0.0208786 secs] 366916K->266246K(506816K), 0.0209145 secs] [Times: user=0.26 sys=0.01, real=0.02 secs]
2020-10-27T15:33:36.253-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.253-0800: [ParNew: 156855K->17471K(157248K), 0.0202997 secs] 405631K->307910K(506816K), 0.0203349 secs] [Times: user=0.24 sys=0.01, real=0.02 secs]
2020-10-27T15:33:36.290-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.290-0800: [ParNew: 157247K->17471K(157248K), 0.0241310 secs] 447686K->348789K(506816K), 0.0241640 secs] [Times: user=0.29 sys=0.01, real=0.02 secs]
2020-10-27T15:33:36.315-0800: [CMS-concurrent-abortable-preclean: 0.003/0.114 secs] [Times: user=0.83 sys=0.04, real=0.11 secs]
2020-10-27T15:33:36.315-0800: [GC (CMS Final Remark) [YG occupancy: 29135 K (157248 K)]2020-10-27T15:33:36.315-0800: [Rescan (parallel) , 0.0004469 secs]2020-10-27T15:33:36.316-0800: [weak refs processing, 0.0000312 secs]2020-10-27T15:33:36.316-0800: [class unloading, 0.0002327 secs]2020-10-27T15:33:36.316-0800: [scrub symbol table, 0.0002317 secs]2020-10-27T15:33:36.316-0800: [scrub string table, 0.0000939 secs][1 CMS-remark: 331318K(349568K)] 360454K(506816K), 0.0011090 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.316-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.317-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.317-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.317-0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.333-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.333-0800: [ParNew: 157247K->17471K(157248K), 0.0110342 secs] 441331K->348103K(506816K), 0.0110791 secs] [Times: user=0.14 sys=0.00, real=0.01 secs]
2020-10-27T15:33:36.344-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 330632K(349568K)] 348881K(506816K), 0.0002142 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.344-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.345-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.345-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.345-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.345-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.345-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.345-0800: [GC (CMS Final Remark) [YG occupancy: 30636 K (157248 K)]2020-10-27T15:33:36.345-0800: [Rescan (parallel) , 0.0002496 secs]2020-10-27T15:33:36.346-0800: [weak refs processing, 0.0000124 secs]2020-10-27T15:33:36.346-0800: [class unloading, 0.0001613 secs]2020-10-27T15:33:36.346-0800: [scrub symbol table, 0.0002606 secs]2020-10-27T15:33:36.346-0800: [scrub string table, 0.0001120 secs][1 CMS-remark: 330632K(349568K)] 361268K(506816K), 0.0008787 secs] [Times: user=0.01 sys=0.01, real=0.00 secs]
2020-10-27T15:33:36.346-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.347-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.347-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.347-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.365-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.365-0800: [ParNew: 157247K->17471K(157248K), 0.0083558 secs] 398666K->298255K(506816K), 0.0084048 secs] [Times: user=0.10 sys=0.00, real=0.01 secs]
2020-10-27T15:33:36.374-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 280784K(349568K)] 298399K(506816K), 0.0002174 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.374-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.374-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.375-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.375-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.375-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.390-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.390-0800: [ParNew: 157247K->17470K(157248K), 0.0094628 secs] 438031K->342133K(506816K), 0.0095008 secs] [Times: user=0.11 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.416-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.416-0800: [ParNew: 156737K->156737K(157248K), 0.0000445 secs]2020-10-27T15:33:36.416-0800: [CMS2020-10-27T15:33:36.416-0800: [CMS-concurrent-abortable-preclean: 0.002/0.041 secs] [Times: user=0.15 sys=0.00, real=0.04 secs]
 (concurrent mode failure): 324662K->294898K(349568K), 0.0427517 secs] 481399K->294898K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0429343 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T15:33:36.476-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.476-0800: [ParNew: 139776K->17471K(157248K), 0.0074140 secs] 434674K->340302K(506816K), 0.0074600 secs] [Times: user=0.09 sys=0.00, real=0.01 secs]
2020-10-27T15:33:36.484-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 322831K(349568K)] 343518K(506816K), 0.0002377 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.484-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.485-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.485-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.485-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.485-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.485-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.486-0800: [GC (CMS Final Remark) [YG occupancy: 30872 K (157248 K)]2020-10-27T15:33:36.486-0800: [Rescan (parallel) , 0.0004038 secs]2020-10-27T15:33:36.486-0800: [weak refs processing, 0.0000135 secs]2020-10-27T15:33:36.486-0800: [class unloading, 0.0001808 secs]2020-10-27T15:33:36.486-0800: [scrub symbol table, 0.0003099 secs]2020-10-27T15:33:36.486-0800: [scrub string table, 0.0001327 secs][1 CMS-remark: 322831K(349568K)] 353703K(506816K), 0.0010806 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.488-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.489-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.489-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.489-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.503-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.503-0800: [ParNew: 157219K->17470K(157248K), 0.0094121 secs] 443258K->345478K(506816K), 0.0094503 secs] [Times: user=0.12 sys=0.00, real=0.01 secs]
2020-10-27T15:33:36.512-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 328007K(349568K)] 345591K(506816K), 0.0002251 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.513-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.514-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.514-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.515-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.515-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.515-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.515-0800: [GC (CMS Final Remark) [YG occupancy: 30741 K (157248 K)]2020-10-27T15:33:36.515-0800: [Rescan (parallel) , 0.0003809 secs]2020-10-27T15:33:36.515-0800: [weak refs processing, 0.0000131 secs]2020-10-27T15:33:36.515-0800: [class unloading, 0.0003251 secs]2020-10-27T15:33:36.516-0800: [scrub symbol table, 0.0004084 secs]2020-10-27T15:33:36.516-0800: [scrub string table, 0.0001821 secs][1 CMS-remark: 328007K(349568K)] 358749K(506816K), 0.0013604 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.516-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.518-0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.524-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.524-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.533-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.533-0800: [ParNew: 157246K->17471K(157248K), 0.0107576 secs] 455652K->355380K(506816K), 0.0107985 secs] [Times: user=0.13 sys=0.01, real=0.01 secs]
2020-10-27T15:33:36.544-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 337908K(349568K)] 356021K(506816K), 0.0002109 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.544-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.545-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.545-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.546-0800: [CMS-concurrent-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.546-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.546-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.546-0800: [GC (CMS Final Remark) [YG occupancy: 30288 K (157248 K)]2020-10-27T15:33:36.546-0800: [Rescan (parallel) , 0.0002477 secs]2020-10-27T15:33:36.546-0800: [weak refs processing, 0.0000111 secs]2020-10-27T15:33:36.546-0800: [class unloading, 0.0001831 secs]2020-10-27T15:33:36.546-0800: [scrub symbol table, 0.0002680 secs]2020-10-27T15:33:36.546-0800: [scrub string table, 0.0001144 secs][1 CMS-remark: 337908K(349568K)] 368197K(506816K), 0.0008681 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.547-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.547-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.547-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.547-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.562-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.562-0800: [ParNew: 157247K->157247K(157248K), 0.0000173 secs]2020-10-27T15:33:36.562-0800: [CMS: 302494K->328109K(349568K), 0.0424158 secs] 459741K->328109K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0424816 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T15:33:36.604-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 328109K(349568K)] 328257K(506816K), 0.0003563 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.605-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.606-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.606-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.606-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.606-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.624-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.624-0800: [ParNew: 139776K->139776K(157248K), 0.0000197 secs]2020-10-27T15:33:36.624-0800: [CMS2020-10-27T15:33:36.624-0800: [CMS-concurrent-abortable-preclean: 0.001/0.018 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
 (concurrent mode failure): 328109K->337172K(349568K), 0.0444829 secs] 467885K->337172K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0445575 secs] [Times: user=0.04 sys=0.00, real=0.04 secs]
2020-10-27T15:33:36.687-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.687-0800: [ParNew: 139776K->139776K(157248K), 0.0000204 secs]2020-10-27T15:33:36.687-0800: [CMS: 337172K->348127K(349568K), 0.0494348 secs] 476948K->348127K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0495054 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-10-27T15:33:36.737-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 348127K(349568K)] 351183K(506816K), 0.0003167 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.737-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.738-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.738-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.738-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.738-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.738-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.738-0800: [GC (CMS Final Remark) [YG occupancy: 12519 K (157248 K)]2020-10-27T15:33:36.738-0800: [Rescan (parallel) , 0.0003527 secs]2020-10-27T15:33:36.739-0800: [weak refs processing, 0.0000154 secs]2020-10-27T15:33:36.739-0800: [class unloading, 0.0001983 secs]2020-10-27T15:33:36.739-0800: [scrub symbol table, 0.0003152 secs]2020-10-27T15:33:36.739-0800: [scrub string table, 0.0001419 secs][1 CMS-remark: 348127K(349568K)] 360646K(506816K), 0.0010754 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.740-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.740-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.740-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.740-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.761-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.761-0800: [ParNew: 139776K->139776K(157248K), 0.0000198 secs]2020-10-27T15:33:36.761-0800: [CMS: 347735K->349533K(349568K), 0.0484610 secs] 487511K->349790K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0485346 secs] [Times: user=0.04 sys=0.00, real=0.05 secs]
2020-10-27T15:33:36.810-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349533K(349568K)] 350078K(506816K), 0.0004358 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.811-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.811-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.811-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.813-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.813-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.813-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.813-0800: [GC (CMS Final Remark) [YG occupancy: 16465 K (157248 K)]2020-10-27T15:33:36.813-0800: [Rescan (parallel) , 0.0004110 secs]2020-10-27T15:33:36.813-0800: [weak refs processing, 0.0000173 secs]2020-10-27T15:33:36.813-0800: [class unloading, 0.0002167 secs]2020-10-27T15:33:36.814-0800: [scrub symbol table, 0.0003512 secs]2020-10-27T15:33:36.814-0800: [scrub string table, 0.0001643 secs][1 CMS-remark: 349533K(349568K)] 365998K(506816K), 0.0012131 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.814-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.814-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.827-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.827-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.833-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.834-0800: [ParNew: 156864K->156864K(157248K), 0.0000209 secs]2020-10-27T15:33:36.834-0800: [CMS: 349244K->349464K(349568K), 0.0581950 secs] 506109K->354861K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0582629 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
2020-10-27T15:33:36.892-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349464K(349568K)] 355334K(506816K), 0.0003933 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.892-0800: [CMS-concurrent-mark-start]
2020-10-27T15:33:36.893-0800: [CMS-concurrent-mark: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.893-0800: [CMS-concurrent-preclean-start]
2020-10-27T15:33:36.894-0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.894-0800: [CMS-concurrent-abortable-preclean-start]
2020-10-27T15:33:36.894-0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.895-0800: [GC (CMS Final Remark) [YG occupancy: 19073 K (157248 K)]2020-10-27T15:33:36.895-0800: [Rescan (parallel) , 0.0005005 secs]2020-10-27T15:33:36.895-0800: [weak refs processing, 0.0000244 secs]2020-10-27T15:33:36.895-0800: [class unloading, 0.0002081 secs]2020-10-27T15:33:36.895-0800: [scrub symbol table, 0.0003543 secs]2020-10-27T15:33:36.896-0800: [scrub string table, 0.0002064 secs][1 CMS-remark: 349464K(349568K)] 368538K(506816K), 0.0013561 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.896-0800: [CMS-concurrent-sweep-start]
2020-10-27T15:33:36.896-0800: [CMS-concurrent-sweep: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.896-0800: [CMS-concurrent-reset-start]
2020-10-27T15:33:36.897-0800: [CMS-concurrent-reset: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.915-0800: [GC (Allocation Failure) 2020-10-27T15:33:36.915-0800: [ParNew: 157236K->157236K(157248K), 0.0000207 secs]2020-10-27T15:33:36.915-0800: [CMS: 348590K->349503K(349568K), 0.0511968 secs] 505827K->358841K(506816K), [Metaspace: 2732K->2732K(1056768K)], 0.0512707 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-10-27T15:33:36.967-0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 349503K(349568K)] 358985K(506816K), 0.0004303 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-10-27T15:33:36.967-0800: [CMS-concurrent-mark-start]
执行结束!共生成对象次数:11082
Heap
 par new generation   total 157248K, used 15353K2020-10-27T15:33:36.968-0800 [0x00000007a0000000, 0x00000007aaaa0000, 0x00000007aaaa0000)
  eden space 139776K,  10% used [0x00000007a0000000, 0x00000007a0efe678, 0x00000007a8880000)
:   from[CMS-concurrent-mark: 0.001/0.001 secs] space 17472K,   0% used [0x00000007a8880000, 0x00000007a8880000, 0x00000007a9990000)
  to   space 17472K,   0% used [Times: user=0.00 sys=0.00, real=0.00 secs]  [0x00000007a9990000, 0x00000007a9990000, 0x00000007aaaa0000)
 concurrent mark-sweep generation total 349568K, used 349503K [0x00000007aaaa0000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K

  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
2020-10-27T15:33:36.968-0800: [CMS-concurrent-preclean-start]
```

## 3.2 将堆内存分配4096M

```
java -XX:+UseConcMarkSweepGC -Xms4096m -Xmx4096m -XX:+PrintGCDetails -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T15:48:06.500-0800: [GC (Allocation Failure) 2020-10-27T15:48:06.500-0800: [ParNew: 886080K->110719K(996800K), 0.0671741 secs] 886080K->215682K(4083584K), 0.0672164 secs] [Times: user=0.19 sys=0.54, real=0.06 secs]
2020-10-27T15:48:06.671-0800: [GC (Allocation Failure) 2020-10-27T15:48:06.671-0800: [ParNew: 996686K->110720K(996800K), 0.0632550 secs] 1101649K->357026K(4083584K), 0.0632892 secs] [Times: user=0.16 sys=0.54, real=0.06 secs]
2020-10-27T15:48:06.827-0800: [GC (Allocation Failure) 2020-10-27T15:48:06.827-0800: [ParNew: 996800K->110720K(996800K), 0.0815442 secs] 1243106K->511160K(4083584K), 0.0815779 secs] [Times: user=1.01 sys=0.04, real=0.08 secs]
2020-10-27T15:48:06.993-0800: [GC (Allocation Failure) 2020-10-27T15:48:06.993-0800: [ParNew: 996800K->110720K(996800K), 0.0799602 secs] 1397240K->665426K(4083584K), 0.0799944 secs] [Times: user=0.99 sys=0.04, real=0.08 secs]
2020-10-27T15:48:07.159-0800: [GC (Allocation Failure) 2020-10-27T15:48:07.159-0800: [ParNew: 996800K->110720K(996800K), 0.0844310 secs] 1551506K->829586K(4083584K), 0.0844666 secs] [Times: user=1.04 sys=0.04, real=0.09 secs]
执行结束!共生成对象次数:16727
Heap
 par new generation   total 996800K, used 146494K [0x00000006c0000000, 0x0000000703990000, 0x0000000703990000)
  eden space 886080K,   4% used [0x00000006c0000000, 0x00000006c22ef868, 0x00000006f6150000)
  from space 110720K, 100% used [0x00000006fcd70000, 0x0000000703990000, 0x0000000703990000)
  to   space 110720K,   0% used [0x00000006f6150000, 0x00000006f6150000, 0x00000006fcd70000)
 concurrent mark-sweep generation total 3086784K, used 718866K [0x0000000703990000, 0x00000007c0000000, 0x00000007c0000000)
 Metaspace       used 2739K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 291K, capacity 386K, committed 512K, reserved 1048576K
```

## 3.3 CMS GC特点
1. 其对年轻代采用并行 STW 方式的 mark-copy (标记-复制)算法，对老年代主要使用并发 mark-sweep (标记-清除)算法。
2. CMS GC 的设计目标是避免在老年代垃圾收集时出现长时间的卡顿，主要通过两种手段来达成此
目标：
    1. 不对老年代进行整理，而是使用空闲列表（free-lists）来管理内存空间的回收。
    2. 在 mark-and-sweep （标记-清除） 阶段的大部分工作和应用线程一起并发执行。
3. 系统考虑低延迟有限，每次 GC 时间尽量短，用CMS GC。


# 4 G1 GC
## 4.1 将堆内存分配512M

```
java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-27T15:54:44.189-0800: [GC pause (G1 Evacuation Pause) (young) 33394K->12866K(512M), 0.0041614 secs]
2020-10-27T15:54:44.201-0800: [GC pause (G1 Evacuation Pause) (young) 43703K->21835K(512M), 0.0046023 secs]
2020-10-27T15:54:44.219-0800: [GC pause (G1 Evacuation Pause) (young) 77578K->39945K(512M), 0.0072719 secs]
2020-10-27T15:54:44.262-0800: [GC pause (G1 Evacuation Pause) (young) 146M->73370K(512M), 0.0112187 secs]
2020-10-27T15:54:44.287-0800: [GC pause (G1 Evacuation Pause) (young) 157M->98495K(512M), 0.0093100 secs]
2020-10-27T15:54:44.377-0800: [GC pause (G1 Evacuation Pause) (young) 344M->172M(512M), 0.0196656 secs]
2020-10-27T15:54:44.413-0800: [GC pause (G1 Evacuation Pause) (young) 303M->202M(512M), 0.0108341 secs]
2020-10-27T15:54:44.434-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 273M->222M(512M), 0.0047981 secs]
2020-10-27T15:54:44.439-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.439-0800: [GC concurrent-root-region-scan-end, 0.0001056 secs]
2020-10-27T15:54:44.439-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.440-0800: [GC concurrent-mark-end, 0.0012850 secs]
2020-10-27T15:54:44.440-0800: [GC remark, 0.0011934 secs]
2020-10-27T15:54:44.441-0800: [GC cleanup 234M->234M(512M), 0.0007155 secs]
2020-10-27T15:54:44.478-0800: [GC pause (G1 Evacuation Pause) (young) 401M->265M(512M), 0.0083200 secs]
2020-10-27T15:54:44.488-0800: [GC pause (G1 Evacuation Pause) (mixed) 273M->249M(512M), 0.0055030 secs]
2020-10-27T15:54:44.494-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 252M->249M(512M), 0.0014641 secs]
2020-10-27T15:54:44.496-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.496-0800: [GC concurrent-root-region-scan-end, 0.0001912 secs]
2020-10-27T15:54:44.496-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.497-0800: [GC concurrent-mark-end, 0.0012325 secs]
2020-10-27T15:54:44.497-0800: [GC remark, 0.0014062 secs]
2020-10-27T15:54:44.499-0800: [GC cleanup 257M->256M(512M), 0.0008325 secs]
2020-10-27T15:54:44.500-0800: [GC concurrent-cleanup-start]
2020-10-27T15:54:44.500-0800: [GC concurrent-cleanup-end, 0.0000185 secs]
2020-10-27T15:54:44.524-0800: [GC pause (G1 Evacuation Pause) (young)-- 423M->317M(512M), 0.0042685 secs]
2020-10-27T15:54:44.529-0800: [GC pause (G1 Evacuation Pause) (mixed) 328M->302M(512M), 0.0037071 secs]
2020-10-27T15:54:44.533-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 305M->303M(512M), 0.0011950 secs]
2020-10-27T15:54:44.535-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.535-0800: [GC concurrent-root-region-scan-end, 0.0000718 secs]
2020-10-27T15:54:44.535-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.535-0800: [GC concurrent-mark-end, 0.0007303 secs]
2020-10-27T15:54:44.536-0800: [GC remark, 0.0010830 secs]
2020-10-27T15:54:44.537-0800: [GC cleanup 309M->308M(512M), 0.0006660 secs]
2020-10-27T15:54:44.537-0800: [GC concurrent-cleanup-start]
2020-10-27T15:54:44.537-0800: [GC concurrent-cleanup-end, 0.0000137 secs]
2020-10-27T15:54:44.551-0800: [GC pause (G1 Evacuation Pause) (young) 419M->335M(512M), 0.0038842 secs]
2020-10-27T15:54:44.557-0800: [GC pause (G1 Evacuation Pause) (mixed) 351M->303M(512M), 0.0039053 secs]
2020-10-27T15:54:44.564-0800: [GC pause (G1 Evacuation Pause) (mixed) 328M->303M(512M), 0.0042825 secs]
2020-10-27T15:54:44.569-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 305M->305M(512M), 0.0018785 secs]
2020-10-27T15:54:44.571-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.571-0800: [GC concurrent-root-region-scan-end, 0.0001107 secs]
2020-10-27T15:54:44.571-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.572-0800: [GC concurrent-mark-end, 0.0008175 secs]
2020-10-27T15:54:44.572-0800: [GC remark, 0.0012348 secs]
2020-10-27T15:54:44.573-0800: [GC cleanup 313M->313M(512M), 0.0008887 secs]
2020-10-27T15:54:44.586-0800: [GC pause (G1 Evacuation Pause) (young) 407M->339M(512M), 0.0048493 secs]
2020-10-27T15:54:44.593-0800: [GC pause (G1 Evacuation Pause) (mixed) 356M->317M(512M), 0.0045064 secs]
2020-10-27T15:54:44.600-0800: [GC pause (G1 Evacuation Pause) (mixed) 340M->325M(512M), 0.0027913 secs]
2020-10-27T15:54:44.604-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 328M->325M(512M), 0.0016194 secs]
2020-10-27T15:54:44.605-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.605-0800: [GC concurrent-root-region-scan-end, 0.0001009 secs]
2020-10-27T15:54:44.605-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.606-0800: [GC concurrent-mark-end, 0.0007729 secs]
2020-10-27T15:54:44.606-0800: [GC remark, 0.0014079 secs]
2020-10-27T15:54:44.608-0800: [GC cleanup 333M->332M(512M), 0.0007914 secs]
2020-10-27T15:54:44.609-0800: [GC concurrent-cleanup-start]
2020-10-27T15:54:44.609-0800: [GC concurrent-cleanup-end, 0.0000162 secs]
2020-10-27T15:54:44.619-0800: [GC pause (G1 Evacuation Pause) (young) 408M->347M(512M), 0.0038245 secs]
2020-10-27T15:54:44.625-0800: [GC pause (G1 Evacuation Pause) (mixed) 370M->331M(512M), 0.0053062 secs]
2020-10-27T15:54:44.634-0800: [GC pause (G1 Evacuation Pause) (mixed) 361M->342M(512M), 0.0031106 secs]
2020-10-27T15:54:44.638-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 344M->343M(512M), 0.0014450 secs]
2020-10-27T15:54:44.639-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.639-0800: [GC concurrent-root-region-scan-end, 0.0000937 secs]
2020-10-27T15:54:44.639-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.640-0800: [GC concurrent-mark-end, 0.0007953 secs]
2020-10-27T15:54:44.640-0800: [GC remark, 0.0014395 secs]
2020-10-27T15:54:44.642-0800: [GC cleanup 350M->350M(512M), 0.0008266 secs]
2020-10-27T15:54:44.650-0800: [GC pause (G1 Evacuation Pause) (young) 404M->357M(512M), 0.0048553 secs]
2020-10-27T15:54:44.658-0800: [GC pause (G1 Evacuation Pause) (mixed) 379M->340M(512M), 0.0076481 secs]
2020-10-27T15:54:44.670-0800: [GC pause (G1 Evacuation Pause) (mixed) 367M->349M(512M), 0.0028920 secs]
2020-10-27T15:54:44.673-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 351M->350M(512M), 0.0016091 secs]
2020-10-27T15:54:44.674-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.674-0800: [GC concurrent-root-region-scan-end, 0.0000882 secs]
2020-10-27T15:54:44.674-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.675-0800: [GC concurrent-mark-end, 0.0008252 secs]
2020-10-27T15:54:44.675-0800: [GC remark, 0.0013818 secs]
2020-10-27T15:54:44.677-0800: [GC cleanup 357M->357M(512M), 0.0008351 secs]
2020-10-27T15:54:44.684-0800: [GC pause (G1 Evacuation Pause) (young) 404M->367M(512M), 0.0031334 secs]
2020-10-27T15:54:44.691-0800: [GC pause (G1 Evacuation Pause) (mixed) 391M->356M(512M), 0.0060411 secs]
2020-10-27T15:54:44.701-0800: [GC pause (G1 Evacuation Pause) (mixed) 388M->367M(512M), 0.0032378 secs]
2020-10-27T15:54:44.704-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 370M->368M(512M), 0.0019653 secs]
2020-10-27T15:54:44.706-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.706-0800: [GC concurrent-root-region-scan-end, 0.0001141 secs]
2020-10-27T15:54:44.706-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.707-0800: [GC concurrent-mark-end, 0.0008987 secs]
2020-10-27T15:54:44.707-0800: [GC remark, 0.0014325 secs]
2020-10-27T15:54:44.709-0800: [GC cleanup 376M->376M(512M), 0.0008772 secs]
2020-10-27T15:54:44.713-0800: [GC pause (G1 Evacuation Pause) (young) 404M->381M(512M), 0.0033355 secs]
2020-10-27T15:54:44.719-0800: [GC pause (G1 Evacuation Pause) (mixed) 407M->363M(512M), 0.0069253 secs]
2020-10-27T15:54:44.729-0800: [GC pause (G1 Evacuation Pause) (mixed) 390M->365M(512M), 0.0030330 secs]
2020-10-27T15:54:44.733-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 368M->366M(512M), 0.0016084 secs]
2020-10-27T15:54:44.734-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.734-0800: [GC concurrent-root-region-scan-end, 0.0000903 secs]
2020-10-27T15:54:44.734-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.735-0800: [GC concurrent-mark-end, 0.0008098 secs]
2020-10-27T15:54:44.735-0800: [GC remark, 0.0013784 secs]
2020-10-27T15:54:44.737-0800: [GC cleanup 374M->374M(512M), 0.0007813 secs]
2020-10-27T15:54:44.741-0800: [GC pause (G1 Evacuation Pause) (young) 402M->378M(512M), 0.0022937 secs]
2020-10-27T15:54:44.746-0800: [GC pause (G1 Evacuation Pause) (mixed) 405M->368M(512M), 0.0055197 secs]
2020-10-27T15:54:44.752-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 369M->368M(512M), 0.0018228 secs]
2020-10-27T15:54:44.754-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.754-0800: [GC concurrent-root-region-scan-end, 0.0000180 secs]
2020-10-27T15:54:44.754-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.755-0800: [GC concurrent-mark-end, 0.0011325 secs]
2020-10-27T15:54:44.755-0800: [GC remark, 0.0014896 secs]
2020-10-27T15:54:44.757-0800: [GC cleanup 380M->380M(512M), 0.0008679 secs]
2020-10-27T15:54:44.760-0800: [GC pause (G1 Evacuation Pause) (young) 404M->383M(512M), 0.0027238 secs]
2020-10-27T15:54:44.766-0800: [GC pause (G1 Evacuation Pause) (mixed) 411M->376M(512M), 0.0044367 secs]
2020-10-27T15:54:44.771-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 383M->379M(512M), 0.0020185 secs]
2020-10-27T15:54:44.773-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.773-0800: [GC concurrent-root-region-scan-end, 0.0000600 secs]
2020-10-27T15:54:44.773-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.774-0800: [GC concurrent-mark-end, 0.0009467 secs]
2020-10-27T15:54:44.774-0800: [GC remark, 0.0015391 secs]
2020-10-27T15:54:44.776-0800: [GC cleanup 386M->386M(512M), 0.0008732 secs]
2020-10-27T15:54:44.780-0800: [GC pause (G1 Evacuation Pause) (young) 408M->383M(512M), 0.0029503 secs]
2020-10-27T15:54:44.786-0800: [GC pause (G1 Evacuation Pause) (mixed) 406M->369M(512M), 0.0059629 secs]
2020-10-27T15:54:44.792-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 371M->370M(512M), 0.0018426 secs]
2020-10-27T15:54:44.794-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.794-0800: [GC concurrent-root-region-scan-end, 0.0000941 secs]
2020-10-27T15:54:44.794-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.795-0800: [GC concurrent-mark-end, 0.0008711 secs]
2020-10-27T15:54:44.795-0800: [GC remark, 0.0014337 secs]
2020-10-27T15:54:44.797-0800: [GC cleanup 378M->378M(512M), 0.0009241 secs]
2020-10-27T15:54:44.800-0800: [GC pause (G1 Evacuation Pause) (young) 400M->379M(512M), 0.0020751 secs]
2020-10-27T15:54:44.805-0800: [GC pause (G1 Evacuation Pause) (mixed) 405M->374M(512M), 0.0039411 secs]
2020-10-27T15:54:44.809-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 374M->373M(512M), 0.0014229 secs]
2020-10-27T15:54:44.811-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.811-0800: [GC concurrent-root-region-scan-end, 0.0000638 secs]
2020-10-27T15:54:44.811-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.812-0800: [GC concurrent-mark-end, 0.0009325 secs]
2020-10-27T15:54:44.812-0800: [GC remark, 0.0015108 secs]
2020-10-27T15:54:44.813-0800: [GC cleanup 385M->385M(512M), 0.0007956 secs]
2020-10-27T15:54:44.817-0800: [GC pause (G1 Evacuation Pause) (young) 401M->379M(512M), 0.0025002 secs]
2020-10-27T15:54:44.823-0800: [GC pause (G1 Evacuation Pause) (mixed) 406M->375M(512M), 0.0039255 secs]
2020-10-27T15:54:44.827-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 376M->376M(512M), 0.0018789 secs]
2020-10-27T15:54:44.829-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.829-0800: [GC concurrent-root-region-scan-end, 0.0000660 secs]
2020-10-27T15:54:44.829-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.830-0800: [GC concurrent-mark-end, 0.0009045 secs]
2020-10-27T15:54:44.830-0800: [GC remark, 0.0014198 secs]
2020-10-27T15:54:44.832-0800: [GC cleanup 383M->383M(512M), 0.0008306 secs]
2020-10-27T15:54:44.835-0800: [GC pause (G1 Evacuation Pause) (young) 410M->388M(512M), 0.0023084 secs]
2020-10-27T15:54:44.841-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 415M->386M(512M), 0.0062089 secs]
2020-10-27T15:54:44.847-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 387M->385M(512M), 0.0018854 secs]
2020-10-27T15:54:44.849-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.850-0800: [GC concurrent-root-region-scan-end, 0.0001104 secs]
2020-10-27T15:54:44.850-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.851-0800: [GC concurrent-mark-end, 0.0009804 secs]
2020-10-27T15:54:44.851-0800: [GC remark, 0.0014130 secs]
2020-10-27T15:54:44.852-0800: [GC cleanup 395M->395M(512M), 0.0007291 secs]
2020-10-27T15:54:44.856-0800: [GC pause (G1 Evacuation Pause) (young) 415M->392M(512M), 0.0022065 secs]
2020-10-27T15:54:44.862-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 417M->399M(512M), 0.0042865 secs]
2020-10-27T15:54:44.867-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 401M->399M(512M), 0.0016009 secs]
2020-10-27T15:54:44.868-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.868-0800: [GC concurrent-root-region-scan-end, 0.0000579 secs]
2020-10-27T15:54:44.868-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.869-0800: [GC concurrent-mark-end, 0.0008850 secs]
2020-10-27T15:54:44.869-0800: [GC remark, 0.0015304 secs]
2020-10-27T15:54:44.871-0800: [GC cleanup 410M->410M(512M), 0.0008971 secs]
2020-10-27T15:54:44.874-0800: [GC pause (G1 Evacuation Pause) (young) 428M->409M(512M), 0.0020646 secs]
2020-10-27T15:54:44.880-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 435M->423M(512M), 0.0036208 secs]
2020-10-27T15:54:44.888-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 449M->443M(512M), 0.0021666 secs]
2020-10-27T15:54:44.891-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 447M->444M(512M), 0.0010974 secs]
2020-10-27T15:54:44.892-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.892-0800: [GC concurrent-root-region-scan-end, 0.0000806 secs]
2020-10-27T15:54:44.892-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.893-0800: [GC pause (G1 Humongous Allocation) (young)-- 450M->448M(512M), 0.0011255 secs]
2020-10-27T15:54:44.894-0800: [GC concurrent-mark-end, 0.0023331 secs]
2020-10-27T15:54:44.894-0800: [GC remark, 0.0013178 secs]
2020-10-27T15:54:44.896-0800: [GC cleanup 450M->450M(512M), 0.0008264 secs]
2020-10-27T15:54:44.897-0800: [GC pause (G1 Evacuation Pause) (young)-- 450M->450M(512M), 0.0010974 secs]
2020-10-27T15:54:44.898-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 451M->451M(512M), 0.0011225 secs]
2020-10-27T15:54:44.899-0800: [Full GC (Allocation Failure)  451M->332M(512M), 0.0321700 secs]
2020-10-27T15:54:44.933-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 338M->332M(512M), 0.0016091 secs]
2020-10-27T15:54:44.934-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.934-0800: [GC concurrent-root-region-scan-end, 0.0001046 secs]
2020-10-27T15:54:44.934-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.935-0800: [GC concurrent-mark-end, 0.0009562 secs]
2020-10-27T15:54:44.935-0800: [GC remark, 0.0015596 secs]
2020-10-27T15:54:44.937-0800: [GC cleanup 345M->345M(512M), 0.0008054 secs]
2020-10-27T15:54:44.940-0800: [GC pause (G1 Evacuation Pause) (young) 364M->339M(512M), 0.0021261 secs]
2020-10-27T15:54:44.943-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 341M->340M(512M), 0.0014644 secs]
2020-10-27T15:54:44.944-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.944-0800: [GC concurrent-root-region-scan-end, 0.0000854 secs]
2020-10-27T15:54:44.944-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.945-0800: [GC concurrent-mark-end, 0.0009597 secs]
2020-10-27T15:54:44.945-0800: [GC remark, 0.0016048 secs]
2020-10-27T15:54:44.947-0800: [GC cleanup 349M->349M(512M), 0.0009058 secs]
2020-10-27T15:54:44.952-0800: [GC pause (G1 Evacuation Pause) (young) 372M->350M(512M), 0.0023516 secs]
2020-10-27T15:54:44.957-0800: [GC pause (G1 Evacuation Pause) (mixed) 377M->355M(512M), 0.0034252 secs]
2020-10-27T15:54:44.962-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 359M->355M(512M), 0.0018547 secs]
2020-10-27T15:54:44.963-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.964-0800: [GC concurrent-root-region-scan-end, 0.0001101 secs]
2020-10-27T15:54:44.964-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.965-0800: [GC concurrent-mark-end, 0.0011348 secs]
2020-10-27T15:54:44.965-0800: [GC remark, 0.0014567 secs]
2020-10-27T15:54:44.966-0800: [GC cleanup 368M->368M(512M), 0.0008085 secs]
2020-10-27T15:54:44.969-0800: [GC pause (G1 Evacuation Pause) (young) 383M->365M(512M), 0.0025548 secs]
2020-10-27T15:54:44.976-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 392M->376M(512M), 0.0036354 secs]
2020-10-27T15:54:44.980-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 377M->376M(512M), 0.0015833 secs]
2020-10-27T15:54:44.981-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:44.982-0800: [GC concurrent-root-region-scan-end, 0.0000975 secs]
2020-10-27T15:54:44.982-0800: [GC concurrent-mark-start]
2020-10-27T15:54:44.983-0800: [GC concurrent-mark-end, 0.0009938 secs]
2020-10-27T15:54:44.983-0800: [GC remark, 0.0015228 secs]
2020-10-27T15:54:44.984-0800: [GC cleanup 388M->388M(512M), 0.0008043 secs]
2020-10-27T15:54:44.988-0800: [GC pause (G1 Evacuation Pause) (young) 409M->386M(512M), 0.0026266 secs]
2020-10-27T15:54:44.993-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 411M->399M(512M), 0.0026094 secs]
2020-10-27T15:54:45.000-0800: [GC pause (G1 Humongous Allocation) (mixed)-- 425M->419M(512M), 0.0019607 secs]
2020-10-27T15:54:45.003-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 426M->424M(512M), 0.0012864 secs]
2020-10-27T15:54:45.004-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.004-0800: [GC concurrent-root-region-scan-end, 0.0000770 secs]
2020-10-27T15:54:45.004-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.005-0800: [GC pause (G1 Evacuation Pause) (young)-- 427M->427M(512M), 0.0010998 secs]
2020-10-27T15:54:45.006-0800: [GC pause (G1 Evacuation Pause) (young)-- 428M->428M(512M), 0.0011493 secs]
2020-10-27T15:54:45.008-0800: [Full GC (Allocation Failure)  428M->331M(512M), 0.0364795 secs]
2020-10-27T15:54:45.044-0800: [GC concurrent-mark-abort]
2020-10-27T15:54:45.045-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 334M->332M(512M), 0.0018063 secs]
2020-10-27T15:54:45.047-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.047-0800: [GC concurrent-root-region-scan-end, 0.0000686 secs]
2020-10-27T15:54:45.047-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.048-0800: [GC concurrent-mark-end, 0.0009966 secs]
2020-10-27T15:54:45.048-0800: [GC remark, 0.0015468 secs]
2020-10-27T15:54:45.049-0800: [GC cleanup 338M->338M(512M), 0.0009308 secs]
2020-10-27T15:54:45.054-0800: [GC pause (G1 Evacuation Pause) (young) 368M->341M(512M), 0.0025600 secs]
2020-10-27T15:54:45.057-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 343M->341M(512M), 0.0013970 secs]
2020-10-27T15:54:45.058-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.059-0800: [GC concurrent-root-region-scan-end, 0.0000942 secs]
2020-10-27T15:54:45.059-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.060-0800: [GC concurrent-mark-end, 0.0010246 secs]
2020-10-27T15:54:45.060-0800: [GC remark, 0.0013837 secs]
2020-10-27T15:54:45.061-0800: [GC cleanup 350M->350M(512M), 0.0008108 secs]
2020-10-27T15:54:45.064-0800: [GC pause (G1 Evacuation Pause) (young) 371M->353M(512M), 0.0022010 secs]
2020-10-27T15:54:45.070-0800: [GC pause (G1 Evacuation Pause) (mixed) 379M->357M(512M), 0.0026948 secs]
2020-10-27T15:54:45.073-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 362M->358M(512M), 0.0021897 secs]
2020-10-27T15:54:45.076-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.076-0800: [GC concurrent-root-region-scan-end, 0.0000836 secs]
2020-10-27T15:54:45.076-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.077-0800: [GC concurrent-mark-end, 0.0009799 secs]
2020-10-27T15:54:45.077-0800: [GC remark, 0.0016052 secs]
2020-10-27T15:54:45.078-0800: [GC cleanup 367M->367M(512M), 0.0009990 secs]
2020-10-27T15:54:45.082-0800: [GC pause (G1 Evacuation Pause) (young) 386M->365M(512M), 0.0024220 secs]
2020-10-27T15:54:45.088-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 391M->373M(512M), 0.0045458 secs]
2020-10-27T15:54:45.093-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 374M->374M(512M), 0.0018856 secs]
2020-10-27T15:54:45.095-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.095-0800: [GC concurrent-root-region-scan-end, 0.0000956 secs]
2020-10-27T15:54:45.095-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.096-0800: [GC concurrent-mark-end, 0.0011612 secs]
2020-10-27T15:54:45.096-0800: [GC remark, 0.0014492 secs]
2020-10-27T15:54:45.098-0800: [GC cleanup 384M->384M(512M), 0.0008495 secs]
2020-10-27T15:54:45.102-0800: [GC pause (G1 Evacuation Pause) (young) 403M->383M(512M), 0.0024560 secs]
2020-10-27T15:54:45.108-0800: [GC pause (G1 Evacuation Pause) (mixed)-- 412M->415M(512M), 0.0040912 secs]
2020-10-27T15:54:45.113-0800: [GC pause (G1 Humongous Allocation) (mixed)-- 424M->421M(512M), 0.0017671 secs]
2020-10-27T15:54:45.115-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 424M->423M(512M), 0.0012898 secs]
2020-10-27T15:54:45.117-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.117-0800: [GC concurrent-root-region-scan-end, 0.0000824 secs]
2020-10-27T15:54:45.117-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.117-0800: [GC pause (G1 Evacuation Pause) (young)-- 424M->424M(512M), 0.0012012 secs]
2020-10-27T15:54:45.118-0800: [GC pause (G1 Evacuation Pause) (young)-- 425M->425M(512M), 0.0013059 secs]
2020-10-27T15:54:45.120-0800: [Full GC (Allocation Failure)  425M->338M(512M), 0.0312782 secs]
2020-10-27T15:54:45.151-0800: [GC concurrent-mark-abort]
2020-10-27T15:54:45.152-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 342M->340M(512M), 0.0017370 secs]
2020-10-27T15:54:45.153-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.153-0800: [GC concurrent-root-region-scan-end, 0.0000512 secs]
2020-10-27T15:54:45.153-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.154-0800: [GC concurrent-mark-end, 0.0009941 secs]
2020-10-27T15:54:45.154-0800: [GC remark, 0.0014585 secs]
2020-10-27T15:54:45.156-0800: [GC cleanup 350M->350M(512M), 0.0008731 secs]
2020-10-27T15:54:45.160-0800: [GC pause (G1 Evacuation Pause) (young) 368M->344M(512M), 0.0024993 secs]
2020-10-27T15:54:45.163-0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 345M->344M(512M), 0.0013997 secs]
2020-10-27T15:54:45.164-0800: [GC concurrent-root-region-scan-start]
2020-10-27T15:54:45.164-0800: [GC concurrent-root-region-scan-end, 0.0000143 secs]
2020-10-27T15:54:45.164-0800: [GC concurrent-mark-start]
2020-10-27T15:54:45.165-0800: [GC concurrent-mark-end, 0.0011448 secs]
2020-10-27T15:54:45.165-0800: [GC remark, 0.0013578 secs]
2020-10-27T15:54:45.167-0800: [GC cleanup 353M->353M(512M), 0.0008095 secs]
执行结束!共生成对象次数:10849
```

## 4.2 将堆内存分配为4096M

```
java -XX:+UseG1GC -Xms4g -Xmx4g -XX:+PrintGC -XX:+PrintGCDateStamps GCLogAnalysis
正在执行...
2020-10-28T09:28:19.266-0800: [GC pause (G1 Evacuation Pause) (young) 204M->68374K(4096M), 0.0217693 secs]
2020-10-28T09:28:19.308-0800: [GC pause (G1 Evacuation Pause) (young) 244M->124M(4096M), 0.0196908 secs]
2020-10-28T09:28:19.350-0800: [GC pause (G1 Evacuation Pause) (young) 302M->180M(4096M), 0.0195994 secs]
2020-10-28T09:28:19.390-0800: [GC pause (G1 Evacuation Pause) (young) 358M->231M(4096M), 0.0158456 secs]
2020-10-28T09:28:19.424-0800: [GC pause (G1 Evacuation Pause) (young) 409M->289M(4096M), 0.0175973 secs]
2020-10-28T09:28:19.461-0800: [GC pause (G1 Evacuation Pause) (young) 467M->339M(4096M), 0.0158845 secs]
2020-10-28T09:28:19.495-0800: [GC pause (G1 Evacuation Pause) (young) 517M->399M(4096M), 0.0175196 secs]
2020-10-28T09:28:19.534-0800: [GC pause (G1 Evacuation Pause) (young) 597M->461M(4096M), 0.0206247 secs]
2020-10-28T09:28:19.591-0800: [GC pause (G1 Evacuation Pause) (young) 719M->545M(4096M), 0.0307118 secs]
2020-10-28T09:28:19.646-0800: [GC pause (G1 Evacuation Pause) (young) 807M->609M(4096M), 0.0213765 secs]
2020-10-28T09:28:19.706-0800: [GC pause (G1 Evacuation Pause) (young) 925M->703M(4096M), 0.0335223 secs]
2020-10-28T09:28:19.830-0800: [GC pause (G1 Evacuation Pause) (young) 1203M->833M(4096M), 0.0446630 secs]
2020-10-28T09:28:19.920-0800: [GC pause (G1 Evacuation Pause) (young) 1289M->937M(4096M), 0.0320664 secs]
2020-10-28T09:28:20.029-0800: [GC pause (G1 Evacuation Pause) (young) 1555M->1098M(4096M), 0.0564011 secs]
执行结束!共生成对象次数:17095
```

## 4.3 G1 GC特点
1. 堆不再分成年轻代和老年代，而是划分为多个（通常是 2048 个）可以存放对象的 小块堆区域(smaller heap regions)。
2. 在并发阶段估算每个小堆块存活对象的总数。构建回收集的原则是：垃圾最多的小块会被优先收集。
3. 系统内存堆较大，同时希望整体来看平均 GC 时间可控，使用 G1 GC。