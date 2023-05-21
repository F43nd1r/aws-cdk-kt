package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInterfacePermission(
  id: String,
  props: CfnNetworkInterfacePermissionProps,
  initializer: CfnNetworkInterfacePermission.() -> Unit = {},
): CfnNetworkInterfacePermission = CfnNetworkInterfacePermission(this, id, props).apply(initializer)
