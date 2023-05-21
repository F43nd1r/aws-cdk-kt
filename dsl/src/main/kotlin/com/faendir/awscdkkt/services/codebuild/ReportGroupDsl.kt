package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.constructs.Construct

@Generated
public fun Construct.reportGroup(id: String, initializer: ReportGroup.() -> Unit = {}): ReportGroup
    = ReportGroup(this, id).apply(initializer)

@Generated
public fun Construct.reportGroup(
  id: String,
  props: ReportGroupProps,
  initializer: ReportGroup.() -> Unit = {},
): ReportGroup = ReportGroup(this, id, props).apply(initializer)
