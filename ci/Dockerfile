FROM harbor.34580.com/api-mall/project-base-8-jdk-alpine:1.0.0

# app jar file
ARG APP_NAME="@app_name"
ARG APP_JAR_FILE="@app_jar_file"

# ting yun
ARG TINGYUN_JAR_FILE="@tingyun_jar_file"
ARG TINGYUN_PROPERTY_FILE="@tingyun_property_file"

# java,product environment and other
ENV JAVA_CMD_JAR=" -jar ${APP_JAR_FILE}"
ENV JAVA_CMD_OPTION="/usr/bin/java -XX:-OmitStackTraceInFastThrow "
ENV JAVA_CMD_OPTION_PRO="/usr/bin/java -Xmx8g -XX:MaxNewSize=4g -XX:NewSize=1g -XX:-OmitStackTraceInFastThrow -javaagent:${TINGYUN_JAR_FILE} "

# for sky walking
ENV JAVA_CMD_OPTION_SKYWALKING="/usr/bin/java -Xmx8g -XX:MaxNewSize=4g -XX:NewSize=1g -XX:-OmitStackTraceInFastThrow -javaagent:skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=${APP_NAME} "


# add file to /opt/app direcotry
ADD $APP_JAR_FILE /opt/app/
ADD $TINGYUN_PROPERTY_FILE /opt/app/

EXPOSE @containerPort
WORKDIR /opt/app/

# ENTRYPOINT ["/sbin/tini", "--", "/bin/sh", "-c", "if [ ${ENV} = 'PRO' ] ; then ${JAVA_CMD_OPTION_PRO}${JAVA_OPTS}${JAVA_CMD_JAR} ;else ${JAVA_CMD_OPTION}${JAVA_OPTS}${JAVA_CMD_JAR} ;fi"]
# for sky walking
ENTRYPOINT ["/sbin/tini", "--", "/bin/sh", "-c", "${JAVA_CMD_OPTION_SKYWALKING}${JAVA_CMD_JAR}"]