package com.faendir.awscdkkt.generated.services.bcmdataexports

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bcmdataexports.CfnExport
import software.amazon.awscdk.services.bcmdataexports.CfnExportProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExport(
  id: String,
  props: CfnExportProps,
  initializer: @AwsCdkDsl CfnExport.() -> Unit = {},
): CfnExport = CfnExport(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExport(id: String, initializer: @AwsCdkDsl CfnExport.Builder.() -> Unit = {}): CfnExport = CfnExport.Builder.create(this, id).apply(initializer).build()
