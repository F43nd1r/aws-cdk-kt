package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUser
import software.amazon.awscdk.services.iam.CfnUserProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUser(id: String, initializer: CfnUser.() -> Unit = {}): CfnUser =
    CfnUser(this, id).apply(initializer)

@Generated
public fun Construct.cfnUser(
  id: String,
  props: CfnUserProps,
  initializer: CfnUser.() -> Unit = {},
): CfnUser = CfnUser(this, id, props).apply(initializer)
