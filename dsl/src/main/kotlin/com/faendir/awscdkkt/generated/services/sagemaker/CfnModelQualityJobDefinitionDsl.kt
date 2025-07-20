package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinitionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnModelQualityJobDefinition(
  id: String,
  props: CfnModelQualityJobDefinitionProps,
  initializer: @AwsCdkDsl CfnModelQualityJobDefinition.() -> Unit = {},
): CfnModelQualityJobDefinition = CfnModelQualityJobDefinition(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnModelQualityJobDefinition(id: String, initializer: @AwsCdkDsl CfnModelQualityJobDefinition.Builder.() -> Unit = {}): CfnModelQualityJobDefinition = CfnModelQualityJobDefinition.Builder.create(this, id).apply(initializer).build()
