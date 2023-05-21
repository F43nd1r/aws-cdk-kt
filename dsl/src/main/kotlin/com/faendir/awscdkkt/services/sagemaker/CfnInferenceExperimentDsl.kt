package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInferenceExperiment(
  id: String,
  props: CfnInferenceExperimentProps,
  initializer: CfnInferenceExperiment.() -> Unit = {},
): CfnInferenceExperiment = CfnInferenceExperiment(this, id, props).apply(initializer)
