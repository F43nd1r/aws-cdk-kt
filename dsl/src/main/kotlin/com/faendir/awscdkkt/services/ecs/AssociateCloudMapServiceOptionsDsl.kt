@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AssociateCloudMapServiceOptions

public
    fun associateCloudMapServiceOptions(initializer: AssociateCloudMapServiceOptions.Builder.() -> Unit):
    AssociateCloudMapServiceOptions =
    AssociateCloudMapServiceOptions.builder().apply(initializer).build()
