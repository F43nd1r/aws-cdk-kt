package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.TopicSubscriptionConfig

@Generated
public fun buildTopicSubscriptionConfig(initializer: @AwsCdkDsl
    TopicSubscriptionConfig.Builder.() -> Unit): TopicSubscriptionConfig =
    TopicSubscriptionConfig.Builder().apply(initializer).build()
