package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.Subnet
import software.amazon.awscdk.services.ec2.SubnetProps
import software.constructs.Construct

@Generated
public fun Construct.subnet(
  id: String,
  props: SubnetProps,
  initializer: @AwsCdkDsl Subnet.() -> Unit = {},
): Subnet = Subnet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSubnet(id: String, initializer: @AwsCdkDsl Subnet.Builder.() -> Unit =
    {}): Subnet = Subnet.Builder.create(this, id).apply(initializer).build()
