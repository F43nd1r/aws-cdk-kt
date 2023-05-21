package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun ingressConfigurationProperty(initializer: CfnService.IngressConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.IngressConfigurationProperty =
    CfnService.IngressConfigurationProperty.builder().apply(initializer).build()
