@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.SubscriptionOptions

public fun subscriptionOptions(initializer: SubscriptionOptions.Builder.() -> Unit):
    SubscriptionOptions = SubscriptionOptions.builder().apply(initializer).build()
