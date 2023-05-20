@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.SubscriptionOptions

public fun subscriptionOptions(initializer: SubscriptionOptions.Builder.() -> Unit):
    SubscriptionOptions = SubscriptionOptions.builder().apply(initializer).build()
