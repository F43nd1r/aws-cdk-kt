@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
