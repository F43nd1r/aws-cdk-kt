package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageProps

@Generated
public fun cfnImageProps(initializer: CfnImageProps.Builder.() -> Unit = {}): CfnImageProps =
    CfnImageProps.builder().apply(initializer).build()
