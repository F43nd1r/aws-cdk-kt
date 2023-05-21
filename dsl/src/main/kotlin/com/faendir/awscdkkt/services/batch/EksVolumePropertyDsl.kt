package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun eksVolumeProperty(initializer: CfnJobDefinition.EksVolumeProperty.Builder.() -> Unit =
    {}): CfnJobDefinition.EksVolumeProperty =
    CfnJobDefinition.EksVolumeProperty.builder().apply(initializer).build()
