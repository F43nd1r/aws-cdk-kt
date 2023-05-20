@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.constructs.Construct

public fun Construct.cfnReportGroup(
  id: String,
  props: CfnReportGroupProps,
  initializer: CfnReportGroup.() -> Unit = {},
): CfnReportGroup = CfnReportGroup(this, id, props).apply(initializer)
