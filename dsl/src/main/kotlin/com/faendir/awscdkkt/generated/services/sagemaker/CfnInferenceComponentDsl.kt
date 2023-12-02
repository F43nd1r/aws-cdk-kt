package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInferenceComponent(
  id: String,
  props: CfnInferenceComponentProps,
  initializer: @AwsCdkDsl CfnInferenceComponent.() -> Unit = {},
): CfnInferenceComponent = CfnInferenceComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInferenceComponent(id: String, initializer: @AwsCdkDsl
    CfnInferenceComponent.Builder.() -> Unit = {}): CfnInferenceComponent =
    CfnInferenceComponent.Builder.create(this, id).apply(initializer).build()
