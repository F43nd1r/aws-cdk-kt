package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcLookupOptions

@Generated
public fun vpcLookupOptions(initializer: VpcLookupOptions.Builder.() -> Unit = {}): VpcLookupOptions
    = VpcLookupOptions.builder().apply(initializer).build()
