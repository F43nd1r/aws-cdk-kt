package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInferenceExperiment(id: String, props: CfnInferenceExperimentProps):
    CfnInferenceExperiment = CfnInferenceExperiment(this, id, props)

@Generated
public fun Construct.cfnInferenceExperiment(
  id: String,
  props: CfnInferenceExperimentProps,
  initializer: @AwsCdkDsl CfnInferenceExperiment.() -> Unit,
): CfnInferenceExperiment = CfnInferenceExperiment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInferenceExperiment(id: String, initializer: @AwsCdkDsl
    CfnInferenceExperiment.Builder.() -> Unit): CfnInferenceExperiment =
    CfnInferenceExperiment.Builder.create(this, id).apply(initializer).build()
