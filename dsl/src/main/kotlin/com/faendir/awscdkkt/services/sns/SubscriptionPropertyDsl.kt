package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic

@Generated
public fun subscriptionProperty(initializer: CfnTopic.SubscriptionProperty.Builder.() -> Unit = {}):
    CfnTopic.SubscriptionProperty =
    CfnTopic.SubscriptionProperty.builder().apply(initializer).build()
