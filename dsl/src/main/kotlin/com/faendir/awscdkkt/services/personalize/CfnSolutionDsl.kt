package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSolution(
  id: String,
  props: CfnSolutionProps,
  initializer: CfnSolution.() -> Unit = {},
): CfnSolution = CfnSolution(this, id, props).apply(initializer)
