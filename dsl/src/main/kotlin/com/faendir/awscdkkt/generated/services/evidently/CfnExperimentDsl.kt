package com.faendir.awscdkkt.generated.services.evidently

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnExperiment.() -> Unit = {},
): CfnExperiment = CfnExperiment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExperiment(id: String, initializer: @AwsCdkDsl CfnExperiment.Builder.() -> Unit = {}): CfnExperiment = CfnExperiment.Builder.create(this, id).apply(initializer).build()
