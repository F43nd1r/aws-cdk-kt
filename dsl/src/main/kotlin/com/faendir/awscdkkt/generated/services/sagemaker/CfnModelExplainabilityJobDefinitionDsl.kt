package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelExplainabilityJobDefinition(id: String,
    props: CfnModelExplainabilityJobDefinitionProps): CfnModelExplainabilityJobDefinition =
    CfnModelExplainabilityJobDefinition(this, id, props)

@Generated
public fun Construct.cfnModelExplainabilityJobDefinition(
  id: String,
  props: CfnModelExplainabilityJobDefinitionProps,
  initializer: @AwsCdkDsl CfnModelExplainabilityJobDefinition.() -> Unit,
): CfnModelExplainabilityJobDefinition = CfnModelExplainabilityJobDefinition(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnModelExplainabilityJobDefinition(id: String, initializer: @AwsCdkDsl
    CfnModelExplainabilityJobDefinition.Builder.() -> Unit): CfnModelExplainabilityJobDefinition =
    CfnModelExplainabilityJobDefinition.Builder.create(this, id).apply(initializer).build()
