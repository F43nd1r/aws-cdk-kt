package com.faendir.awscdkkt.generated.services.sso

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnPermissionSet
import software.amazon.awscdk.services.sso.CfnPermissionSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPermissionSet(
  id: String,
  props: CfnPermissionSetProps,
  initializer: @AwsCdkDsl CfnPermissionSet.() -> Unit = {},
): CfnPermissionSet = CfnPermissionSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPermissionSet(id: String, initializer: @AwsCdkDsl CfnPermissionSet.Builder.() -> Unit = {}): CfnPermissionSet = CfnPermissionSet.Builder.create(this, id).apply(initializer).build()
