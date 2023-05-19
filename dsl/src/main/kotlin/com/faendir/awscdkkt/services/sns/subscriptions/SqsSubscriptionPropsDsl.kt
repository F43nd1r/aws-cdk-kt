@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps

public fun sqsSubscriptionProps(initializer: SqsSubscriptionProps.Builder.() -> Unit):
    SqsSubscriptionProps = SqsSubscriptionProps.builder().apply(initializer).build()
