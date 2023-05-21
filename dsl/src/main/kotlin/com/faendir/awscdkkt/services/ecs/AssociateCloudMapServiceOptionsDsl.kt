package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions

@Generated
public
    fun associateCloudMapServiceOptions(initializer: AssociateCloudMapServiceOptions.Builder.() -> Unit
    = {}): AssociateCloudMapServiceOptions =
    AssociateCloudMapServiceOptions.builder().apply(initializer).build()
