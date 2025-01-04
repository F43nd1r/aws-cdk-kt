package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildVolumeProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.VolumeProperty.Builder.() -> Unit = {}): CfnJobDefinition.VolumeProperty =
    CfnJobDefinition.VolumeProperty.Builder().apply(initializer).build()
