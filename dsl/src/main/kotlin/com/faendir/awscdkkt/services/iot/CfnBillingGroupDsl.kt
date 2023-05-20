@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.amazon.awscdk.services.iot.CfnBillingGroupProps
import software.constructs.Construct

public fun Construct.cfnBillingGroup(id: String, initializer: CfnBillingGroup.() -> Unit = {}):
    CfnBillingGroup = CfnBillingGroup(this, id).apply(initializer)

public fun Construct.cfnBillingGroup(
  id: String,
  props: CfnBillingGroupProps,
  initializer: CfnBillingGroup.() -> Unit = {},
): CfnBillingGroup = CfnBillingGroup(this, id, props).apply(initializer)
