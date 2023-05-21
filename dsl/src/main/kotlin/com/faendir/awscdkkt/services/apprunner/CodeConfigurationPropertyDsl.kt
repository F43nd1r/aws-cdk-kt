package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun codeConfigurationProperty(initializer: CfnService.CodeConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.CodeConfigurationProperty =
    CfnService.CodeConfigurationProperty.builder().apply(initializer).build()
