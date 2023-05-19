@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnPermission
import software.amazon.awscdk.services.acmpca.CfnPermissionProps
import software.constructs.Construct

public fun Construct.cfnPermission(
  id: String,
  props: CfnPermissionProps,
  initializer: CfnPermission.() -> Unit = {},
): CfnPermission = CfnPermission(this, id, props).apply(initializer)
