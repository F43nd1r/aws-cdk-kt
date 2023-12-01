package com.faendir.awscdkkt.generated.services.entityresolution

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMatchingWorkflow(
  id: String,
  props: CfnMatchingWorkflowProps,
  initializer: @AwsCdkDsl CfnMatchingWorkflow.() -> Unit = {},
): CfnMatchingWorkflow = CfnMatchingWorkflow(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMatchingWorkflow(id: String, initializer: @AwsCdkDsl
    CfnMatchingWorkflow.Builder.() -> Unit = {}): CfnMatchingWorkflow =
    CfnMatchingWorkflow.Builder.create(this, id).apply(initializer).build()
