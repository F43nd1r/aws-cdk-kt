package com.faendir.awscdkkt.generated.services.cur

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cur.CfnReportDefinition
import software.amazon.awscdk.services.cur.CfnReportDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReportDefinition(id: String, props: CfnReportDefinitionProps):
    CfnReportDefinition = CfnReportDefinition(this, id, props)

@Generated
public fun Construct.cfnReportDefinition(
  id: String,
  props: CfnReportDefinitionProps,
  initializer: @AwsCdkDsl CfnReportDefinition.() -> Unit,
): CfnReportDefinition = CfnReportDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReportDefinition(id: String, initializer: @AwsCdkDsl
    CfnReportDefinition.Builder.() -> Unit): CfnReportDefinition =
    CfnReportDefinition.Builder.create(this, id).apply(initializer).build()
