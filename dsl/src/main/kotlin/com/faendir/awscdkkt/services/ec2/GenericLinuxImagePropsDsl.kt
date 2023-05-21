package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GenericLinuxImageProps

@Generated
public fun genericLinuxImageProps(initializer: GenericLinuxImageProps.Builder.() -> Unit = {}):
    GenericLinuxImageProps = GenericLinuxImageProps.builder().apply(initializer).build()
