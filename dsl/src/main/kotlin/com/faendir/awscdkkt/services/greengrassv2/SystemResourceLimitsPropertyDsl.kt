package com.faendir.awscdkkt.services.greengrassv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@Generated
public
    fun systemResourceLimitsProperty(initializer: CfnDeployment.SystemResourceLimitsProperty.Builder.() -> Unit
    = {}): CfnDeployment.SystemResourceLimitsProperty =
    CfnDeployment.SystemResourceLimitsProperty.builder().apply(initializer).build()
