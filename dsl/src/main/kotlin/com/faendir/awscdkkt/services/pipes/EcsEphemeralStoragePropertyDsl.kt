package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun ecsEphemeralStorageProperty(initializer: CfnPipe.EcsEphemeralStorageProperty.Builder.() -> Unit
    = {}): CfnPipe.EcsEphemeralStorageProperty =
    CfnPipe.EcsEphemeralStorageProperty.builder().apply(initializer).build()
