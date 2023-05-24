package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.RequestedSubnet

@Generated
public fun buildRequestedSubnet(initializer: @AwsCdkDsl RequestedSubnet.Builder.() -> Unit):
    RequestedSubnet = RequestedSubnet.Builder().apply(initializer).build()
