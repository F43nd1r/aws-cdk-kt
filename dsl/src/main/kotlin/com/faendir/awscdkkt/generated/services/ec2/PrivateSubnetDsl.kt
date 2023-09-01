package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrivateSubnet
import software.amazon.awscdk.services.ec2.PrivateSubnetProps
import software.constructs.Construct

@Generated
public fun Construct.privateSubnet(
  id: String,
  props: PrivateSubnetProps,
  initializer: @AwsCdkDsl PrivateSubnet.() -> Unit = {},
): PrivateSubnet = PrivateSubnet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPrivateSubnet(id: String, initializer: @AwsCdkDsl
    PrivateSubnet.Builder.() -> Unit = {}): PrivateSubnet = PrivateSubnet.Builder.create(this,
    id).apply(initializer).build()
