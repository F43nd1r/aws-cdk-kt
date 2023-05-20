@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

public
    fun clientConfigurationsProperty(initializer: CfnVolume.ClientConfigurationsProperty.Builder.() -> Unit):
    CfnVolume.ClientConfigurationsProperty =
    CfnVolume.ClientConfigurationsProperty.builder().apply(initializer).build()
