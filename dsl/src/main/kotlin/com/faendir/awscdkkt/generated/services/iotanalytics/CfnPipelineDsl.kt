package com.faendir.awscdkkt.generated.services.iotanalytics

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotanalytics.CfnPipeline
import software.amazon.awscdk.services.iotanalytics.CfnPipelineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPipeline(
  id: String,
  props: CfnPipelineProps,
  initializer: @AwsCdkDsl CfnPipeline.() -> Unit = {},
): CfnPipeline = CfnPipeline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPipeline(id: String, initializer: @AwsCdkDsl CfnPipeline.Builder.() -> Unit = {}): CfnPipeline = CfnPipeline.Builder.create(this, id).apply(initializer).build()
