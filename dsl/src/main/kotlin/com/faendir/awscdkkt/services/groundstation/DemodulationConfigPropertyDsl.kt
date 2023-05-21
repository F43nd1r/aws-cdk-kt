package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig

@Generated
public
    fun demodulationConfigProperty(initializer: CfnConfig.DemodulationConfigProperty.Builder.() -> Unit
    = {}): CfnConfig.DemodulationConfigProperty =
    CfnConfig.DemodulationConfigProperty.builder().apply(initializer).build()
