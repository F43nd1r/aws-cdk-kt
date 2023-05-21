package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicPolicyProps

@Generated
public fun topicPolicyProps(initializer: TopicPolicyProps.Builder.() -> Unit = {}): TopicPolicyProps
    = TopicPolicyProps.builder().apply(initializer).build()
