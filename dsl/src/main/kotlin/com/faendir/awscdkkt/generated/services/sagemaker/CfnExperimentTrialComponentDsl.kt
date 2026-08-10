package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnExperimentTrialComponent
import software.amazon.awscdk.services.sagemaker.CfnExperimentTrialComponentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExperimentTrialComponent(
  id: String,
  props: CfnExperimentTrialComponentProps,
  initializer: @AwsCdkDsl CfnExperimentTrialComponent.() -> Unit = {},
): CfnExperimentTrialComponent = CfnExperimentTrialComponent(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExperimentTrialComponent(id: String, initializer: @AwsCdkDsl CfnExperimentTrialComponent.Builder.() -> Unit = {}): CfnExperimentTrialComponent = CfnExperimentTrialComponent.Builder.create(this, id).apply(initializer).build()
