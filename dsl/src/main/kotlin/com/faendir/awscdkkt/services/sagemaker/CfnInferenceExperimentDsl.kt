@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
