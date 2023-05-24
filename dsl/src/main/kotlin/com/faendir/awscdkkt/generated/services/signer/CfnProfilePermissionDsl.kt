package com.faendir.awscdkkt.generated.services.signer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnProfilePermission
import software.amazon.awscdk.services.signer.CfnProfilePermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnProfilePermission(id: String, props: CfnProfilePermissionProps):
    CfnProfilePermission = CfnProfilePermission(this, id, props)

@Generated
public fun Construct.cfnProfilePermission(
  id: String,
  props: CfnProfilePermissionProps,
  initializer: @AwsCdkDsl CfnProfilePermission.() -> Unit,
): CfnProfilePermission = CfnProfilePermission(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnProfilePermission(id: String, initializer: @AwsCdkDsl
    CfnProfilePermission.Builder.() -> Unit): CfnProfilePermission =
    CfnProfilePermission.Builder.create(this, id).apply(initializer).build()
