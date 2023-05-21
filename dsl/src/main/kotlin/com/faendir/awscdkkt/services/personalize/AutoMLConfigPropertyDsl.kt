package com.faendir.awscdkkt.services.personalize

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution

@Generated
public fun autoMLConfigProperty(initializer: CfnSolution.AutoMLConfigProperty.Builder.() -> Unit =
    {}): CfnSolution.AutoMLConfigProperty =
    CfnSolution.AutoMLConfigProperty.builder().apply(initializer).build()
