@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
import software.constructs.Construct

public fun Construct.cfnVPCEndpointServicePermissions(
  id: String,
  props: CfnVPCEndpointServicePermissionsProps,
  initializer: CfnVPCEndpointServicePermissions.() -> Unit = {},
): CfnVPCEndpointServicePermissions = CfnVPCEndpointServicePermissions(this, id,
    props).apply(initializer)
