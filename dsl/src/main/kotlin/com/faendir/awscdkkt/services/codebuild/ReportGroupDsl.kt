@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
