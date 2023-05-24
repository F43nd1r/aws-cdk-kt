package com.faendir.awscdkkt.generated.services.codepipeline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPipeline(id: String, props: CfnPipelineProps): CfnPipeline =
    CfnPipeline(this, id, props)

@Generated
public fun Construct.cfnPipeline(
  id: String,
  props: CfnPipelineProps,
  initializer: @AwsCdkDsl CfnPipeline.() -> Unit,
): CfnPipeline = CfnPipeline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPipeline(id: String, initializer: @AwsCdkDsl
    CfnPipeline.Builder.() -> Unit): CfnPipeline = CfnPipeline.Builder.create(this,
    id).apply(initializer).build()
