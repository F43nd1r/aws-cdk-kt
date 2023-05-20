@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

public
    fun recordingGroupProperty(initializer: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit):
    CfnConfigurationRecorder.RecordingGroupProperty =
    CfnConfigurationRecorder.RecordingGroupProperty.builder().apply(initializer).build()
