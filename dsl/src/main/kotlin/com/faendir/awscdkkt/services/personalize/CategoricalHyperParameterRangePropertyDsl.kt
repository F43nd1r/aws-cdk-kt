package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public
    fun categoricalHyperParameterRangeProperty(initializer: CfnSolution.CategoricalHyperParameterRangeProperty.Builder.() -> Unit
    = {}): CfnSolution.CategoricalHyperParameterRangeProperty =
    CfnSolution.CategoricalHyperParameterRangeProperty.builder().apply(initializer).build()
