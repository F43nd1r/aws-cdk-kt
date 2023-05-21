package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GenericWindowsImageProps

@Generated
public fun genericWindowsImageProps(initializer: GenericWindowsImageProps.Builder.() -> Unit = {}):
    GenericWindowsImageProps = GenericWindowsImageProps.builder().apply(initializer).build()
