package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReportGroup(
  id: String,
  props: CfnReportGroupProps,
  initializer: CfnReportGroup.() -> Unit = {},
): CfnReportGroup = CfnReportGroup(this, id, props).apply(initializer)
