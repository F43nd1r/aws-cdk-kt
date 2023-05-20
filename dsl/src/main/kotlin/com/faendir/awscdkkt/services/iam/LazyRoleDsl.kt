@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
