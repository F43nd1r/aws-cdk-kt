package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@Generated
public
    fun componentRunWithProperty(initializer: CfnDeployment.ComponentRunWithProperty.Builder.() -> Unit
    = {}): CfnDeployment.ComponentRunWithProperty =
    CfnDeployment.ComponentRunWithProperty.builder().apply(initializer).build()
