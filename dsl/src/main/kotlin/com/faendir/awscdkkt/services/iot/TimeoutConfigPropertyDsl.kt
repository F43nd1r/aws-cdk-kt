package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun timeoutConfigProperty(initializer: CfnJobTemplate.TimeoutConfigProperty.Builder.() -> Unit =
    {}): CfnJobTemplate.TimeoutConfigProperty =
    CfnJobTemplate.TimeoutConfigProperty.builder().apply(initializer).build()
