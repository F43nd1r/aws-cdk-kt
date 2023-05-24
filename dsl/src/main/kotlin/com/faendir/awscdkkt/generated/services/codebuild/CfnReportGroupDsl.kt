package com.faendir.awscdkkt.generated.services.codebuild

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import software.amazon.awscdk.services.codebuild.CfnReportGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReportGroup(id: String, props: CfnReportGroupProps): CfnReportGroup =
    CfnReportGroup(this, id, props)

@Generated
public fun Construct.cfnReportGroup(
  id: String,
  props: CfnReportGroupProps,
  initializer: @AwsCdkDsl CfnReportGroup.() -> Unit,
): CfnReportGroup = CfnReportGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReportGroup(id: String, initializer: @AwsCdkDsl
    CfnReportGroup.Builder.() -> Unit): CfnReportGroup = CfnReportGroup.Builder.create(this,
    id).apply(initializer).build()
