package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.SubscriptionFilter
import software.amazon.awscdk.services.logs.SubscriptionFilterProps
import software.constructs.Construct

@Generated
public fun Construct.subscriptionFilter(
  id: String,
  props: SubscriptionFilterProps,
  initializer: SubscriptionFilter.() -> Unit = {},
): SubscriptionFilter = SubscriptionFilter(this, id, props).apply(initializer)
