package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun vpcOutputSettingsProperty(initializer: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.VpcOutputSettingsProperty =
    CfnChannel.VpcOutputSettingsProperty.builder().apply(initializer).build()
