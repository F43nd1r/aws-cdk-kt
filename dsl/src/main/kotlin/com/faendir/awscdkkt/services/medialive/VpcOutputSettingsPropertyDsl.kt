@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun vpcOutputSettingsProperty(initializer: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit):
    CfnChannel.VpcOutputSettingsProperty =
    CfnChannel.VpcOutputSettingsProperty.builder().apply(initializer).build()
