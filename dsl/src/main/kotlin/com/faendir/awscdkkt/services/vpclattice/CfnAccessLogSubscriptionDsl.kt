package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessLogSubscription(
  id: String,
  props: CfnAccessLogSubscriptionProps,
  initializer: CfnAccessLogSubscription.() -> Unit = {},
): CfnAccessLogSubscription = CfnAccessLogSubscription(this, id, props).apply(initializer)
