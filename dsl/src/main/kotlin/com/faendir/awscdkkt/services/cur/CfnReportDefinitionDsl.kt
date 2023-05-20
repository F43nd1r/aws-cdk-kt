@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cur

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cur.CfnReportDefinition
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps
import software.constructs.Construct

public fun Construct.cfnReportDefinition(
  id: String,
  props: CfnReportDefinitionProps,
  initializer: CfnReportDefinition.() -> Unit = {},
): CfnReportDefinition = CfnReportDefinition(this, id, props).apply(initializer)
