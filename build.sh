# 拉取最新的源码
# git pull

# 停止已运行的服务
# sh run.sh stop

# 执行打包
mvn clean package -Dmaven.test.skip=true

# 运行
# sh run.sh start

echo "多用户博客打包完毕, 可使用sh run.sh start进行启动"