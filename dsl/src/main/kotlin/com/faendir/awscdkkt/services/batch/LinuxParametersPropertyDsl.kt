package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun linuxParametersProperty(initializer: CfnJobDefinition.LinuxParametersProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.LinuxParametersProperty =
    CfnJobDefinition.LinuxParametersProperty.builder().apply(initializer).build()
