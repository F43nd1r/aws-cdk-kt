package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelBiasJobDefinition(id: String, props: CfnModelBiasJobDefinitionProps):
    CfnModelBiasJobDefinition = CfnModelBiasJobDefinition(this, id, props)

@Generated
public fun Construct.cfnModelBiasJobDefinition(
  id: String,
  props: CfnModelBiasJobDefinitionProps,
  initializer: @AwsCdkDsl CfnModelBiasJobDefinition.() -> Unit,
): CfnModelBiasJobDefinition = CfnModelBiasJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelBiasJobDefinition(id: String, initializer: @AwsCdkDsl
    CfnModelBiasJobDefinition.Builder.() -> Unit): CfnModelBiasJobDefinition =
    CfnModelBiasJobDefinition.Builder.create(this, id).apply(initializer).build()
