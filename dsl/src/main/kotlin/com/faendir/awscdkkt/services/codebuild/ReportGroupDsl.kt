@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.constructs.Construct

public fun Construct.reportGroup(id: String, initializer: ReportGroup.() -> Unit = {}): ReportGroup
    = ReportGroup(this, id).apply(initializer)

public fun Construct.reportGroup(
  id: String,
  props: ReportGroupProps,
  initializer: ReportGroup.() -> Unit = {},
): ReportGroup = ReportGroup(this, id, props).apply(initializer)
