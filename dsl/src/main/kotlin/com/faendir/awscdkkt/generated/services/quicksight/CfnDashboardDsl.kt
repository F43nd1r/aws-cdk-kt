package com.faendir.awscdkkt.generated.services.quicksight

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnDashboard
import software.amazon.awscdk.services.quicksight.CfnDashboardProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDashboard(
  id: String,
  props: CfnDashboardProps,
  initializer: @AwsCdkDsl CfnDashboard.() -> Unit = {},
): CfnDashboard = CfnDashboard(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDashboard(id: String, initializer: @AwsCdkDsl CfnDashboard.Builder.() -> Unit = {}): CfnDashboard = CfnDashboard.Builder.create(this, id).apply(initializer).build()
