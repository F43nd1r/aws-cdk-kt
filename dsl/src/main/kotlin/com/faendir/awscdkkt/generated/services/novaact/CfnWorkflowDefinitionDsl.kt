package com.faendir.awscdkkt.generated.services.novaact

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.novaact.CfnWorkflowDefinition
import software.amazon.awscdk.services.novaact.CfnWorkflowDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWorkflowDefinition(
  id: String,
  props: CfnWorkflowDefinitionProps,
  initializer: @AwsCdkDsl CfnWorkflowDefinition.() -> Unit = {},
): CfnWorkflowDefinition = CfnWorkflowDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWorkflowDefinition(id: String, initializer: @AwsCdkDsl CfnWorkflowDefinition.Builder.() -> Unit = {}): CfnWorkflowDefinition = CfnWorkflowDefinition.Builder.create(this, id).apply(initializer).build()
