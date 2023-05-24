package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildVolumesProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.VolumesProperty.Builder.() -> Unit): CfnJobDefinition.VolumesProperty =
    CfnJobDefinition.VolumesProperty.Builder().apply(initializer).build()
