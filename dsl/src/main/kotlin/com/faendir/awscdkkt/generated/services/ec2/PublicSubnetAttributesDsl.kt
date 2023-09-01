package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PublicSubnetAttributes

@Generated
public fun buildPublicSubnetAttributes(initializer: @AwsCdkDsl
    PublicSubnetAttributes.Builder.() -> Unit = {}): PublicSubnetAttributes =
    PublicSubnetAttributes.Builder().apply(initializer).build()
