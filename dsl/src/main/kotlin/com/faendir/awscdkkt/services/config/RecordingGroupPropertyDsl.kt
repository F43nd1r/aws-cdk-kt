@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

public
    fun recordingGroupProperty(initializer: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit):
    CfnConfigurationRecorder.RecordingGroupProperty =
    CfnConfigurationRecorder.RecordingGroupProperty.builder().apply(initializer).build()
