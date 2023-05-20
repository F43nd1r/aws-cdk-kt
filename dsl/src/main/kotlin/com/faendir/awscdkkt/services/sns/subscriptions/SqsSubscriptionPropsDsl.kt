@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps

public fun sqsSubscriptionProps(initializer: SqsSubscriptionProps.Builder.() -> Unit):
    SqsSubscriptionProps = SqsSubscriptionProps.builder().apply(initializer).build()
