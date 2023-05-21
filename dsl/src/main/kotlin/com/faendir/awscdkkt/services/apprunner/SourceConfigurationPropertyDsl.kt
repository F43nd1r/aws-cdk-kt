package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun sourceConfigurationProperty(initializer: CfnService.SourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.SourceConfigurationProperty =
    CfnService.SourceConfigurationProperty.builder().apply(initializer).build()
