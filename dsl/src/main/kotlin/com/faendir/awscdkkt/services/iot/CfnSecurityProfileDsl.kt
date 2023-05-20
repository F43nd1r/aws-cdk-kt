@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import software.amazon.awscdk.services.iot.CfnSecurityProfileProps
import software.constructs.Construct

public fun Construct.cfnSecurityProfile(id: String, initializer: CfnSecurityProfile.() -> Unit =
    {}): CfnSecurityProfile = CfnSecurityProfile(this, id).apply(initializer)

public fun Construct.cfnSecurityProfile(
  id: String,
  props: CfnSecurityProfileProps,
  initializer: CfnSecurityProfile.() -> Unit = {},
): CfnSecurityProfile = CfnSecurityProfile(this, id, props).apply(initializer)
