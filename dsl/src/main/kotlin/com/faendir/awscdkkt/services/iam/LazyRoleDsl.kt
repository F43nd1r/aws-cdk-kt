@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.LazyRole
import software.amazon.awscdk.services.iam.LazyRoleProps
import software.constructs.Construct

public fun Construct.lazyRole(
  id: String,
  props: LazyRoleProps,
  initializer: LazyRole.() -> Unit = {},
): LazyRole = LazyRole(this, id, props).apply(initializer)
