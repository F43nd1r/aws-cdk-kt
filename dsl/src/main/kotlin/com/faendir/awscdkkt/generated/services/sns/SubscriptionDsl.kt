package com.faendir.awscdkkt.generated.services.sns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.subscription(id: String, props: SubscriptionProps): Subscription =
    Subscription(this, id, props)

@Generated
public fun Construct.subscription(
  id: String,
  props: SubscriptionProps,
  initializer: @AwsCdkDsl Subscription.() -> Unit,
): Subscription = Subscription(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSubscription(id: String, initializer: @AwsCdkDsl
    Subscription.Builder.() -> Unit): Subscription = Subscription.Builder.create(this,
    id).apply(initializer).build()
