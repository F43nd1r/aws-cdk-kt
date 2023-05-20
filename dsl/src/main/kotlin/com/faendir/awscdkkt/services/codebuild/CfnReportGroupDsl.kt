@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
