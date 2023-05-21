package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInstance

@Generated
public fun volumeProperty(initializer: CfnInstance.VolumeProperty.Builder.() -> Unit = {}):
    CfnInstance.VolumeProperty = CfnInstance.VolumeProperty.builder().apply(initializer).build()
