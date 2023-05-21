package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnServiceLinkedRole
import software.amazon.awscdk.services.iam.CfnServiceLinkedRoleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceLinkedRole(
  id: String,
  props: CfnServiceLinkedRoleProps,
  initializer: CfnServiceLinkedRole.() -> Unit = {},
): CfnServiceLinkedRole = CfnServiceLinkedRole(this, id, props).apply(initializer)
