package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile
import software.amazon.awscdk.services.iot.CfnSecurityProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityProfile(id: String, initializer: CfnSecurityProfile.() -> Unit =
    {}): CfnSecurityProfile = CfnSecurityProfile(this, id).apply(initializer)

@Generated
public fun Construct.cfnSecurityProfile(
  id: String,
  props: CfnSecurityProfileProps,
  initializer: CfnSecurityProfile.() -> Unit = {},
): CfnSecurityProfile = CfnSecurityProfile(this, id, props).apply(initializer)
