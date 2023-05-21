package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceProfile(id: String, initializer: CfnServiceProfile.() -> Unit = {}):
    CfnServiceProfile = CfnServiceProfile(this, id).apply(initializer)

@Generated
public fun Construct.cfnServiceProfile(
  id: String,
  props: CfnServiceProfileProps,
  initializer: CfnServiceProfile.() -> Unit = {},
): CfnServiceProfile = CfnServiceProfile(this, id, props).apply(initializer)
