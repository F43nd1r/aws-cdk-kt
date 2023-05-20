@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEventSubscription
import software.amazon.awscdk.services.dms.CfnEventSubscriptionProps
import software.constructs.Construct

public fun Construct.cfnEventSubscription(
  id: String,
  props: CfnEventSubscriptionProps,
  initializer: CfnEventSubscription.() -> Unit = {},
): CfnEventSubscription = CfnEventSubscription(this, id, props).apply(initializer)
