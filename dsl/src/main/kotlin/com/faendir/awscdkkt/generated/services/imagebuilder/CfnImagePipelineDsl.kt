package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import software.amazon.awscdk.services.imagebuilder.CfnImagePipelineProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImagePipeline(id: String, props: CfnImagePipelineProps): CfnImagePipeline =
    CfnImagePipeline(this, id, props)

@Generated
public fun Construct.cfnImagePipeline(
  id: String,
  props: CfnImagePipelineProps,
  initializer: @AwsCdkDsl CfnImagePipeline.() -> Unit,
): CfnImagePipeline = CfnImagePipeline(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnImagePipeline(id: String, initializer: @AwsCdkDsl
    CfnImagePipeline.Builder.() -> Unit): CfnImagePipeline = CfnImagePipeline.Builder.create(this,
    id).apply(initializer).build()
