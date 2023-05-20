@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps
import software.constructs.Construct

public fun Construct.cfnSubscriptionFilter(
  id: String,
  props: CfnSubscriptionFilterProps,
  initializer: CfnSubscriptionFilter.() -> Unit = {},
): CfnSubscriptionFilter = CfnSubscriptionFilter(this, id, props).apply(initializer)
