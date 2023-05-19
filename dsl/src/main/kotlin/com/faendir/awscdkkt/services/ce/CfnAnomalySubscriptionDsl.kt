@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ce

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import software.amazon.awscdk.services.ce.CfnAnomalySubscriptionProps
import software.constructs.Construct

public fun Construct.cfnAnomalySubscription(
  id: String,
  props: CfnAnomalySubscriptionProps,
  initializer: CfnAnomalySubscription.() -> Unit = {},
): CfnAnomalySubscription = CfnAnomalySubscription(this, id, props).apply(initializer)
