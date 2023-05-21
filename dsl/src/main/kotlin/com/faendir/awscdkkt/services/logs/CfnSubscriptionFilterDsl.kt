package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionFilter(
  id: String,
  props: CfnSubscriptionFilterProps,
  initializer: CfnSubscriptionFilter.() -> Unit = {},
): CfnSubscriptionFilter = CfnSubscriptionFilter(this, id, props).apply(initializer)
