package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public fun hpoConfigProperty(initializer: CfnSolution.HpoConfigProperty.Builder.() -> Unit = {}):
    CfnSolution.HpoConfigProperty =
    CfnSolution.HpoConfigProperty.builder().apply(initializer).build()
