package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.SubscriptionOptions

@Generated
public fun subscriptionOptions(initializer: SubscriptionOptions.Builder.() -> Unit = {}):
    SubscriptionOptions = SubscriptionOptions.builder().apply(initializer).build()
