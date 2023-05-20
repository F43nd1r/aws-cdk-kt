@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.Role
import software.amazon.awscdk.services.iam.RoleProps
import software.constructs.Construct

public fun Construct.role(
  id: String,
  props: RoleProps,
  initializer: Role.() -> Unit = {},
): Role = Role(this, id, props).apply(initializer)
