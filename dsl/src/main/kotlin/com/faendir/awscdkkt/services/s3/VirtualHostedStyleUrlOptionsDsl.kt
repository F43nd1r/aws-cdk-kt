package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions

@Generated
public fun virtualHostedStyleUrlOptions(initializer: VirtualHostedStyleUrlOptions.Builder.() -> Unit
    = {}): VirtualHostedStyleUrlOptions =
    VirtualHostedStyleUrlOptions.builder().apply(initializer).build()
