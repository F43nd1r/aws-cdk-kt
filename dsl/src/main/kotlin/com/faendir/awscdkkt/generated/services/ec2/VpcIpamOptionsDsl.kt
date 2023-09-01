package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcIpamOptions

@Generated
public fun buildVpcIpamOptions(initializer: @AwsCdkDsl VpcIpamOptions.Builder.() -> Unit = {}):
    VpcIpamOptions = VpcIpamOptions.Builder().apply(initializer).build()
