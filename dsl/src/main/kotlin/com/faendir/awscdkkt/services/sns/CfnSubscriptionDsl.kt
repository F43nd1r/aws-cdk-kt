@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.CfnSubscription
import software.amazon.awscdk.services.sns.CfnSubscriptionProps
import software.constructs.Construct

public fun Construct.cfnSubscription(
  id: String,
  props: CfnSubscriptionProps,
  initializer: CfnSubscription.() -> Unit = {},
): CfnSubscription = CfnSubscription(this, id, props).apply(initializer)
