@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

public
    fun egressConfigurationProperty(initializer: CfnService.EgressConfigurationProperty.Builder.() -> Unit):
    CfnService.EgressConfigurationProperty =
    CfnService.EgressConfigurationProperty.builder().apply(initializer).build()
