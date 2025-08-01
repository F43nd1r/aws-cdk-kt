package com.faendir.awscdkkt.generated.services.ram

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnPermission
import software.amazon.awscdk.services.ram.CfnPermissionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPermission(
  id: String,
  props: CfnPermissionProps,
  initializer: @AwsCdkDsl CfnPermission.() -> Unit = {},
): CfnPermission = CfnPermission(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPermission(id: String, initializer: @AwsCdkDsl CfnPermission.Builder.() -> Unit = {}): CfnPermission = CfnPermission.Builder.create(this, id).apply(initializer).build()
