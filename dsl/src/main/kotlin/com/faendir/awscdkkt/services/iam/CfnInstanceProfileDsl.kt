package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInstanceProfile(
  id: String,
  props: CfnInstanceProfileProps,
  initializer: CfnInstanceProfile.() -> Unit = {},
): CfnInstanceProfile = CfnInstanceProfile(this, id, props).apply(initializer)
