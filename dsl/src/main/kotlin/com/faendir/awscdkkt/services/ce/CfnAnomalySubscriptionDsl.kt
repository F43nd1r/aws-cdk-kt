package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnomalySubscription(
  id: String,
  props: CfnAnomalySubscriptionProps,
  initializer: CfnAnomalySubscription.() -> Unit = {},
): CfnAnomalySubscription = CfnAnomalySubscription(this, id, props).apply(initializer)
