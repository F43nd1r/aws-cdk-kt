@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
import software.constructs.Construct

public fun Construct.cfnAccessLogSubscription(
  id: String,
  props: CfnAccessLogSubscriptionProps,
  initializer: CfnAccessLogSubscription.() -> Unit = {},
): CfnAccessLogSubscription = CfnAccessLogSubscription(this, id, props).apply(initializer)
