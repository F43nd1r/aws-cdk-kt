@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun videoCodecSettingsProperty(initializer: CfnChannel.VideoCodecSettingsProperty.Builder.() -> Unit):
    CfnChannel.VideoCodecSettingsProperty =
    CfnChannel.VideoCodecSettingsProperty.builder().apply(initializer).build()
