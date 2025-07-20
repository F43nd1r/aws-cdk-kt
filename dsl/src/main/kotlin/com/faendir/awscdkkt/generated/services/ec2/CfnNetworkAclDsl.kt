package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAcl
import software.amazon.awscdk.services.ec2.CfnNetworkAclProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkAcl(
  id: String,
  props: CfnNetworkAclProps,
  initializer: @AwsCdkDsl CfnNetworkAcl.() -> Unit = {},
): CfnNetworkAcl = CfnNetworkAcl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkAcl(id: String, initializer: @AwsCdkDsl CfnNetworkAcl.Builder.() -> Unit = {}): CfnNetworkAcl = CfnNetworkAcl.Builder.create(this, id).apply(initializer).build()
