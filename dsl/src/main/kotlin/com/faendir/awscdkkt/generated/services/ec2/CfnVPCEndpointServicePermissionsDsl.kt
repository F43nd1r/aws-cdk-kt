package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPCEndpointServicePermissions(
  id: String,
  props: CfnVPCEndpointServicePermissionsProps,
  initializer: @AwsCdkDsl CfnVPCEndpointServicePermissions.() -> Unit = {},
): CfnVPCEndpointServicePermissions = CfnVPCEndpointServicePermissions(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnVPCEndpointServicePermissions(id: String, initializer: @AwsCdkDsl
    CfnVPCEndpointServicePermissions.Builder.() -> Unit = {}): CfnVPCEndpointServicePermissions =
    CfnVPCEndpointServicePermissions.Builder.create(this, id).apply(initializer).build()
