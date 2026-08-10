package com.faendir.awscdkkt.generated.services.osis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.osis.CfnPipelineBlueprint
import software.amazon.awscdk.services.osis.CfnPipelineBlueprintProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPipelineBlueprint(id: String, initializer: @AwsCdkDsl CfnPipelineBlueprint.() -> Unit = {}): CfnPipelineBlueprint = CfnPipelineBlueprint(this, id).apply(initializer)

@Generated
public fun Construct.cfnPipelineBlueprint(
  id: String,
  props: CfnPipelineBlueprintProps,
  initializer: @AwsCdkDsl CfnPipelineBlueprint.() -> Unit = {},
): CfnPipelineBlueprint = CfnPipelineBlueprint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPipelineBlueprint(id: String, initializer: @AwsCdkDsl CfnPipelineBlueprint.Builder.() -> Unit = {}): CfnPipelineBlueprint = CfnPipelineBlueprint.Builder.create(this, id).apply(initializer).build()
