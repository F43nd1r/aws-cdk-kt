@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

public
    fun solutionConfigProperty(initializer: CfnSolution.SolutionConfigProperty.Builder.() -> Unit):
    CfnSolution.SolutionConfigProperty =
    CfnSolution.SolutionConfigProperty.builder().apply(initializer).build()
