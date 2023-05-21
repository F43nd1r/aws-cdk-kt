package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.SqsSubscriptionProps

@Generated
public fun sqsSubscriptionProps(initializer: SqsSubscriptionProps.Builder.() -> Unit = {}):
    SqsSubscriptionProps = SqsSubscriptionProps.builder().apply(initializer).build()
