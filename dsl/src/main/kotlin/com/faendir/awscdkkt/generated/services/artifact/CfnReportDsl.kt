package com.faendir.awscdkkt.generated.services.artifact

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.artifact.CfnReport
import software.amazon.awscdk.services.artifact.CfnReportProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReport(id: String, initializer: @AwsCdkDsl CfnReport.() -> Unit = {}): CfnReport = CfnReport(this, id).apply(initializer)

@Generated
public fun Construct.cfnReport(
  id: String,
  props: CfnReportProps,
  initializer: @AwsCdkDsl CfnReport.() -> Unit = {},
): CfnReport = CfnReport(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReport(id: String, initializer: @AwsCdkDsl CfnReport.Builder.() -> Unit = {}): CfnReport = CfnReport.Builder.create(this, id).apply(initializer).build()
