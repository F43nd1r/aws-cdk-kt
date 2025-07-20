package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl SubscriptionFilter.() -> Unit = {},
): SubscriptionFilter = SubscriptionFilter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSubscriptionFilter(id: String, initializer: @AwsCdkDsl SubscriptionFilter.Builder.() -> Unit = {}): SubscriptionFilter = SubscriptionFilter.Builder.create(this, id).apply(initializer).build()
