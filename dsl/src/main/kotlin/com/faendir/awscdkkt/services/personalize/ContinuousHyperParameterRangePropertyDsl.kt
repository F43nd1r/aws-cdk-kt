package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public
    fun continuousHyperParameterRangeProperty(initializer: CfnSolution.ContinuousHyperParameterRangeProperty.Builder.() -> Unit
    = {}): CfnSolution.ContinuousHyperParameterRangeProperty =
    CfnSolution.ContinuousHyperParameterRangeProperty.builder().apply(initializer).build()
