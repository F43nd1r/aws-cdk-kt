package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.AlbControllerOptions

@Generated
public fun albControllerOptions(initializer: AlbControllerOptions.Builder.() -> Unit = {}):
    AlbControllerOptions = AlbControllerOptions.builder().apply(initializer).build()
