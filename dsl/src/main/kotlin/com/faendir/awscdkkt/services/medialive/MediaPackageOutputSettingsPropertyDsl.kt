package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun mediaPackageOutputSettingsProperty(initializer: CfnChannel.MediaPackageOutputSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.MediaPackageOutputSettingsProperty =
    CfnChannel.MediaPackageOutputSettingsProperty.builder().apply(initializer).build()
