@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ram

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ram.CfnPermission
import software.amazon.awscdk.services.ram.CfnPermissionProps
import software.constructs.Construct

public fun Construct.cfnPermission(
  id: String,
  props: CfnPermissionProps,
  initializer: CfnPermission.() -> Unit = {},
): CfnPermission = CfnPermission(this, id, props).apply(initializer)
