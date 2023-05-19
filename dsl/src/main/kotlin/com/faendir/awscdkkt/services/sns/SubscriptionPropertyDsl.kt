@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnTopic

public fun subscriptionProperty(initializer: CfnTopic.SubscriptionProperty.Builder.() -> Unit):
    CfnTopic.SubscriptionProperty =
    CfnTopic.SubscriptionProperty.builder().apply(initializer).build()
