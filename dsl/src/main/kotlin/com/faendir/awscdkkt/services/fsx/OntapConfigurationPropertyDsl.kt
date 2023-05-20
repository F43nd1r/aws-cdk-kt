@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

public
    fun ontapConfigurationProperty(initializer: CfnVolume.OntapConfigurationProperty.Builder.() -> Unit):
    CfnVolume.OntapConfigurationProperty =
    CfnVolume.OntapConfigurationProperty.builder().apply(initializer).build()
