package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AllocateCidrRequest

@Generated
public fun buildAllocateCidrRequest(initializer: @AwsCdkDsl AllocateCidrRequest.Builder.() -> Unit):
    AllocateCidrRequest = AllocateCidrRequest.Builder().apply(initializer).build()
