package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.PublicKeyProps

@Generated
public fun publicKeyProps(initializer: PublicKeyProps.Builder.() -> Unit = {}): PublicKeyProps =
    PublicKeyProps.builder().apply(initializer).build()
