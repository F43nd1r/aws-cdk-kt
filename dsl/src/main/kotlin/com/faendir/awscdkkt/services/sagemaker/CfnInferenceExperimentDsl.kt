@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperimentProps
import software.constructs.Construct

public fun Construct.cfnInferenceExperiment(
  id: String,
  props: CfnInferenceExperimentProps,
  initializer: CfnInferenceExperiment.() -> Unit = {},
): CfnInferenceExperiment = CfnInferenceExperiment(this, id, props).apply(initializer)
