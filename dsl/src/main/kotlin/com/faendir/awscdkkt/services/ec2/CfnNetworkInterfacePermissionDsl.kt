@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
import software.constructs.Construct

public fun Construct.cfnNetworkInterfacePermission(
  id: String,
  props: CfnNetworkInterfacePermissionProps,
  initializer: CfnNetworkInterfacePermission.() -> Unit = {},
): CfnNetworkInterfacePermission = CfnNetworkInterfacePermission(this, id, props).apply(initializer)
