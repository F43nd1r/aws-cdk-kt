package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InstanceRequireImdsv2AspectProps

@Generated
public
    fun instanceRequireImdsv2AspectProps(initializer: InstanceRequireImdsv2AspectProps.Builder.() -> Unit
    = {}): InstanceRequireImdsv2AspectProps =
    InstanceRequireImdsv2AspectProps.builder().apply(initializer).build()
