package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnExperimentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExperiment(
  id: String,
  props: CfnExperimentProps,
  initializer: CfnExperiment.() -> Unit = {},
): CfnExperiment = CfnExperiment(this, id, props).apply(initializer)
