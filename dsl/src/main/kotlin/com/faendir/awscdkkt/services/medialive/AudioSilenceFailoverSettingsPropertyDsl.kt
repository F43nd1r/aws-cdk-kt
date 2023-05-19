@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun audioSilenceFailoverSettingsProperty(initializer: CfnChannel.AudioSilenceFailoverSettingsProperty.Builder.() -> Unit):
    CfnChannel.AudioSilenceFailoverSettingsProperty =
    CfnChannel.AudioSilenceFailoverSettingsProperty.builder().apply(initializer).build()
