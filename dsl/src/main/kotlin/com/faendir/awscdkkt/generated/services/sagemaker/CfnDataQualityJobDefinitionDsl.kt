package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataQualityJobDefinition(
  id: String,
  props: CfnDataQualityJobDefinitionProps,
  initializer: @AwsCdkDsl CfnDataQualityJobDefinition.() -> Unit = {},
): CfnDataQualityJobDefinition = CfnDataQualityJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataQualityJobDefinition(id: String, initializer: @AwsCdkDsl CfnDataQualityJobDefinition.Builder.() -> Unit = {}): CfnDataQualityJobDefinition = CfnDataQualityJobDefinition.Builder.create(this, id).apply(initializer).build()
