package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.constructs.Construct

@Generated
public fun Construct.dashboard(id: String, initializer: Dashboard.() -> Unit = {}): Dashboard =
    Dashboard(this, id).apply(initializer)

@Generated
public fun Construct.dashboard(
  id: String,
  props: DashboardProps,
  initializer: Dashboard.() -> Unit = {},
): Dashboard = Dashboard(this, id, props).apply(initializer)
