package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

@Generated
public fun buildVolumeProperty(initializer: @AwsCdkDsl CfnInstance.VolumeProperty.Builder.() -> Unit
    = {}): CfnInstance.VolumeProperty =
    CfnInstance.VolumeProperty.Builder().apply(initializer).build()
