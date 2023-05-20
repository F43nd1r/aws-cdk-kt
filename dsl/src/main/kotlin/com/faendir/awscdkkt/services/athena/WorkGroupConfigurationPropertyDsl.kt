@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.athena

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnWorkGroup

public
    fun workGroupConfigurationProperty(initializer: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit):
    CfnWorkGroup.WorkGroupConfigurationProperty =
    CfnWorkGroup.WorkGroupConfigurationProperty.builder().apply(initializer).build()
