package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AllocatedSubnet

@Generated
public fun buildAllocatedSubnet(initializer: @AwsCdkDsl AllocatedSubnet.Builder.() -> Unit = {}):
    AllocatedSubnet = AllocatedSubnet.Builder().apply(initializer).build()
