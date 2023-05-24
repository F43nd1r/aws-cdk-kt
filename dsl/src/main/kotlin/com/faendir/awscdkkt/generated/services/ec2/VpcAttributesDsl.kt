package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcAttributes

@Generated
public fun buildVpcAttributes(initializer: @AwsCdkDsl VpcAttributes.Builder.() -> Unit):
    VpcAttributes = VpcAttributes.Builder().apply(initializer).build()
