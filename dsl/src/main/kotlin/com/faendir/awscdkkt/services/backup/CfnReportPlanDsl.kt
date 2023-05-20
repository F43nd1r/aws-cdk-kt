@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnReportPlan
import software.amazon.awscdk.services.backup.CfnReportPlanProps
import software.constructs.Construct

public fun Construct.cfnReportPlan(
  id: String,
  props: CfnReportPlanProps,
  initializer: CfnReportPlan.() -> Unit = {},
): CfnReportPlan = CfnReportPlan(this, id, props).apply(initializer)
