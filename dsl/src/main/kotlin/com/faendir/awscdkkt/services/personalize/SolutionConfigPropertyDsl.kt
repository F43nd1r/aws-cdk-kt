package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public fun solutionConfigProperty(initializer: CfnSolution.SolutionConfigProperty.Builder.() -> Unit
    = {}): CfnSolution.SolutionConfigProperty =
    CfnSolution.SolutionConfigProperty.builder().apply(initializer).build()
