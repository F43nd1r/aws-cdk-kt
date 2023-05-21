package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AllocateCidrRequest

@Generated
public fun allocateCidrRequest(initializer: AllocateCidrRequest.Builder.() -> Unit = {}):
    AllocateCidrRequest = AllocateCidrRequest.builder().apply(initializer).build()
