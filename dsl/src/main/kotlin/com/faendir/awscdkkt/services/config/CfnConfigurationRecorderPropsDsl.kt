package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorderProps

@Generated
public
    fun cfnConfigurationRecorderProps(initializer: CfnConfigurationRecorderProps.Builder.() -> Unit
    = {}): CfnConfigurationRecorderProps =
    CfnConfigurationRecorderProps.builder().apply(initializer).build()
