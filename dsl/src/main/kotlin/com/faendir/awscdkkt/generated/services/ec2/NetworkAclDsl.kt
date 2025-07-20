package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.constructs.Construct

@Generated
public fun Construct.networkAcl(
  id: String,
  props: NetworkAclProps,
  initializer: @AwsCdkDsl NetworkAcl.() -> Unit = {},
): NetworkAcl = NetworkAcl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNetworkAcl(id: String, initializer: @AwsCdkDsl NetworkAcl.Builder.() -> Unit = {}): NetworkAcl = NetworkAcl.Builder.create(this, id).apply(initializer).build()
