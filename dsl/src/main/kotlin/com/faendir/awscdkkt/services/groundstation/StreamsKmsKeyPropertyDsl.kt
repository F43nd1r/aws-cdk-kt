package com.faendir.awscdkkt.services.groundstation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

@Generated
public
    fun streamsKmsKeyProperty(initializer: CfnMissionProfile.StreamsKmsKeyProperty.Builder.() -> Unit
    = {}): CfnMissionProfile.StreamsKmsKeyProperty =
    CfnMissionProfile.StreamsKmsKeyProperty.builder().apply(initializer).build()
