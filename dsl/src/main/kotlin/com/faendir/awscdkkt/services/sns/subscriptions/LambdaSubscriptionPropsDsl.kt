package com.faendir.awscdkkt.services.sns.subscriptions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.subscriptions.LambdaSubscriptionProps

@Generated
public fun lambdaSubscriptionProps(initializer: LambdaSubscriptionProps.Builder.() -> Unit = {}):
    LambdaSubscriptionProps = LambdaSubscriptionProps.builder().apply(initializer).build()
