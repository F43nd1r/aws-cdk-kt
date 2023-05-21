package com.faendir.awscdkkt.services.ram

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
  initializer: CfnPermission.() -> Unit = {},
): CfnPermission = CfnPermission(this, id, props).apply(initializer)
