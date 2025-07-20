package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PublicSubnet
import software.amazon.awscdk.services.ec2.PublicSubnetProps
import software.constructs.Construct

@Generated
public fun Construct.publicSubnet(
  id: String,
  props: PublicSubnetProps,
  initializer: @AwsCdkDsl PublicSubnet.() -> Unit = {},
): PublicSubnet = PublicSubnet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPublicSubnet(id: String, initializer: @AwsCdkDsl PublicSubnet.Builder.() -> Unit = {}): PublicSubnet = PublicSubnet.Builder.create(this, id).apply(initializer).build()
