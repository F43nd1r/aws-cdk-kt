@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun audioWatermarkSettingsProperty(initializer: CfnChannel.AudioWatermarkSettingsProperty.Builder.() -> Unit):
    CfnChannel.AudioWatermarkSettingsProperty =
    CfnChannel.AudioWatermarkSettingsProperty.builder().apply(initializer).build()
