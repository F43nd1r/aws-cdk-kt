@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps
import software.constructs.Construct

public fun Construct.cfnSolution(
  id: String,
  props: CfnSolutionProps,
  initializer: CfnSolution.() -> Unit = {},
): CfnSolution = CfnSolution(this, id, props).apply(initializer)
