@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic

public fun subscriptionProperty(initializer: CfnTopic.SubscriptionProperty.Builder.() -> Unit):
    CfnTopic.SubscriptionProperty =
    CfnTopic.SubscriptionProperty.builder().apply(initializer).build()
