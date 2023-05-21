package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcIpamOptions

@Generated
public fun vpcIpamOptions(initializer: VpcIpamOptions.Builder.() -> Unit = {}): VpcIpamOptions =
    VpcIpamOptions.builder().apply(initializer).build()
