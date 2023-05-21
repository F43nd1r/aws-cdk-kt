package com.faendir.awscdkkt.services.robomaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.robomaker.CfnSimulationApplication

@Generated
public
    fun sourceConfigProperty(initializer: CfnSimulationApplication.SourceConfigProperty.Builder.() -> Unit
    = {}): CfnSimulationApplication.SourceConfigProperty =
    CfnSimulationApplication.SourceConfigProperty.builder().apply(initializer).build()
