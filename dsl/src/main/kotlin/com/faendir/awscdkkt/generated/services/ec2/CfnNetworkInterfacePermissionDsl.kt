package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermission
import software.amazon.awscdk.services.ec2.CfnNetworkInterfacePermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkInterfacePermission(id: String,
    props: CfnNetworkInterfacePermissionProps): CfnNetworkInterfacePermission =
    CfnNetworkInterfacePermission(this, id, props)

@Generated
public fun Construct.cfnNetworkInterfacePermission(
  id: String,
  props: CfnNetworkInterfacePermissionProps,
  initializer: @AwsCdkDsl CfnNetworkInterfacePermission.() -> Unit,
): CfnNetworkInterfacePermission = CfnNetworkInterfacePermission(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNetworkInterfacePermission(id: String, initializer: @AwsCdkDsl
    CfnNetworkInterfacePermission.Builder.() -> Unit): CfnNetworkInterfacePermission =
    CfnNetworkInterfacePermission.Builder.create(this, id).apply(initializer).build()
