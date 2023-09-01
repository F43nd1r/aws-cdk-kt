package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes

@Generated
public fun buildPrivateSubnetAttributes(initializer: @AwsCdkDsl
    PrivateSubnetAttributes.Builder.() -> Unit = {}): PrivateSubnetAttributes =
    PrivateSubnetAttributes.Builder().apply(initializer).build()
