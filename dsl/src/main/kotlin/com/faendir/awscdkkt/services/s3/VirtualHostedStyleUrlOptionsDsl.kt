@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions

public
    fun virtualHostedStyleUrlOptions(initializer: VirtualHostedStyleUrlOptions.Builder.() -> Unit):
    VirtualHostedStyleUrlOptions = VirtualHostedStyleUrlOptions.builder().apply(initializer).build()
