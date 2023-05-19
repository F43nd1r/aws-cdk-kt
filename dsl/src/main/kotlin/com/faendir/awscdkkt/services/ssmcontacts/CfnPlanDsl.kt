@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
import software.constructs.Construct

public fun Construct.cfnPlan(
  id: String,
  props: CfnPlanProps,
  initializer: CfnPlan.() -> Unit = {},
): CfnPlan = CfnPlan(this, id, props).apply(initializer)
