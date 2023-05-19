@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.amazon.awscdk.services.iam.CfnInstanceProfileProps
import software.constructs.Construct

public fun Construct.cfnInstanceProfile(
  id: String,
  props: CfnInstanceProfileProps,
  initializer: CfnInstanceProfile.() -> Unit = {},
): CfnInstanceProfile = CfnInstanceProfile(this, id, props).apply(initializer)
