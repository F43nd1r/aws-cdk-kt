package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.amazon.awscdk.services.backup.CfnReportPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReportPlan(id: String, props: CfnReportPlanProps): CfnReportPlan =
    CfnReportPlan(this, id, props)

@Generated
public fun Construct.cfnReportPlan(
  id: String,
  props: CfnReportPlanProps,
  initializer: @AwsCdkDsl CfnReportPlan.() -> Unit,
): CfnReportPlan = CfnReportPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReportPlan(id: String, initializer: @AwsCdkDsl
    CfnReportPlan.Builder.() -> Unit): CfnReportPlan = CfnReportPlan.Builder.create(this,
    id).apply(initializer).build()
