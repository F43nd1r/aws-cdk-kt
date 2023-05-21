package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun runConfigProperty(initializer: CfnCanary.RunConfigProperty.Builder.() -> Unit = {}):
    CfnCanary.RunConfigProperty = CfnCanary.RunConfigProperty.builder().apply(initializer).build()
