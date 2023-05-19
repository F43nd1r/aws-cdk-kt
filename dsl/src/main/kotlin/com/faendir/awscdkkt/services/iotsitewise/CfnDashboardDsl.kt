@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnDashboard
import software.amazon.awscdk.services.iotsitewise.CfnDashboardProps
import software.constructs.Construct

public fun Construct.cfnDashboard(
  id: String,
  props: CfnDashboardProps,
  initializer: CfnDashboard.() -> Unit = {},
): CfnDashboard = CfnDashboard(this, id, props).apply(initializer)
