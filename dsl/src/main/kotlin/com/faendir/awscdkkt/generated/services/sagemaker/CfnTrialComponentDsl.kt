package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnTrialComponent
import software.amazon.awscdk.services.sagemaker.CfnTrialComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrialComponent(
  id: String,
  props: CfnTrialComponentProps,
  initializer: @AwsCdkDsl CfnTrialComponent.() -> Unit = {},
): CfnTrialComponent = CfnTrialComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrialComponent(id: String, initializer: @AwsCdkDsl CfnTrialComponent.Builder.() -> Unit = {}): CfnTrialComponent = CfnTrialComponent.Builder.create(this, id).apply(initializer).build()
