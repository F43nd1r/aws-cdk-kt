package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVolumeProps

@Generated
public fun cfnVolumeProps(initializer: CfnVolumeProps.Builder.() -> Unit = {}): CfnVolumeProps =
    CfnVolumeProps.builder().apply(initializer).build()
