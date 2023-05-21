package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.subscription(
  id: String,
  props: SubscriptionProps,
  initializer: Subscription.() -> Unit = {},
): Subscription = Subscription(this, id, props).apply(initializer)
