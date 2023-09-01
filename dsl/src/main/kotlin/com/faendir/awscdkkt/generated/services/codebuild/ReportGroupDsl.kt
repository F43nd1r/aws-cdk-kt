package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.constructs.Construct

@Generated
public fun Construct.reportGroup(id: String, initializer: @AwsCdkDsl ReportGroup.() -> Unit = {}):
    ReportGroup = ReportGroup(this, id).apply(initializer)

@Generated
public fun Construct.reportGroup(
  id: String,
  props: ReportGroupProps,
  initializer: @AwsCdkDsl ReportGroup.() -> Unit = {},
): ReportGroup = ReportGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildReportGroup(id: String, initializer: @AwsCdkDsl
    ReportGroup.Builder.() -> Unit = {}): ReportGroup = ReportGroup.Builder.create(this,
    id).apply(initializer).build()
