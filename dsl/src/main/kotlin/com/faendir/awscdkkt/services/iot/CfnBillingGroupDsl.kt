package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.amazon.awscdk.services.iot.CfnBillingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBillingGroup(id: String, initializer: CfnBillingGroup.() -> Unit = {}):
    CfnBillingGroup = CfnBillingGroup(this, id).apply(initializer)

@Generated
public fun Construct.cfnBillingGroup(
  id: String,
  props: CfnBillingGroupProps,
  initializer: CfnBillingGroup.() -> Unit = {},
): CfnBillingGroup = CfnBillingGroup(this, id, props).apply(initializer)
