FROM centos:7
ENV RELEASE_PATH target/mdw-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/mdw

ADD ${RELEASE_PATH} /opt/mdw

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/mdw/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/mdw/ \
    && chgrp -R 0 /opt/mdw && chmod -R g=u /opt/mdw

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/mdw/mdw-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
