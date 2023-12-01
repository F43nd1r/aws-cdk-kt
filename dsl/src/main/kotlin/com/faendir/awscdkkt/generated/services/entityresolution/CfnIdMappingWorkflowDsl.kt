package com.faendir.awscdkkt.generated.services.entityresolution

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIdMappingWorkflow(
  id: String,
  props: CfnIdMappingWorkflowProps,
  initializer: @AwsCdkDsl CfnIdMappingWorkflow.() -> Unit = {},
): CfnIdMappingWorkflow = CfnIdMappingWorkflow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIdMappingWorkflow(id: String, initializer: @AwsCdkDsl
    CfnIdMappingWorkflow.Builder.() -> Unit = {}): CfnIdMappingWorkflow =
    CfnIdMappingWorkflow.Builder.create(this, id).apply(initializer).build()
