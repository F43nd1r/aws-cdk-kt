package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.SubscriptionFilterOptions

@Generated
public fun subscriptionFilterOptions(initializer: SubscriptionFilterOptions.Builder.() -> Unit =
    {}): SubscriptionFilterOptions = SubscriptionFilterOptions.builder().apply(initializer).build()
