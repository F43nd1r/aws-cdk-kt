package com.faendir.awscdkkt.generated.services.cloudwatch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.constructs.Construct

@Generated
public fun Construct.dashboard(id: String): Dashboard = Dashboard(this, id)

@Generated
public fun Construct.dashboard(id: String, initializer: @AwsCdkDsl Dashboard.() -> Unit): Dashboard
    = Dashboard(this, id).apply(initializer)

@Generated
public fun Construct.dashboard(id: String, props: DashboardProps): Dashboard = Dashboard(this, id,
    props)

@Generated
public fun Construct.dashboard(
  id: String,
  props: DashboardProps,
  initializer: @AwsCdkDsl Dashboard.() -> Unit,
): Dashboard = Dashboard(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDashboard(id: String, initializer: @AwsCdkDsl
    Dashboard.Builder.() -> Unit): Dashboard = Dashboard.Builder.create(this,
    id).apply(initializer).build()
