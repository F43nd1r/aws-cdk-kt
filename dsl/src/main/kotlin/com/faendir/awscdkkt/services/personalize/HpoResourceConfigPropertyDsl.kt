package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public
    fun hpoResourceConfigProperty(initializer: CfnSolution.HpoResourceConfigProperty.Builder.() -> Unit
    = {}): CfnSolution.HpoResourceConfigProperty =
    CfnSolution.HpoResourceConfigProperty.builder().apply(initializer).build()
