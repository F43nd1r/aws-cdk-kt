package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigurationRecorder

@Generated
public
    fun recordingGroupProperty(initializer: CfnConfigurationRecorder.RecordingGroupProperty.Builder.() -> Unit
    = {}): CfnConfigurationRecorder.RecordingGroupProperty =
    CfnConfigurationRecorder.RecordingGroupProperty.builder().apply(initializer).build()
