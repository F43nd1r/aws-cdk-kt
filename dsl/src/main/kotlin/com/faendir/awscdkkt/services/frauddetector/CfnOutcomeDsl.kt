@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnOutcome
import software.amazon.awscdk.services.frauddetector.CfnOutcomeProps
import software.constructs.Construct

public fun Construct.cfnOutcome(
  id: String,
  props: CfnOutcomeProps,
  initializer: CfnOutcome.() -> Unit = {},
): CfnOutcome = CfnOutcome(this, id, props).apply(initializer)
