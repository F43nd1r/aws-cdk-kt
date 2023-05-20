@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDashboardProps
import software.constructs.Construct

public fun Construct.cfnDashboard(
  id: String,
  props: CfnDashboardProps,
  initializer: CfnDashboard.() -> Unit = {},
): CfnDashboard = CfnDashboard(this, id, props).apply(initializer)
