@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps
import software.constructs.Construct

public fun Construct.cfnStep(
  id: String,
  props: CfnStepProps,
  initializer: CfnStep.() -> Unit = {},
): CfnStep = CfnStep(this, id, props).apply(initializer)
