# Annotation 丢失调研

项目依赖关系

test-module:0.0.1-SNAPSHOT
|-annotation-module:0.0.1
\-domain-module:0.0.1-SNAPSHOT
  \-annotation-module:0.0.2


Maven jar引入默认处理策略
1. 最短路径优先
	Maven 面对 D1 和 D2 时，会默认选择最短路径的那个 jar 包，即 D2。E->F->D2 比 A->B->C->D1 路径短 1。
2. 最先声明优先
	如果路径一样的话，举个例子： A->B->C1, E->F->C2 ，两个依赖路径长度都是 2，那么就选择最先声明。

以上依赖会造成annotation-module:0.0.2被覆盖而未引入
此时domain-module可以成功加载类 但是AnnotationTwo注解丢失
