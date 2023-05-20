@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
import software.constructs.Construct

public fun Construct.cfnBillingGroup(
  id: String,
  props: CfnBillingGroupProps,
  initializer: CfnBillingGroup.() -> Unit = {},
): CfnBillingGroup = CfnBillingGroup(this, id, props).apply(initializer)
