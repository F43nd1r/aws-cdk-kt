package com.faendir.awscdkkt.generated.services.autoscaling.hooktargets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.autoscaling.hooktargets.TopicHook
import software.amazon.awscdk.services.sns.ITopic

@Generated
public fun topicHook(topic: ITopic): TopicHook = TopicHook(topic)
