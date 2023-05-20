@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicSubscriptionConfig

public fun topicSubscriptionConfig(initializer: TopicSubscriptionConfig.Builder.() -> Unit):
    TopicSubscriptionConfig = TopicSubscriptionConfig.builder().apply(initializer).build()
